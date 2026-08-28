class Solution:
    def scoreOfString(self, s: str) -> int:
        if len(s) == 1: return 0 
        p = 1
        score = 0
        while p < len(s):
            score += abs(ord(s[p]) - ord(s[p-1]))
            p += 1
        return score
