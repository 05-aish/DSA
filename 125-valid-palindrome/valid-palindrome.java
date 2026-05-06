// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//         int i = 0;
//         int j = s.length() - 1;
//         while(i <= j){
//             if(s.charAt(i) == s.charAt(j)){
//                 i++;
//                 j--;
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            char leftChar = s.charAt((i));
            char rightChar = s.charAt((j));
            if(!Character.isLetterOrDigit(leftChar)) {i++; continue;}
            if(!Character.isLetterOrDigit(rightChar)) {j--; continue;}
            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
