package BestTime;

public class BestTimeToBuy {
	 public int maxProfit(int[] prices) {
		 	if(prices.length == 0)
		 	return 0;
		 	
	        int max = 0;
	        int minp = prices[0];
	        for(int i = 0; i<prices.length;i++){
	        	if(prices[i]>minp){
	        			max = Math.max(max, prices[i] - minp);
	        		}
	        	else{
	        			minp = prices[i];
	        		}
	        	}
	        return max;
	    }
}
