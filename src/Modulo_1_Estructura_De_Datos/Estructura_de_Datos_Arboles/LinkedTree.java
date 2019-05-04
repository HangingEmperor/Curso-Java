package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles;

import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Exceptions.BadPositionException;
import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Exceptions.EmptyTreeException;
import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Exceptions.UnAccessException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedTree<E> implements Tree<E> {

    private Nodo<E> root;
    private int size;

    public LinkedTree() {
        root = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
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
    public Iterable<Position<E>> positions() {
        List<Position<E>> list = new ArrayList<Position<E>>();
        preOrden(this.root, list);
        return list;
    }

    @Override
    public Position<E> root() throws EmptyTreeException {
        if (root == null) {
            throw new EmptyTreeException("The tree is empty.");
        } else {
            return this.root;
        }
    }

    @Override
    public Position<E> parent(Position<E> p) throws UnAccessException {
        Nodo<E> nodo = cPosition(p);
        Nodo<E> father = nodo.getFather();

        if (father == null) {
            throw new UnAccessException("No tiene padre.");
        } else {
            return father;
        }
    }

    @Override
    public Iterable children(Position<E> p) {
        return null;
    }

    @Override
    public boolean isLeaf(Position<E> p) {
        Nodo<E> nodo = cPosition(p);
        boolean result = false;
        List<Nodo<E>> sons = nodo.getSons();
        return (sons == null) || (sons.isEmpty());
    }

    @Override
    public boolean isInternal(Position<E> p) {
        return !isLeaf(p);
    }

    @Override
    public boolean isRoot(Position<E> p) {
        Nodo<E> nodo = cPosition(p);
        return (nodo == this.root);
    }

    @Override
    public E replace(Position<E> p, E elemento) {
        Nodo<E> nodo = cPosition(p);
        E aux = nodo.getElement();
        nodo.setElement(elemento);
        return aux;
    }

    public Position<E> add(Position<E> father, E element) {
        Nodo<E> nodoFather = cPosition(father);
        Nodo<E> newNode = createNode(nodoFather, element, new ArrayList<Nodo<E>>());
        List<Nodo<E>> children = nodoFather.getSons();
        children.add(newNode);
        this.size++;
        return newNode;
    }

    public Position<E> addRoot(E element) {
        Nodo<E> newNode = createNode(null, element, new ArrayList<Nodo<E>>());
        this.root = newNode;
        this.size++;
        return newNode;
    }

    public Position<E> remove(Position<E> p) {
        Nodo<E> nodo = cPosition(p);
        Nodo<E> father = nodo.getFather();
        List<Nodo<E>> children = father.getSons();
        children.remove(nodo);

        List<Position<E>> list = new ArrayList<Position<E>>();
        this.preOrden(p, list);
        size -= list.size();
        return nodo;
    }

    /* Castea un Position a Nodo si es posible */
    protected Nodo<E> cPosition(Position<E> p) throws BadPositionException {
        if ((p == null) || !(p instanceof Nodo)) {
            throw new BadPositionException("Posicion no valida.");
        } else {
            Nodo<E> n = (Nodo<E>) p;
            return n;
        }
    }

    protected Nodo<E> createNode(Nodo father, E element, List<Nodo<E>> sons) {
        Nodo<E> newNode = new Nodo<E>(father, element, sons);
        return newNode;
    }

    public void preOrden(Position<E> p, List<Position<E>> list) {
        list.add(p);
        Nodo<E> nodo = cPosition(p);
        if (!this.isLeaf(p)) {
            for (Position<E> h : nodo.getSons()) {
                preOrden(h, list);
            }
        }
    }
}
