/*
Uniandes - Puyo 
Clasificacion de Animales
Octavo Semestre
Jonathan Llerena
27-05-2016
*/

package ej5clasificacionanimales;
import java.util.Date;

public class clsAnimales {
    
    public enum tipo1{vertebrados, invertebrados, oviparos, mamiferos};
   
    private int _id;
    private String _nombre;
    private Date _apareamiento;
    private float peso;
    private tipo1 _tipo1;

    public clsAnimales() {
    }

    public clsAnimales(int _id, String _nombre, Date _apareamiento, float peso, tipo1 _tipo1) {
        this._id = _id;
        this._nombre = _nombre;
        this._apareamiento = _apareamiento;
        this.peso = peso;
        this._tipo1 = _tipo1;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public Date Apareamiento() {
        return _apareamiento;
    }

    public void Apareamiento(Date _apareamiento) {
        this._apareamiento = _apareamiento;
    }

    public float Peso() {
        return peso;
    }

    public void Peso(float peso) {
        this.peso = peso;
    }

    public tipo1 Tipo1() {
        return _tipo1;
    }

    public void Tipo1(tipo1 _tipo1) {
        this._tipo1 = _tipo1;
    } 
}
