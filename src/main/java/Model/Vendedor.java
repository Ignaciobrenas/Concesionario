/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ignac
 */
public class Vendedor extends Empleado {

    private double comisionPorVenta = 50;
    private int ventasRealizadas = 5;

    public Vendedor(String nombre) {
        super(nombre);
    }

    public double getComisionPorVenta() {
        return comisionPorVenta;
    }

    public void setComisionPorVenta(double comisionPorVenta) {
        this.comisionPorVenta = comisionPorVenta;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    public String trabajar() {
        return "El vendedor está atendiendo a clientes y mostrando los coches.";
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (ventasRealizadas * comisionPorVenta);
    }

}
