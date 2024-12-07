/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rb940
 */
public class Empresas {
    private String NombreEmpresa,Ruc, Direccion, Email;

    private List<Empleados> empleados;
    

//constructor
    public Empresas(String NombreEmpresa, String Ruc, String Direccion, String Email) {
        this.NombreEmpresa = NombreEmpresa;
        this.Ruc = Ruc;
        this.Direccion = Direccion;
        this.Email = Email;
 
        this.empleados = new ArrayList<>();
    }
    

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public List<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleados> empleados) {
        this.empleados = empleados;
    }
    
    
    

    
    // Método para agregar empleado
    public void agregarEmpleado(Empleados empleado) {
        empleados.add(empleado);
    }

    // Método para eliminar empleado por cédula
    public boolean eliminarEmpleado(String Cedula) {
        for (Empleados empleado : empleados) {
            if (empleado.getCedula().equals(Cedula)) {
                empleados.remove(empleado);
                return true;
            }
        }
        return false;
    }

    // Método para buscar un empleado por cédula
    public Empleados buscarEmpleado(String cedula) {
        for (Empleados empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                return empleado;
            }
        }
        return null;
    }



    
    void mostrar(){
    System.out.println("El nombre de la empresa es: "+NombreEmpresa);
    System.out.println("El ruc de la empresa es: "+Ruc);
    System.out.println("La direccion de la empresa es; "+Direccion);
    System.out.println("El Email de la empresa es: "+Email);}
}
