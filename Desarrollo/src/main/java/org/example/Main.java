package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        int dimension;
        int primes=0;
        dimension= readDim();
        int [] vector;
        vector = new int [dimension];
        llenarVector(vector);
        mostrarVector(vector);
        esPrimo();
    }

    private static void esPrimo() {
    }

    private static void mostrarVector(int[] vector) {
    }

    private static void llenarVector(int[] vector) {
    }

    private static int readDim() {
        Scanner teclado = new Scanner(System.in);
        int dimension= teclado.nextInt();
        return dimension;
    }
}