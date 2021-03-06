package FindNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/** 
 * Brilliant idea! Because the elements in the Array are from 1 to n,
 *  so subtracting 1 will be 0 to n-1 which are the index of the array.
Take input [4.3.2.7.8.2.3.1] as an example,
 by subtracting 1 it becomes [3.2.1.6.7.1.2.0] which is an array of index.
For the first iteration
when i = 0 , it marks the nums[3] as negative, the array become [4.3.2.-7.8.2.3.1].
when i = 1, it marks the nums[2] as negative, the array become [4.3.-2.-7.8.2.3.1].
when i = 2, it marks the nums[1] as negative, the array become [4.-3.-2.-7.8.2.3.1].
when i = 3, it marks the nums[6] as negative, the array become [4.-3.-2.-7.8.2.-3.1].
��
��
when i = 6, it marks the nums[0] as negative, the array become [-4.-3.-2.-7.8.2.-3.-1].

For the second iteration
find nums[4] = 8 and nums[5] = 2 which > 0;
which means 4 and 5 are not in the index array[3.2.1.6.7.1.2.0].
by adding 1, 5 and 6 are not in the input[4.3.2.7.8.2.3.1]
return[5.6]*/

public class FindAllNumbers {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		
			for(int i=0 ; i<nums.length ; i++){
				int val = Math.abs(nums[i]) - 1;
				if(nums[val] > 0){
					nums[val] = -nums[val];
				}
			}
			
			for(int i=0 ; i<nums.length ; i++){
				if(nums[i] > 0){
					list.add(i+1);
				}
			}
			return list;
	}
}
