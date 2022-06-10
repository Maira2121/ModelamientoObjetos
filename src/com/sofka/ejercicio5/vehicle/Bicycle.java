package com.sofka.ejercicio5.vehicle;

import com.sofka.ejercicio5.Vehicle;

/**
 * Clase Bicycle permite rear objetos de tipo bicicleta.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class Bicycle extends Vehicle {
    private String biketype;

    /**
     * Constructor de la clase
     *
     * @param registrationDate fecha de registro
     * @param color            color del vehículo
     * @param biketype         tipo de bicicleta.
     */
    public Bicycle(String registrationDate, String color, String biketype) {
        super("Bicicleta", 1, false, 2, registrationDate, "Tierra", color);
        this.biketype = biketype;

    }

    public String getBiketype() {
        return biketype;
    }

    public void setBiketype(String biketype) {
        this.biketype = biketype;
    }

    /**
     * método para mostrar los valores de los atributos
     *
     * @return valores de los atributos.
     */
    @Override
    public String toString() {
        return "Bicicleta {" +
                "Fecha de matriculación: " + registrationDate +
                ", Color: " + color +
                ", Tipo de bicicleta: " + biketype + "}";
    }
}
