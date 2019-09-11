package lab7;

class StackList { 

    private class Node { 
  
        int num;
        Node link;
    } 

    Node top; 

    StackList() { 
        this.top = null; 
    } 

    public void push(int x){ 

        Node temp = new Node(); 
        if (temp == null) { 
            System.out.print("\nHeap Overflow"); 
            return; 
        } 

        temp.num = x; 
        temp.link = top; 
        top = temp; 
    } 

    public boolean isEmpty() { 
        return top == null; 
    } 

    public int peek() { 
        if (!isEmpty()) { 
            return top.num; 
        } 
        else { 
            System.out.println("Stack is empty"); 
            return -1; 
        } 
    } 

    public void pop() { 

        if (top == null) { 
            System.out.print("\nStack Underflow"); 
            return; 
        } 

        top = (top).link; 
    } 
  
    public void display() { 

        if (top == null) { 
            System.out.printf("\nStack Underflow"); 
        } 
        else { 
            Node temp = top; 
            while (temp != null) {
                System.out.printf("%d->", temp.num); 
                temp = temp.link; 
            } 
        } 
    } 
}