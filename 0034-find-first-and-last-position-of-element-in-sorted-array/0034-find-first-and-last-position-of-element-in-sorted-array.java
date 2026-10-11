class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        if (first == nums.length || nums[first] != target) return new int[]{-1, -1};
        int last = upperBound(nums, target) - 1;   
        return new int[]{first, last};
    }

   public int lowerBound(int[] nums, int target) {
        int lo=0, hi=nums.length;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>=target) hi = mid;
            else lo = mid+1;
        }
        return lo;
    }
    public int upperBound(int[] nums, int target) {   // first index where nums[i] > target
    int lo = 0, hi = nums.length;
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] > target) hi = mid;
        else lo = mid + 1;
    }
    return lo;
}
}