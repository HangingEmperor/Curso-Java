package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Cola;

public class ColaDoble<E> implements InterfaceQueueDoble<E> {

    private ColaDobleNodo<E> head;
    private ColaDobleNodo<E> tail;
    private int size;

    ColaDoble() {
        head = null;
        tail = null;
        size = 0;
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
    public E front() {
        if (this.isEmpty()) {
            System.out.println("La cola esta vacia.");
            return null;
        } else {
            return this.head.getElement();
        }
    }

    @Override
    public E tail() {
        if (this.isEmpty()) {
            System.out.println("La cola esta vacia.");
            return null;
        } else {
            return this.tail.getElement();
        }
    }

    @Override
    public void enqueue(E element) {
        if (this.isEmpty()) {
            ColaDobleNodo<E> newNodo = new ColaDobleNodo<E>();
            newNodo.setElement(element);
            newNodo.setNext(null);
            newNodo.setPrev(null);
            this.head = newNodo;
            this.tail = newNodo;
            this.size = 1;
        } else {
            ColaDobleNodo<E> newNodo = new ColaDobleNodo<>();
            newNodo.setElement(element);
            newNodo.setNext(null);
            newNodo.setPrev(tail);
            this.tail.setNext(newNodo);
            this.tail = newNodo;
            this.size++;
        }
    }

    @Override
    public void dequeue() {
        if (this.isEmpty()) {
            System.out.println("La cola esta vacia");
        } else {
            this.head = this.head.getNext();
            this.size--;
        }
    }
}
