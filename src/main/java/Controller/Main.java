/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controller;

import Model.Concesionario;
import Model.Empleado;
import Model.Vendedor;
import Model.Mecanico;
import Model.Gerente;
import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Concesionario concesionario = new Concesionario();

        System.out.print("Introduce el nombre del concesionario: ");
        String nombreConcesionario = sc.nextLine();
        concesionario.setNombre(nombreConcesionario);

        System.out.println("\nCreación de empleados...");

        boolean seguir = true;
        int contador = 1;

        while (seguir) {
            System.out.println("Empleado " + contador + ": Tipo (1. Vendedor, 2. Mecánico, 3. Gerente)");
            System.out.print("Tipo: ");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            Empleado empleado = null;

            switch (tipo) {
                case 1:
                    empleado = new Vendedor(nombre);
                    System.out.println("Vendedor creado correctamente.");
                    break;
                case 2:
                    empleado = new Mecanico(nombre);
                    System.out.println("Mecánico creado correctamente.");
                    break;
                case 3:
                    empleado = new Gerente(nombre);
                    System.out.println("Gerente creado correctamente.");
                    break;
                default:
                    System.out.println("Tipo no válido, inténtalo de nuevo.");
                    continue;
            }

            Concesionario.getEmpleados().add(empleado);
            contador++;

            System.out.print("\n¿Añadir otro empleado? (s/n): ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                seguir = false;
            }
        }

        Concesionario.trabajarTodos();
        Concesionario.mostrarSueldos();

        sc.close();
    }
}
