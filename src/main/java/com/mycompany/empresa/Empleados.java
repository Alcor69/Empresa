/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author rb940
 */
public class Empleados {
   
    private String Nombre, Cedula;
    private Double Salario;

    public Empleados(String Nombre, String Cedula, Double Salario) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }
    
    void mostrar(){
        System.out.println("El nombre ingresado es: " + Nombre);
        System.out.println("La cedula ingresada es: "+ Cedula);
        System.out.println("El salario ingresado es de: "+ Salario);
        
        
        
    }
}

