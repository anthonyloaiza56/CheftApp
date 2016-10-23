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
public class Alimento {
    public String Nombre;
    public int ID;
    
    public void setDato(String Alimento,int id){
        this.Nombre=Alimento;
        this.ID=id;        
    }
    public int getID(){
        return this.ID;        
    }
    public String getNombre(){
        return this.Nombre;        
    }
    
}
