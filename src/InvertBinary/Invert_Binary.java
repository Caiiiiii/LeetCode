package InvertBinary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;



	public class Invert_Binary {
		public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
		
		 public TreeNode invertTree(TreeNode root) {
			    if (root == null){
		            return root;
		        }

		        TreeNode tmp = root.left;
		        root.left = root.right;
		        root.right = tmp;

		        invertTree(root.left);
		        invertTree(root.right);

		        return root;

	    
	}
		 
		 /**
		  *     	1
		  * 	2       3 
		  * 4      5  6    7
		  * 
		  * 		|第一步
		  * 		
		  * 	  	1
		  * 	3       2 
		  * 6      7  4    5
		  * 		|第二步
		  * 	  	1
		  * 	3       2 
		  * 7      6  5    4
		  * 	
		  * 
		  * 
		  * */

}
