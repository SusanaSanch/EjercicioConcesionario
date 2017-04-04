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
public class Camion extends Vehiculo{
    
    private int carga;
    private String tipo;

   
    public Camion(int carga, String tipo, String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        this.carga = carga;
        this.tipo = tipo;
    }

    public Camion() {
    }

    @Override
    public String toString() {
        return super.toString()+"\nCarga: " + this.getCarga() + "\nTipo: " 
                + this.getTipo() + "\n";
    }

    
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
