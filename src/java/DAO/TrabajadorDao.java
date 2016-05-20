package DAO;


import Servicios.TrabajadorServicio;
import VO.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class TrabajadorDao {
    //TrabajadorServicio servi =null;
    //Connection connection = null;
    
    
    
    public int ingresar(Trabajador c){
        int resultado = -1;
        Trabajador t = c;
        String a = c.getNombre_Trabajador();
        String b= c.getPass_Trabajador();
        
        Connection connection = DAO.conexion.getConnection();
         PreparedStatement pst=null;
            ResultSet rs=null;
            String sql="SELECT * FROM trabajador WHERE nombre_Trabajador=? and password=?";
            System.out.println("Nombre:"+a);
            System.out.println("Pass:"+b);
            
        try{
            pst = connection.prepareStatement(sql);
            pst.setString(1, c.getNombre_Trabajador());
            pst.setString(2, c.getPass_Trabajador());
            rs= pst.executeQuery();
            if (rs.next()){
                c.setNombre_Trabajador(rs.getString("nombre_Trabajador"));
                resultado = rs.getInt("aa");
                System.out.println(c.getNombre_Trabajador());
                
            }else {
                System.out.println("No se encuentra el trbajador!!!");}
            
        }catch (SQLException e) {
            System.out.println("No se ejecuto el SQL!!!");
			e.printStackTrace();
		}
        return resultado;
           }
}
