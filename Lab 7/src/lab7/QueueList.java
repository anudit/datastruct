package lab7;

class QNode { 
    int dat; 
    QNode next; 

    public QNode(int dat) 
    { 
        this.dat = dat; 
        this.next = null; 
    } 
} 
  
class QueueList { 
    QNode front, rear; 
  
    public QueueList() { 
        this.front = this.rear = null; 
    } 
  
    void enqueue(int key) { 
        QNode temp = new QNode(key); 

        if (this.rear == null) { 
            this.front = this.rear = temp; 
            return; 
        } 

        this.rear.next = temp; 
        this.rear = temp; 
    } 

    QNode dequeue() { 

        if (this.front == null) 
            return null; 

        QNode temp = this.front; 
        this.front = this.front.next; 

        if (this.front == null) 
            this.rear = null; 
        return temp; 
    } 
    
    public void display() {

    	System.out.println("\n");
    	QNode temp = front; 
         while (temp != null) {
             System.out.printf("%d->", temp.dat); 
             temp = temp.next; 
         }
         
    } 
}