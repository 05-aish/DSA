class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap = 0;
        int maxCap = 0;
        for(int i = 0; i < weights.length; ++i){
            maxCap += weights[i];
            int currMin = weights[i];
            minCap = Math.max(minCap, currMin);
        }
 
        while(minCap < maxCap){
            int daysNeeded = 1;
            int currentLoad = 0;
            int mid = minCap + (maxCap - minCap)/2;
            
            for(int i = 0; i < weights.length; i++){
    
                if(currentLoad + weights[i] > mid){
                    daysNeeded += 1;
                    currentLoad = 0;
                }
                currentLoad += weights[i];
            }

            if(daysNeeded > days){
                minCap = mid + 1;
            }
            else{
                maxCap = mid;
            }
        }
        return minCap;
    }
}