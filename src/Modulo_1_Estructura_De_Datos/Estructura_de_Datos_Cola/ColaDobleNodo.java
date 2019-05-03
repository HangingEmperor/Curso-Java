package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Cola;

public class ColaDobleNodo<E> {

    private E element;
    private ColaDobleNodo<E> prev;
    private ColaDobleNodo<E> next;

    ColaDobleNodo() {
        this.element = null;
        this.prev = null;
        this.next = null;
    }

    E getElement() {
        return element;
    }

    void setElement(E element) {
        this.element = element;
    }

    public ColaDobleNodo<E> getPrev() {
        return prev;
    }

    void setPrev(ColaDobleNodo<E> prev) {
        this.prev = prev;
    }

    ColaDobleNodo<E> getNext() {
        return next;
    }

    void setNext(ColaDobleNodo<E> next) {
        this.next = next;
    }
}
