class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        lastIndex = len(s) - 1
        while lastIndex >= 0 and s[lastIndex] == ' ':
            lastIndex -= 1
        
        res = 0
        for i in range(lastIndex, -1, -1):
            if s[i] == ' ': break
            res += 1
        return res