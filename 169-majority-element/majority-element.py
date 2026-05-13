class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majorNo = len(nums) // 2
        freqMap = {}
        for i in range(len(nums)):
            freqMap[nums[i]] = freqMap.get(nums[i], 0) + 1
        
        for key, val in freqMap.items():
            if val > majorNo:
                return key