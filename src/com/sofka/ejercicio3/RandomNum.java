package com.sofka.ejercicio3;

import com.sofka.Menu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Clase RandomNum: esta clase permite generar números aleatorios para luego ser ordenador por los métodos de burbuja o Quick sort
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-09
 * @since 1.0.1
 */
public class RandomNum {
    private double[] num;
    private int nElement;
    Menu menu = new Menu();

    /**
     * Método que define la cantidad de números a generar y luego llama al método para llenar el arreglo de números y luego muestra los números aleatorios generados.
     */
    public void randomNum() {
        nElement = 10;
        num = new double[nElement];
        fillArrayList();
        System.out.println("Array de números aleatorios generado:");
        printAscendingOrder();

    }

    /**
     * Método para invocar el método de ordenamiento Burbuja donde se pregunta si se desea ordenar de forma ascendente o descendente
     */
    public void bubble() {
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int opcion;
        orderRandomBubble(num);
        while (!exit) {
            opcion = sn.nextInt();
            sn.skip("\n");
            switch (opcion) {
                case 1 -> {
                    System.out.println("Números ordenados con el método Burbuja en forma ascendente:");
                    printAscendingOrder();
                    System.out.println("");
                    menu.menuRandomOrder();

                }
                case 2 -> {
                    System.out.println("Números ordenados con el método Burbuja en forma descendente:");
                    printDescendingOrder();
                    System.out.println("");
                    menu.menuRandomOrder();
                }
                case 3 -> exit = true;
                default -> System.out.println("Only numbers between 1 y 3");
            }

        }
    }

    /**
     * Método para invocar el método de ordenamiento QuickSort donde se pregunta si se desea ordenar de forma ascendente o descendente
     */
    public void quickSort() {
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int opcion;
        orderRandomQuickSort(num, 0, num.length - 1);
        while (!exit) {
            opcion = sn.nextInt();
            sn.skip("\n");
            switch (opcion) {
                case 1 -> {
                    System.out.println("Números ordenados con el método Quick sort en forma ascendente:");
                    printAscendingOrder();
                    System.out.println("");
                    menu.menuRandomOrder();
                }
                case 2 -> {
                    System.out.println("Números ordenados con el método Quick sort en forma descendente:");
                    printDescendingOrder();
                    System.out.println("");
                    menu.menuRandomOrder();
                }
                case 3 -> exit = true;
                default -> System.out.println("Only numbers between 1 y 3");
            }

        }
    }

    /**
     * Método de ordenamiento burbuja.
     */
    public void orderRandomBubble(double[] num) {
        for (int i = 0; i < nElement - 1; i++) {
            for (int j = 0; j < nElement - 1; j++) {
                if (num[j] > num[j + 1]) {
                    double aux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = aux;
                }
            }
        }
    }

    /**
     * Método de ordenamiento Quick sort.
     */
    public void orderRandomQuickSort(double[] array, int left, int right) {
        double pivot = num[left];
        int i = left;
        int j = right;
        double aux;
        while (i < j) {
            while (array[i] <= pivot && i < j) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
        num[left] = num[j];
        num[j] = pivot;
        if (left < j - 1) {
            orderRandomQuickSort(array, left, j - 1);
        }
        if (j + 1 < right) {
            orderRandomQuickSort(array, j + 1, right);
        }

    }

    /**
     * Método de llenar el arreglo con los números aleatorios.
     */
    public void fillArrayList() {
        int x = 0;
        double number;
        while (x < nElement) {
            number = Math.random() * 100 + 1;
            num[x] = number;
            x++;
        }

    }

    /**
     * Método para imprimir los números aleatorios
     */
    private void printAscendingOrder() {
        DecimalFormat df = new DecimalFormat("###.#");
        for (int i = 0; i < nElement; i++) {
            System.out.print("(" + df.format(num[i]) + "), ");

        }
        System.out.print("\b\b");

    }

    /**
     * Método para imprimir los números aleatorios de forma descendente.
     */
    private void printDescendingOrder() {
        DecimalFormat df = new DecimalFormat("###.#");
        for (int i = nElement - 1; i >= 0; i--) {
            System.out.print("(" + df.format(num[i]) + "), ");
        }
        System.out.print("\b\b");
    }

}
