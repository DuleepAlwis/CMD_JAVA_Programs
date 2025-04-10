package ll;

import java.util.LinkedList;

public class ReverseLinkedList{
	
	public static void main(String [] args){
	
		LinkedList<Integer> pre = new LinkedList<Integer>();
		pre.add(1);
		pre.add(2);
		pre.add(3);
		
		LinkedList<Integer> rll = new LinkedList<Integer>();
		
		pre.descendingIterator().forEachRemaining(rll::add);
		
		System.out.println("Previous List "+pre);
		System.out.println("New List after reverse "+rll);

	
	}
}
