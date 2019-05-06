package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.LinkedBinaryTree;

import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Exceptions.BadPositionException;
import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Exceptions.EmptyTreeException;
import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Exceptions.UnAccessException;
import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Position;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedBinaryTree<E> implements InterfaceBinaryTree<E> {

    public BinaryNode<E> root;
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
        Iterable<Position<E>> positions = positions();
        List<Position<E>> result = new ArrayList<Position<E>>();
        for (Position<E> p : positions) {
            result.add(p);
        }
        return result.iterator();
    }

    @Override
    public Iterable positions() {
        List<Position<E>> list = new ArrayList<Position<E>>();
        preOrden(this.root, list);
        return list;
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
        BinaryNode<E> node = checkPosition(p);
        List<Position<E>> sons = new ArrayList<Position<E>>();

        if (this.isLeaf(p)) {
            if (node.getLeft() != null) {
                sons.add(node.getLeft());
            }
            if (node.getRight() != null) {
                sons.add(node.getRight());
            }
        }
        return sons;
    }

    @Override
    public boolean isLeaf(Position<E> p) {
        BinaryNode<E> node = checkPosition(p);
        return (node.getLeft() == null) && (node.getRight() == null);
    }

    @Override
    public boolean isInternal(Position<E> p) {
        return !this.isLeaf(p);
    }

    @Override
    public boolean isRoot(Position<E> p) {
        BinaryNode<E> node = checkPosition(p);
        return node.equals(root);
    }

    @Override
    public E replace(Position<E> p, E elemento) {
        BinaryNode<E> node = checkPosition(p);
        E element = node.getElement();
        node.setElement(elemento);
        return element;
    }

    public BinaryNode<E> addRight(Position<E> p, E element) {
        BinaryNode<E> node = checkPosition(p);
        BinaryNode<E> newNode = this.createNode(element, null, null, node);
        if (node.getRight() == null) {
            node.setRight(newNode);
            this.size++;
        } else {
            throw new UnAccessException("Ya tiene un hijo derecho.");
        }
        return newNode;
    }

    public BinaryNode<E> addLeft(Position<E> p, E element) {
        BinaryNode<E> node = checkPosition(p);
        BinaryNode<E> newNode = this.createNode(element, null, null, node);
        if (node.getLeft() == null) {
            node.setLeft(newNode);
            this.size++;
        } else {
            throw new UnAccessException("Ya tiene un hijo izquierdo.");
        }
        return newNode;
    }

    public BinaryNode<E> addRoot(E element) {
        BinaryNode<E> newNode = this.createNode(element, null, null, null);
        if (this.root == null) {
            this.root = newNode;
            this.size++;
        } else {
            throw new BadPositionException("El arbol ya contiene una raiz");
        }
        return newNode;
    }

    public E remove(Position<E> p) {
        BinaryNode<E> node = checkPosition(p);
        BinaryNode<E> nodeLeft = node.getLeft();
        BinaryNode<E> nodeRight = node.getRight();
        E element = node.getElement();

        if ((nodeLeft != null) && (nodeRight != null)) {
            throw new BadPositionException("No se puedn borrar nodos con dos hijos");
        } else {
            BinaryNode<E> son;
            // Solo hijo derecho
            if (nodeRight != null) {
                son = nodeRight;
            }
            // Solo hijo izquierdo
            if (nodeLeft != null) {
                son = nodeLeft;
            }
            // Nodo hoja
            else {
                son = null;
            }
            // Si el nodo es raiz
            if (node.equals(root)) {
                if (son == null) {
                    root = null;
                    size = 0;
                } else {
                    son.setParent(null);
                    root = son;
                }
            }
            // Si no es raiz
            else {
                BinaryNode<E> grandfather = node.getParent();
                if (node.equals(grandfather.getLeft())) {
                    grandfather.setLeft(son);
                } else if (node.equals(grandfather.getRight())) {
                    grandfather.setRight(son);
                }

                if (son != null) {
                    son.setParent(grandfather);
                }
            }
            // Fin de si nodo es raiz.
            this.size--;
        }
        return element;
    }

    /*Metodos auxiliares*/

    protected BinaryNode<E> checkPosition(Position<E> p) {
        if (!(p instanceof BinaryNode)) {
            throw new BadPositionException("Posicion no valida.");
        } else {
            BinaryNode<E> n = (BinaryNode<E>) p;
            return n;
        }
    }

    protected BinaryNode<E> createNode(E element, BinaryNode<E> right, BinaryNode<E> left, BinaryNode<E> father) {
        return new BinaryNode<E>(element, right, left, father);
    }

    protected void preOrden(Position<E> p, List<Position<E>> list) {
        list.add(p);
        if (hasLeft(p)) {
            preOrden(left(p), list);
        }
        if (hasRight(p)) {
            preOrden(right(p), list);
        }
    }
}
