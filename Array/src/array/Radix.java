/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 *
 * @author rloaiza
 */
public class Radix {
 
    public void radixSort(int[] arr){
        
    long inicio = new GregorianCalendar().getTimeInMillis() ; //inicio el tiempo en milisegundos
    
    if(arr.length == 0)
            return;
    int[][] np = new int[arr.length][2];
    int[] q = new int[0x100];
        int i,j,k,l,f = 0;
        for(k=0;k<4;k++){
            for(i=0;i<(np.length-1);i++)
                np[i][1] = i+1;
            np[i][1] = -1;
            for(i=0;i<q.length;i++)
                q[i] = -1;
            for(f=i=0;i<arr.length;i++){
                j = ((0xFF<<(k<<3))&arr[i])>>(k<<3);
                if(q[j] == -1)
                    l = q[j] = f;
                else{
                    l = q[j];
                    while(np[l][1] != -1)
                        l = np[l][1];
                    np[l][1] = f;
                    l = np[l][1];
                }
                f = np[f][1];
                np[l][0] = arr[i];
                np[l][1] = -1;
            }
            for(l=q[i=j=0];i<0x100;i++)
                for(l=q[i];l!=-1;l=np[l][1])
                        arr[j++] = np[l][0];
        }
    
         long ultimo = new GregorianCalendar().getTimeInMillis(); //aqui termina el tiempo
        
        
        //aqui recorro la lista ordenada segun su algoritmo
        int recorre4=0;
        while(recorre4!=arr.length){
            System.out.println(arr[recorre4]);
            recorre4++;
        }
        System.out.println("lista ordenada por Radix , su tamaño es "+arr.length+ ",su tiempo fue " + (ultimo -inicio) + " milisegundos");
        
    }
    
}
    


