package com.sofka.ejercicio1;

import java.util.UUID;

/**
 * Clase CelestialBody permite crear objetos de tipo cuerpo celeste con los atributos solicitados.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-06
 * @since 1.0.1
 */
public class CelestialBody {
    private final UUID idCelestialBody;
    private String nameCelestialBody;
    private double mass;
    private double density;
    private double diameter;
    private double distanceFromSun;

    /**
     * Constructor de la clase CelestialBody
     *
     * @param nameCelestialBody nombre del cuerpo celeste a crear
     * @param mass              masa del cuerpo celeste
     * @param density           densidad del cuerpo celeste
     * @param diameter          diámetro del cuerpo celeste
     * @param distanceFromSun   distancia al sol del cuerpo celeste.
     */
    public CelestialBody(String nameCelestialBody, double mass, double density, double diameter, double distanceFromSun) {
        this.idCelestialBody = UUID.randomUUID();
        this.nameCelestialBody = nameCelestialBody;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
    }


    public String getNameCelestialBody() {
        return nameCelestialBody;
    }

    public void setNameCelestialBody(String nameCelestialBody) {
        this.nameCelestialBody = nameCelestialBody;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    /**
     * Método para mostrar los datos de los objetos
     *
     * @return los atributos de los objetos.
     */
    @Override
    public String toString() {
        return "Cuerpo celeste: {" +
                "Id:" + idCelestialBody +
                ", Nombre: '" + nameCelestialBody + '\'' +
                ", Masa: " + mass +
                ", Densidad: " + density +
                ", Diámetro: " + diameter +
                ", Distancia del sol: " + distanceFromSun +
                '}';
    }
}
