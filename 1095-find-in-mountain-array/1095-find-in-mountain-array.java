/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
         int lo=0, hi= mountainArr.length()-1;
        while(lo<hi){
            int mid =lo+(hi-lo)/2;
            if(mountainArr.get(mid)> mountainArr.get(mid+1))hi=mid;
            else lo = mid +1;;
        }
        int peak = lo;

        int index= search(mountainArr, target, 0,peak, true);
        if(index!=-1){
            return index;
        }

        return search(mountainArr, target, peak+1,mountainArr.length()-1, false);
    }

    public static int search(MountainArray arr,int target, int lo, int hi,boolean ascending){
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int val = arr.get(mid);
            if(val ==target) return mid;
            boolean check = ascending ? val < target : val > target;
            if(check){
                lo=mid+1;
            }else{
                hi = mid-1;
            }
        }
        return -1;
    }
}