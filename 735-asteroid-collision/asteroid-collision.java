class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i : asteroids){
            boolean collide = false;
            while(!stack.isEmpty() && i < 0 && stack.peek() > 0){
                if(Math.abs(i) > stack.peek()){
                    stack.pop();
                    continue;
                }
                else if(stack.peek() == Math.abs(i)){
                    stack.pop();
                    collide = true;
                    break;
                }
                else{
                    collide = true;
                    break;
                }
            }
            if(!collide){
                stack.push(i);
            }
        }
        // Convert stack to array for the return type
        int[] result = new int[stack.size()];
        for (int j = stack.size() - 1; j >= 0; j--) {
            result[j] = stack.pop();
        }
        return result;
    }
}