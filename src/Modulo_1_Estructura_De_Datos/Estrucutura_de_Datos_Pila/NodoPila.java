package Modulo_1_Estructura_De_Datos.Estrucutura_de_Datos_Pila;

class NodoPila<E> {
    private E element;
    private NodoPila<E> prev;

    NodoPila() {
        element = null;
        prev = null;
    }

    E getElement() {
        return element;
    }

    void setElement(E element) {
        this.element = element;
    }

    NodoPila<E> getPrev() {
        return prev;
    }

    void setPrev(NodoPila<E> prev) {
        this.prev = prev;
    }
}
