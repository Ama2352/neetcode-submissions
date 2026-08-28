class Solution {

    private boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }

    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int l = 0;
        int r = str.length() - 1;
        while(l < r) {
            while(l < r && !isAlphaNum(str.charAt(l))) {
                l++;
                continue;
            }
            while(l < r && !isAlphaNum(str.charAt(r))) {
                r--;
                continue;
            }
            if(str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
