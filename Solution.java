class Solution {
    public void reverseString(char[] s) {
        helper(0, s);
    }
    
    public void helper(int index, char[] s){
        if( index >= s.length/2) {
            return;
        }
        s[s.length - index - 1] ^= s[index];
        s[index] ^= s[s.length - index - 1];
        s[s.length - index - 1] ^= s[index];
        
        helper(index + 1, s);
    }
}
