package com.sofka.ejercicio2;

/**
 * Class2 creada para mostrar la ejecución de los métodos main
 * En esta clase se restan 2 números.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class Class2 {
    public static void main(String[] args) {
        System.out.println("Restando 14 - 8, el resultado es: " + subtraction(14, 8));
    }

    /**
     * Método para restar dos número.
     * @param n1 número 1 para restar
     * @param n2 número 2 para restar
     * @return resultado de la resta.
     */
    public static int subtraction(int n1, int n2) {
        return n1 - n2;
    }
}
