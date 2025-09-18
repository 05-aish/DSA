class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n = len(matrix)
        m = len(matrix[0])

        left = 0
        top = 0
        right = m - 1
        bottom = n - 1

        order = []
        while(left <= right and top <= bottom):
            #right
            for i in range(left, right + 1):
                order.append(matrix[top][i])
            top += 1

            #bottom
            for i in range(top, bottom + 1):
                order.append(matrix[i][right])
            right -= 1
            #left
            if(top <= bottom):
                for i in range(right, left - 1, -1):
                    order.append(matrix[bottom][i])
                bottom -= 1
            #top
            if(left <= right):
                for i in range(bottom, top - 1, -1):
                    order.append(matrix[i][left])
                left += 1
        return order


        