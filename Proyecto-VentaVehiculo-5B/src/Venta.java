/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juani
 */
public class Venta {

    private int cantidad;
    private Cliente cliente;
    private Vehiculo vehiculo;

    // Constructor
    public Venta(int cantidad, Cliente cliente, Vehiculo vehiculo) {
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    // Getters
    public int getCantidad() {
        return cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    // Setters
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // Metodo para calcular
    public double calcularTotal() {
        return cantidad * vehiculo.getPrecio();
    }

    // toString completo
    @Override
    public String toString() {
        return "Venta{"
                + "Cantidad=" + cantidad
                + ", " + cliente
                + ", " + vehiculo
                + ", Total=" + calcularTotal()
                + '}';
    }
}
