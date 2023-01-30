
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public login log(String cedula, String pass){
        login l = new login();
        String sql = "SELECT * FROM personal WHERE cedula = ? AND pass = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cedula);
            ps.setString(2, pass);
            rs= ps.executeQuery();
            if (rs.next()) {
                l.setCedula(rs.getString("cedula"));
                l.setNombre(rs.getString("nombre"));
                l.setCorreo(rs.getString("correo"));
                l.setPass(rs.getString("pass"));
                l.setRol(rs.getString("rol"));
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
    }
    
    
    public boolean Registrar(login reg){
        String sql = "INSERT INTO personal (cedula, nombre, correo, pass, rol, empresa_ruc) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getCedula());
            ps.setString(2, reg.getNombre());
            ps.setString(3, reg.getCorreo());
            ps.setString(4, reg.getPass());
            ps.setString(5, reg.getRol());
            ps.setString(6, reg.getEmpresa_ruc());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean EliminarUsuario(String cedula){
        String sql = "DELETE FROM personal WHERE cedula = ? ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cedula);
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
    
    public List ListarUsuarios(){
       List<login> Lista = new ArrayList();
       String sql = "SELECT * FROM personal";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               login lg = new login();
               lg.setCedula(rs.getString("cedula"));
               lg.setNombre(rs.getString("nombre"));
               lg.setCorreo(rs.getString("correo"));
               lg.setRol(rs.getString("rol"));
               Lista.add(lg);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
    
    public login BuscarUsuario(String cedula){
       login cl = new login();
       String sql = "SELECT * FROM personal WHERE cedula = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setString(1, cedula);
           rs = ps.executeQuery();
           if (rs.next()) {
               cl.setAlter_cedula(rs.getString("cedula"));
               cl.setCedula(rs.getString("cedula"));
               cl.setNombre(rs.getString("nombre"));
               cl.setCorreo(rs.getString("correo"));
               cl.setPass(rs.getString("pass"));
               cl.setRol(rs.getString("rol")); 
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return cl;
   }
    
    public boolean ModificarUsuario(login pr){
        String sql = "UPDATE personal SET cedula=?, nombre=?, correo=?, pass=?, rol=? WHERE cedula=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, pr.getCedula());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getCorreo());
            ps.setString(4, pr.getPass());
            ps.setString(5, pr.getRol());
            ps.setString(6, pr.getAlter_cedula());
            
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
}
