class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        freqS = defaultdict(int)
        freqT = defaultdict(int)
        for char in s:
            freqS[char] += 1
        for char in t:
            freqT[char] += 1
        
        return freqS == freqT