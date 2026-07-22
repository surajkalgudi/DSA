class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=Integer.MIN_VALUE;
        for(int[] customer: accounts){
            int sum=0;
            for(int i:customer){
                sum+=i;
            }
            wealth=Math.max(sum, wealth);
        }
        return wealth;
    }
}