package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myArray = getIntegers(3);
        printArray(myArray);

        int[] sortedArray = sortIntegers(myArray);

        printArray(sortedArray);


    }


    public static int[] getIntegers(int num) {

        int[] array = new int[num];

        System.out.println("Digit "+ num +" number :");
        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray (int[] array) {

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static int[] sortIntegers (int[] array) {

        for(int i = 0; i < array.length; i++) {
            boolean flag = false;
            for(int j = 0; j < array.length-1; j++) {

                //Se l' elemento j e maggiore del successivo allora
                //scambiamo i valori
                if(array[j] > array[j+1]) {
                    int k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                    flag=true; //Lo setto a true per indicare che é avvenuto uno scambio
                }


            }

            if(!flag) break; //Se flag=false allora vuol dire che nell' ultima iterazione
            //non ci sono stati scambi, quindi il metodo può terminare
            //poiché l' array risulta ordinato
        }

        int[] arraySort = Arrays.copyOf(array, array.length);

        return arraySort;
    }

}



