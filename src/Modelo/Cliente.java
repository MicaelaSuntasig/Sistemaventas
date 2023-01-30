/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JHONY
 */

/*
    METODOS SETTER Y GETTER PARA ASIGNAR U OBTENER UNA CADENA
*/


public class Cliente {
    private String cedula;
    private String alter_cedula;
    private String nombre;
    private String telefono;
    private String direccion;
    private String empresa_ruc1;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String telefono, String direccion, String empresa_ruc1, String alter_cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empresa_ruc1 = empresa_ruc1;
        this.alter_cedula = alter_cedula;
    }

    public String getAlter_cedula() {
        return alter_cedula;
    }

    public void setAlter_cedula(String alter_cedula) {
        this.alter_cedula = alter_cedula;
    }

    public String getEmpresa_ruc1() {
        return empresa_ruc1;
    }

    public void setEmpresa_ruc1(String empresa_ruc1) {
        this.empresa_ruc1 = empresa_ruc1;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
