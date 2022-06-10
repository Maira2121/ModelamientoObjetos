package com.sofka.ejercicio5;

/**
 * Clase Vehículo permite crear objetos de tipo vehículo.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public abstract class Vehicle {
    protected int numberOfPassengers;
    protected boolean crew;
    protected int numberOfWheels;
    protected String registrationDate;
    protected String displacementMedium;
    protected String color;
    protected String typeVehicle;

    /**
     * Constructor de la clase Vehicle .
     *
     * @param numberOfPassengers atributo para definir el número de pasajeros
     * @param crew               atributo para definir si es de tripulación o no.
     * @param numberOfWheels     atributo para definir el número de llantas.
     * @param registrationDate   atributo para definirla fecha de registro.
     * @param displacementMedium atributo para definir el medio por el que se desplaza.
     * @param color              atributo para definir el color del vehículo.
     */
    public Vehicle(String typeVehicle, int numberOfPassengers, boolean crew, int numberOfWheels, String registrationDate, String displacementMedium, String color) {
        this.typeVehicle = typeVehicle;
        this.numberOfPassengers = numberOfPassengers;
        this.crew = crew;
        this.numberOfWheels = numberOfWheels;
        this.registrationDate = registrationDate;
        this.displacementMedium = displacementMedium;
        this.color = color;
    }

    /**
     * Método toString convierte a String cualquier objeto y muestra los valores de sus atributos.
     *
     * @return los valores de los atributos de los objetos de tipo vehículo.
     */
    @Override
    public String toString() {
        return "Vehículo {" +
                "Tipo de Vehículo: " + typeVehicle +
                ", Número de pasajeros: " + numberOfPassengers +
                ", Tripulación: =" + crew() +
                ", Número de llantas: " + numberOfWheels +
                ", Fecha de matricula: " + registrationDate +
                ", Medio por el que se desplaza: " + displacementMedium +
                ", Color: " + color +
                " }";
    }

    /**
     * Método para mostrar si hay tripulación o no
     *
     * @return una respuesta mejor entendible para el usuario.
     */
    private String crew() {
        String crew;
        if (!this.crew)
            return " No";
        else {
            return " Sí";
        }
    }


}
