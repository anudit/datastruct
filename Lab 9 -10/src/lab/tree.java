package lab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class tree {
	static class Node {
		
        int age;
        String name;
        Node left;
        Node right;
        
        Node(int age, String name) {
            left = null;
            right = null;
            this.name = name;
            this.age = age;

        }
    }
	
	Node root;
	
	tree() {  
        root = null;  
    } 
	
	public static int compare(String n1, String n2) {
        n1 = n1.toLowerCase();
        n2 = n2.toLowerCase();
        int flag = 0;

        for (int i = 0; i < n2.length(); i++) {
            int ch1 = (int) n1.charAt(i);
            int ch2 = (int) n2.charAt(i);

            if (ch1 > ch2) {
                flag = 0;
                break;

            } else if (ch2 > ch1) {
                flag = 1;
                break;

            } else {
                continue;
            }
        }
        return flag;
    }
	
	public static Node min(Node root) {
        Node root2 = null;
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        root2 = root;
        if (root.right != null) {
            root = root.right;
        } else {
            root = null;
        }

        return root2;
    }

    void insert(String name, int age) {
        root = insertR(root, age, name);
    }

    Node insertR(Node root, int age, String name) {

        if (root == null) {
            root = new Node(age, name);
            return root;
        }

        if (compare(root.name, name) == 0) {
            root.left = insertR(root.left, age, name);
        } else if (compare(root.name, name) == 1) {
            root.right = insertR(root.right, age, name);
        }
        
        return root;
    }
    
    String minValue(Node root) { 
        String minv = root.name; 
        while (root.left != null) 
        { 
            minv = root.left.name; 
            root = root.left; 
        } 
        return minv; 
    }
    
    void delete(String name) { 
        root = deleteR(root, name); 
    } 

    Node deleteR(Node root, String name) { 
        if (root == null)  return root; 

        if (compare(root.name, name) == 0) 
            root.left = deleteR(root.left, name); 
        else if (compare(root.name, name) == 1) 
            root.right = deleteR(root.right, name);  
        else { 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 

            root.name = minValue(root.right); 

            root.right = deleteR(root.right, root.name); 
        } 
  
        return root; 
    }
    
    void print() {
    	String st = "";
    	String savedata = printR(root, st);
    	try {
			write(savedata);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static String printR(Node root, String data) {
        if (root != null) {
        	printR(root.left, data);
        	try {
				write(root.name + " " + root.age);
			} catch (IOException e) {
				e.printStackTrace();
			}
            System.out.println(root.name + " " + root.age);
            printR(root.right, data);
        }
        return data;
    }
    
    public static void write(String textToAppend) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/anudit/Documents/GitHub/datastruct/Lab 9/src/lab/data.txt", true)); 
        writer.newLine(); 
        writer.write(textToAppend);
        writer.close();
    }
    
    

}
