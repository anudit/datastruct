package lab11;
import lab11.BinaryTree;

public class question1 {
	public static void main(String args[]) { 
        BinaryTree bt = new BinaryTree(); 

        bt.root = new Node(1); 
        bt.root.left = new Node(2); 
        bt.root.right = new Node(3); 
//        bt.root.left.right = new Node(4); 
//        bt.root.left.left = new Node(5); 
//        bt.root.right.left = new Node(6);
//        bt.root.right.right = new Node(7); 
           
        int node_count = bt.countNodes(bt.root); 
        int index = 0; 
           
        if (bt.isComplete(bt.root, index, node_count)) 
            System.out.println("complete tree"); 
        else
            System.out.println("not a complete tree");  
        
        if(bt.isFull(bt.root)) 
            System.out.println("full tree"); 
        else
            System.out.println("not a full tree");
        
        System.out.println(bt.maxdif(bt.root)); 
        bt.printPaths(bt.root); 
    } 
}
