/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);//Importamos el metodo Scanner
        Estudiante datos = new Estudiante();//Creamos el objeto 'datos' de tipo Estudiante
        
        //Variables globales.
        String nombre;
        int cedula;
        int edad;
        
        for(int x = 1; x<=2; x++){
            System.out.printf("\nEstuiante %d\n", x);
            System.out.printf("\tNombre: ");
            
            nombre = entrada.nextLine();
            System.out.printf("\tCedula: ");
            
            cedula = entrada.nextInt();
            System.out.printf("\tEdad: ");
            edad = entrada.nextInt();
            
            entrada.nextLine();//Limpiador de Scanner
            
            datos.obtenerdatos(nombre, cedula, edad);//Llamamos al metodo obtenerdatos.
            
        }
        
        datos.presentardatos();//Llamamos al metodo presentardatos.
        
        
    }
    
}
