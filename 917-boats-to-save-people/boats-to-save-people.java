class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0;
        int j = people.length - 1;
        Arrays.sort(people);
        int count = 0;
        while(i <= j) {
            if(people[i] + people[j] <= limit){
                count += 1;
                i++;
                j--;
            }
            else{
                count += 1;
                j--;
            }
        }
        return count; 
    }
}