class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        unsorted_heights = heights.copy()
        heights.sort()
        counter = 0
        for i in range(len(heights)):
            if heights[i] != unsorted_heights[i]:
                counter += 1
        return counter