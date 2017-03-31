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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 0;
        int id = 4;
        List<Coche> listaCoches = new ArrayList<>();
        
        Coche c1 = new Coche(1, "Volskwagen", "T5", 12345, 1234, true);
        Coche c2 = new Coche(2, "Toyota", "Yaris", 6000, 25220, false);
        Coche c3 = new Coche(3, "Seat", "Alhambra", 10000, 100000, true);
        
        listaCoches.add(c1);
        listaCoches.add(c2);
        listaCoches.add(c3);
               
        
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
                    Menu.crearNuevoCoche(listaCoches, id);
                    id ++;
                    break;

                case 2:
                    Menu.listarCoches(listaCoches);
                    break;

                case 3:
                    Menu.actualizarCoche(listaCoches);
                    break;

                case 4:
                    Menu.borrarCoche(listaCoches);
                    break;
            }
        }while(opcion!=0);
        
    }
    
}
