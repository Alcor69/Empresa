/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

import java.util.Scanner;

/**
 *
 * @author rb940
 */
public class Empresa {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
       // Crear la empresa
        System.out.println("** CREAR EMPRESA **");
        System.out.print("Ingrese el Nombre de la Empresa: ");
        String NombreEmpresa = scanner.nextLine();
        System.out.print("Ingrese el RUC de la Empresa: ");
        String Ruc = scanner.nextLine();
        System.out.print("Ingrese la Dirección de la Empresa: ");
        String Direccion = scanner.nextLine();
        System.out.print("Ingrese el Email de la Empresa: ");
        String Email = scanner.nextLine();

        // Crear objeto Empresa
        Empresas empresas = new Empresas(NombreEmpresa, Ruc, Direccion, Email);
        
        System.out.println("Empresa creada exitosamente.\n");

        // Agregar empleados
        boolean continuar = true;
        while (continuar) {
            System.out.println("** CREAR EMPLEADO **");
            System.out.print("Ingrese el Nombre del empleado: ");
            String Nombre = scanner.nextLine();
            System.out.print("Ingrese la Cédula del empleado: ");
            String Cedula = scanner.nextLine();
            System.out.print("Ingrese el Salario del empleado: ");
            double Salario = scanner.nextDouble();
            scanner.nextLine();  // Limpiar buffer

            // Crear objeto Empleado
            Empleados empleados = new Empleados(Nombre, Cedula, Salario);
            empresas.agregarEmpleado(empleados);
            System.out.println("Empleado agregado exitosamente.\n");

            // Preguntar si se desea agregar otro empleado
            System.out.print("¿Desea agregar otro empleado? (Si/No): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                continuar = false;
            }
        }

        // Mostrar la empresa y empleados
        empresas.mostrar();

        // Eliminar un empleado
        System.out.println("** ELIMINAR EMPLEADO **");
        System.out.print("Ingrese la Cédula del empleado a eliminar: ");
        String cedulaEliminar = scanner.nextLine();
        if (empresas.eliminarEmpleado(cedulaEliminar)) {
            System.out.println("Empleado eliminado exitosamente.\n");
        } else {
            System.out.println("Empleado no encontrado.\n");
        }

        // Buscar un empleado
        System.out.println("** BUSCAR EMPLEADO **");
        System.out.print("Ingrese la Cédula del empleado a buscar: ");
        String cedulaBuscar = scanner.nextLine();
        Empleados empleadoBuscar = empresas.buscarEmpleado(cedulaBuscar);
        if (empleadoBuscar != null) {
            System.out.println("Empleado encontrado:");
            empleadoBuscar.mostrar();
        } else {
            System.out.println("Empleado no encontrado.\n");
        }

        // Mostrar la empresa y empleados después de eliminar
        empresas.mostrar();

        // Cerrar el scanner
        
    }
}
            
            
    
    
     
    

