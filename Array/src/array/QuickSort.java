package array;

import java.util.GregorianCalendar;

public class QuickSort {
    private static int array[];
    private static int length;
 
    public void sort(int[] inputArr) {
        
        
        long inicio = new GregorianCalendar().getTimeInMillis() ; //inicio el tiempo en milisegundos
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
        long ultimo = new GregorianCalendar().getTimeInMillis(); //aqui termina el tiempo
        
        int recorre4=0;
        while(recorre4!=inputArr.length){
            System.out.println(inputArr[recorre4]);
            recorre4++;
        }
        System.out.println("lista ordenada por QuickSort, su tamaño es "+inputArr.length+ ",la duracion fue " + (ultimo -inicio) + " milisegundos");
        
        
        
    }
 
    private static void quickSort(int lowerIndex, int higherIndex) {
        long inicio = new GregorianCalendar().getTimeInMillis() ; //inicio el tiempo en milisegundos 
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private static void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
