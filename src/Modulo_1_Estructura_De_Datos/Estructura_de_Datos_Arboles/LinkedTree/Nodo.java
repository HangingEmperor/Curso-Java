package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.LinkedTree;

import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Position;

import java.util.List;

public class Nodo<E> implements Position<E> {

    private Nodo<E> father;
    private E element;
    private List<Nodo<E>> sons;

    public Nodo(Nodo<E> father, E element, List<Nodo<E>> sons) {
        this.father = father;
        this.element = element;
        this.sons = sons;
    }

    @Override
    public E element() {
        return element;
    }

    public Nodo<E> getFather() {
        return father;
    }

    public void setFather(Nodo<E> father) {
        this.father = father;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public List<Nodo<E>> getSons() {
        return sons;
    }

    public void setSons(List<Nodo<E>> sons) {
        this.sons = sons;
    }
}
