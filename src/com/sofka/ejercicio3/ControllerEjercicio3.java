package com.sofka.ejercicio3;

import com.sofka.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase ControllerEjercicio3, dirige la ejecución del ejercicio 3, mostrando el menú para que el usuario seleccione la opción deseada.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-09
 * @since 1.0.1
 */
public class ControllerEjercicio3 {
    public void controllerEjercicio3() {
        Scanner sn = new Scanner(System.in);
        Menu menu = new Menu();
        RandomNum randomNum = new RandomNum();
        randomNum.randomNum();
        boolean salir = false;
        int option;
        while (!salir) {
            menu.menuRandom();
            try {
                System.out.println("Escribe una de las opciones");
                System.out.println("---------------------------------");
                option = sn.nextInt();
                sn.skip("\n");
                switch (option) {
                    case 1 -> {
                        menu.menuRandomOrder();
                        randomNum.bubble();
                    }
                    case 2 -> {
                        menu.menuRandomOrder();
                        randomNum.quickSort();
                    }
                    case 3 -> salir = true
                    ;
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
