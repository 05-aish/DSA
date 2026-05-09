class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int x1 = 1;
        int x2 = 2;
        for(int i = 3; i < n + 1; i++){
            int num = x1 + x2;
            x1 = x2;
            x2 = num;
        }
        return x2;
    }
}