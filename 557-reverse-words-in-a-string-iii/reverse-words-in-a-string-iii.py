class Solution:
    def reverseWords(self, s: str) -> str:
        s = list(s)
        i = 0
        j = 0 #j tracks position of spaces
        k = j - 1
        
        while j <= len(s) - 1:
            if s[j] == ' ':
                k = j - 1
                while i < k:
                        temp = s[i]
                        s[i] = s[k]
                        s[k] = temp
                    
                        i += 1
                        k -= 1
                i = j + 1
            j += 1
            #swap last word if j has reached end
            if j == len(s) - 1:
                k = j
                while i < k:
                        temp = s[i]
                        s[i] = s[k]
                        s[k] = temp
                    
                        i += 1
                        k -= 1
            

        s = ''.join(s)
        return s