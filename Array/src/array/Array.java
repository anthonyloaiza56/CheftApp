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
        //AQUI MUESTRO LA LISTA HECHA
        /*
         int recorre=0;
        while(recorre!=ArregloOrdenado.length){
            System.out.println(ArregloOrdenado[recorre]);
            recorre++;
        }
        System.out.println("lista ordenada hecha");
        
       
        */
        
        /*
        ************************
        LISTA DESCENDENTE
        ************************
        */
        
        
        int indice2=0;
        int numero_lista2=1000;
        int Arreglodescendente[];
        Arreglodescendente= new int[1000];
        while(numero_lista2!=0){
            Arreglodescendente[indice2]=numero_lista2;
            numero_lista2--;
            indice2++;
        }
        //AQUI MUESTRO LA LISTA HECHA
        /*
         int recorre2=0;
        while(recorre2!=Arreglodescendente.length){
            System.out.println(Arreglodescendente[recorre2]);
            recorre2++;
        }
        System.out.println("Arreglodescendente hecho");
        
        */
       
        
        /*
        ***********************
        Arreglo DESORDENADA
        ***********************
        */
        int indice3=0;
        int aleatorio = (int) (Math.random()*1000)+1;
        int ArregloDesordenada[];
        ArregloDesordenada= new int[1000];
        while(indice3!=1000){
            ArregloDesordenada[indice3]=aleatorio;
            aleatorio = (int) (Math.random()*1000);
            indice3++;
        }
        
        
         
        //AQUI MUESTRO LA LISTA HECHA  
        /*
        int recorre3=0;
        while(recorre3!=ArregloDesordenada.length){
            System.out.println(ArregloDesordenada[recorre3]);
            recorre3++;
        }
        System.out.println("ArregloDesordenada hecha");
        */
        
        
        
        //Bubble B = new Bubble();
        //B.ordenar(ArregloDesordenada);
        
       //Insertion I= new Insertion();
      //I.doInsertionSort(ArregloDesordenada);
      
     //QuickSort Q = new QuickSort();
     //Q.sort(ArregloDesordenada);
       
     //Radix R = new Radix();
     //R.radixSort(ArregloDesordenada);
      
    //Sort_shell Se= new Sort_shell();
    //Se.ordenar(Arreglodescendente);
       
       Selection lista= new Selection();
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
       
       //Inv_extras=lista.ordenar(Inv_extras); //ORDENO LA LISTA INGRESADA DE EXTRAS
       
       for(int indiceI=0;indiceI<Inv_extras.length;indiceI++){
           System.out.println(E.FindString_by_ID(Inv_extras[indiceI]));
       }
      
       
       
    
     
        
      
       
      
       

    }
    }
