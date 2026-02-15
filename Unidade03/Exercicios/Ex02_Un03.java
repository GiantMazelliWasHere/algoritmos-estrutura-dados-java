class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

}

public class Ex02_Un03 {
    Node root;

    public Ex02_Un03() {
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

    public boolean eBST() {
        return validarBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean validarBST(Node no, int min, int max) {
        if (no == null) return true;

        
        if (no.key <= min || no.key >= max) return false;

        
        return validarBST(no.left, min, no.key) && 
               validarBST(no.right, no.key, max);
    }

    public static void main(String[] args) {
        Ex02_Un03 arvore = new Ex02_Un03();

        arvore.insert(10);
        arvore.insert(5);
        arvore.insert(15);
        arvore.insert(3);
        arvore.insert(7);
        arvore.insert(12);
        arvore.insert(18);

        System.out.println("Em ordem traversal:");
        arvore.inorderTraversal();

        int keyToSearch = 7;
        System.out.println("\n\nProcurando por " + keyToSearch + ": " + (arvore.search(keyToSearch) ? "Encontrado" : "Não encontrado"));

        System.out.println("A arvore é uma BST? " + (arvore.eBST() ? "Sim" : "Não"));
    }

}
