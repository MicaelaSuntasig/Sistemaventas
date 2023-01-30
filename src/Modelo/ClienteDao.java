/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JHONY
 */

/*
    DATA ACCESS OBJECTS
    OBJETO DE ACCESO A LOS DATOS
    SCRIPT DE MYSQL PARA ACCEDER A LOS DATOS
*/

public class ClienteDao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarCliente(Cliente cl){
        String sql = "INSERT INTO clientes (dni, nombre, telefono, direccion) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getCedula());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getTelefono());
            ps.setString(4, cl.getDireccion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
   public List ListarCliente(){
       List<Cliente> ListaCl = new ArrayList();
       String sql = "SELECT * FROM clientes";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Cliente cl = new Cliente();
               
               cl.setCedula(rs.getString("dni"));
               cl.setNombre(rs.getString("nombre"));
               cl.setTelefono(rs.getString("telefono"));
               cl.setDireccion(rs.getString("direccion"));
               ListaCl.add(cl);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaCl;
   }
   
   public boolean EliminarCliente(String id){
       String sql = "DELETE FROM clientes WHERE dni = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }
   
   public boolean ModificarCliente(Cliente cl, String cod2){
       String sql = "UPDATE clientes SET dni=?, nombre=?, telefono=?, direccion=? WHERE dni=?;";
       try {
           ps = con.prepareStatement(sql);
           
           ps.setString(1, cl.getCedula());
           ps.setString(2, cl.getNombre());
           ps.setString(3, cl.getTelefono());
           ps.setString(4, cl.getDireccion());
           ps.setString(5, cod2);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
   
   public Cliente Buscarcliente(String dni){
       Cliente cl = new Cliente();
       String sql = "SELECT * FROM clientes WHERE dni = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setString(1, dni);
           rs = ps.executeQuery();
           if (rs.next()) {
               cl.setCedula(rs.getString("dni"));
               cl.setNombre(rs.getString("nombre"));
               cl.setTelefono(rs.getString("telefono"));
               cl.setDireccion(rs.getString("direccion"));
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return cl;
   }
   
    public String BuscarIDCLIENTE(String cod){
        
        Cliente c = new Cliente();
        
        String sql = "SELECT * FROM clientes where dni=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                
                c.setAlter_cedula(rs.getString("dni"));
                
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return c.getAlter_cedula();
    }
   
}
