class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> i = new HashSet();
        for(int n:nums){
            if(!i.add(n))
                return true;
        }
        return false;
    }
}