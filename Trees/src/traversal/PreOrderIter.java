package traversal;
import java.util.*;

// root left right

public class PreOrderIter {
	
	public static List<Integer> preOrderIter(Node root) {
		
		List<Integer> ans=new ArrayList<Integer>();
		if(root==null) return ans;
		
		Stack<Node> st=new Stack<Node>();
		st.push(root);
		
		while(!st.isEmpty()) {
			root=st.pop();
			ans.add(root.data);
			if(root.right!=null) st.push(root.right);
			if(root.left!=null) st.push(root.left);
			
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
		
		List<Integer> ans=preOrderIter(root);
		
		System.out.println(ans);
		
	}

}
