package traversal;
import java.util.*;

public class Level {
	
	static List<List<Integer>> levelOrder(Node root) {
		Queue<Node> queue=new LinkedList<Node>();
	    List<List<Integer>> ans = new LinkedList<List<Integer>>();
		
		if(root==null) return ans;
		
		queue.offer(root);
		while(!queue.isEmpty()) {
			int levelNum=queue.size();
			List<Integer> subAns = new LinkedList<Integer>();
			for (int i=0;i<levelNum;i++) {
				Node current=queue.poll();
				subAns.add(current.data);
				if(current.left!=null) {
					queue.offer(current.left);
				}
				if(current.right!=null) {
					queue.offer(current.right);
				}
			}
			ans.add(subAns);
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
		
		List<List<Integer>> ans = levelOrder(root);
		System.out.println(ans);
	}

}
