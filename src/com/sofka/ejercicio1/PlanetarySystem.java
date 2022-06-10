package com.sofka.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase permite simular un sistema planetario, en esta se establecen los métodos para crear, listar y calcular la atracción gravitatoria.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-09
 * @since 1.0.1
 */
public class PlanetarySystem {
    private final Scanner leerDato = new Scanner(System.in);
    public final double G = 6.67E-11;
    private final ArrayList<CelestialBody> celestialBodies = new ArrayList<>();

    /**
     * Método para crear objetos de tipo cuerpo celeste.
     */
    public void creatorCelestialBody() {
        String nameCelestialBody;
        double mass, density, diameter, distanceFromSun;
        messageView("Escriba un nombre para cuerpo celestial: ");
        nameCelestialBody = leerDato.nextLine();
        messageView("Escriba la masa del cuerpo celestial en kilogramos: ");
        mass = leerDato.nextDouble();
        leerDato.skip("\n");
        messageView("Escriba la densidad del cuerpo celeste: ");
        density = leerDato.nextDouble();
        messageView("Escriba el diámetro del cuerpo celestial: ");
        diameter = leerDato.nextDouble();
        messageView("Escriba la distancia que existe entre el cuerpo celestial y el sol");
        distanceFromSun = leerDato.nextDouble();
        leerDato.skip("\n");
        CelestialBody celestialBody = new CelestialBody(nameCelestialBody, mass, density, diameter, distanceFromSun);
        celestialBodies.add(celestialBody);
        messageView("Cuerpo celestial creado con éxito.");

    }

    /**
     * Método para mostrar mensajes por pantalla
     *
     * @param message el mensaje que se quiere mostrar.
     */
    private void messageView(String message) {
        System.out.println(message);
    }

    /**
     * Método para mostrar los cuerpos celestes creados.
     */
    public void toListCelestialBodies() {
        if (celestialBodies.size() > 0) {
            for (CelestialBody celestialBody : celestialBodies) {
                System.out.println(celestialBody.toString());
            }
        } else {
            messageView("No se han registrado cuerpos celestes.");
        }
    }

    /**
     * Método que llama al método para calcular la atracción gravitatoria. Aquí solo se piden los cuerpos celestes.
     */
    public void calculateAttraction() {
        String body1, body2;
        messageView("Escriba el nombre del cuerpo celeste 1: ");
        body1 = leerDato.nextLine();
        messageView("Escriba el nombre del cuerpo celeste 2: ");
        body2 = leerDato.nextLine();
        calculateGravitationalAttraction(body1, body2);

    }

    /**
     * Método para calcular la atracción gravitatoria. Este método verifica que los cuerpos celestes existan en la base de datos,
     * pide los datos necesarios para calcular la atracción gravitatoria y muestra el resultado.
     *
     * @param celestialBody1 cuerpo celeste 1
     * @param celestialBody2 cuerpo celeste 2
     */
    private void calculateGravitationalAttraction(String celestialBody1, String celestialBody2) {
        double gravitationalAttraction, distance;
        int body1, body2;
        body1 = searchBody(celestialBody1);
        body2 = searchBody(celestialBody2);
        if (body1 != -1 && body2 != -1) {
            messageView("Escriba la distancia que existe entre los cuerpos celestiales (en metros): ");
            distance = leerDato.nextDouble();
            gravitationalAttraction = (G * celestialBodies.get(body1).getMass() * celestialBodies.get(body2).getMass()) / (Math.pow(distance, 2));
            messageView("La atracción gravitatoria entre " + celestialBodies.get(body1).getNameCelestialBody() +
                    " y " + celestialBodies.get(body2).getNameCelestialBody() + " es de: "
                    + gravitationalAttraction + " Newton.");
        } else if (body1 == -1) {
            messageView("El cuerpo celeste " + celestialBody1 + " no está registrado en la base de datos");
        } else {
            messageView("El cuerpo celeste " + celestialBody2 + " no está registrado en la base de datos");
        }
    }

    /**
     * Método para buscar cuerpos celestes creados por nombre.
     *
     * @param nameCelestialBody nombre del cuerpo celeste a buscar
     * @return devuelve un entero que representa la posición en la lista del cuerpo celeste, o -1 si no lo encuentra.
     */
    private int searchBody(String nameCelestialBody) {
        int pos = -1;
        for (int i = 0; i < celestialBodies.size(); i++) {
            if (celestialBodies.get(i).getNameCelestialBody().equalsIgnoreCase(nameCelestialBody)) {
                pos = i;
            }
        }
        return pos;
    }

    /**
     * Método que crea algunos cuerpos celestes con el fin de que haya datos para hacer pruebas.
     */
    public void fillPlanetarySystem() {
        CelestialBody jupiter = new CelestialBody("Júpiter", 1.90, 1.33, 139.820, 778.5);
        CelestialBody mars = new CelestialBody("Marte", 6.40, 3.93, 6.7, 227.9);
        CelestialBody mercury = new CelestialBody("Mercurio", 3.285, 5.43, 4.879, 57.91);
        CelestialBody neptune = new CelestialBody("Neptuno", 1.024, 1.64, 49.244, 4.495);
        CelestialBody saturn = new CelestialBody("Saturno", 5.683, 687, 116.460, 1.434);
        CelestialBody uranus = new CelestialBody("Urano", 8.681, 1.27, 50.724, 2.871);
        CelestialBody venus = new CelestialBody("Venus", 4.867, 5.24, 12.104, 108.2);
        CelestialBody moon = new CelestialBody("Luna", 7.349, 3.34, 3.474, 149.984);
        CelestialBody earth = new CelestialBody("Tierra", 5.972, 5.51, 12.742, 149.6);
        celestialBodies.add(jupiter);
        celestialBodies.add(mars);
        celestialBodies.add(mercury);
        celestialBodies.add(neptune);
        celestialBodies.add(saturn);
        celestialBodies.add(uranus);
        celestialBodies.add(venus);
        celestialBodies.add(moon);
        celestialBodies.add(earth);
    }

}
