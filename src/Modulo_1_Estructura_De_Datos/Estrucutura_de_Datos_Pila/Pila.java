package Modulo_1_Estructura_De_Datos.Estrucutura_de_Datos_Pila;

public class Pila<E> implements InterfacePila<E> {

    int size;
    NodoPila<E> top;

    public Pila() {
        size = 0;
        top = null;
    }

    @Override
    public void push(E element) {
        if (this.isEmpty()) {
            NodoPila<E> pl = new NodoPila<E>();
            pl.setElement(element);
            pl.setPrev(null);
            top = pl;
            this.size = 1;
        } else {
            NodoPila<E> pl = new NodoPila<E>();
            pl.setElement(element);
            pl.setPrev(top);
            top = pl;
            this.size++;
        }
    }

    @Override
    public void pop() {
        if (this.isEmpty()) {
            System.out.println("La pila ya esta vacia.");
        } else {
            top = top.getPrev();
            this.size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public E top() {
        E element;
        if (this.isEmpty()) {
            return element = null;
        } else {
            return element = top.getElement();
        }
    }
}
