package JewelsAndStones;


//You're given strings J representing the types of stones that are jewels,
//and S representing the stones you have.  Each character in S is a type of stone you have.
//You want to know how many of the stones you have are also jewels.
//
//The letters in J are guaranteed distinct, and all characters in J and S are letters.
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//Example 1:
//
//Input: J = "aA", S = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: J = "z", S = "ZZ"
//Output: 0


public class Jewels_And_Stones {
	   public int numJewelsInStones(String J, String S) {
	        int result = 0;
	        for(int i = 0;i<S.length();i++){
	        	for(int j = 0;j<J.length();j++){
	        		if(S.substring(i, i+1).equals(J.substring(j, j+1))){
	        			result++;
	        		}
	        	}
	        }
	        return result;
	    }

	    // public int numJewelsInStones(String J, String S) {
		//    return S.replaceAll("[^" + J + "]", "").length();
		//}              
	
}


