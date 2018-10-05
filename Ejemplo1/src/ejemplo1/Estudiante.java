/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author carlos
 */
public class Estudiante {
    //Creacion de atributos
    private String nombre;
    private int cedula;
    private int edad;
    private String cadena = String.format("\n%20s\n\n%-20s%-15s%s\n\n","REPORTE",
                "Nombre","Cedula","Edad");
    
    //Metodo que permite guardar los datos.
    public void obtenerdatos(String n, int c, int e){
        nombre = n;
        cedula = c;
        edad = e;
        
        cadena = String.format("%s%-20s%-15d%d\n",cadena,nombre,cedula,edad);
    }
    
    //Metodo que permite presentar los datos
    public void presentardatos(){
        
        System.out.println(cadena);
    }
}
