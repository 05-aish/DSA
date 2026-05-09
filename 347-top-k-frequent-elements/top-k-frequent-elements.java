class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
	     List<int[]> frequencies = new ArrayList<>();
	     for(int data : nums) {
			freq.put(data, freq.getOrDefault(data, 0) + 1);
	     }
	     List<int[]> freqstore = new ArrayList<>();
	     for(Map.Entry<Integer, Integer> x : freq.entrySet()) {
	    	 freqstore.add(new int[] {x.getKey(), x.getValue()});
	     }
	     freqstore.sort((a,b) -> b[1] - a[1]);
	     int[] OutputArray = new int[k];
	     for(int i = 0; i < k; i++) {
	    	 OutputArray[i] = freqstore.get(i)[0];
	     }
		return OutputArray;

        
        
    }
}