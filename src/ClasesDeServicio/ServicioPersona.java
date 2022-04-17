/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeServicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ServicioPersona {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Crear Persona");
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad :");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo ('H' hombre, 'M' mujer, 'O' otro)");
        char sexo = leer.next().toUpperCase().charAt(0);
        System.out.println(sexo);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("La opcion ingresada no es correcta, Por favor reingrese una opción válida.");
            System.out.println("('H' hombre, 'M' mujer, 'O' otro)");
            sexo = leer.next().toUpperCase().charAt(0);

        }
        System.out.println("Ingrese el peso de la persona");
        double peso= leer.nextDouble();
        System.out.println("Ingrese la altura de la persona");
        double altura= leer.nextDouble();
        Persona nuevaP = new Persona(nombre, edad, sexo, peso, altura);
        return nuevaP;

    }

    public int calcularIMC(Persona actual) {
        final int porDebajo=-1, pesoIdeal=0, pesoPorArriba=1;
        double IMC = 0, peso=actual.getPeso(),altura=actual.getAltura();
        
        IMC= peso/(altura*altura);
        if (IMC<20){
            actual.setEvaluacionDePeso(porDebajo);
            return porDebajo;
        }else if(IMC<=25){
            actual.setEvaluacionDePeso(pesoIdeal);
            return pesoIdeal;
        }else{
            actual.setEvaluacionDePeso(pesoPorArriba);
            return pesoPorArriba;
        }
    }
    public boolean esMayorDeEdad(Persona actual){
        boolean esMayor=false;
        if(actual.getEdad()>=18){
            esMayor=true;
            actual.setEsMayor(esMayor);
        } 
        return esMayor;
    }
}
