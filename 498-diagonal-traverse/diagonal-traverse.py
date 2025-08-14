class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows = len(mat)
        cols = len(mat[0])

        res = []
        going_up = True

        curr_row =  curr_col = 0
        while len(res) != rows * cols: #if equal, it means we've processed all elems.
            if going_up:
                #defining bounds
                while curr_row >= 0 and curr_col < cols:
                    
                    res.append(mat[curr_row][curr_col])
                    #going up by doing UP and RIGHT.
                    curr_row -= 1
                    curr_col += 1
                
                #if we reach end of col, row gets adjusted by 2, col by 1(to stay in bounds)
                if curr_col == cols:
                    curr_col -= 1
                    curr_row += 2
                
                #row needs fixing, eg. element at 0,0
                else:
                    curr_row += 1      
                going_up = False
            #going down by doing DOWN and LEFT.
            else:
                while curr_row < rows and curr_col >= 0:
                    res.append(mat[curr_row][curr_col])
                    curr_row += 1
                    curr_col -= 1

                #if we reach out of bounds
                if curr_row == rows:
                    curr_col += 2
                    curr_row -= 1
                else:
                    curr_col += 1

                going_up = True
        return res

