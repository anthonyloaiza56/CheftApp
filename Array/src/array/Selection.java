/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.GregorianCalendar;

/**
 *
 * @author rloaiza
 */
public class Selection {
    public int arr[];
    public int tiempo;
    
    
    
    public int[] ordenar(int arreglo[]){
    
     /*
        *********************************************************
        SELECTION
        *********************************************************
        */
        long inicio = new GregorianCalendar().getTimeInMillis() ; //inicio el tiempo en milisegundos
        
        
        int arr[];
        arr=arreglo; //AQUI SE PONE EL TIPO DE LISTA A USAR
        int min;
        for (int i = 0; i < arr.length; i++) {
            //ASUME QUE EL PRIMER ELEMENTO ES EL MINIMO
        min = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;

            }
        }
        if (min != i) {
            final int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(arr[i]);
    }
        
        long ultimo = new GregorianCalendar().getTimeInMillis(); //aqui termina el tiempo
        
        
        //aqui recorro la lista ordenada segun su algoritmo
        int recorre4=0;
        while(recorre4!=arr.length){
            System.out.println(arr[recorre4]);
            recorre4++;
        }
        
        System.out.println("lista ordenada por Selection, su tamaño es "+arr.length+ ",su duracion fue de " + (ultimo -inicio) + " milisegundos");
        return arr;
    }
    
}
