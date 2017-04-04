/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.ArrayList;

/**
 *
 * @author alumno2
 */
public class Codificador {
    
    final String FIELD_SEPARATOR = "###";
    final String OBJECT_SEPARATOR = "&&&";
    
    public String codificar(ArrayList<Vehiculo> lista){
        
        StringBuilder sb = new StringBuilder();
        
        for(Vehiculo v:lista)
        {
                    if(v instanceof Coche)
                    {
                        sb.append("1")
                            .append(FIELD_SEPARATOR)
                            .append(((Coche) v).getKilometraje())
                            .append(FIELD_SEPARATOR)
                            .append(((Coche) v).isSegundaMano())
                            .append(FIELD_SEPARATOR);
                        
                    }else if(v instanceof Camion)
                    {
                        sb.append("2")
                            .append(FIELD_SEPARATOR)
                            .append(((Camion) v).getCarga())
                            .append(FIELD_SEPARATOR)
                            .append(((Camion) v).getTipo())
                            .append(FIELD_SEPARATOR);
                    }
                    sb.append(v.getMarca())
                        .append(FIELD_SEPARATOR)
                        .append(v.getModelo())
                        .append(FIELD_SEPARATOR)
                        .append(v.getPrecio())
                        .append(FIELD_SEPARATOR)
                        .append(v.getId())
                        .append(OBJECT_SEPARATOR);
                    
        }
        return sb.toString();                    
    }
    
    public ArrayList<Vehiculo> descodificar (String s)
    {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        
        String[] objetos = s.split(OBJECT_SEPARATOR);
        for (String objeto : objetos) 
        {
            String[]vars = objeto.split(FIELD_SEPARATOR);
            if(vars[0].equals("1"))
            {
                System.out.println(objeto);
                lista.add(
                new Coche (vars[3], 
                        vars[4],
                        Float.valueOf(vars[5]), 
                        Integer.valueOf(vars[1]), 
                        Boolean.valueOf(vars[2])
                ) 
            );
            }else if(vars[0].equals("2"))
            {lista.add( //int carga, String tipo, String marca, String modelo, float precio
                new Camion (Integer.valueOf(vars[1]), 
                        vars[2],
                        vars[3],
                        vars[4],
                        Float.valueOf(vars[5])
                ) 
            );
            }
        }
        return lista;
    }
    
}
