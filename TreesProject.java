<<<<<<< HEAD
/*
 Collins Nyamu & Nicholas Hoang
Tree Project
 */
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
=======
import java.util.Arrays;
import java.util.Stack;
>>>>>>> a84373d (Entirety of Question 1 sorting the bst)

public class TreesProject {

    public static void main(String[] args) {
<<<<<<< HEAD
        int [] keys = { 50, 30, 60, 40, 50, 90, 20, 35, 50};     //50, 70, 20, 10, 90, 80, 75, 90, 25, 28
        Node root = null;
        System.out.println("hello wrld");
        for (int item : keys) {
             root = insert(root, item);
        }
        GetPrint(root);
=======
        System.out.println("trees project");

        SortingIntegers sorter = new SortingIntegers();
        Integer[] arrIntegers = {44,109,67,55,50,22,12,17,66,31};


        System.out.println("Original array: " + Arrays.toString(arrIntegers));

        sorter.sortIntegerArray(arrIntegers);
>>>>>>> a84373d (Entirety of Question 1 sorting the bst)
    }

    public static void GetPrint(Node root){
        if(root == null){
            System.out.println("The tree is Empty");
        } else {
            //What Gets Printed
            sortIntegerArray(root);
            System.out.println("");
            System.out.println( "Left Child: " + root.left.key);
            System.out.println( "Right Child: " + root.right.key);
        }
    }

<<<<<<< HEAD
    public static void sortIntegerArray(Node root) {
        if (root != null){
            sortIntegerArray(root.left);
            System.out.print(root.key + " ");
            sortIntegerArray(root.right);
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
=======
    //represents each node in the tree
class Node {
    int key; 
    Node left, right;

public Node(int item) {
    key = item;
    left = right = null;

                }
        }    
        //root of our bst
private Node root; 

public BST() {
    root = null;
}

    public int getRootKey(){
            if ( root != null) {
                return root.key;
            }
//throw an exception for when tree is empty
        throw new IllegalStateException("bst is empty");
    }

    public BST getLeftChild() {
        BST LeftChild = new BST();
        LeftChild.root = this.root.left;
        
        return LeftChild;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert (int key) {
        root = insertRec(root, key);
    }

private Node insertRec(Node root, int key){
    if (root == null) {
        root = new Node(key);
        return root;
    }


    if (key <= root.key) {
        root.left = insertRec(root.left, key);
    } else {
        root.right = insertRec(root.right, key);
    }

    return root;

}

    public boolean holding(int key){
        return holdingRec(root, key);
    }

    private boolean holdingRec(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.key == key) {
            return true;
        }

        if(key < root.key) {
            return holdingRec(root.left, key);

        } else {
            return holdingRec(root.right, key);
        }
    }

    public void inOrderTraversal() {
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        Node current = root;

        //traversing tree using stack now

        while (current != null || !stack.isEmpty()) {

            while (current != null) {

                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.key + " ");

            //move to right subtree after popping top of stack
            current = current.right;
        }

        System.out.println();
    }
}


public static class SortingIntegers {

    public void sortIntegerArray(Integer []arr) {

        BST bst = new BST();

        for(int num : arr) {
            bst.insert(num);
        }

        System.out.println("Sorted order (in-order traversal): ");
        bst.inOrderTraversal();
    }
}

>>>>>>> a84373d (Entirety of Question 1 sorting the bst)

    }                



