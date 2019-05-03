package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Lista;

public class Main {
    public static void main(String[] args) {
        DoubleLinked<String> dl = new DoubleLinked<String>();
        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        String s4 = "4";

        dl.addLast(s1);
        dl.addLast(s2);
        dl.addLast(s3);
        dl.addLast(s4);

        String s5 = "Hola soy nuevo";
        dl.remove(1);
        String resultado = "";

        DoubleLinked<String> dl2 = new DoubleLinked<String>();

        while (!dl.isEmpty()) {
            System.out.println(dl.getFirst());
            dl2.addFirst(dl.getFirst());
            dl.removeFirst();
        }
        dl = dl2;

        System.out.println("Aqui xd" + dl.get(1));
    }
}
