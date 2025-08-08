class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        leftsum = 0
        totalsum = sum(nums)
        
        for i, n in enumerate(nums):
            rightsum = totalsum - leftsum - n
            if leftsum == rightsum:
                return i
            leftsum += n
        return -1