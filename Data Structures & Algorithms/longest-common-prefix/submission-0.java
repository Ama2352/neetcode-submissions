class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String pivot = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(!pivot.isEmpty() && !strs[i].contains(pivot)) {
                pivot = pivot.substring(0, pivot.length() - 1);
            }
        }

        return pivot;
    }
}