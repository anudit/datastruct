package lab4;

public class Passengers {
	Passenger head;
	static int total = 0;
	static class Passenger { 

	     String name; 
	     Passenger next;
	     
	     // Constructor 
	     Passenger(String d) 
	     { 
	         name = d;
	         next = null; 
	     }

	 }
	
	 public static Passengers addPassenger(Passengers list, String _pname) { 
		 
		 total++;
		 Passenger new_node = new Passenger(_pname); 
	     new_node.next = null; 

	     if (list.head == null) { 
	         list.head = new_node; 
	     } 
	     else { 

	    	 Passenger last = list.head; 
	         while (last.next != null) { 
	             last = last.next; 
	         } 

	         last.next = new_node; 
	     } 

	     return list; 
	 } 

	 public static void print(Passengers listA) { 
		 Passenger currNode = listA.head; 

	     System.out.print("Passengers: "); 

	     while (currNode != null) { 
	         System.out.println(currNode.name + " "); 
	         currNode = currNode.next; 
	     } 
	 } 

	 public static Passengers deletePassenger(Passengers list, String name) { 
		 total--;
		 Passenger currNode = list.head; 

	     while (currNode != null) { 
	         if(currNode.name.equals(name) == true) {
	        	 currNode.next = currNode.next.next;
	        	 break;
	         }
	         else {
	        	 currNode = currNode.next;
	         }
	     } 
	     
	     return list; 
	 } 
	 
	 public static boolean isPassenger(Passengers list, String _name) { 
		 Passenger currNode = list.head; 

	     while (currNode != null) { 
	         if(currNode.name.equals(_name) == true) {
	        	 return true;
	         }
	         else {
	        	 currNode = currNode.next;
	         }
	     }
	     
	     return false; 
	 }
	 
	 public static Passenger getPassenger(Passengers list, String _name) { 
		 Passenger currNode = list.head; 

	     while (currNode != null) { 
	         if(currNode.name.equals(_name) == true) {
	        	 return currNode;
	         }
	         else {
	        	 currNode = currNode.next;
	         }
	     }
	     
	     return new Passenger("Not Found"); 
	 }

	} 
