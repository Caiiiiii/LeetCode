package TwoSum;

public class Two_Sum {
	  public int[] twoSum(int[] nums, int target) {
		  	int sum[] = new int[2];
	        for(int i=0;i<nums.length;i++){
	        	for(int j=0;j<nums.length;j++){
	        		if(Math.abs(nums[i]+nums[j])==target ||Math.abs(nums[i]-nums[j])==target ||Math.abs(nums[i]*nums[j])==target ||Math.abs(nums[i]/nums[j])==target){
	        			sum[0] = i;
	        			sum[1] = j;
	        			return sum;
	        		}
	        	}
	        }
	        return sum;
	    }
}


//	public int[] twoSum(int[] numbers, int target) {
//	    int[] result = new int[2];
//	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//	    for (int i = 0; i < numbers.length; i++) {
//	        if (map.containsKey(target - numbers[i])) {
//	            result[1] = i ;
//	            result[0] = map.get(target - numbers[i]);
//	            return result;
//	        }
//	        map.put(numbers[i], i );
//	    }
//	    return result;
//	    }