package lab4;

import lab4.Passengers;
public class Flights {
	Flight head;
	
	static class Flight { 

	     String fno; 
	     Flight next;
	     Passengers passengers = new Passengers();
	     
	     // Constructor 
	     Flight(String d) 
	     { 
	         fno = d;
	         next = null; 
	     }
	     
	     public void addPassenger(String pname) {
	    	 
	    	 passengers = passengers.addPassenger(passengers, pname);
	     }
	     public void removePassenger(String pname) {
	    	 
	    	 passengers = passengers.deletePassenger(passengers, pname);
	     }
	     public Passengers getPassengers() {
	    	 return passengers;
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
