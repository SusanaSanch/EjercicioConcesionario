/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author alumno2
 */
public class Coche extends Vehiculo{
    
    private int kilometraje;
    private boolean segundaMano;

    public Coche(String marca, String modelo, float precio, int kilometraje, boolean segundaMano) {
        super(marca, modelo, precio);
        this.kilometraje = kilometraje;
        this.segundaMano = segundaMano;
    }
    
    public Coche(){}
    /*
    @Override
    public String toString() {
        return "Vehículo " + id + ": \n" + "Marca: " + marca
                + "\nModelo: " + modelo + "\nPrecio: " + precio
                + "\nKilometraje: " + getKilometraje() + "\nSegunda Mano: " 
                + isSegundaMano() + "\n"; //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public String toString() {
        return super.toString()+"\nKilometraje: " + this.getKilometraje() 
                + "\nSegunda Mano: " + this.isSegundaMano() + "\n"; 
    }
    
    
    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isSegundaMano() {
        return segundaMano;
    }

    public void setSegundaMano(boolean segundaMano) {
        this.segundaMano = segundaMano;
    }

    
    
        
}
