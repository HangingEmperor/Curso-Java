package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.LinkedTree;

import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Position;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedTreeTest {

    @Test
    public void testSize() {
        LinkedTree<String> t = new LinkedTree<String>();
        Position<String> p1 = t.addRoot("a");
        Position<String> p2 = t.add(p1, "b");
        Position<String> p3 = t.add(p2, "c");
        t.add(p1, "d");
        t.add(p1, "e");
        t.add(p2, "f");
        t.add(p2, "g");
        t.add(p2, "h");

        assertEquals(t.size(), 8);
    }

    @Test
    public void testRemove() {
        LinkedTree<String> t = new LinkedTree<String>();
        Position<String> p1 = t.addRoot("a");
        Position<String> p2 = t.add(p1, "b");
        Position<String> p3 = t.add(p1, "c");
        t.add(p2, "d");
        t.add(p2, "e");
        t.add(p3, "f");
        t.add(p3, "g");
        t.add(p3, "h");
        t.remove(p3);
        assertEquals(t.size(), 4);
    }

    @Test
    public void testElements() {
        LinkedTree<String> t = new LinkedTree<String>();
        Position<String> p1 = t.addRoot("a");
        Position<String> p2 = t.add(p1, "b");
        Position<String> p3 = t.add(p1, "c");
        t.add(p2, "d");
        t.add(p2, "e");
        t.add(p3, "f");
        t.add(p3, "g");
        t.add(p3, "h");

        String salida = "";

        for (Position<String> e : t.positions()) {
            salida += e.element();
        }
        assertEquals(salida, "abdecfgh");
    }

}