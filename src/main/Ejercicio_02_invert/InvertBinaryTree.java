package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
        public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        // guardamos tem el subarbol izquierdo
        Node temp = root.getLeft();
        // intercambiamos recursivamente el derecho con el izquierdo 
        root.setLeft(invertTree(root.getRight()));
        root.setRight(invertTree(temp));
        // retornamos la raiz
        return root;
    }

}
