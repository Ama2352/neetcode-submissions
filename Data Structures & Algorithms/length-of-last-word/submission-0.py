class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        tripStr = s.strip()
        res = 0
        for i in range(len(tripStr) - 1, -1, -1):
            if tripStr[i] == ' ': break
            res += 1
        return res