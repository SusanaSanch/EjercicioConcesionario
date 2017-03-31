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
public class Coche {
    
    private int id;
    private String marca;
    private String modelo;
    private float precio;
    private int kilometraje;
    private boolean segundaMano;

    public Coche(int id, String marca, String modelo, float precio, int kilometraje, boolean segundaMano) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.segundaMano = segundaMano;
    }
    
    public Coche(){}

    @Override
    public String toString() {
        return "Vehículo " + id + ": \n" + "Marca: " + marca
                + "\nModelo: " + modelo + "\nPrecio: " + precio
                + "\nKilometraje: " + kilometraje + "\nSegunda Mano: " 
                + segundaMano + "\n"; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
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
