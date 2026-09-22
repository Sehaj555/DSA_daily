package traversal;

import java.util.*;

public class PostOrderIter2 {
	
	public static List<Integer> postOrderIter(Node root){
		
		List<Integer> ans=new ArrayList<Integer>();
		Stack<Node> st=new Stack<Node>();
		Node node=root;
		
		while(node!=null || !st.isEmpty()) {
			if(node!=null) {
				// Go as left far as possible
				st.push(node);
				node=node.left;
			}
			else {
				// Check the right child of the top node
				Node temp=st.peek().right;
				
				// If there is no right child
				if(temp==null) {
					
					temp=st.pop();
					ans.add(temp.data);
					
					while(!st.isEmpty() && temp==st.peek().right) {
						temp=st.pop();
						ans.add(temp.data);
					}
				}
				else {
					node=temp;
				}
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
		
		List<Integer> ans=postOrderIter(root);
		
		System.out.println(ans);
		
	}

}
