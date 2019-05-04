package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.LinkedBinaryTree;

import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Position;
import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Tree;

public interface InterfaceBinaryTree<E> extends Tree<E> {

    Position<E> left(Position<E> p);

    Position<E> right(Position<E> p);

    boolean hasRight(Position<E> p);

    boolean hasLeft(Position<E> p);
}
