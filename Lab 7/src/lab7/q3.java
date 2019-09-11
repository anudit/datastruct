package lab7;
import lab7.QueueList;

public class q3 {
	
	public static void main(String[] args) {
		QueueList obj = new QueueList(); 

        obj.enqueue(11); 
        obj.enqueue(22); 
        
        obj.display(); 
        obj.enqueue(33); 
        obj.enqueue(44); 

        obj.display(); 

        obj.dequeue(); 
        obj.dequeue(); 
        
        obj.display(); 
	}
}
