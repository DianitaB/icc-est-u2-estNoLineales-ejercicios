package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0; // árbol vacío tiene profundidad 0
        }
        // Calculamos la profundidad del subárbol izquierdo
        int leftDepth = maxDepth(root.getLeft());
        // Calculamos la profundidad del subárbol derecho
        int rightDepth = maxDepth(root.getRight());
        // 
        return Math.max(leftDepth, rightDepth) + 1;
    }
    
}
