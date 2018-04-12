package SingleNumber;



//Given an array of integers, 
//every element appears twice except for one. Find that single one.

public class Single_Number {
	public static void main(String[] args) {
		int[] num = new int[]{1,2,3,2,1,3,4};
		int result=0;
		for(int i=0;i<num.length;i++){
			result^=num[i];
		}
		System.out.println(result);
	}
}
