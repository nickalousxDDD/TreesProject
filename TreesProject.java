import java.util.*;

//represents each node in the tree
class Node {
    int key; 
    Node left, right;
    Node(int item) {
        key = item;
        left = right = null;
    } //root of the bst
} 

public class TreesProject {

    public static void main(String[] args) {
        int [] keys = {50, 70, 20, 10, 90, 80};
        Node root = null;
        System.out.println("hello wrld");
        for (int item : keys) {
            root = insert(root, item);
        }
        GetPrint(root);
    }

    public static void GetPrint(Node root){
        if(root == null){
            System.out.println("The tree is Empty");
        } else {
            //What Gets Printed
            inOrder(root);
            System.out.println("");
            System.out.println( "Left Child: " + root.left.key);
            System.out.println( "Right Child: " + root.right.key);
        }
    }

    public static void inOrder(Node root) {
        if (root != null){
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }


    
public static Node insert(Node root, int item) {
    // If tree is empty, create a new node and return it
    if (root == null) {
        return new Node(item);
    }
    
    // Use a stack to track the path during traversal
    Stack<Node> stack = new Stack<>();
    Node current = root;
    
    
    // Traverse to find the insertion point
    while (current != null) {
        
        stack.push(current);
        
        if (item < current.key) {
            current = current.left;
        } else {
            current = current.right;
        }
    }
    
    // Create the new node
    Node newNode = new Node(item);
    
    // Insert the new node at the right position
    if (stack.isEmpty()) {
        return newNode; // Should never happen if root wasn't null
    }
    
    Node lastNode = stack.pop();
    if (item < lastNode.key) {
        lastNode.left = newNode;
    } else {
        lastNode.right = newNode;
    }
    
    // Update the references going back up the tree
    while (!stack.isEmpty()) {
        current = stack.pop();
        // The structure doesn't change for nodes higher up
        // We just need to ensure we return the original root
    }
    
    return root;
}

    }                



