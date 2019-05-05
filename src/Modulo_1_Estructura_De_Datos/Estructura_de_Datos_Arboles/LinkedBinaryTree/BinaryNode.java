package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.LinkedBinaryTree;

import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Position;

public class BinaryNode<E> implements Position<E> {

    private E element;
    private BinaryNode<E> right;
    private BinaryNode<E> left;
    private BinaryNode<E> parent;

    public BinaryNode() {
        element = null;
        right = null;
        left = null;
        parent = null;
    }

    public BinaryNode(E element, BinaryNode<E> right, BinaryNode<E> left, BinaryNode<E> parent) {
        this.element = element;
        this.right = right;
        this.left = left;
        this.parent = parent;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public BinaryNode<E> getRight() {
        return right;
    }

    public void setRight(BinaryNode<E> right) {
        this.right = right;
    }

    public BinaryNode<E> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<E> left) {
        this.left = left;
    }

    public BinaryNode<E> getParent() {
        return parent;
    }

    public void setParent(BinaryNode<E> parent) {
        this.parent = parent;
    }

    @Override
    public E element() {
        return null;
    }
}
