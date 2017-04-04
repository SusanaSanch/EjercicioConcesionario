/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno2
 */
public class Menu {
    
    static int opcion = 0;
    static int id = 0;
    static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    
     public static void escribirFichero()
    {
        System.out.println("Ha entrado en escribir fichero");
        Codificador codificador = new Codificador();
        GestorFicheros gestorFicheros = new GestorFicheros("objetos.txt");
        String coded = codificador.codificar(listaVehiculos);
        gestorFicheros.escribirFichero(coded);
    }
    
    public static void leerFichero()
    {
        Codificador codificador = new Codificador();
        GestorFicheros gestorFicheros = new GestorFicheros("objetos.txt");
        String objetosSerializados = gestorFicheros.leerFichero();
        ArrayList<Vehiculo> objetos = codificador.descodificar(objetosSerializados);
        /*
        System.out.println("Marca\t\tModelo\t\tPrecio");
        for (Vehiculo v : objetos) {
            System.out.println(
                v.getMarca()+"\t\t"+v.getModelo()+"\t\t"+v.getPrecio()
            );
        }*/
        
    }
    
    public static void cargarEjemplos(){
        //EJEMPLOS
        int id = 4;
        
        Coche c1 = new Coche("Volskwagen", "T5", 12345, 1234, true);
        Coche c2 = new Coche("Toyota", "Yaris", 6000, 25220, false);
        Coche c3 = new Coche("Seat", "Alhambra", 10000, 100000, true);
        
        c1.setId(1);
        c2.setId(2);
        c3.setId(3);
        
        listaVehiculos.add(c1);
        listaVehiculos.add(c2);
        listaVehiculos.add(c3);
        
        Codificador codificador = new Codificador();
        GestorFicheros gestorFicheros = new GestorFicheros("objetos.txt");
        
        //prueba escritura 
        
        String coded = codificador.codificar(listaVehiculos);
        gestorFicheros.escribirFichero(coded);
        
        //prueba lectura
        /*
        String objetosSerializados = gestorFicheros.leerFichero();
        ArrayList<Vehiculo> objetos = codificador.descodificar(objetosSerializados);
        
        System.out.println("Marca\t\tModelo\t\tPrecio");
        for (Vehiculo v : objetos) {
            System.out.println(
                v.getMarca()+"\t\t"+v.getModelo()+"\t\t"+v.getPrecio()
            );
        }*/
        
        //FIN EJEMPLOS
    }
    
   
    
    public static void salir()
    {
        System.out.println("Programa finalizado");
    }
    
    public static void borrarVehiculo(ArrayList<Vehiculo> listaVehiculo)
    {
       
        try {
            System.out.println("Elija un vehículo de la lista: ");
            for(int i=1;i<listaVehiculo.size();i++){
                System.out.println("opción"+i+" - "+listaVehiculo.get(i).toString());
            }
            int id = Integer.valueOf(JOptionPane.showInputDialog("Introduzca el vehículo a borrar:"));
            listaVehiculo.remove(id);
            System.out.println("El vehículo número " + id + " ha sido borrado.");
            
        } catch (Exception e) {
            System.out.println("Error en el borrado del vehículo");
        }
    } 
    
}
