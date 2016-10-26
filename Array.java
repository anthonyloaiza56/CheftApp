/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Inventario.Extras;
import java.util.GregorianCalendar;

/**
 *
 * @author rloaiza
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ***************************
        Arreglo ORDENADO
        ***************************
        */
        int indice=0;
        int numero_lista=1;
        int ArregloOrdenado[];
        ArregloOrdenado= new int[1000];
        while(indice!=1000){
            ArregloOrdenado[indice]=numero_lista;
            numero_lista++;
            indice++;
        }
        
        
        //Bubble B = new Bubble();
        //B.ordenar(ArregloDesordenada);
        
       //Insertion I= new Insertion();
      //I.doInsertionSort(ArregloDesordenada);
      
    

      
   
       
        Bubble lista= new Bubble();
       Extras E = new Extras(); //CREO LA CLASE DE EXTRAS
       Alimento listaExtras[];
       listaExtras=E.lista(); //CREO LA LISTA DE ALIMENTOS EXTRAS
       
       //A PARTIR DE AQUI SIMULO CUANDO EL CHEFF INGRESA ALIMENTOS AL INVENTARIO
       //EN ESTE EJEMPLO EL INRESÓ 4
       int Inv_extras[];
       Inv_extras= new int[4];
       Inv_extras[0]=E.FindID_by_STRING("Salsa Inglesa");
       Inv_extras[1]=E.FindID_by_STRING("Polvo de hornear");
       Inv_extras[2]=E.FindID_by_STRING("Gelatina");
       Inv_extras[3]=E.FindID_by_STRING("Mermelada de fresa");
       
       Inv_extras=lista.ordenar(Inv_extras); //ORDENO LA LISTA INGRESADA DE EXTRAS
       
       for(int indiceI=0;indiceI<Inv_extras.length;indiceI++){
           System.out.println(E.FindString_by_ID(Inv_extras[indiceI]));
       }
      
       
       
    
     
        //Frutas-QuickSORT
       
       //QuickSort Q = new QuickSort();
     //Q.sort(ArregloDesordenada);
       
       //Granos-RadixSort
         //Radix R = new Radix();
     //R.radixSort(ArregloDesordenada);
       
       //Vegetales ShellSort
       //Sort_shell Se= new Sort_shell();
    //Se.ordenar(Arreglodescendente);
       
       //Lacteos Bubble sort
       //Bubble B = new Bubble();
        //B.ordenar(ArregloDesordenada);
        
       //Carnes Insertion
      //Insertion I= new Insertion();
      //I.doInsertionSort(ArregloDesordenada);
      
       
      
       

    }
    }
