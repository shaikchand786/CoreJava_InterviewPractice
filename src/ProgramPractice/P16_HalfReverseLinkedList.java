package ProgramPractice;

import java.util.LinkedList;

public class P16_HalfReverseLinkedList {

	public static void main(String[] args) {

		 LinkedList<String> ll = new LinkedList<String>();
	        ll.add("Aman");
	        ll.add("Chand");
	        ll.add("Nazira");
	        ll.add("Basha");
	        ll.add("Dad");
	        ll.add("Mom");
	      System.out.println(ll);
	   // Reverse the second half of the LinkedList
	      int mid = ll.size() / 2;
	      System.out.println(mid);
	      for (int i = 0; i < ll.size() - mid - 1; i++)	//ll.size() - mid --> calculates the number of elements in the second half.
	      {
	    	  //Use a single for loop to remove the last element (removeLast()) 
	    	  //and add it back at the appropriate index (add(mid + i, element)).
	            ll.add(mid + i, ll.removeLast());	//removeLast() --> used to remove and return the last element of a LinkedList.
	      }
        System.out.println("LinkedList after reversing the second half: " + ll);

	}

}

//Explanation for "linkedList.add(mid + i, linkedList.removeLast());":

//linkedList.removeLast():
//Removes and returns the last element of the list.
//For example, if linkedList = [1, 2, 3, 4, 5, 6], the first call removes 6.
//linkedList.add(mid + i, element):
//
//Inserts the removed element (6 in this case) at the calculated index (mid + i).
//In the first iteration:
//mid = 3, i = 0, so mid + i = 3.
//The list becomes [1, 2, 3, 6, 4, 5]

//How the Loop Works:
//First Iteration:
//
//removeLast() removes 6.
//add(mid + i, 6) adds 6 at index 3.
//List becomes: [1, 2, 3, 6, 4, 5].
//Second Iteration:
//
//removeLast() removes 5.
//add(mid + i, 5) adds 5 at index 4.
//List becomes: [1, 2, 3, 6, 5, 4].

