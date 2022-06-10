package com.sofka.ejercicio6;

import java.util.Vector;

/**
 * Clase que representa un arreglo.
 *
 * @author Maira Bastidas Gómez
 * @version 1.0.1 2022-06-10
 * @since 1.0.1
 */
public class ArrayNumber {
    private final Vector<Integer> vector = new Vector<>();

    /**
     * Método que pregunta si un número es igual al ultimo ingresado.
     * @param number número a comparar.
     * @return retorna 1 si es igual o -1 si no es igual.
     */
    public int lookNumber(int number) {
        if (vector.size() > 0 && vector.lastElement().equals(number)) {
            return 1;
        } else return -1;
    }

    /**
     * Método para mostrar los números ingresados en el arreglo.
     */
    public void print(){
        for (Integer integer : vector) {
            System.out.println(integer);
        }
    }

    /**
     * Método para agregar números en el arreglo.
     */
    public void addNumber(int number){
        vector.add(number);
    }
}
