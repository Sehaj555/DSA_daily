package traversal;
import java.util.*;

public class PostOrderIter {
	
	public static List<Integer> postOrderIter(Node root){
		Stack<Node> st1=new Stack<Node>();
		Stack<Node> st2=new Stack<Node>();
		List<Integer> ans=new ArrayList<Integer>();
		
		if(root==null) return ans;
		
		st1.push(root);
		while(!st1.isEmpty()) {
			root=st1.pop();
			st2.push(root);
			if(root.left!=null) st1.push(root.left);
			if(root.right!=null) st1.push(root.right);
			
		}
		while(!st2.isEmpty()) {
			ans.add(st2.pop().data);
		}
		
		return ans;
		
				
	}
	
	
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		List<Integer> ans=postOrderIter(root);
		
		System.out.println(ans);
		
	}

}
