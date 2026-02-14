/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juani
 */
public class Vehiculo {

    private String marca;
    private double precio;
    private String motor;

    // Constructor
    public Vehiculo(String marca, double precio, String motor) {
        this.marca = marca;
        this.precio = precio;
        this.motor = motor;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMotor() {
        return motor;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    // toString legible
    @Override
    public String toString() {
        return "Vehiculo{"
                + "Marca='" + marca + '\''
                + ", Precio=" + precio
                + ", Motor='" + motor + '\''
                + '}';
    }
}
