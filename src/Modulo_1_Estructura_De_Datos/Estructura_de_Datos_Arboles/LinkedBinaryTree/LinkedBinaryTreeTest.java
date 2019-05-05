package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.LinkedBinaryTree;

import Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Arboles.Position;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedBinaryTreeTest {

    @Test
    public void testSize() {
        LinkedBinaryTree<String> t = new LinkedBinaryTree<String>();
        Position<String> p = t.addRoot("a");
        Position<String> p1 = t.addLeft(p, "b");
        Position<String> p2 = t.addRight(p, "c");
        t.addLeft(p1, "d");
        t.addRight(p1, "e");
        t.addLeft(p2, "f");
        t.addRight(p2, "g");

        assertEquals(t.size(), 6);
    }

    @Test
    public void testRemove() {
        LinkedBinaryTree<String> t = new LinkedBinaryTree<String>();
        Position<String> p = t.addRoot("a");
        Position<String> p1 = t.addLeft(p, "b");
        Position<String> p2 = t.addRight(p, "c");
        t.addLeft(p1, "d");
        t.addLeft(p2, "f");
        t.addRight(p2, "g");
        t.remove(p1);

        assertEquals(t.size(), 4);
    }
}