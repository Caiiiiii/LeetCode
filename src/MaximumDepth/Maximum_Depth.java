package MaximumDepth;

public class Maximum_Depth {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 

	 public int maxDepth(TreeNode root) {
		 if(root == null) return 0;
		 int depth_left = maxDepth(root.left)+1;
		 int depth_right = maxDepth(root.right)+1;
		 return (depth_left >= depth_right)?depth_left:depth_right;
    }
}
