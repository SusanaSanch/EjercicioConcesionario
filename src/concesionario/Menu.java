/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno2
 */
public class Menu {
    
    public static void showMenu(){
        
        System.out.println("Seleccione una opción:\n");
        System.out.println("1 - Crear nuevo coche");
        System.out.println("2 - Listar todos los coches");
        System.out.println("3 - Actualizar un coche");
        System.out.println("4 - Borrar un coche");
        System.out.println("0 - Salir");
    }
    
    public static int recogerRespuesta()
    {
        int respuesta = 0;
        
        Scanner sc = new Scanner(System.in);
        respuesta = Integer.valueOf(sc.nextLine());
        
        return respuesta;
    }
    
    public static void salir()
    {
        System.out.println("Programa finalizado");
    }
    
    public static void crearNuevoCoche(List<Coche> listaCoches, int id)
    {
        Coche coche = new Coche();
        boolean segundaMano = false;
        
        try {
            coche.setMarca(JOptionPane.showInputDialog("Introduzca marca del vehículo:"));
            coche.setModelo(JOptionPane.showInputDialog("Introduzca modelo del vehículo:"));
            coche.setPrecio(Float.valueOf(JOptionPane.showInputDialog("Introduzca precio del vehículo:")));
            coche.setKilometraje(Integer.valueOf(JOptionPane.showInputDialog("Introduzca kilometraje:")));
            coche.setSegundaMano(preguntaSegundaMano());
                
        listaCoches.add(coche);
        } catch (Exception e) {
            System.out.println("Se ha producido un error creando el nuevo coche");
        }
    }
    
    public static boolean preguntaSegundaMano()
    {
        String booleano = "";
        boolean segundaMano = false;
        
        booleano = JOptionPane.showInputDialog("¿El vehículo es de segunda mano? (SI/NO)");
        
        if(booleano.equalsIgnoreCase("SI"))
        {
            segundaMano = true;
        }
        else if(booleano.equalsIgnoreCase("NO"))
        {
            segundaMano = false;
        }
        else
        {
            System.out.println("El valor introducido no es válido");
            preguntaSegundaMano();
        }
        
        return segundaMano;
    }
    
    public static void listarCoches(List<Coche> listaCoches){
        
        for (Coche coche : listaCoches) {
            System.out.println(coche.toString());
        }
        
    }
    
    public static void actualizarCoche (List<Coche> listaCoches)
    {
        
        System.out.println("Lista de coches: ");
        for(int i=1;i<listaCoches.size();i++){
            System.out.println(i+" - "+listaCoches.get(i).toString());
        }
        int id = Integer.valueOf(JOptionPane.showInputDialog("Introduzca el id del vehículo a actualizar:"));
        Coche cocheDeseado = listaCoches.get(id);
       
        cocheDeseado.setMarca(JOptionPane.showInputDialog("Introduzca marca del vehículo:", cocheDeseado.getMarca()));
        cocheDeseado.setModelo(JOptionPane.showInputDialog("Introduzca modelo del vehículo:", cocheDeseado.getModelo()));
        cocheDeseado.setPrecio(Float.valueOf(JOptionPane.showInputDialog("Introduzca precio del vehículo:", cocheDeseado.getPrecio())));
        cocheDeseado.setKilometraje(Integer.valueOf(JOptionPane.showInputDialog("Introduzca kilometraje:", cocheDeseado.getKilometraje())));
        cocheDeseado.setSegundaMano(preguntaSegundaMano());
                
    }
    
    public static void borrarCoche(List<Coche> listaCoches)
    {
        try {
        int id = Integer.valueOf(JOptionPane.showInputDialog("Introduzca el id del vehículo a borrar:"));
        int idCoche = 0;
        int cont = 0;
        
        do
        {
            idCoche = listaCoches.get(cont).getId();
            cont++;
        }while(id == idCoche);
        
        listaCoches.remove(cont);
            System.out.println("El vehículo con id " + idCoche + " ha sido borrado.");
            
        } catch (Exception e) {
            System.out.println("Error en el borrado del vehículo");
        }
        
    }
    
}
