
package Modelo;


public class Productos {

    private String codigo;
    private String alter_codigo;
    private String nombre;
    private String proveedor;
    private String proveedorPro;
    private int stock;
    private double precio;
    
    public Productos(){
        
    }

    public Productos(String codigo, String nombre, String proveedor, String proveedorPro, int stock, double precio, String alter_codigo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.proveedorPro = proveedorPro;
        this.stock = stock;
        this.precio = precio;
        this.alter_codigo = alter_codigo;
    }

    public String getAlter_codigo() {
        return alter_codigo;
    }

    public void setAlter_codigo(String alter_codigo) {
        this.alter_codigo = alter_codigo;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getProveedorPro() {
        return proveedorPro;
    }

    public void setProveedorPro(String proveedorPro) {
        this.proveedorPro = proveedorPro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   
}
