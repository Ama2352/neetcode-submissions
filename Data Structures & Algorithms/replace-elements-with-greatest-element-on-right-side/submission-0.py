class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        res = []
        n = len(arr)
        for index in range(n - 1):
            greatest = arr[index+1]
            for j in range(index + 1, n):
                if arr[j] > greatest:
                    greatest = arr[j]
            arr[index] = greatest
        arr[len(arr)-1] = -1
        return arr
