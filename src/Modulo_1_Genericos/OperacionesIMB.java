package Modulo_1_Genericos;

import java.util.ArrayList;
import java.util.Iterator;

public class OperacionesIMB<E> {

    public void addElement(ArrayList<E> list, E element) {
        list.add(element);
    }

    public E searchElement(ArrayList<E> list, E element) {
        Iterator<E> it = list.iterator();
        while (it.hasNext()) {
            E item = it.next();
            if (item.equals(it)) {
                return item;
            }
        }
        return null;
    }

    public E deleteElement(ArrayList<E> list, E element) {
        Iterator<E> it = list.iterator();
        while (it.hasNext()) {
            E item = it.next();
            if (item.equals(element)) {
                it.remove();
                return item;
            }
        }
        return null;
    }

    public void printElement(ArrayList<E> list, E element) {
        System.out.println(element);
    }
}
