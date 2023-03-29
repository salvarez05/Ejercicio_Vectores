package org.example;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Scanner;

public class MainTest {
    @BeforeClass
    public static void main(String[] args) {
        int dimension;
        int primes=0;
        dimension= readDim();
        int [] vector;
        vector = new int [dimension];
        llenarVector(vector);
        System.out.println("Arreglo original");
        mostrarVector(vector);
        for (int pos = 0; pos < vector.length; pos++) {
            if(esPrimo(vector[pos])) primes++;
        }
        int [] vectorPrimes= new int[primes];
        copiarVectores(vector, vectorPrimes);
        System.out.println("Arreglo primo");
        mostrarVectorPrimo(vectorPrimes);

    }


    @Test
    private static void mostrarVectorPrimo(int[] otroVec) {
        for (int i = 0; i < otroVec.length; i++) {
            System.out.println(otroVec[i]);
        }
    }

    @Test
    private static void copiarVectores(int[] vec, int[] vectorPrimes) {
        int otraPos=0;
        for (int pos = 0; pos < vec.length; pos++) {
            if(esPrimo(vec[pos])){
                vectorPrimes[otraPos] = vec[pos];
                otraPos++;
            }

        }
    }

    @Test
    private static boolean esPrimo(int numero) {
        boolean primo = true;
        if (numero==0){
            primo=false;
        }
        if (numero==1){
            primo=false;
        }
        for (int cont = 2; cont < numero; cont++) {
            if (numero%cont==0){
                primo=false;
            }
        }
        return primo;
    }

    @Test
    private static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    @Test
    private static void llenarVector(int[] vector) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese numero");
            vector[i]= teclado.nextInt();
        }
    }

    @Test
    private static int readDim() {
        System.out.println("Cuan largo quiere el primer vector");
        Scanner teclado = new Scanner(System.in);
        int dimension= teclado.nextInt();
        return dimension;
    }


}
