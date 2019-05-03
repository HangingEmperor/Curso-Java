package Modulo_1_Estructura_De_Datos.Estructura_de_Datos_Cola;

public class Main {
    public static void main(String[] args) {
        ColaDoble cd = new ColaDoble();
        String s1 = "1";
        String s2 = "2";
        String s3 = "3";

        cd.enqueue(s1);
        cd.enqueue(s2);
        cd.enqueue(s3);

        System.out.println(cd.front());
        System.out.println(cd.tail());

        cd.dequeue();

        System.out.println(cd.front());
        System.out.println(cd.tail());
    }
}
