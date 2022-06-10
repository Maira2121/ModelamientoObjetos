package com.sofka.ejercicio1;

import com.sofka.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase ControllerEjercicio1, dirige la ejecución del ejercicio 1, mostrando el menú para que el usuario seleccione la opción deseada.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-09
 * @since 1.0.1
 */
public class ControllerEjercicio1 {
    public void controllerEjercicio1() {
        Scanner sn = new Scanner(System.in);
        Menu menu = new Menu();
        PlanetarySystem planetarySystem = new PlanetarySystem();
        planetarySystem.fillPlanetarySystem();
        boolean salir = false;
        int option;
        while (!salir) {
            menu.menuPlanetary();
            try {
                System.out.println("Escribe una de las opciones");
                System.out.println("---------------------------------");
                option = sn.nextInt();
                sn.skip("\n");
                switch (option) {
                    case 1 -> planetarySystem.creatorCelestialBody();
                    case 2 -> planetarySystem.calculateAttraction();
                    case 3 -> planetarySystem.toListCelestialBodies();
                    case 4 -> salir = true;
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
