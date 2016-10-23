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
public class Bubble {
    
    	public void ordenar(int [] arreglo){
		
            
       long inicio = new GregorianCalendar().getTimeInMillis() ; //inicio el tiempo en milisegundos

            
	int temp = 0;
        
	
	while (true){
		boolean cambio = false;
		for(int pos = 1; pos < arreglo.length; pos++){
			if (arreglo[pos] < arreglo[pos-1]){
				temp = arreglo[pos];
				arreglo[pos] = arreglo[pos-1];
				arreglo[pos-1] = temp;
				cambio = true;
			}
		}
		if (cambio == false)
			break;
	}
        
               long ultimo = new GregorianCalendar().getTimeInMillis(); //aqui termina el tiempo
        
        int recorre4=0;
        while(recorre4!=arreglo.length){
            System.out.println(arreglo[recorre4]);
            recorre4++;
        }
        System.out.println("lista ordenada por QuickSort, su tamaño es "+arreglo.length+ ",la duracion fue " + (ultimo -inicio) + " milisegundos");
        
        
        
	}
	
    
}
