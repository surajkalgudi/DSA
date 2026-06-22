class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = Integer.MIN_VALUE;
        for(var customer: accounts){
            int sum =0;
            for(int money :customer){
                sum += money;
            }
            wealth = Math.max(wealth, sum);
        }
        return wealth;
    }
}