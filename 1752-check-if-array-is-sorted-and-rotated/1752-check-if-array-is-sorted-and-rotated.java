class Solution {
    public boolean check(int[] nums) {
        int curr=nums[0], count=0;
       for(int i=1;i<nums.length;i++){
            if(nums[i]<curr){
                count++;
            }
            curr=nums[i];
       }
       if(nums[nums.length-1]> nums[0]){
        count++;
       }
       if(count ==0 || count ==1)
        return true;
        else
        return false;
    }
}