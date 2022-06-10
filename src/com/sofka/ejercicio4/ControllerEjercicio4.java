package com.sofka.ejercicio4;

import com.sofka.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase ControllerEjercicio4, dirige la ejecución del ejercicio 4, mostrando el menú para que el usuario seleccione la opción deseada.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class ControllerEjercicio4 {
    public void controllerEjercicio4() {
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
                sn.skip("\n");
                switch (option) {
                    case 1 -> ferry.enterVehicle();
                    case 2 -> ferry.printVehicles();
                    case 3 -> salir = true;
                    default -> System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
                sn.skip("\n");
            }
        }
    }
}
