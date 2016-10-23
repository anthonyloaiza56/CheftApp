package Sort;

import java.util.Arrays;

public class MainS {

	public static void main(String[] args) {
		//Shell
		int [] array = {5,3,0,2,4,1,0,5,2,3,1,4}; 
	    System.out.println("Before: " + Arrays.toString(array));
	    ShellSort.sort(array);
	    System.out.println("After:  " + Arrays.toString(array));
		 
		//InsertionSort
		/*
		int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = InsertionSort.doInsertionSort((arr1));
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }*/
		//QuickSort
        /*int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        QuickSort.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }*/
	}
}
