package lab8;
class Node  
{ 
    int data; 
    Node next, prev; 
} 
  
class DoublyLinkedList { 
	
	Node head = null; 
	
	public DoublyLinkedList() {
		
	}
  
    static Node createNode(int data)  { 
            Node newNode = new Node();  
            newNode.data = data;  
            newNode.prev = newNode.next = null;  
            return newNode;  
    } 

    public void insert(int data) { 
    	
    		Node newNode = createNode(data);
  
    		Node head = this.head;
            Node current; 

            if (head == null) 
                head = newNode;  

            else if (head.data >= newNode.data) { 
                newNode.next = head; 
                newNode.next.prev = newNode; 
                head = newNode; 
            }
            else { 
                current = head; 

                while (current.next != null &&  
                        current.next.data < newNode.data)  
                    current = current.next; 

                newNode.next = current.next; 

                if (current.next != null)  
                    newNode.next.prev = newNode;  
  
                current.next = newNode;  
                newNode.prev = current;  
            } 
            this.head = head; 
    } 
  
    public void delete(int delNo) { 
    	Node currNode = this.head;

        if (currNode.data == delNo) { 
        	currNode = currNode.next; 
        }
        while (currNode != null) {
        	if(currNode.data == delNo) {
        		Node p = currNode.prev;
        		if (currNode.next != null) {
        			p.next = currNode.next; 
	        		p.next.prev =  p;
        		}
        		else {
        			p.next = null;
        		}
        		break;
        	}
        	currNode = currNode.next;
        }
    }
    
	static int columnSize = 20;
	static String sep = "|";
	
	public static String getFixed(String st) {
		
		if(st == null) {
			st = "null";
		}
		
		String fix = "";
		int spCnt = (columnSize - st.length())/2;
		for (int i=0; i<=spCnt; i++) {
			fix+=" "; 
		}
		fix += st;
		for (int i=0; i<=spCnt-1; i++) {
			fix+=" ";
		}
		int diff = columnSize - (spCnt*2) - st.length();
		for (int i=0; i<diff; i++) {
			fix+=" ";
		}
		fix+=sep;
		return fix;
		
	}
	
	public static String getFixed(int in) {
		return getFixed(Integer.toString(in));
	}
	public static String getFixed(Node n) {
		return getFixed(String.valueOf(n));
	}
    
    public void print() {
    	
    	System.out.print(getFixed("Previous Node"));
    	System.out.print(getFixed("Current Node"));
    	System.out.print(getFixed("Next Node"));
    	System.out.print(getFixed("Node Data") + "\n");
    	
    		Node head = this.head;
    		
            while (head != null) { 
            		System.out.print(getFixed(head.prev));
            		System.out.print(getFixed(head));
            		System.out.print(getFixed(head.next));
            		System.out.print(getFixed(head.data));
            		System.out.println();
                    head = head.next;
            } 
            
  
    } 
} 
 