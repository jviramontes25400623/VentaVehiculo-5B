/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juani
 */
public class Cliente {
   
         
    //rs=razon social
    
    private String rs = "";
    private String rfc = "";
    private String email = "";
    
    public Cliente(String rs, String rfc, String email){
    this.rs = rs;
    this.rfc = rfc;
    this.email = email;
    
    
    }
    @Override
    public String toString(){
    return this.rs + this.rfc + this.email;
    }
    

    //atributos, constructor, toString
    
}
