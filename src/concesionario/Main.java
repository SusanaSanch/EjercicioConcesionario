/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno2
 */
public class Main {

    static int opcion = 0;
    static int id = 0;
    
     public static void escribirFichero(ArrayList<Vehiculo> listaVehiculos)
    {
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
        
        System.out.println("Marca\t\tModelo\t\tPrecio");
        for (Vehiculo v : objetos) {
            System.out.println(
                v.getMarca()+"\t\t"+v.getModelo()+"\t\t"+v.getPrecio()
            );
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
       
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        
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
        
        do{
            do{
            Menu.showMenu();

            try {
            opcion = Menu.recogerRespuesta();
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                opcion = Menu.recogerRespuesta();
            }
            }while (opcion >4 || opcion < 0);

       
            switch(opcion)
            {
                case 0:
                    Menu.salir();
                    break;

                case 1:
                    Menu.crearNuevoVehiculo(listaVehiculos, id);
                    id ++;
                    escribirFichero(listaVehiculos);
                    break;

                case 2:
                    Menu.listarVehiculos(listaVehiculos);
                    leerFichero();
                    break;

                case 3:
                    Menu.actualizarVehiculo(listaVehiculos);
                    escribirFichero(listaVehiculos);
                    break;

                case 4:
                    Menu.borrarVehiculo(listaVehiculos);
                    escribirFichero(listaVehiculos);
                    break;
            }
        }while(opcion!=0);
        
    }
    
}
