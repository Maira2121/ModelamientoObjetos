package com.sofka;

public class Menu {
    /**
     * Clase menú fue creada para llamar los métodos y no hacer más largas la clase donde se utilizan,
     * así que solo se debe instanciar la clase y se llama el método requerido.
     * ---------------------------------
     * Método utilizado en la clase Main
     */
    public void menuMain() {
        System.out.println("---------------------------------");
        System.out.println("Menú Principal");
        System.out.println("---------------------------------");
        System.out.println("1. Ejercicio 1: Sistema planetario.");
        System.out.println("2. Ejercicio 2: Método Main.");
        System.out.println("3. Ejercicio 3: Menú números aleatorios.");
        System.out.println("4. Ejercicio 4: Control de un Ferri.");
        System.out.println("5. Ejercicio 5: Sistema Ferri.");
        System.out.println("6. Ejercicio 6: Vector.");
        System.out.println("7. Salir.");
    }

    /**
     * Método utilizado en la clase MusicLibrary.
     */
    public void menuPlanetary() {
        System.out.println("---------------------------------");
        System.out.println("Menú Sistema planetario");
        System.out.println("---------------------------------");
        System.out.println("1. Crear cuerpos celestes");
        System.out.println("2. Calcular atracción gravitacional ");
        System.out.println("3. Listar cuerpos celestes ");
        System.out.println("4. Volver ");
    }

    public void menuRandom() {
        System.out.println("\n---------------------------------");
        System.out.println("Ordenar números aleatorios");
        System.out.println("---------------------------------");
        System.out.println("1. Ordenar por el método de Burbuja.");
        System.out.println("2. Ordenar por el método Quick sort.");
        System.out.println("3. Volver");
    }

    public void menuRandomOrder() {
        System.out.println("---------------------------------");
        System.out.println("Menú números aleatorios ordenados");
        System.out.println("---------------------------------");
        System.out.println("Escribe una de las opciones");
        System.out.println("1. Orden ascendente");
        System.out.println("2. Orden descendente");
        System.out.println("3. Volver");
    }

    public void menuFerry() {
        System.out.println("---------------------------------");
        System.out.println("Menú control de ferry");
        System.out.println("---------------------------------");
        System.out.println("1. Ingresar vehículos.");
        System.out.println("2. Listar vehículos.");
        System.out.println("3. Volver");
    }

    public void menuFerry2() {
        System.out.println("---------------------------------");
        System.out.println("Menú control de ferry");
        System.out.println("---------------------------------");
        System.out.println("1. Ingresar Bicicleta.");
        System.out.println("2. Ingresar Lancha.");
        System.out.println("3. Ingresar Carro.");
        System.out.println("4. Ingresar Moto.");
        System.out.println("5. Ingresar Camión.");
        System.out.println("6. Volver");
    }
}
