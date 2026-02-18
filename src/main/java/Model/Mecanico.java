/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ignac
 */
public class Mecanico extends Empleado {

    private int horasExtra = 0;
    private double pagoHoraExtra = 15;

    public Mecanico(String nombre) {
        super(nombre);
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    @Override
    public String trabajar() {
        return "El mecánico está revisando y reparando los coches.";
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (horasExtra * pagoHoraExtra);
    }

}
