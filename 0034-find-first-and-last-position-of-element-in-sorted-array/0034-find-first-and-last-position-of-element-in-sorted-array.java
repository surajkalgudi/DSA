class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = lowerBound(nums,target);
        int hi = highBound(nums,target)-1;
        if(low == nums.length || nums[low] !=target) return new int []{-1,-1};
        else return new int[]{low,hi} ;
    }

    public int highBound(int[] nums, int target){
        int lo=0, hi=nums.length;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>target) hi = mid;
            else lo = mid+1;
        }
        return lo;
    }

    public int lowerBound(int[] nums, int target){
        int lo=0, hi=nums.length;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>=target) hi = mid;
            else lo = mid+1;
        }
        return lo;
    }
}