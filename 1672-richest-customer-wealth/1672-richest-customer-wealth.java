class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int[] customer: accounts){
            int sum=0;
            for(int i:customer){
                sum+=i;
            }
            if(sum>wealth){
                wealth=sum;
            }
        }
        return wealth;
    }
}