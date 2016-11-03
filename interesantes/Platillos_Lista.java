package app.tony.com.cheffapp;

/**
 * Esta clase la usare para los registros del menu, verficar si hay suficientes ingredientes, traducir las ordenes que lleguen(encontrar la receta),que el cliente maneje el precio de las recetas,ordenar las listas de ongredientes antes de usar en busqueda binaria
 * Created by rloaiza on 10/31/2016.
 */

public class Platillos_Lista {
    public Platillo lista[]=new Platillo[21];


    public void crear_lista() {
        Platillo Arroz_con_pollo= new Platillo();
        Arroz_con_pollo.crear_platillo("Arroz con Pollo",10, new String[]{"Picar la cebolla y el chile ", "Cocinar el filete de pollo y el arroz ","Agregar la salsa y revolver"},"Plato Fuerte",new int[]{39,5,66,65,23},2000);
        lista[0]=Arroz_con_pollo;

        Platillo Arroz_Cantones=new Platillo();
        Arroz_Cantones.crear_platillo("Arroz Cantonés",11,new String[]{"Picar la salchicha, el chile y cilantro ","Cocinar la carne y el arroz","Agregar la salsa y resolver"},"Plato Fuerte",new int[]{39,3,13,67,66,22},2200);
        lista[1]=Arroz_Cantones;

        Platillo Lomo_de_res=new Platillo();
        Lomo_de_res.crear_platillo("Lomito de res a la plancha",12,new String[]{"Paso 1: Picar la cebolla y el chile = 4 min","Paso 2: Cocinar el lomo y el arroz = 30 min","Paso 3: picar el tomate y la lechuga = 4 min"},"Plato Fuerte",new int[]{39,9,66,65,75,70},3000);
        lista[2]=Lomo_de_res;

        Platillo Pechuga_de_pollo= new Platillo();
        Pechuga_de_pollo.crear_platillo("Pechuga de Pollo a la plancha",13,new String[]{"Paso 1: Cocinar la pechuga y el arroz = 25 min","Paso 2: picar el tomate y la lechuga = 4 min"},"Plato Fuerte",new int[]{39,12,75,70},2200);
        lista[3]=Pechuga_de_pollo;

        Platillo Sopa_de_pollo= new Platillo();
        Sopa_de_pollo.crear_platillo("Sopa de pollo",14,new String[]{"Paso 1: Cocinar la pechuga, papa, camote y elote = 30 min","Paso 2: mezclar el caldo de carne, agua y los ingredientes cocinados = 10 min"},"Plato Fuerte",new int[]{12,71,64,69,1},2500);
        lista[4]=Sopa_de_pollo;

        Platillo Pastel_de_carne=new Platillo();
        Pastel_de_carne.crear_platillo("Pastel de carne",15,new String[]{"Paso 1: Cocinar la cebolla= 2 min","Paso 2: mezclar la carne con los huevos, sal, pimienta y leche = 20 min","Paso 3: cocinar en el horno = 10 min"},"Plato Fuerte",new int[]{4,7,65,55,19,21},2600);
        lista[5]=Pastel_de_carne;

        Platillo Pasta_en_salsa=new Platillo();
        Pasta_en_salsa.crear_platillo("Pasta en salsa blanca",16,new String[]{"Paso 1: Cocinar la pasta= 10 min","Paso 2: cocinar la leche con la harina y la cebolla picada = 9 min","Paso 3: agregar sal y pimienta y revolver = 4 min"},"Plato Fuerte",new int[]{52,65,47,55,19,21},1800);
        lista[6]=Pasta_en_salsa;

        //continuacion
        Platillo Tilapia_al_horno=new Platillo();
        Tilapia_al_horno.crear_platillo("Tilapia al horno",17,new String[]{"Paso 1: Cocinar la tilapia y el arroz= 20 min","Paso 2: cocinar la cebolla = 2 min","Paso 3: picar el tomate y la lechuga = 4 min"},"Plato Fuerte",new int[]{14,39,65,75,70},2800);
        lista[7]=Tilapia_al_horno;

        Platillo Frijoles_con_carne=new Platillo();
        Frijoles_con_carne.crear_platillo("Frijoles con carne de cerdo",18,new String[]{"Paso 1: Cocinar los frijoles y la carne = 30 min","Paso 2: picar la cebolla y el chile dulce = 4 min","Paso 3: agregar sal y pimienta y revolver = 4 min"},"Plato Fuerte",new int[]{44,65,2,66,19,21},2000);
        lista[8]=Frijoles_con_carne;

        Platillo Albondigas_en_salsa=new Platillo();
        Albondigas_en_salsa.crear_platillo("Albóndigas en salsa",19,new String[]{"Paso 1: Cocinar la carne molida = 10 min","Paso 2: cocinar el tomate con la cebolla, harina = 9 min","Paso 3: agregar sal y pimienta = 4 min"},"Plato Fuerte",new int[]{4,65,47,75,19,21},2200);
        lista[9]=Albondigas_en_salsa;

        Platillo Pozole= new Platillo();
        Pozole.crear_platillo("Pozole",20,new String[]{"Paso 1: Cocinar la carne= 20 min","Paso 2: agregar la cebolla picada, el maíz y el caldo de carne = 22 min","Paso 3: agregar sal, pimienta y cocinar= 4 min"},"Entrada",new int[]{2,65,1,50,19,21},1500);
        lista[10]=Pozole;

        Platillo Tortilla_de_queso= new Platillo();
        Tortilla_de_queso.crear_platillo("Tortilla de queso",21,new String[]{"Paso 1: mezclar el queso, harina, leche y sal = 11 min","Paso 2: cocinar las tortillas= 5 min"},"Entrada",new int[]{60,47,55,21},1000);
        lista[11]=Tortilla_de_queso;

        Platillo Huevos_revueltos= new Platillo();
        Huevos_revueltos.crear_platillo("Huevos revueltos con jamón",22,new String[]{"Paso 1: picar el jamón y mezclar con los huevos= 9 min","Paso 2: cocinar y añadir la sal y pimenta = 4 min"},"Entrada",new int[]{8,7,19,21},800);
        lista[12]=Huevos_revueltos;

        Platillo Patacones_con_queso= new Platillo();
        Patacones_con_queso.crear_platillo("Patacones con queso",23,new String[]{"Paso 1: cocinar el plátano en agua= 4 min","Paso 2: mezclar la, cebolla, queso y amasar = 4 min","Paso 3: agregar sal y pimienta = 4 min","Paso 4: formar los patacones y cocinar = 5 min"},"Entrada",new int[]{73,65,60,19,21},1000);
        lista[13]=Patacones_con_queso;

        Platillo Ensalada_de_aguacate= new Platillo();
        Ensalada_de_aguacate.crear_platillo("Ensalada de aguacate",24,new String[]{"Paso 1: Picar el aguacate, tomate y lechuga = 6 min","Paso 2: mezclar todo = 2 min"},"Entrada",new int[]{24,65,75,70,21},1000);
        lista[14]=Ensalada_de_aguacate;

        Platillo Tres_leches= new Platillo();
        Tres_leches.crear_platillo("Tres leches",25,new String[]{"Paso 1: Mezclar harina, leche, huevos, leche evaporada y leche condensada = 17 min","Paso 2: cocinar al horno = 15 min"},"Postre",new int[]{47,55,7,56,57},1500);
        lista[15]=Tres_leches;

        Platillo Chesse_cake_fresa= new Platillo();
        Chesse_cake_fresa.crear_platillo("Cheese cake de fresa",26,new String[]{"Paso 1: Picar las fresas = 2 min","Paso 2: Mezclar harina, leche y leche evaporada = 11 min","Paso 3: cocinar al horno = 15 min"},"Postre",new int[]{47,55,27,57},1200);
        lista[16]=Chesse_cake_fresa;

        Platillo Queque_seco= new Platillo();
        Queque_seco.crear_platillo("Porción de queque seco",27,new String[]{"Paso 1: Mezclar harina, leche, polvo de hornear y huevo = 13 min","Paso 2: cocinar al horno = 15 min"},"Postre",new int[]{47,55,20,7},1200);
        lista[17]=Queque_seco;

        Platillo Helado_con_gelatina= new Platillo();
        Helado_con_gelatina.crear_platillo("Helado con Gelatina",28,new String[]{"Paso 1: servir el helado y la gelatina = 8 min","Paso 2: decorar con leche condensada por encima = 4 min"},"Postre",new int[]{17,16,56},1000);
        lista[18]=Helado_con_gelatina;

        Platillo Flan_de_coco= new Platillo();
        Flan_de_coco.crear_platillo("Flan de coco",29,new String[]{"Paso 1: servir el flan = 4 min","Paso 2: decorar con la mermelada = 2 min"},"Plato Fuerte",new int[]{15,18},800);
        lista[19]=Flan_de_coco;

        Platillo Fresas_con_crema_chantilli= new Platillo();
        Fresas_con_crema_chantilli.crear_platillo("Fresas con crema chantilli",30,new String[]{"Paso 1: picar las fresas = 2 min","Paso 2: decorar con crema y leche condensada = 6 min"},"Postre",new int[]{27,54,56},1200);
        lista[20]=Fresas_con_crema_chantilli;

    }


}
