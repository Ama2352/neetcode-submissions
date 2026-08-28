class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> freqS = new HashMap<>();
         Map<Character, Integer> freqT = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);
            freqS.put(cS, freqS.getOrDefault(cS, 0) + 1);
            freqT.put(cT, freqT.getOrDefault(cT, 0) + 1);
        }
        return freqS.equals(freqT);
    }
}
