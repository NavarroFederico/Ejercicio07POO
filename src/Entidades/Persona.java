/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ASUS
 */
public class Persona {

    private String nombre;
    private int edad;
    private char sexo; //'H' , 'M', 'O'
    private double peso;
    private double altura;
    private int evaluacionDePeso;
    private boolean esMayor;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        evaluacionDePeso = 0;
        esMayor = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEvaluacionDePeso() {
        return evaluacionDePeso;
    }

    public void setEvaluacionDePeso(int evaluacionDePeso) {
        this.evaluacionDePeso = evaluacionDePeso;
    }

    public boolean isEsMayor() {
        return esMayor;
    }

    public void setEsMayor(boolean esMayor) {
        this.esMayor = esMayor;
    }

    @Override
    public String toString() {
        String resultado = "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
        switch (evaluacionDePeso) {
            case -1:
                resultado += "Esta por Debajo del peso ideal";
                break;
            case 0:
                resultado += "Esta en el peso ideal";
                break;
            case 1:
                resultado += "Esta por Encima del peso ideal";
                break;
            default:
        }
        if (esMayor) {
            resultado += "\nLa Persona es Mayor de Edad";
        } else {
            resultado += "\nLa Persona NO es Mayor de Edad";
        }
        return resultado;
    }

}
