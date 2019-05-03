package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Cola;

public interface InterfaceQueueDoble<E> {

    /*
    - size(): Devuelve el tamaño de la lista.
    - isEmpty: Si esta vacia.
    - front(): Primer elemento.
    - enqueue(E e): Poner en la cola.
    - dequeue(): Quitar de la cola. [Quita al primero de la cola.]
    - tail(): Devuelve el ultimo elemento.
    */

    int size();

    boolean isEmpty();

    E front();

    E tail();

    void enqueue(E element);

    void dequeue();

}
