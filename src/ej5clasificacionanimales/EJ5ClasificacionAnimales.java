/*
Uniandes - Puyo 
Clasificacion de Animales
Octavo Semestre
Jonathan Llerena
27-05-2016
*/

package ej5clasificacionanimales;
import java.util.ArrayList;

public class EJ5ClasificacionAnimales {
   
    public static void main(String[] args) {
        ArrayList<clsAnimales> anim = new ArrayList<clsAnimales>();
               
        clsAnimales anim1 = new clsAnimales (1,"Canguro", null, 10, clsAnimales.tipo1.vertebrados);
        clsAnimales anim2 = new clsAnimales (2, "Araña", null, 15, clsAnimales.tipo1.invertebrados);
        clsAnimales anim3 = new clsAnimales (3, "Avestruz", null, 20, clsAnimales.tipo1.oviparos);
        clsAnimales anim4 = new clsAnimales (4, "Perro", null, 25, clsAnimales.tipo1.mamiferos);
        clsAnimales anim5 = new clsAnimales (5, "Camello", null, 30, clsAnimales.tipo1.vertebrados);
        clsAnimales anim6 = new clsAnimales (6, "Gusano", null, 35,clsAnimales.tipo1.invertebrados);
        clsAnimales anim7 = new clsAnimales (7, "Calamar", null, 40, clsAnimales.tipo1.oviparos);
        clsAnimales anim8 = new clsAnimales (8, "Gato", null, 45, clsAnimales.tipo1.mamiferos);
        clsAnimales anim9 = new clsAnimales (9, "Gorila", null, 50, clsAnimales.tipo1.vertebrados);
        clsAnimales anim10 = new clsAnimales (10, "Caracol", null, 55, clsAnimales.tipo1.invertebrados);   
        
        anim.add(anim1);
        anim.add(anim2);
        anim.add(anim3);
        anim.add(anim4);
        anim.add(anim5);
        anim.add(anim6);
        anim.add(anim7);
        anim.add(anim8);
        anim.add(anim9);
        anim.add(anim10);
        imprimir(anim);        
    }
    
    public static void imprimir(ArrayList<clsAnimales> anim){
        
        for (clsAnimales animal : anim){
            System.out.println("**********************");
            System.out.println("Id: " + animal.Id());
            System.out.println("Nombre: " + animal.Nombre());
            System.out.println("Apareamiento: " + animal.Apareamiento());
            System.out.println("Peso: " + animal.Peso());
            System.out.println("");            
        }
    }
}
