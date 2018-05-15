package CountingBits;

public class Counting_bits {
  public int[] countbits(int num){
	  int[] result = new int[num+1];
	  result[0]=0;
	  for (int i = 1; i <= num; ++i) {
          result[i] = result[i / 2] + (i % 2);
      }
	  return  result;
    }

}
