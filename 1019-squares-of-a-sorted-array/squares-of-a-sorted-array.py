class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        i = 0
        j = len(nums) - 1
        result = [0]*len(nums)
        r = len(nums) - 1
        while j >= 0 and i <= j:
            if abs(nums[i]) > abs(nums[j]):
                result[r] = nums[i] * nums[i]
                i += 1
            else:
                result[r] = nums[j] * nums[j]
                j -= 1
            r = r - 1
        return result