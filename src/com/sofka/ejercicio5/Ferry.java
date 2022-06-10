package com.sofka.ejercicio5;


import com.sofka.Menu;
import com.sofka.ejercicio5.vehicle.Bicycle;
import com.sofka.ejercicio5.vehicle.Boat;
import com.sofka.ejercicio5.vehicle.Car;
import com.sofka.ejercicio5.vehicle.Motorcycle;
import com.sofka.ejercicio5.vehicle.Truck;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
    Scanner leerDato = new Scanner(System.in);
    Menu menu = new Menu();
    boolean salir = false;
    int option;

    public void ferry() {
        while (!salir) {
            menu.menuFerry2();
            try {
                System.out.println("Escribe una de las opciones");
                System.out.println("---------------------------------");
                option = leerDato.nextInt();
                leerDato.skip("\n");
                switch (option) {
                    case 1 -> createBicycle();
                    case 2 -> createBoat();
                    case 3 -> createCar();
                    case 4 -> createMotorcycle();
                    case 5 -> createTruck();
                    case 6 -> salir = true;
                    default -> System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                leerDato.next();
                leerDato.skip("\n");
            }
        }
    }

    /**
     * Método para crear vehículos tipo moto.
     */
    private void createMotorcycle() {
        int numberOfPassengers;
        String cylinder, color, registrationDate, cicle;
        cicle = "s";
        do {
            if (vehicles.size() < 10) {
                messageView("Ingrese número de pasajeros");
                numberOfPassengers = leerDato.nextInt();
                leerDato.skip("\n");
                messageView("Ingrese la fecha de matricula con el formato dd/MM/yyyy");
                registrationDate = leerDato.nextLine();
                messageView("Ingrese el color");
                color = leerDato.nextLine();
                messageView("Ingrese el tipo de cilindraje alto o bajo");
                cylinder = leerDato.nextLine();
                Vehicle motorcycle = new Motorcycle(numberOfPassengers, registrationDate, color, cylinder);
                vehicles.add(motorcycle);
                messageView("Moto registrado!");
                messageView("¿Desea ingresar otra moto? S para Sí, N para No.");
                cicle = leerDato.next();
                leerDato.skip("\n");

            } else {
                messageView("No queda espacio en el ferri.");
            }
        } while (cicle.equals("S") || cicle.equals("s"));

    }

    /**
     * Método para crear vehículos tipo camión.
     */
    private void createTruck() {
        int numberOfPassengers, numberOfWheels;
        String color, registrationDate, cicle;
        double height;
        cicle = "s";
        do {
            if (vehicles.size() < 10) {
                messageView("Ingrese número de pasajeros");
                numberOfPassengers = leerDato.nextInt();
                messageView("Ingrese el número de llantas");
                numberOfWheels = leerDato.nextInt();
                leerDato.skip("\n");
                messageView("Ingrese la fecha de matricula con el formato dd/MM/yyyy");
                registrationDate = leerDato.nextLine();
                messageView("Ingrese la altura del camión en metros");
                height = leerDato.nextDouble();
                leerDato.skip("\n");
                messageView("Ingrese el color");
                color = leerDato.nextLine();
                Vehicle truck = new Truck(numberOfPassengers, numberOfWheels, registrationDate, color, height);
                vehicles.add(truck);
                messageView("Camión registrado!");
                messageView("¿Desea ingresar otro camión? S para Sí, N para No.");
                cicle = leerDato.next();
                leerDato.skip("\n");
            } else {
                messageView("No queda espacio en el ferri.");
            }
        } while (cicle.equals("S") || cicle.equals("s"));

    }

    /**
     * Método para crear vehículos tipo bicicleta.
     */
    private void createBicycle() {
        String type, color, registrationDate, cicle;
        cicle = "s";
        do {
            if (vehicles.size() < 10) {
                messageView("Ingrese la fecha de matricula con el formato dd/MM/yyyy");
                registrationDate = leerDato.nextLine();
                messageView("Ingrese el color de la bicicleta");
                color = leerDato.nextLine();
                messageView("Ingrese el tipo de bicicleta");
                type = leerDato.nextLine();
                Vehicle bicycle = new Bicycle(registrationDate, color, type);
                vehicles.add(bicycle);
                messageView("Bicicleta registrada!");
                messageView("¿Desea ingresar otra bicicleta? S para Sí, N para No.");
                cicle = leerDato.next();
                leerDato.skip("\n");
            } else {
                messageView("No queda espacio en el ferri.");
            }
        } while (cicle.equals("S") || cicle.equals("s"));

    }

    /**
     * Método para crear vehículos tipo lancha.
     */
    private void createBoat() {
        int numberOfPassengers, answer, numberEngines;
        String color, registrationDate, cicle;
        cicle = "s";
        boolean crew;
        do {
            if (vehicles.size() < 10) {
                messageView("Ingrese número de pasajeros");
                numberOfPassengers = leerDato.nextInt();
                messageView("Ingrese 0 si el vehiculo No tiene tripulación y 1 si tiene ");
                answer = leerDato.nextInt();
                leerDato.skip("\n");
                crew = crew(answer);
                messageView("Ingrese la fecha de matricula con el formato dd/MM/yyyy");
                registrationDate = leerDato.nextLine();
                messageView("Ingrese el color");
                color = leerDato.nextLine();
                messageView("Ingrese el número de motores");
                numberEngines = leerDato.nextInt();
                Vehicle boat = new Boat(numberOfPassengers, crew, registrationDate, color, numberEngines);
                vehicles.add(boat);
                messageView("Lancha registrada!");
                messageView("¿Desea ingresar otra Lancha? S para Sí, N para No.");
                cicle = leerDato.next();
                leerDato.skip("\n");
            } else {
                messageView("No queda espacio en el ferri.");
            }
        } while (cicle.equals("S") || cicle.equals("s"));

    }

    /**
     * Método para crear vehículos tipo carro.
     */
    private void createCar() {
        int numberOfPassengers, numberDoors;
        String color, registrationDate, cicle;
        cicle = "s";
        do {
            if (vehicles.size() < 10) {
                messageView("Ingrese número de pasajeros");
                numberOfPassengers = leerDato.nextInt();
                leerDato.skip("\n");
                messageView("Ingrese la fecha de matricula con el formato dd/MM/yyyy");
                registrationDate = leerDato.nextLine();
                messageView("Ingrese el color");
                color = leerDato.nextLine();
                messageView("Ingrese el número de puertas");
                numberDoors = leerDato.nextInt();
                Vehicle car = new Car(numberOfPassengers, registrationDate, color, numberDoors);
                vehicles.add(car);
                messageView("Carro registrado!");
                messageView("¿Desea ingresar otro Carro? S para Sí, N para No.");
                cicle = leerDato.next();
                leerDato.skip("\n");
            } else {
                messageView("No queda espacio en el ferri.");
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
