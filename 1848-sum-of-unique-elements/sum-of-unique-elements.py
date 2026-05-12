class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        freqmap = {}
        count = 0

        for i in range(len(nums)):
            freqmap[nums[i]] = freqmap.get(nums[i], 0) + 1

        for key, value in freqmap.items():
            if value == 1:
                count += key
        return count