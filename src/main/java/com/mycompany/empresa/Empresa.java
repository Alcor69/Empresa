/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rb940
 */
public class Empresa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empresas> listaEmpresas = new ArrayList<>(); // Lista para almacenar varias empresas

        boolean continuar = true;
        while (continuar) {
            // Crear una nueva empresa
            System.out.println("** CREAR NUEVA EMPRESA **");
            System.out.print("Ingrese el Nombre de la Empresa: ");
            String NombreEmpresa = scanner.nextLine();
            System.out.print("Ingrese el RUC de la Empresa: ");
            String Ruc = scanner.nextLine();
            System.out.print("Ingrese la Dirección de la Empresa: ");
            String Direccion = scanner.nextLine();
            System.out.print("Ingrese el Email de la Empresa: ");
            String Email = scanner.nextLine();

            // Crear objeto Empresa
            Empresas nuevaEmpresa = new Empresas(NombreEmpresa, Ruc, Direccion, Email);
            listaEmpresas.add(nuevaEmpresa);
            System.out.println("Empresa creada exitosamente.\n");

            // Agregar empleados a la empresa recién creada
            boolean agregarEmpleado = true;
            while (agregarEmpleado) {
                System.out.println("** CREAR EMPLEADO **");
                System.out.print("Ingrese el Nombre del empleado: ");
                String Nombre = scanner.nextLine();
                System.out.print("Ingrese la Cédula del empleado: ");
                String Cedula = scanner.nextLine();
                System.out.print("Ingrese el Salario del empleado: ");
                double Salario = scanner.nextDouble();
                scanner.nextLine();  // Limpiar buffer

                // Crear objeto Empleado y agregarlo a la empresa
                Empleados nuevoEmpleado = new Empleados(Nombre, Cedula, Salario);
                nuevaEmpresa.agregarEmpleado(nuevoEmpleado);
                System.out.println("Empleado agregado exitosamente.\n");

                // Preguntar si se desea agregar otro empleado
                System.out.print("¿Desea agregar otro empleado? (Si/No): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("No")) {
                    agregarEmpleado = false;
                }
            }

            // Preguntar si se desea crear otra empresa
            System.out.print("¿Desea crear otra empresa? (Si/No): ");
            String crearOtra = scanner.nextLine();
            if (crearOtra.equalsIgnoreCase("No")) {
                continuar = false;
            }
        }

        // Mostrar todas las empresas y sus empleados
        System.out.println("** LISTA DE EMPRESAS Y EMPLEADOS **");
        for (Empresas empresa : listaEmpresas) {
            empresa.mostrar();
            System.out.println("Empleados:");
            for (Empleados empleado : empresa.getEmpleados()) {
                empleado.mostrar();
            }
            System.out.println("------------------------------------------------");
        }
        
        
          System.out.println("** ELIMINAR EMPLEADO **");
        if (!listaEmpresas.isEmpty()) {
            // Mostrar todas las empresas para que el usuario elija
            System.out.println("Seleccione una empresa para eliminar un empleado:");
            for (int i = 0; i < listaEmpresas.size(); i++) {
                System.out.println((i + 1) + ". " + listaEmpresas.get(i).getNombreEmpresa());
            }
            System.out.print("Ingrese el número de la empresa: ");
            int empresaSeleccionada = scanner.nextInt();
            

            if (empresaSeleccionada > 0 && empresaSeleccionada <= listaEmpresas.size()) {
                Empresas empresa = listaEmpresas.get(empresaSeleccionada - 1); // Obtener la empresa seleccionada

                // Mostrar empleados de la empresa seleccionada
                System.out.println("Empleados de la empresa " + empresa.getNombreEmpresa() + ":");
                for (int i = 0; i < empresa.getEmpleados().size(); i++) {
                    System.out.println((i + 1) + ". " + empresa.getEmpleados().get(i).getNombre() + " (Cédula: " + empresa.getEmpleados().get(i).getCedula() + ")");
                }

                // Solicitar cédula del empleado a eliminar
                System.out.print("Ingrese la Cédula del empleado a eliminar: ");
                String cedulaEliminar = scanner.nextLine();

                // Eliminar empleado
                if (empresa.eliminarEmpleado(cedulaEliminar)) {
                    System.out.println("Empleado eliminado exitosamente.\n");
                } else {
                    System.out.println("Empleado no encontrado.\n");
                }
            } else {
                System.out.println("Selección no válida.\n");
            }
        } else {
            System.out.println("No hay empresas disponibles.\n");
        }

        // Opcional: Eliminar un empleado o buscar un empleado de alguna empresa (similar a lo que ya tienes)
    }
}
