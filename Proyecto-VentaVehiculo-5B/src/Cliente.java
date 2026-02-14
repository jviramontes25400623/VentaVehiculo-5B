/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juani
 */
public class Cliente {

    private String rs;
    private String rfc;
    private String email;

    // Constructor
    public Cliente(String rs, String rfc, String email) {
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;
    }

    // Getters
    public String getRs() {
        return rs;
    }

    public String getRfc() {
        return rfc;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setRs(String rs) {
        this.rs = rs;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString legible
    @Override
    public String toString() {
        return "Cliente{"
                + "Razon Social='" + rs + '\''
                + ", RFC='" + rfc + '\''
                + ", Email='" + email + '\''
                + '}';
    }
}
