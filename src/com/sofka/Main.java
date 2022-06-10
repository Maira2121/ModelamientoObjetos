package com.sofka;

import com.sofka.ejercicio1.ControllerEjercicio1;
import com.sofka.ejercicio1.PlanetarySystem;
import com.sofka.ejercicio3.ControllerEjercicio3;
import com.sofka.ejercicio4.ControllerEjercicio4;
import com.sofka.ejercicio5.ControllerEjercicio5;
import com.sofka.ejercicio6.Array;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        Menu menu = new Menu();
        boolean salir = false;
        int opcion;
        while (!salir) {
            menu.menuMain();
            try {
                System.out.println("Escribe una de las opciones");
                System.out.println("---------------------------------");
                opcion = sn.nextInt();
                sn.skip("\n");
                switch (opcion) {
                    case 1:
                        ControllerEjercicio1 ejercicio1 = new ControllerEjercicio1();
                        ejercicio1.controllerEjercicio1();
                        break;
                    case 2:
                        com.sofka.ejercicio2.Main.main(args);
                        break;
                    case 3:
                        ControllerEjercicio3 ejercicio3 = new ControllerEjercicio3();
                        ejercicio3.controllerEjercicio3();
                        break;
                    case 4:
                        ControllerEjercicio4 ejercicio4 = new ControllerEjercicio4();
                        ejercicio4.controllerEjercicio4();
                        break;
                    case 5:
                        ControllerEjercicio5 ejercicio5 = new ControllerEjercicio5();
                        ejercicio5.controllerEjercicio5();
                        break;
                    case 6:
                        Array array = new Array();
                        array.array();
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
                sn.skip("\n");
            }
        }
    }
}
