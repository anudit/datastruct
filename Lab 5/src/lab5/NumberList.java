package lab5;

public class NumberList {
	Number head;
	static int total = 0;
	static class Number { 

        public int num; 
        Number next;

        Number(int d) { 
        	num = d;
            next = null; 
        }
        
        public int getNum() {
        	return num;
        }

	}
	

	
    public static NumberList addNumber(NumberList list, int _num) { 
        
        total++;
        Number new_node = new Number(_num); 
        new_node.next = null; 

        if (list.head == null) { 
            list.head = new_node; 
        }
        else { 

            Number last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 

            last.next = new_node; 
        } 

        return list; 
    } 

	 public static void print(NumberList listA) { 
		 Number currNode = listA.head; 

	     System.out.print("Number List : "); 

	     while (currNode != null) { 
	         System.out.print(currNode.num + " "); 
	         currNode = currNode.next; 
	     } 
	 } 
	 
	 public static void print(NumberList listA, int _skip) { 
		 Number currNode = listA.head; 
		 int skip = _skip;
	     System.out.print("Number List : "); 

	     while (currNode != null) { 
	    	 if(skip != 0) {
	    		 System.out.print(currNode.num + " "); 
		         skip--;
	    	 }
	    	 else {
	    		 skip = _skip;
	    	 }  
	    	 currNode = currNode.next;
	     } 
	 } 

    public static NumberList deleteNumber(NumberList list, int _name) { 
        total--;
        Number currNode = list.head; 

        while (currNode != null) { 
            if(currNode.num == _name) {
                currNode.next = currNode.next.next;
                break;
            }
            else {
                currNode = currNode.next;
            }
        } 
        
        return list; 
    } 
	 
	 public static boolean isNumber(NumberList list, int _name) { 
		 Number currNode = list.head; 

	     while (currNode != null) { 
	    	 if(currNode.num == _name) {
	        	 return true;
	         }
	         else {
	        	 currNode = currNode.next;
	         }
	     }
	     
	     return false; 
	 }
	 
    public static Number getNumberByNumber(NumberList list, int _name) { 
        Number currNode = list.head; 

        while (currNode != null) { 
        	if(currNode.num == _name) {
                return currNode;
            }
            else {
                currNode = currNode.next;
            }
        }
        
        return new Number(0); 
    }
    
    public static int getNumberByIndex(NumberList list, int _index, boolean _reverse) { 
        Number currNode = list.head; 
        
        if(_reverse = true) {
        	_index = total - _index;
        }
  
        int cnt = 0;
        
        while (currNode != null) { 
        	if(cnt == _index) {
                return currNode.num;
            }
        	currNode = currNode.next;
        	cnt++;
        }
        
        return -1; 
    }
    
    public static int getNumberByIndex(NumberList list, int _index) {
    	return getNumberByIndex(list, _index, false);
    }
    
    public static NumberList unique(NumberList list) { 
        Number currNode = list.head; 
        NumberList uniqueList = new NumberList();
        while (currNode != null) { 
        	if(uniqueList.isNumber(uniqueList, currNode.num) == false) {
        		uniqueList.addNumber(uniqueList, currNode.num);
        	}
        	currNode = currNode.next;
        }
        
        return uniqueList; 
    }
    
	public NumberList join(NumberList l1, NumberList l2){
		l1.total += l2.total;

        if (l1.head == null) { 
        	l1.head = l2.head;
        }
        else {
        	Number last = l1.head; 
            while (last.next != null) { 
                last = last.next; 
            }
            last.next = l2.head; 
        } 
		return l1;
	}

} 
