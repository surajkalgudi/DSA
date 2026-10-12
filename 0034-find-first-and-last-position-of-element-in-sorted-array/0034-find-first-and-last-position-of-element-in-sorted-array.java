class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = lowerBound(nums,target);
        if(low == nums.length || nums[low] !=target) return new int[]{-1,-1};
        int high = higherBound(nums,target);
        return new int[]{low,high-1};
    }

    public int lowerBound(int[] nums, int target){
        int lo=0, hi=nums.length;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid] >= target) hi=mid;
            else lo = mid+1;
        }
        return lo;
    }

    public int higherBound(int[] nums, int target){
        int lo=0, hi=nums.length;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid] > target) hi=mid;
            else lo = mid+1;
        }
        return lo;
    }
}