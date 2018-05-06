package HouseRobber;

public class House_Robber {
	public int rob(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		if(nums.length == 1)
			return nums[0];
		
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = nums[1];
		dp[1] = Math.max(dp[0], dp[1]);  //��ʵȡ�ķ�ʽ�����֣�Ҫô��0λ�ÿ�ʼ��Ҫô��1λ�ÿ�ʼ������ѡ���нϴ���Ǹ�ô��
		for(int i = 2; i < nums.length; i++)
			dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
		
		return dp[nums.length-1];
        
    }
}