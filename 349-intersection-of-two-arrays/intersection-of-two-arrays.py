class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        hashset1 = set()
        hashset2 = set()
        for i in nums1:
            hashset1.add(i)
        for i in nums2:
            hashset2.add(i)
        return list(hashset1 & hashset2)