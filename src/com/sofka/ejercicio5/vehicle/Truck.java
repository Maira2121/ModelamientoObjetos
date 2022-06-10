package com.sofka.ejercicio5.vehicle;

import com.sofka.ejercicio5.Vehicle;

/**
 * Clase Truck permite rear objetos de tipo Camión.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class Truck extends Vehicle {
    private double height;

    /**
     * Constructor de la clase
     *
     * @param numberOfPassengers número de pasajeros
     * @param registrationDate   fecha de registro
     * @param color              color del vehículo
     * @param height             altura del camión.
     */
    public Truck(int numberOfPassengers, int numberOfWheels, String registrationDate, String color, double height) {
        super("Camión", numberOfPassengers, false, numberOfWheels, registrationDate, "Tierra", color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Método pra mostrar los datos de los objetos.
     *
     * @return valores de los atributos de los objetos
     */
    @Override
    public String toString() {
        return "Truck{" +
                "Número de pasajeros: " + numberOfPassengers +
                ", Número de llantas: " + numberOfWheels +
                ", Feha de matriculación: " + registrationDate +
                ", Color: " + color +
                ", height=" + height +
                '}';
    }
}
