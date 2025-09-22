class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = set()
        for key in nums:
            if(key in hashset):
                return True
            hashset.add(key)
        return False