/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import Model.Empleado;

/**
 *
 * @author ignac
 */
public class Concesionario {

    public String nombre;
    public static ArrayList<Empleado> empleados = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public static void setEmpleados(ArrayList<Empleado> empleados) {
        Concesionario.empleados = empleados;
    }

    public static void trabajarTodos() {
        System.out.println("\n¡A trabajar!");
        for (Empleado e : empleados) {
            String icono = "";
            if (e instanceof Vendedor) {
                icono = "🚗";
            } else if (e instanceof Mecanico) {
                icono = "🔧";
            } else if (e instanceof Gerente) {
                icono = "👔";
            }
            System.out.println(icono + " " + e.getNombre() + " → " + e.trabajar());
        }
    }

    public static void mostrarSueldos() {
        double totalVendedores = 0;
        double totalMecanicos = 0;
        double totalGerentes = 0;

        for (Empleado e : empleados) {
            if (e instanceof Vendedor) {
                totalVendedores += e.calcularSueldo();
            } else if (e instanceof Mecanico) {
                totalMecanicos += e.calcularSueldo();
            } else if (e instanceof Gerente) {
                totalGerentes += e.calcularSueldo();
            }
        }

        double total = totalVendedores + totalMecanicos + totalGerentes;

        System.out.println("\n💰 Resumen de sueldos:");
        System.out.println("Vendedores: " + totalVendedores + " €");
        System.out.println("Mecánicos: " + totalMecanicos + " €");
        System.out.println("Gerentes: " + totalGerentes + " €");
        System.out.println("Total de sueldos: " + total + " €");
    }

}
