class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }


        return root;
    }

    void inorderTraversal() {
        inorderTraversalRec(root);
    }

    void inorderTraversalRec(Node root){
        if(root != null){
            inorderTraversalRec(root.left);
            System.out.print(root.key + " ");
            inorderTraversalRec(root.right);
        }
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.key == key) 
            return true;

        if (key < root.key)
            return searchRec(root.left, key);
         else 
            return searchRec(root.right, key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(60);
        tree.insert(20);
        tree.insert(40);


        System.out.println("Inorder traversal of the BST:");
        tree.inorderTraversal();

        if(tree.search(10)) {
            System.out.println("\nElement found in the BST.");
        } else {
            System.out.println("\nElement not found in the BST.");
        }
    }
}