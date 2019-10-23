package lab;

public class q2 {

	public static void main(String[] args) {
		
		tree2 tree = new tree2(); 

        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(25); 
        tree.insert(60); 
        tree.insert(80);
         
        System.out.println("INORDER:");
        tree.inorder(); 
        System.out.println("\nPREORDER:");
        tree.preorder(tree.root); 
        System.out.println("\nPOSTORDER:");
        tree.postorder(tree.root);
        System.out.print("\nLARGEST: ");
        tree.largest();
        System.out.print("SUM: ");
        tree.sum();
	}

}	
