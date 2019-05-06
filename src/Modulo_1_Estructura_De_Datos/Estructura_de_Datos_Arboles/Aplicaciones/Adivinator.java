package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Aplicaciones;

import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.LinkedBinaryTree.LinkedBinaryTree;
import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Position;

import java.util.Scanner;

public class Adivinator {

    static LinkedBinaryTree<String> a = new LinkedBinaryTree<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena1 = "";
        String cadena2 = "";

        System.out.println("¿De que tema quieres que te adivina?");
        cadena1 = sc.nextLine();
        a.addRoot(cadena1);

        System.out.println(a.root());
        System.out.println(a.root.element());
        System.out.println(a.root().element());

        System.out.println("¿Puedes darme un ejemplo de un " + a.root().element());
        cadena1 = sc.nextLine();
        a.addLeft(a.root(), cadena1);

        while (cadena2.compareToIgnoreCase("fin") != 0) {
            Adivinator.recorreArbol(a.root());
        }// Fin del ciclo while
    } // Fin de metodo main

    public static void recorreArbol(Position<String> p) {
        Scanner scanner = new Scanner(System.in);
        String respuesta1 = "";
        // En caso de que el nodo sea hoja.
        if (a.isLeaf(p)) {
            System.out.println(p.element() + "?");
            respuesta1 = scanner.nextLine();
            if (respuesta1.compareToIgnoreCase("si") == 0) {
                System.out.println("Bien he acertado! Volvamos a empezar.");
                Adivinator.recorreArbol(a.root());
            } else {
                System.out.println("Vaya, nunca lo habria adivinado...!");
                System.out.println("Por favor, escribeme la solucion.");
                String solucion = scanner.nextLine();

                System.out.println("Escribeme lo que diferencia " + p.element() + " y " + solucion);
                String nodoInterno = scanner.nextLine();
                String oldLeaf = p.element();

                a.replace(p, nodoInterno);
                a.addLeft(p, solucion);
                a.addRight(p, oldLeaf);

                System.out.println("Volvamos a empezar.");
                Adivinator.recorreArbol(a.root());
            }
        }
        // En caso contrario.
        else {
            System.out.println(p.element() + "?");
            respuesta1 = scanner.nextLine();
            if (respuesta1.compareToIgnoreCase("si") == 0) {
                if (a.hasLeft(p)) {
                    Adivinator.recorreArbol(a.left(p));
                } else {
                    System.out.println("¿En que estabas pensando?");
                    String respuesta2 = scanner.nextLine();
                    a.addLeft(p, respuesta2);

                    System.out.println("Volvemos a empezar.");
                    Adivinator.recorreArbol(a.root());
                }
            } else {
                if (a.hasRight(p)) {
                    Adivinator.recorreArbol(a.left(p));
                } else {
                    System.out.println("¿En que estabas pensando?");
                    String respuesta2 = scanner.nextLine();
                    a.addRight(p, respuesta2);

                    System.out.println("Volvemos a empezar.");
                    Adivinator.recorreArbol(a.root());
                }
            }
        }
    }

}
