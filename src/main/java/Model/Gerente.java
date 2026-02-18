/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ignac
 */
public class Gerente extends Empleado {

    private double bonus = 500;

    public Gerente(String nombre) {
        super(nombre);
        this.sueldoBase = 2000;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String trabajar() {
        return "El gerente está supervisando el concesionario y coordinando al equipo.";
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bonus;
    }

}
