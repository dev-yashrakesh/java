package trees;

public class TreeUse {

	public static void main(String[] args) {
		
		TreeNode<Integer> root=new TreeNode<>(5);
		TreeNode<Integer> node1=new TreeNode<>(5);
		TreeNode<Integer> node2=new TreeNode<>(5);
		TreeNode<Integer> node3=new TreeNode<>(5);
		TreeNode<Integer> node4=new TreeNode<>(5);
		
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node3.children.add(node4);
		
		System.out.println(root);
	}

}
