package Modulo_1_Estructura_De_Datos.Estrucutura_de_Datos_Pila;

public class Main {
    public static void main(String[] args) {
        Pila prueba = new Pila();

        String s1 = "1";
        String s2 = "2";
        String s3 = "3";

        prueba.push(s1);
        System.out.println((String) prueba.top());
        prueba.push(s2);
        System.out.println((String) prueba.top());
        prueba.push(s3);
        System.out.println((String) prueba.top());
        prueba.pop();
        System.out.println((String) prueba.top());

    }
}
