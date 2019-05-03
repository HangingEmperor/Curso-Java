package Modulo_1_Estructura_De_Datos.Estrucutura_de_Datos_Pila;

public interface InterfacePila<E> {
    /*
    - push(x): Añade elemento a la cima.
    - pop(x): Extrae elemento de la cima.
    - size(): Devuelve el tamaño de la pila.
    - isEmpty(): Pregunta si esta vacia.
    - top(): Devuelve el elemento de la cima de la pila.
    */
    void push(E element);

    void pop();

    int size();

    boolean isEmpty();

    E top();

}
