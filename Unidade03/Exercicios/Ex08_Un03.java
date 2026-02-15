class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

}

public class Ex08_Un03 {
    Node root;

    Ex08_Un03() {
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

    public int encontrarMinimo() {
        if (root == null) {
            throw new IllegalStateException("A árvore está vazia!");
        }

        Node atual = root;
        while (atual.left != null) {
            atual = atual.left;
        }
        return atual.key;
    }

    public void percorrerEmOrdem(Node no) {
        if (no != null) {
            percorrerEmOrdem(no.left);
            System.out.print(no.key + " ");
            percorrerEmOrdem(no.right);
        }
    }

    public static void main(String[] args) {
        Ex08_Un03 arvore = new Ex08_Un03();
        arvore.insert(10);
        arvore.insert(5);
        arvore.insert(15);
        arvore.insert(3);
        arvore.insert(7);
        arvore.insert(12);
        arvore.insert(18);

        System.out.println("Árvore em ordem:");
        arvore.percorrerEmOrdem(arvore.root);
        System.out.println("\nValor mínimo na árvore: " + arvore.encontrarMinimo());
    }
}
