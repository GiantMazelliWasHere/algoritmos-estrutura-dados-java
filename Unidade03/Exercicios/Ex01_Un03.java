class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }
}

public class Ex01_Un03 {
    Node root;

    public Ex01_Un03() {
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

    public void percorrerEmOrdem(Node node) {
        if (node != null) {
            percorrerEmOrdem(node.left);
            System.out.print(node.key + " ");
            percorrerEmOrdem(node.right);
        }
    }

    public void percorrerPreOrdem(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            percorrerPreOrdem(node.left);
            percorrerPreOrdem(node.right);
        }
    }

    public void percorrerPosOrdem(Node node) {
        if (node != null) {
            percorrerPosOrdem(node.left);
            percorrerPosOrdem(node.right);
            System.out.print(node.key + " ");
        }
    }

    public static void main(String[] args) {
        Ex01_Un03 tree = new Ex01_Un03();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Percorrer em ordem:");
        tree.percorrerEmOrdem(tree.root);

        System.out.println("\nPercorrer pré-ordem:");
        tree.percorrerPreOrdem(tree.root);

        System.out.println("\nPercorrer pós-ordem:");
        tree.percorrerPosOrdem(tree.root);
    }
    
}
