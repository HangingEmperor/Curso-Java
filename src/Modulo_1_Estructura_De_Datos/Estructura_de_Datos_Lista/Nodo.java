package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Lista;

public class Nodo<E> {

    private E element;
    private Nodo<E> previous;
    private Nodo<E> next;

    public Nodo() {
        element = null;
        previous = null;
        next = null;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Nodo<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo<E> previous) {
        this.previous = previous;
    }

    public Nodo<E> getNext() {
        return next;
    }

    public void setNext(Nodo<E> next) {
        this.next = next;
    }
}
