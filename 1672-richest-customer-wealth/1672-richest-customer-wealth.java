class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0,max=0;
        for(int a[] : accounts){
            for(int i:a){
                sum+=i;
                max=Math.max(sum,max);
            }
            sum=0;
        }
        return max;
    }
}