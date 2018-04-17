package ConvertBST;

import java.util.ArrayList;
import java.util.List;

public class BstToGreaterTree {
	
	  public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		  }
	  
	  	
		int sum = 0;
	 public TreeNode convertBST(TreeNode root) {
	     if(root == null) return null;
       
		 if(root.right != null) convertBST(root.right); 
		 
		 sum += root.val;
		 root.val = sum;
		 
		 if(root.left != null) convertBST(root.left); 
		return root;
	 } 
}
