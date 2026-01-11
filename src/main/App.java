package main;

import java.util.List;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        //  EJERCICIO 1
        System.out.println("EJERCICIO 1: Insertar en Árbol Binario de Búsqueda");
        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        InsertBST insertador = new InsertBST();
        Node raiz = null;
        for (int v : valores) {
            raiz = insertador.insert(raiz, v);
        }
        System.out.print("Input: [5, 3, 7, 2, 4, 6, 8]\nOutput (In-Order): ");
        insertador.printInOrder(raiz);
        System.out.println("\n");

        
        // 🪞 EJERCICIO 2
        System.out.println("EJERCICIO 2: Invertir Árbol Binario");
        Node nodo2 = new Node(4);
        nodo2.setLeft(new Node(2));
        nodo2.setRight(new Node(7)); 
        nodo2.getLeft().setLeft(new Node(1));
        nodo2.getLeft().setRight(new Node(3));
        nodo2.getRight().setLeft(new Node(6));
        nodo2.getRight().setRight(new Node(9));

        System.out.print("Input (In-Order): ");
        insertador.printInOrder(nodo2);

        InvertBinaryTree inverter = new InvertBinaryTree();
        Node invertido = inverter.invertTree(nodo2);

        System.out.print("\nOutput (In-Order): ");
        insertador.printInOrder(invertido);
        System.out.println("\n");

        // EJERCICIO 3
        System.out.println("EJERCICIO 3: Listar Niveles en Listas Enlazadas");
        ListLevels listador = new ListLevels();
       var niveles = listador.listLevels(invertido); 

        for (List<Node> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
        }
            System.out.println();
        }
        System.out.println();

       
        // EJERCICIO 4
        System.out.println(" EJERCICIO 4: Calcular Profundidad Máxima del Árbol");
        Node nodo4 = new Node(4);
        nodo4.setLeft(new Node(2));
        nodo4.setRight(new Node(7));
        nodo4.getLeft().setLeft(new Node(1));
        nodo4.getLeft().setRight(new Node(3));
        nodo4.getLeft().getLeft().setLeft(new Node(8));

        Depth depth = new Depth();
        int profundidad = depth.maxDepth(nodo4);
        System.out.println("Profundidad máxima esperada: " + profundidad);
    }
}


