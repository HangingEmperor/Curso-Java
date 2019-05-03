package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Cola;

public class ColaDobleNodo<E> {

    private E element;
    private ColaDobleNodo<E> prev;
    private ColaDobleNodo<E> next;

    public ColaDobleNodo() {
        this.element = null;
        this.prev = null;
        this.next = null;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public ColaDobleNodo<E> getPrev() {
        return prev;
    }

    public void setPrev(ColaDobleNodo<E> prev) {
        this.prev = prev;
    }

    public ColaDobleNodo<E> getNext() {
        return next;
    }

    public void setNext(ColaDobleNodo<E> next) {
        this.next = next;
    }
}
