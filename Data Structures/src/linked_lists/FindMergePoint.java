package linked_lists;

import java.util.HashMap;

public class FindMergePoint {
	int FindMergeNode(Node<Integer> headA, Node<Integer> headB) {
	    // Complete this function
	    // Do not write the main method. 
	    HashMap<Node<Integer>, Boolean> map = new HashMap<Node<Integer>, Boolean>();
	    while(headA != null) {
	        map.put(headA, true);
	        headA = headA.next;
	    }
	    while(headB != null) {
	        if(map.containsKey(headB)){
	            return headB.data;
	        }
	        headB = headB.next;
	    }
	    return -1;
	}
	
	public static 


}
