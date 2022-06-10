package com.sofka.ejercicio5.vehicle;

import com.sofka.ejercicio5.Vehicle;

/**
 *Clase Boat permite rear objetos de tipo lancha.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class Boat extends Vehicle {
    private int numberEngines;

    /**
     * Constructor de la clase
     * @param numberOfPassengers número de pasajeros
     * @param registrationDate fecha de registro
     * @param color color del vehículo
     * @param numberEngines número de motores.
     */
    public Boat(int numberOfPassengers, boolean crew, String registrationDate, String color, int numberEngines) {
        super("Lancha", numberOfPassengers, crew, 0, registrationDate, "Agua", color);
        this.numberEngines = numberEngines;
    }

    public int getNumberEngines() {
        return numberEngines;
    }

    public void setNumberEngines(int numberEngines) {
        this.numberEngines = numberEngines;
    }

    /**
     * Método pra mostrar los datos de los objetos.
     *
     * @return valores de los atributos de los objetos
     */
    @Override
    public String toString() {
        return "Lancha: {" +
                "Número de pasajeros: " + numberOfPassengers +
                ", ¿Tiene tripulación?: " + crew() +
                ", Fecha de matriculación: " + registrationDate +
                ", Medio por el qe se desplaza: " + displacementMedium +
                ", Color: " + color +
                ", Número de motores: " + numberEngines +
                '}';
    }

    private String crew() {
        String crew;
        if (!this.crew)
            return "No";
        else {
            return "Sí";
        }
    }
}
