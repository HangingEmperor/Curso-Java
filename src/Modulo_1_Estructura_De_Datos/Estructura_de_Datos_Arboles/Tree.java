package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles;

import java.util.Iterator;

public interface Tree<E> {

    //Devuelve el tamaño.
    int size();

    // True si esta vacio en caso contrario.
    boolean isEmpty();

    // Devolvemos un iterador con todos sus elementos.
    Iterator iterator();

    //Devolvemos una collection de todos sus nodos.
    Iterable positions();

    // Metodos de Acceso:
    //Devolvemos la raiz del arbol.
    Position<E> root();

    //Devuelve el padre del nodo
    Position<E> parent(Position<E> p);

    //Devuelve una lista con todos sus nodos hijo de un nodo.
    Iterable children(Position<E> p);

    // Metodos de Consulta:
    // Preguntamos si el nodo es hoja o no.
    boolean isLeaf(Position<E> p);

    // Preguntamos is un nodo es interno o no.
    boolean isInternal(Position<E> p);

    // Preguntamos si este nodo es raiz.
    boolean isRoot(Position<E> p);

    //Metodos de Actualizacion:
    // Reemplaza el elemento del nodo P por el elemento E.
    E replace(Position<E> p, E elemento);

}
