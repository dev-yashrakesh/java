package trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class TreeInput {

	public static TreeNode<Integer> takeinput(Scanner s){
		int n;
		System.out.println("Enter Root Node");
		n=s.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		System.out.println("Enter children for "+n);
		int childcount=s.nextInt();
		for(int i=0;i<childcount;i++) {
			TreeNode<Integer> child=takeinput(s);
			root.children.add(child);
			
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
		
	}
	
	public static TreeNode<Integer> takeinputLevelWise(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter RootNode ");
		int rootNode=s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingRoot=new QueueUsingLL<>();
		TreeNode<Integer> root=new TreeNode<Integer>(rootNode);
		pendingRoot.enqueue(root);
		while(!pendingRoot.isEmpty()) {
			try {
				TreeNode<Integer> frontNode=pendingRoot.dequeue();
				System.out.println("Enter number of child for "+frontNode.data);
				int numChild=s.nextInt();
				for(int i=0;i<numChild;i++) {
					System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
					int child=s.nextInt();
					TreeNode<Integer> childNode=new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingRoot.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				return null;
			}
		}
		return root;
	}
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		if(root==null) {
			return;
		}
		Queue<TreeNode<Integer>> pendingRoot=new LinkedList<>();
		pendingRoot.add(root);
		pendingRoot.add(null);
		while(!pendingRoot.isEmpty()) {
			TreeNode<Integer> front=pendingRoot.poll();
			if(front!=null) {
				System.out.print(front.data+" ");
				for(int i=0;i<front.children.size();i++) {
					pendingRoot.add(front.children.get(i));
				}
				
			}
			else {
			System.out.println();
			if(!pendingRoot.isEmpty()) {
				pendingRoot.add(null);
			}
			}
			
		}

	}
	
	public static int CountNode(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int count=1;
		for(int i=0;i<root.children.size();i++) {
			count+=CountNode(root.children.get(i));
		}
		return count;
	}
	
	public static int sumOfAllNode(TreeNode<Integer> root){
		if(root==null) {
			return 0;
		}
		int sum=0;
		Queue<TreeNode<Integer>> pending=new LinkedList<>();
		pending.add(root);
		while(!pending.isEmpty()) {
			TreeNode<Integer> front=pending.poll();			
				sum=sum+front.data;
				for(int i=0;i<front.children.size();i++) {
					pending.add(front.children.get(i));				
			}
			
		}
		return sum;
	}
	
	public static int largest(TreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int ans=root.data;
		for(int i=0;i<root.children.size();i++) {
			int child=largest(root.children.get(i));
			if(child>ans) {
				ans=child;
			}
		}
		return ans;
		
	}
	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		if(root==null) {
			return 0;
		}	
		
		int count=0;
		Queue<TreeNode<Integer>> pending=new LinkedList<>();
		pending.add(root);
		while(!pending.isEmpty()) {
			TreeNode<Integer> front=pending.poll();
			if(front.data>x) {
				count++;
			}
			for(int i=0;i<front.children.size();i++) {
				pending.add(front.children.get(i));
			}
		}
		return count;
	}
	
	
	public static int getHeight(TreeNode<Integer> root){
		if(root==null) {
			return 0;
		}
		int ht=0;
		for(int i=0;i<root.children.size();i++) {
			int childheight=getHeight(root.children.get(i));
			ht=Math.max(ht,childheight);
		}
		ht+=1;
		return ht;
	}
	
	
	public static void printAtK(TreeNode<Integer> root,int k) {
		if(k<0) {
			return;
		}
		
		if(k==0) {
			System.out.print(root.data+" ");
		}
		for(int i=0;i<root.children.size();i++) {
			printAtK(root.children.get(i),k-1);
		}
	}
	
	

	public static int countLeafNodes(TreeNode<Integer> root){

		if(root==null) {
			return 0;
		}
		int count=0;
		if(root.children.size()==0) {
			count++;
		}
		
		for(int i=0;i<root.children.size();i++) {
			int small=countLeafNodes(root.children.get(i));
			count=count+small;
		}
		return count;
	}
	
	public static void preorder(TreeNode<Integer> root) {
		System.out.print(root.data+" ");
		
		for(int i=0;i<root.children.size();i++) {
			preorder(root.children.get(i));
		}
	}
	
	public static void printPostOrder(TreeNode<Integer> root){
		for(int i=0;i<root.children.size();i++) {
			printPostOrder(root.children.get(i));
			
		}
		System.out.print(root.data+" ");
	}
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		if(root==null) {
			return false;
		}
		
		Queue<TreeNode<Integer>> pending=new LinkedList<>();
		pending.add(root);
		while(!pending.isEmpty()) {
			TreeNode<Integer> front=pending.poll();
			if(front.data==x) {
				return true;
			}
			else {
				for(int i=0;i<front.children.size();i++) {
					pending.add(front.children.get(i));
				}
			}
		}
		return false;

	}
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		if(root1==null||root2==null) {
			return false;
		}
		
		Queue<TreeNode<Integer>> pending1=new LinkedList<>();
		pending1.add(root1);
		Queue<TreeNode<Integer>> pending2=new LinkedList<>();
		pending2.add(root2);
		
		while(!pending1.isEmpty()&&!pending2.isEmpty()) {
			TreeNode<Integer> front1=pending1.poll();
			TreeNode<Integer> front2=pending2.poll();
			if(front1.data!=front2.data) {
				return false;
			}
			else {
				int i=0,j=0;
				while(i<front1.children.size()&&j<front2.children.size()) {
					pending1.add(front1.children.get(i));
					pending2.add(front2.children.get(i));
					i++;
					j++;
				}
			}
		}
		return true;
	}
	
	public static void replaceWithDepthValue(TreeNode<Integer> root){
		replaceWithDepthValue(root,0);
		
		
	}
	
	public static void replaceWithDepthValue(TreeNode<Integer> root,int depth){

		if(root==null) {
			return;
		}
		
		root.data=depth;
		
		for(int i=0;i<root.children.size();i++) {
			replaceWithDepthValue(root.children.get(i),depth+1);
		}
		
	}
	
public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		if(root==null) {
			return null;
		}
		Queue<TreeNode<Integer>> pending=new LinkedList<>();
		pending.add(root);
		while(!pending.isEmpty()) {
			TreeNode<Integer> front=pending.poll();
			if(front.data>n) {
				return front;
			}
			for(int i=0;i<front.children.size();i++) {
				pending.add(front.children.get(i));
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);


		TreeNode<Integer> root1=takeinputLevelWise();
//		TreeNode<Integer> root2=takeinputLevelWise();
//		printLevelWise(root);
//		int count=CountNode(root);
//		System.out.println(count);
//		int sum=sumOfAllNode(root);
//		System.out.println(sum);
//		int larg=largest(root);
//		System.out.println(larg);
//		int greater=numNodeGreater(root,10);
//		System.out.println(greater);
//		
//		int ht=getHeight(root);
//		System.out.println(ht);
//		printAtK(root,1);
		
//		preorder(root1);
//		printPostOrder(root);
		
//		boolean ans=checkIfContainsX(root,4);
//		System.out.println(ans);
		
//		boolean identical=checkIdentical(root1,root2);
//		System.out.println(identical);
		replaceWithDepthValue(root1);
	}
	

}
