class Solution {
    public void reverseString(char[] s) {
        for(int i=0; i<s.length/2;i++){
            char current = s[i];
            int swapIndex = s.length-1-i;
            s[i]= s[swapIndex];
            s[swapIndex] = current;
        }
    }
}