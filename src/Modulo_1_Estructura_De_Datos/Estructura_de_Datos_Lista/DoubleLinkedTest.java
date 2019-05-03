package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Lista;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class DoubleLinkedTest {

    DoubleLinked<String> dl;

    public DoubleLinkedTest() {

    }

    @Test
    public void testSize() {
        dl = new DoubleLinked<String>();
        // Si el metodo .size() no me devuelve un 0 es que algo malo pasa al momento de setUp.
        assertEquals(dl.size(), 0);
    }

    @Test
    public void testSize2() {
        this.setUp();
        assertEquals(dl.size(), 6);
    }

    @Test
    public void testAddFirst() {
        this.setUp();
        dl.addFirst("Nuevo");
        assertEquals(dl.getFirst(), "Nuevo");
    }

    @Test
    public void testAddIndex() {

    }

    @Test
    public void testResultados() {
        this.tearDown();
        this.setUp();

        Iterable<Nodo<String>> it = dl.iterator();
        Iterator<Nodo<String>> itR = it.iterator();
        String salida = "";

        while (itR.hasNext()) {
            Nodo<String> nodo = itR.next();
            salida += nodo.getElement();
        }
        assertEquals(salida, "332211321");
    }

    @Before
    public void setUp() {
        dl = new DoubleLinked<String>();
        dl.addFirst("1");
        dl.addFirst("2");
        dl.addFirst("3");
        dl.addFirst("11");
        dl.addFirst("22");
        dl.addFirst("33");
    }

    @After
    public void tearDown() {
        dl = new DoubleLinked<String>();
    }

}