package lab4;

import java.util.ArrayList;

public class Flights {
	Flight head;
	
	static class Flight { 

	     String fno; 
	     Flight next; 
	     ArrayList<String> passengers = new ArrayList<String>();
	     
	     // Constructor 
	     Flight(String d) 
	     { 
	         fno = d;
	         next = null; 
	     }
	     
	     public void addPassenger(String pname) {
	    	 passengers.add(pname);
	     }
	     public void removePassenger(String pname) {
	    	 passengers.remove(pname);
	     }
	 }
	
	 public static Flights addFlight(Flights list, String string) { 
		 Flight new_node = new Flight(string); 
	     new_node.next = null; 

	     if (list.head == null) { 
	         list.head = new_node; 
	     } 
	     else { 

	    	 Flight last = list.head; 
	         while (last.next != null) { 
	             last = last.next; 
	         } 

	         last.next = new_node; 
	     } 

	     return list; 
	 } 

	 public static void print(Flights listA) { 
		 Flight currNode = listA.head; 

	     System.out.print("LinkedList: "); 

	     while (currNode != null) { 
	         System.out.print(currNode.fno + " "); 
	         currNode = currNode.next; 
	     } 
	 } 

	 public static Flights deleteFlight(Flights list, String inpFno) { 
		 Flight currNode = list.head; 

	     while (currNode != null) { 
	         if(currNode.fno.equals(inpFno) == true) {
	        	 currNode.next = currNode.next.next;
	        	 break;
	         }
	         else {
	        	 currNode = currNode.next;
	         }
	     } 
	     
	     return list; 
	 } 
	 
	 public static boolean isFlight(Flights list, String inpFno) { 
		 Flight currNode = list.head; 

	     while (currNode != null) { 
	         if(currNode.fno.equals(inpFno) == true) {
	        	 return true;
	         }
	         else {
	        	 currNode = currNode.next;
	         }
	     }
	     
	     return false; 
	 }
	 
	 public static Flight getFlight(Flights list, String inpFno) { 
		 Flight currNode = list.head; 

	     while (currNode != null) { 
	         if(currNode.fno.equals(inpFno) == true) {
	        	 return currNode;
	         }
	         else {
	        	 currNode = currNode.next;
	         }
	     }
	     
	     
	     return new Flight("Not Found"); 
	 }

	} 
