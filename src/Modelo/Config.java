
package Modelo;

public class Config {
    private String ruc;
    private String alter_ruc;
    private String nombre;
    private String telefono;
    private String direccion;
    private String mensaje;
    
    public Config(){
        
    }

    public Config(int id, String ruc, String nombre, String telefono, String direccion, String mensaje, String alter_ruc) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mensaje = mensaje;
        this.alter_ruc= alter_ruc;
    }

    public String getAlter_ruc() {
        return alter_ruc;
    }

    public void setAlter_ruc(String alter_ruc) {
        this.alter_ruc = alter_ruc;
    }


    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
