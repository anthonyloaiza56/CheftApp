package array;

import java.util.GregorianCalendar;

public class Sort_shell {
	
	public void ordenar(int[] arr) {
             long inicio = new GregorianCalendar().getTimeInMillis() ; //inicio el tiempo en milisegundos
            
	    int h = 1;
        while (h < arr.length) h = 3*h + 1;
        while (h > 0){
            h = h/3;
            for (int k = 0; k < h; k++){
                for (int i = h+k; i < arr.length; i+=h){
                    int key = arr[i];
                    int j = i-h;
                    while (j>=0 && arr[j] > key){
                        arr[j+h] = arr[j];
                        j-=h;
                    }
                    arr[j+h] = key;
                    //-> invariant: array[0,h,2*h..j] is sorted
                }
            }
            //->invariant: each h-sub-array is sorted
        }
        
            
            
             long ultimo = new GregorianCalendar().getTimeInMillis(); //aqui termina el tiempo
                
        //aqui recorro la lista ordenada segun su algoritmo
            int recorre4=0;
        while(recorre4!=arr.length){
            System.out.println(arr[recorre4]);
            recorre4++;
        }
        System.out.println("lista ordenada por Insertion, su tamaño es "+arr.length+ ", la duracion del proceso fue " + (ultimo -inicio) + " milisegundos");
	  
        }
}
