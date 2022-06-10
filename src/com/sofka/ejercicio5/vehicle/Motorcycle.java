package com.sofka.ejercicio5.vehicle;

import com.sofka.ejercicio5.Vehicle;

/**
 * Clase Motorcycle permite rear objetos de tipo Moto.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class Motorcycle extends Vehicle {
    private String cylinderCapacity;

    /**
     * Constructor de la clase
     *
     * @param numberOfPassengers número de pasajeros
     * @param registrationDate   fecha de registro
     * @param color              color del vehículo
     * @param cylinderCapacity         cilindraje de la moto.
     */
    public Motorcycle(int numberOfPassengers, String registrationDate, String color, String cylinderCapacity) {
        super("Moto", numberOfPassengers, false, 2, registrationDate, "Tierra", color);
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    /**
     * Método pra mostrar los datos de los objetos.
     *
     * @return valores de los atributos de los objetos
     */
    @Override
    public String toString() {
        return "Moto: {" +
                "Número de pasajeros: " + numberOfPassengers +
                ", Fecha de matriculación: " + registrationDate +
                ", Color: " + color +
                ", Cilindraje: " + cylinderCapacity + '}';
    }
}
