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



public class TreesProject {

    public static void main(String[] args) {

        System.out.println("trees project");

        SortingIntegers sorter = new SortingIntegers();
        Integer[] arrIntegers = {44,109,67,55,50,22,12,17,66,31};


        System.out.println("Original array: " + Arrays.toString(arrIntegers));

        sorter.sortIntegerArray(arrIntegers);

    }



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

}                  



