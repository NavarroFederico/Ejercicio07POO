/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMain;
import  ClasesDeServicio.ServicioPersona;
import Entidades.Persona;
/**
 *
 * @author ASUS
 */
public class Main_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPersona servPer = new ServicioPersona();
        
        Persona p1= servPer.crearPersona();
        Persona p2= servPer.crearPersona();
        Persona p3= servPer.crearPersona();
        Persona p4= servPer.crearPersona();
        
        System.out.println("Comprobando métodos");
        
        servPer.calcularIMC(p1);
        servPer.esMayorDeEdad(p1);
        servPer.calcularIMC(p2);
        servPer.esMayorDeEdad(p2);
        servPer.calcularIMC(p3);
        servPer.esMayorDeEdad(p3);
        servPer.calcularIMC(p4);
        servPer.esMayorDeEdad(p4);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
    
}
