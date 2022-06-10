package com.sofka.ejercicio2;

/**
 * Sí, es posible ejecutar un programa en java que contenga varias clases con métodos main. Por definición el método con la firma
 * public static void main(String[] args), es reconocido como el único método que se ejecuta cuando arranque la aplicación.
 * Convirtiéndolo así, en el punto de partida. Sin embargo, pueden existir varias clases con métodos main, en cuyo caso,
 * una de las formas en las que podemos indicar el punto de partida será llamando a la clase y al método que queremos que se ejecute.
 * Asimismo, podemos dar clic derecho sobre el archivo que se desee ejecutar.
 *
 * Class Main, creada para llamar los métodos main de las otras clases y ejecutar sus propios métodos.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Main de la clase 1: ");
        Class1.main(args);
        System.out.println("Main de la clase 2: ");
        Class2.main(args);
        System.out.println("Main de la clase principal: ");
        main();
    }

    public static void main() {
        System.out.println("Este es el primer método main de la clase principal que se ejecuta.");
        main("Este es el segundo main");
        main(3);
    }

    public static void main(String str) {
        System.out.println(str);
    }

    public static void main(int n) {
        System.out.println("Este es el tercer " + n + " método main de la clase principal que se ejecuta.");
    }
}
