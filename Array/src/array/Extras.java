/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author rloaiza
 */
public class Extras {
    public static Alimento lista_extras[];
    public static int resultado_ID;
    public static String resultado_String;
    public Alimento[] lista(){
    
    lista_extras = new Alimento[9];    
    Alimento Flan= new Alimento();    Flan.setDato("Flan",0);
    Alimento Gelatina= new Alimento();    Gelatina.setDato("Gelatina",1);
    Alimento Helado= new Alimento();    Helado.setDato("Helado",2);
    Alimento Mermelada_de_fresa= new Alimento();    Mermelada_de_fresa.setDato("Mermelada de fresa",3);
    Alimento Pimienta= new Alimento();    Pimienta.setDato("Pimienta",4);
    Alimento Polvo_de_hornear= new Alimento();    Polvo_de_hornear.setDato("Polvo de hornear",5);
    Alimento Sal = new Alimento();    Sal.setDato("Sal",6);
    Alimento Salsa_Inglesa = new Alimento();    Salsa_Inglesa.setDato("Salsa Inglesa",7);
    Alimento Salsa_Lizano = new Alimento();    Salsa_Lizano.setDato("Salsa Lizano",8);
    lista_extras[0]=Flan;
    lista_extras[1]=Gelatina;
    lista_extras[2]=Helado;
    lista_extras[3]=Mermelada_de_fresa;
    lista_extras[4]=Pimienta;
    lista_extras[5]=Polvo_de_hornear;
    lista_extras[6]=Sal;
    lista_extras[7]=Salsa_Inglesa;
    lista_extras[8]=Salsa_Lizano;    
    return lista_extras;
    }
    
    public int FindID_by_STRING(String alimento){ //ingreso el nombre del alimento, y me devuelve su id en la lista
        
        for(int indice=0;indice<lista_extras.length;indice++){
            if(lista_extras[indice].getNombre()==alimento){
                resultado_ID=lista_extras[indice].getID();
                continue;
                
            }
        
        }
        return resultado_ID;
    }
    public String FindString_by_ID(int id_alimento){ //ingreso el id del alimento, y me devuelve su nombre
    
    for(int indice1=0;indice1<lista_extras.length;indice1++){
            if(lista_extras[indice1].ID==id_alimento){
                resultado_String=lista_extras[indice1].getNombre();
                continue;
                }       
    }
        return resultado_String;
    }
}
