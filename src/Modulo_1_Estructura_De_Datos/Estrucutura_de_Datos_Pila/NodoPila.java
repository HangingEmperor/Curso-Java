package Modulo_1_Estructura_De_Datos.Estrucutura_de_Datos_Pila;

public class NodoPila<E> {
    E element;
    NodoPila<E> prev;

    public NodoPila() {
        element = null;
        prev = null;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public NodoPila<E> getPrev() {
        return prev;
    }

    public void setPrev(NodoPila<E> prev) {
        this.prev = prev;
    }
}
