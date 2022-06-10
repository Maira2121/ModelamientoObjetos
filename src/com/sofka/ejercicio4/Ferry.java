package com.sofka.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa un ferry.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class Ferry {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    /**
     * Método para agregar los vehículos al ferry.
     */
    public void enterVehicle() {
        int numberOfPassengers, numberOfWheels, answer;
        String displacementMedium, color, registrationDate, cicle;
        Scanner leerDato = new Scanner(System.in);
        cicle = "s";
        boolean crew;
        do {
            if (vehicles.size() < 10) {
                messageView("Ingrese número de pasajeros");
                numberOfPassengers = leerDato.nextInt();
                messageView("Ingrese 0 si el vehiculo No tiene tripulación y 1 si tiene ");
                answer = leerDato.nextInt();
                crew = crew(answer);
                messageView("Ingrese el número de llantas");
                numberOfWheels = leerDato.nextInt();
                leerDato.skip("\n");
                messageView("Ingrese la fecha de matricula con el formato dd/MM/yyyy");
                registrationDate = leerDato.nextLine();
                messageView("Ingrese el medio por el cual se desplaza");
                displacementMedium = leerDato.nextLine();
                messageView("Ingrese el color");
                color = leerDato.nextLine();
                Vehicle vehicle = new Vehicle(numberOfPassengers, crew, numberOfWheels, registrationDate, displacementMedium, color);
                vehicles.add(vehicle);
                messageView("Vehículo registrado!");
                messageView("¿Desea ingresar otro vehículo? S para Sí, N para No.");
                cicle = leerDato.next();
            } else {
                messageView("No queda espacio en el ferri, la capacidad máxima es de 10 vehículos.");
            }
        } while (cicle.equals("S") || cicle.equals("s"));

    }

    /**
     * Método para listar los vehículos ingresados.
     */
    public void printVehicles() {
        if (vehicles.size() > 0) {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        } else {
            System.out.println("No se han agregado Vehículos.");
        }
    }

    /**
     * Método para mostrar un mensaje
     *
     * @param message mensaje que se desea enviar.
     */
    private void messageView(String message) {
        System.out.println(message);
    }

    /**
     * Método para capturar la respuesta de la existencia o no de tripulación.
     *
     * @param answer respuesta dada por el usuario.
     * @return respuesta
     */
    private boolean crew(int answer) {
        if (answer == 1) {
            return true;
        } else
            return false;
    }

}
