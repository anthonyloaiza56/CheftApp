package app.tony.com.cheffapp;

/**
 * Created by rloaiza on 10/31/2016.
 */

public class Platillo {
    public String Nombre;
    public int id;
    public String pasos[];
    public String categoria;
    public int ingredientes[];//verificar que sin con {3,2,,3} basta
    public int precio;

    public void crear_platillo(String Platillo,int ID,String[] Pasos,String Categoria,int[] Ingredientes,int Precio){
        this.Nombre=Platillo;
        this.id=ID;
        this.pasos=Pasos;
        this.categoria=Categoria;
        this.ingredientes=Ingredientes;
        this.precio=Precio;
    }
}
