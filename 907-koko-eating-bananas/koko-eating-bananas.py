class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l = 1
        r = max(piles)
        res = 0

        while(l <= r):
            m = (l + r )// 2
            totalHours = 0
            for i in piles:
                totalHours += (i + m - 1) // m
            if totalHours > h:
                l = m + 1
            else:
                r = m - 1
                res = m
        return res