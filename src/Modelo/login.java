
package Modelo;

public class login {
    private int id;
    private String nombre;
    private String correo;
    private String pass;
    private String rol;
    private String cedula;
    private String alter_cedula;
    private String empresa_ruc;

    public login() {
    }

    public login(int id, String nombre, String correo, String pass, String rol, String cedula,String empresa_ruc, String alter_cedula) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.pass = pass;
        this.rol = rol;
        this.cedula = cedula;
        this.empresa_ruc= empresa_ruc;
    }


    public String getAlter_cedula() {
        return alter_cedula;
    }

    public void setAlter_cedula(String alter_cedula) {
        this.alter_cedula = alter_cedula;
    }

    public String getEmpresa_ruc() {
        return empresa_ruc;
    }

    public void setEmpresa_ruc(String empresa_ruc) {
        this.empresa_ruc = empresa_ruc;
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


    
}
