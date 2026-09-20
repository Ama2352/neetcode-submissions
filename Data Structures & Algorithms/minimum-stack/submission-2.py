class MinStack:

    def __init__(self):
        self.currentMin = float('inf')
        self.stack = []

    def push(self, val: int) -> None:
        if not self.stack:
            self.stack.append(0)
            self.currentMin = val 
        else:
            self.stack.append(val - self.currentMin)       
            if val < self.currentMin:
                self.currentMin = val

    def pop(self) -> None:
        top = self.stack[-1]
        if top < 0:
            self.currentMin = self.currentMin - top
        self.stack.pop()

    def top(self) -> int:
        top = self.stack[-1]
        if top >= 0:
            return top + self.currentMin
        else:
            return self.currentMin

    def getMin(self) -> int:
        return self.currentMin
        
