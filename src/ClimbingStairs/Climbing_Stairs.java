package ClimbingStairs;

public class Climbing_Stairs {
	public int climbStairs(int n) {
		int a = 1;
		int b = 2;
		if(n == 0||n == 1||n ==2) return n;
		int sum = 0;
		for(int i = 2;i<n;i++){
			sum = a + b;
			a = b;
			b = sum;
		}
		return sum;
	}
}
