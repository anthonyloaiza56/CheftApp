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
public class Insertion {
    
    
        public void doInsertionSort(int[] arreglo){
            
        long inicio = new GregorianCalendar().getTimeInMillis() ; //inicio el tiempo en milisegundos
         
        int temp;
        for (int i = 1; i < arreglo.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arreglo[j] < arreglo[j-1]){
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j-1];
                    arreglo[j-1] = temp;
                }
            }
            
        }
        long ultimo = new GregorianCalendar().getTimeInMillis(); //aqui termina el tiempo        
        
        
        //aqui recorro la lista ordenada segun su algoritmo
        int recorre4=0;
        while(recorre4!=arreglo.length){
            System.out.println(arreglo[recorre4]);
            recorre4++;
        }
        System.out.println("lista ordenada por Insertion,su tamaño es "+arreglo.length+ ", Duracion del proceso = " + (ultimo -inicio) + " milisegundos");
    }
    
}
