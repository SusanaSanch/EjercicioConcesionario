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
    /**
     * muestra el menú
     */
    public static void showMenu(){
        
        System.out.println("Seleccione una opción:\n");
        System.out.println("1 - Crear nuevo coche");
        System.out.println("2 - Listar todos los coches");
        System.out.println("3 - Actualizar un coche");
        System.out.println("4 - Borrar un coche");
        System.out.println("0 - Salir");
    }
    
    /**
     * Recoge la opción elegida
     * @return número de opción
     */
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
    
    public static void crearNuevoVehiculo(List<Vehiculo> listaVehiculos, int id)
    {
        int opcionVehiculo = Integer.valueOf(JOptionPane.showInputDialog("¿Qué vehículo quiere crear?\n"
                + "1 - Coche\n"
                + "2 - Camión"));
        if(opcionVehiculo == 1)
        {
            Coche coche = new Coche();
        
            try {
                coche.setId(id);
                coche.setMarca(JOptionPane.showInputDialog("Introduzca marca del vehículo:"));
                coche.setModelo(JOptionPane.showInputDialog("Introduzca modelo del vehículo:"));
                coche.setPrecio(Float.valueOf(JOptionPane.showInputDialog("Introduzca precio del vehículo:")));
                coche.setKilometraje(Integer.valueOf(JOptionPane.showInputDialog("Introduzca kilometraje:")));
                coche.setSegundaMano(preguntaSegundaMano());

            listaVehiculos.add(coche);
            } catch (Exception e) {
                System.out.println("Se ha producido un error creando el nuevo coche");
            }
        }else if(opcionVehiculo == 2)
        {
            Camion camion = new Camion();
            try {
                camion.setId(id);
                camion.setMarca(JOptionPane.showInputDialog("Introduzca marca del vehículo:"));
                camion.setModelo(JOptionPane.showInputDialog("Introduzca modelo del vehículo:"));
                camion.setPrecio(Float.valueOf(JOptionPane.showInputDialog("Introduzca precio del vehículo:")));
                camion.setCarga(Integer.valueOf(JOptionPane.showInputDialog("Introduzca la carga:")));
                camion.setTipo(JOptionPane.showInputDialog("Introduzca tipo del vehículo:"));

            listaVehiculos.add(camion);
            } catch (Exception e) {
                System.out.println("Se ha producido un error creando el nuevo coche");
            }
        }else
        {
            JOptionPane.showMessageDialog(null,"Valor introducido no válido");
            crearNuevoVehiculo(listaVehiculos, id);
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
    
    public static void listarVehiculos(List<Vehiculo> listaVehiculos){
        
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo instanceof Coche)
            {
                System.out.println(((Coche)vehiculo).toString());
            }
            else
            {
                System.out.println(((Camion)vehiculo).toString());
            }
        }
        
    }
    
    public static void actualizarVehiculo (List<Vehiculo> listaVehiculo)
    {
        
        System.out.println("Elija un vehículo de la lista: ");
        for(int i=1;i<listaVehiculo.size();i++){
            System.out.println("opción"+i+" - "+listaVehiculo.get(i).toString());
        }
        int id = Integer.valueOf(JOptionPane.showInputDialog("Introduzca el vehículo a actualizar:"));
        Vehiculo vehiculoDeseado = listaVehiculo.get(id);
       
        vehiculoDeseado.setMarca(JOptionPane.showInputDialog("Introduzca marca del vehículo:", vehiculoDeseado.getMarca()));
        vehiculoDeseado.setModelo(JOptionPane.showInputDialog("Introduzca modelo del vehículo:", vehiculoDeseado.getModelo()));
        vehiculoDeseado.setPrecio(Float.valueOf(JOptionPane.showInputDialog("Introduzca precio del vehículo:", vehiculoDeseado.getPrecio())));
        
        if(vehiculoDeseado instanceof Coche)
        {
            ((Coche) vehiculoDeseado).setKilometraje(Integer.valueOf(JOptionPane.showInputDialog("Introduzca kilometraje:", ((Coche) vehiculoDeseado).getKilometraje())));
            ((Coche) vehiculoDeseado).setSegundaMano(preguntaSegundaMano());
        }else
        {
            ((Camion)vehiculoDeseado).setCarga(Integer.valueOf(JOptionPane.showInputDialog("Introduzca carga:", ((Camion)vehiculoDeseado).getCarga())));
            ((Camion)vehiculoDeseado).setTipo(JOptionPane.showInputDialog("Introduzca tipo:", ((Camion)vehiculoDeseado).getTipo()));
        }
                
    }
    
    public static void borrarVehiculo(List<Vehiculo> listaVehiculo)
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
