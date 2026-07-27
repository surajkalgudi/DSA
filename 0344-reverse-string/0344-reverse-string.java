class Solution {
    public void reverseString(char[] s) {
        for(int i=0; i<s.length/2;i++){
            char temp = s[i];
            int length = s.length-1-i;
            s[i]= s[length];
            s[length] = temp;
        }
    }
}