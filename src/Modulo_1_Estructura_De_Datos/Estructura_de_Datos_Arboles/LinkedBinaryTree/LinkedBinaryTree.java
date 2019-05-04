package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.LinkedBinaryTree;

import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Exceptions.BadPositionException;
import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Exceptions.EmptyTreeException;
import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Exceptions.UnAccessException;
import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Position;

import java.util.Iterator;

public class LinkedBinaryTree<E> implements InterfaceBinaryTree<E> {

    private BinaryNode<E> root;
    private int size;

    @Override
    public Position<E> left(Position<E> p) {
        BinaryNode<E> nodo = checkPosition(p);
        BinaryNode<E> left;
        if (this.hasLeft(p)) {
            left = nodo.getLeft();
        } else {
            throw new UnAccessException("No existe hijo izquierdo.");
        }
        return left;
    }

    @Override
    public Position<E> right(Position<E> p) {
        BinaryNode<E> nodo = checkPosition(p);
        BinaryNode<E> right;
        if (this.hasRight(p)) {
            right = nodo.getRight();
        } else {
            throw new UnAccessException("No existe hijo izquierdo.");
        }
        return right;
    }

    @Override
    public boolean hasRight(Position<E> p) {
        BinaryNode<E> nodo = checkPosition(p);
        return nodo.getRight() != null;
    }

    @Override
    public boolean hasLeft(Position<E> p) {
        BinaryNode<E> nodo = checkPosition(p);
        return nodo.getLeft() != null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Iterable positions() {
        return null;
    }

    @Override
    public Position<E> root() {
        if (this.isEmpty()) {
            throw new EmptyTreeException("Arbol vacio");
        } else {
            return this.root;
        }
    }

    @Override
    public Position<E> parent(Position<E> p) {
        BinaryNode<E> nodo = checkPosition(p);
        BinaryNode<E> parent;

        if (nodo.equals(root)) {
            throw new UnAccessException("El nodo no tiene hijos");
        } else {
            parent = nodo.getParent();
        }
        return parent;
    }

    @Override
    public Iterable children(Position<E> p) {
        return null;
    }

    @Override
    public boolean isLeaf(Position<E> p) {
        return false;
    }

    @Override
    public boolean isInternal(Position<E> p) {
        return false;
    }

    @Override
    public boolean isRoot(Position<E> p) {
        return false;
    }

    @Override
    public E replace(Position<E> p, E elemento) {
        return null;
    }

    public BinaryNode<E> checkPosition(Position<E> p) {
        if (!(p instanceof BinaryNode)) {
            throw new BadPositionException("Posicion no valida.");
        } else {
            BinaryNode<E> n = (BinaryNode<E>) p;
            return n;
        }
    }
}
