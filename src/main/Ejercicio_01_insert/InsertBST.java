package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {
     public Node insert(Node root, int value) {
        if (root == null) {
            //Si el arbol es vacio, creo el nodo raiz
            return new Node(value);
        }
        if (value < root.getValue()) {
            //Me viy a la izquierda
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            // Me voy a la derecha
            root.setRight(insert(root.getRight(), value));
        }
        // Devuelvo la raiz actualizada
        return root;
    }
     public void printInOrder(Node root) {
        if (root != null) {
            // Nodos del lado izquierdo 
            printInOrder(root.getLeft());
            // Nodo actual
            System.out.print(root.getValue() + " ");
            // Nodo del lado derecho
            printInOrder(root.getRight());
        }
    }
}
