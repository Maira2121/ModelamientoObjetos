package com.sofka.ejercicio5.vehicle;

import com.sofka.ejercicio5.Vehicle;

/**
 * Clase Car permite rear objetos de tipo carro.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class Car extends Vehicle {
    private int numberDoor;

    /**
     * Constructor de la clase
     *
     * @param numberOfPassengers número de pasajeros
     * @param registrationDate   fecha de registro
     * @param color              color del vehículo
     * @param numberDoor         número de puertas.
     */
    public Car(int numberOfPassengers, String registrationDate, String color, int numberDoor) {
        super("Carro", numberOfPassengers, false, 4, registrationDate, "Tierra", color);
        this.numberDoor = numberDoor;
    }

    public int getNumberDoor() {
        return numberDoor;
    }

    public void setNumberDoor(int numberDoor) {
        this.numberDoor = numberDoor;
    }

    /**
     * Método pra mostrar los datos de los objetos.
     *
     * @return valores de los atributos de los objetos
     */
    @Override
    public String toString() {
        return "Carro: {" +
                "Número de pasajeros: " + numberOfPassengers +
                ", Fecha de matriculación: " + registrationDate +
                ", Color: " + color +
                ", Número de puertas: " + numberDoor +
                '}';
    }
}
