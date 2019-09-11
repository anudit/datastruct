package lab7;

import java.util.Arrays;
 
public class StackArray <E> {
    private int size = 0;
    private static final int MAX = 10;
    private Object elements[];
 
    public StackArray() {
        elements = new Object[MAX];
    }
 
    public void push(E e) {
        if (size == elements.length) {
        	throw new java.lang.Error("Stack is full");
        }
        elements[size++] = e;
    }

    public E pop() {
        E e = (E) elements[--size];
        elements[size] = null;
        return e;
    }
    
    public E peak() {
        E e = (E) elements[size-1];
        return e;
    }
    
    public boolean isFull() {
    	if (size >= MAX)
    		return true;
    	else
    		return false;	
    }
    
    public boolean isEmpty() {
    	if (size == 0)
    		return true;
    	else
    		return false;	
    }

    public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i < size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
}