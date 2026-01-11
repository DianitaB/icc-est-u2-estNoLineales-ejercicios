package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {
     public List<List<Node>> listLevels(Node root) {
        List<List<Node>> resultado = new ArrayList<>();
        if (root == null) {
            return resultado;
        }

        Queue<Node> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            // obtenemos la cantidad de los nosods
            int tamañoNivel = cola.size();
            List<Node> nivel = new ArrayList<>();
        
            // procesamos todos los nodos actuale
            for (int i = 0; i < tamañoNivel; i++) {
                Node actual = cola.poll();
                nivel.add(actual);

                // agregamos sus hijos a la cola si esque existen
                if (actual.getLeft() != null) {
                    cola.add(actual.getLeft());
                }

                if (actual.getRight() != null) {
                    cola.add(actual.getRight());
                }
            }
            // agregamos la lista a la principal 
            resultado.add(nivel);
        }
        // devolvemos la lista
        return resultado;
        
    }
}
