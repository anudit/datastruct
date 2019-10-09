package lab8;

import java.util.*; 

class q3 { 
  
	static class Node {  
	    int coeff, power;  
	    Node next;  
	};  
	  
	static Node addnode(Node start, int coeff, int power)  {  
	
	    Node newnode = new Node();  
	    newnode.coeff = coeff;  
	    newnode.power = power;  
	    newnode.next = null;  
	  
	    if (start == null)  
	        return newnode;  
	  
	    Node p = start;  
	    while (p.next != null)  
	        p = p.next;  
	    p.next = newnode;  
	  
	    return start;  
	}  
	
	static void printList( Node p)  
	{  
	    while (p.next != null) {  
	        System.out.print( p.coeff + "x^" + p.power + " + ");  
	  
	        p = p.next;  
	    }  
	    System.out.print( p.coeff  +"\n");  
	}  
	
	static void removeDuplicates(Node start)  
	{  
	    Node p1, p2, dup;  
	    p1 = start;  
	  
	    while (p1 != null && p1.next != null) {  
	        p2 = p1;  
	  
	        while (p2.next != null) {  
	  
	            if (p1.power == p2.next.power) {  
	  
	                p1.coeff = p1.coeff + p2.next.coeff;  
	                dup = p2.next;  
	                p2.next = p2.next.next;  
	  
	            }  
	            else
	                p2 = p2.next;  
	        }  
	        p1 = p1.next;  
	    }  
	}  
	static Node multiply(Node poly1, Node poly2, Node poly3)  {  
	  
	    Node p1, p2;  
	    p1 = poly1;  
	    p2 = poly2;  
	    while (p1 != null) {  
	        while (p2 != null) {  
	            int coeff, power;
	            coeff = p1.coeff * p2.coeff;  
	            power = p1.power + p2.power;  
	            poly3 = addnode(poly3, coeff, power);   
	            p2 = p2.next;  
	        }  
	        
	        p2 = poly2;  
	        p1 = p1.next;  
	    }  
	 
	    removeDuplicates(poly3);  
	    return poly3;  
	}  
	
	public static void main(String args[])  {  
	  
	    Node poly1 = null, poly2 = null, poly3 = null;  
	    poly1 = addnode(poly1, 6, 0);  
	    poly1 = addnode(poly1, 5, 1);  
	    poly1 = addnode(poly1, 3, 2);  
	  
	    poly2 = addnode(poly2, 8, 0);  
	    poly2 = addnode(poly2, 6, 3);  
	  
	    printList(poly1);  
	    printList(poly2);  
	 
	    poly3 = multiply(poly1, poly2, poly3);  
	
	    printList(poly3);  
	  
	}  
  
  
} 