package DiameterOfBinary;

public class Diameter_of_Binary {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 	int sum ;
	public int diameterOfBinaryTree(TreeNode root) {
			sum = 0;
        depth(root);
        return sum;
    }
	
	public int depth(TreeNode root){
	if(root == null) return 0;
	int left = depth(root.left);
	int right = depth(root.right);
	 
	sum = Math.max(sum, left+right+1);
	return Math.max(left ,right)+1;
	}
}
