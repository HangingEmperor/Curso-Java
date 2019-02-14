package Generico;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Genericos <E> {

    public void insertElement(ArrayList<E> list, E element){
        list.add(element);
    }

    public E searchElement(ArrayList<E> list, E element){
        Iterator<E> iterator = list.iterator();
        while (iterator.hasNext()){
            E item= iterator.next();
            if (item.equals(element)){
                return item;
            }
        }
        return null;
    }
}
