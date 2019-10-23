package lab;

public class tree2 {
	class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    Node root; 
  
    tree2() {  
        root = null;  
    } 
    
    void insert(int key) { 
       root = insertEle(root, key); 
    } 
    
    Node insertEle(Node root, int key) { 
  
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        
        if (key < root.key) 
            root.left = insertEle(root.left, key); 
        else if (key > root.key) 
            root.right = insertEle(root.right, key); 
  
        return root; 
    }  
    
    void delete(int key) { 
        root = deleteRec(root, key);  
    } 

    Node deleteRec(Node root, int key) { 
        if (root == null)  return root; 

        if (key < root.key) 
            root.left = deleteRec(root.left, key); 
        else if (key > root.key) 
            root.right = deleteRec(root.right, key); 

        else { 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 

            root.key = minValue(root.right); 

            root.right = deleteRec(root.right, root.key); 
        } 
  
        return root; 
    } 
  
    int minValue(Node root) { 
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    }
    
    void inorder()  { 
       inorderRec(root); 
    } 
  
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    }
    
    public static void postorder(Node root) { 
        if (root == null) 
            return; 
 
        postorder(root.left);
        postorder(root.right); 
  
        System.out.print(root.key + "\n"); 
    } 
    
    public static  void preorder(Node root) { 
        if (root == null) 
            return; 
  
        System.out.print(root.key + "\n"); 
        preorder(root.left);
        preorder(root.right); 
    } 
    
    public void largest() {
    	System.out.println(root.key);
    }
    
    public int s = 0;
    
    void sum()  { 
        sumRec(root);
        System.out.println(s);
     } 
   
     void sumRec(Node root) { 
         if (root != null) { 
        	 sumRec(root.left); 
             s+=root.key;
             sumRec(root.right); 
         } 
     }
    
}
