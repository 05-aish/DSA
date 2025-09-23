class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        hashset = set()
        for key in nums:
            if key in hashset:
                hashset.remove(key)
            else:
                hashset.add(key)
        return list(hashset)[0]
            
            
                