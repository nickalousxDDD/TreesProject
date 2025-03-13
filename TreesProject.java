import java.util.Stack;
import java.util.Arrays;

public class TreesProject {

    public static void main(String[] args) {
        System.out.println("Hello world");

        SortingIntegers sorter = new SortingIntegers();
        Integer[] arrIntegers = {34,63,67,17,27,18,82,14,97,71,13,67};

        System.out.println("Original array: " + Arrays.toString(arrIntegers));

        sorter.sortIntegerArray(arrIntegers); // This will sort and print the array

    }
}

// Sorting integers using Binary Search Tree (BST)
class SortingIntegers {

    public void sortIntegerArray(Integer[] arr) {
        BST bst = new BST(); // Create a new BST object

        for (int num : arr) {
            bst.insert(num); // Insert each element into the BST
        }

        System.out.println("Sorted order (in-order traversal): ");
        bst.inOrderTraversal(); // Print sorted array using in-order traversal

        bst.getRootDetails(); // Print root, left and right subtrees

    }
}

// Binary Search Tree (BST) class
class BST {
    private Node root; // Root of the BST

    // Constructor for the BST
    public BST() {
        root = null;
    }

    // Node class to represent each node in the BST
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Insert a key into the BST
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key into the BST
    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key); // Create a new node if the tree is empty
            return root;
        }

        if (key <= root.key) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Perform in-order traversal to print elements in sorted order
    public void inOrderTraversal() {
        if (root == null) 
         System.out.println("Tree is Empty");  // If the tree is empty, do nothing

        Stack<Node> stack = new Stack<>();
        Node current = root;

        // Traversing the tree using a stack (non-recursive in-order traversal)
        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left; // Go to the left subtree
            }

            current = stack.pop();
            System.out.print(current.key + " "); // Print the key

            // Move to the right subtree
            current = current.right;
        }

        System.out.println();
    }

     // Method to return the root key, left subtree, and right subtree
     public void getRootDetails() {
        if (root != null) {
            System.out.println("Root Key: " + root.key);
            
            if (root.left != null) {
                System.out.println("Left Subtree Key: " + root.left.key); // Return left child key
            } else {
                System.out.println("Left Subtree: None"); // If there's no left child
            }
    
            if (root.right != null) {
                System.out.println("Right Subtree Key: " + root.right.key); // Return right child key
            } else {
                System.out.println("Right Subtree: None"); // If there's no right child
            }
        } else {
            System.out.println("Tree is Empty");
        }
    }

}
