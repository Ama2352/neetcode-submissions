# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        length = 0
        p = head
        arr = []
        while p:
            arr.append(p.val)
            length += 1
            p = p.next
        
        res = []
        h, t = 0, length - 1
        for i in range(length):
            if i % 2 == 0:
                res.append(arr[h])
                h += 1
            else:
                res.append(arr[t])
                t -= 1

        result = head
        i = 0
        while result and i < length:
            result.val = res[i]
            i += 1
            result = result.next




