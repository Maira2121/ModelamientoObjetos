package com.sofka.ejercicio5;

import com.sofka.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase ControllerEjercicio5, dirige la ejecución del ejercicio 5, mostrando el menú para que el usuario seleccione la opción deseada.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class ControllerEjercicio5 {
    public void controllerEjercicio5() {
        Ferry ferry = new Ferry();
        Scanner sn = new Scanner(System.in);
        Menu menu = new Menu();
        boolean salir = false;
        int option;
        while (!salir) {
            menu.menuFerry();
            try {
                System.out.println("Escribe una de las opciones");
                System.out.println("---------------------------------");
                option = sn.nextInt();
                switch (option) {
                    case 1 -> ferry.ferry();
                    case 2 -> ferry.printVehicles();
                    case 3 -> salir = true;
                    default -> {
                        System.out.println("Solo números entre 1 y 3");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
