package lab11;

class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item) { 
        data = item; 
        left = right = null; 
    } 
} 
   
class temp  { 
    int data = Integer.MIN_VALUE; 
} 

class BinaryTree  
{ 
    Node root; 
    int countNodes(Node root) { 
        if (root == null) 
            return (0); 
        return (1 + countNodes(root.left) + countNodes(root.right)); 
    } 

    boolean isComplete(Node root, int index, int number_nodes) { 
        if (root == null)         
           return true; 

        if (index >= number_nodes) 
           return false; 

        return (isComplete(root.left, 2 * index + 1, number_nodes) && isComplete(root.right, 2 * index + 2, number_nodes)); 
   
    } 
   
    boolean isFull(Node node) { 
        if(node == null) 
        return true; 
           
        if(node.left == null && node.right == null ) 
            return true; 

        if((node.left!=null) && (node.right!=null)) 
            return (isFull(node.left) && isFull(node.right)); 

        return false; 
    }  
    
    int max(Node curr, temp tmp) { 
        if (curr == null) 
            return Integer.MAX_VALUE; 

        if (curr.left == null && curr.right == null) 
            return curr.data; 

        int val = Math.min(max(curr.left, tmp), max(curr.right, tmp)); 
        tmp.data = Math.max(tmp.data, curr.data - val); 

        return Math.min(val, curr.data); 
    } 
    
    int maxdif(Node root)  { 
    	temp tmp = new temp(); 
    	max(root, tmp); 
        return tmp.data; 
    }
    void printPaths(Node node){ 
        int path[] = new int[1000]; 
        printPathsRecur(node, path, 0); 
    } 

    void printPathsRecur(Node node, int path[], int pathLen)  
    { 
        if (node == null) 
            return; 
   
        path[pathLen] = node.data; 
        pathLen++; 

        if (node.left == null && node.right == null) 
            printArray(path, pathLen); 
        else { 
            printPathsRecur(node.left, path, pathLen); 
            printPathsRecur(node.right, path, pathLen); 
        } 
    } 

    void printArray(int ints[], int len) { 
        int i; 
        for (i = 0; i < len; i++)  
        { 
            System.out.print(ints[i] + " "); 
        } 
        System.out.println(""); 
    }
} 