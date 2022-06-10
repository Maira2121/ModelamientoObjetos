package com.sofka.ejercicio6;

import java.util.Scanner;

/**
 * Clase Array que muestra la ejecución del ejercicio 6.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class Array {
    private final Scanner leerDato = new Scanner(System.in);

    /**
     * Método para llenar un arreglo de números, hasta que se digite un número igual al anterior ingresado, entonces muestra los número ingresados.
     */
    public void array() {
        ArrayNumber arrayNumber = new ArrayNumber();
        int salir = 0, number;
        do {
            System.out.println("Ingrese número");
            number = leerDato.nextInt();
            if (arrayNumber.lookNumber(number) == 1) {
                arrayNumber.print();
                salir = 1;
            } else {
                arrayNumber.addNumber(number);
            }
        } while (salir != 1);
    }
}
