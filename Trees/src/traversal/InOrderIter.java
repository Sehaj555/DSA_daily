package traversal;

import java.util.*;

public class InOrderIter {
	
	static List<Integer> inOrderIter(Node root) {
		List<Integer> ans=new ArrayList<Integer>();
		if(root==null) return ans;
		
		Stack<Node> st=new Stack<Node>();
		Node node=root;
		
		while(true) {
			if(node!=null) {
				st.push(node);
				node=node.left;
			}
			else {
				if(st.isEmpty()) {
					break;
				}
				node=st.pop();
				ans.add(node.data);
				node=node.right;
			}
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
		
		List<Integer> ans=inOrderIter(root);
		
		System.out.println(ans);
		
	}

}
