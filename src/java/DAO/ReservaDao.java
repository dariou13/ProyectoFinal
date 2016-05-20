/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ReservaDao implements IbaseDatos<Reserva> {


    @Override
    public List<Reserva> Listar() {
    List<Reserva> reservas= null;
	    String query = "SELECT * FROM reserva";
	    Connection connection = conexion.getConnection();
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	  
	    while (rs.next()){
	    	if(reservas == null){
	    		reservas= new ArrayList<Reserva>();
	    	}
                  int id =0;
            String tipo;
	    String fechaInicio = null;
	    String fechaFin = null;
            int id_usuario=0;
	      
	        Reserva registro= new Reserva();
	        id = rs.getInt("id_Reserva");
	        registro.setId_reserva(id);
                
                tipo = rs.getString("tipo");
	        registro.setTipo(tipo) ;
	        
                 fechaFin = rs.getDate("fechaEntrada").toString()+" "+rs.getTime("fechaEntrada");
	        registro.setFechaEntrada(fechaFin) ;
                
	        fechaInicio = rs.getDate("fechaSalida").toString()+" "+rs.getTime("fechaSalida");
	        registro.setFechaSalida(fechaInicio) ;
                                         
                id_usuario = rs.getInt("Usuario_cedula");
	        registro.setUsuario_cedula(id_usuario) ;
	        
	       reservas.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Departamentos");
			e.printStackTrace();
		}
	    
	    return reservas;
	 
    }

    @Override
    public boolean Crear(Reserva t) {

		boolean result=false;
		Connection connection = conexion.getConnection();
	    String query = " insert into reserva ( tipo,fechaSalida, fechaEntrada, Usuario_cedula)"  + " values (?,?,?,?)";
        PreparedStatement preparedStmt=null;
	    try {
			preparedStmt = connection.prepareStatement(query);
                        preparedStmt.setString (1, t.getTipo());
			preparedStmt.setString (2, t.getFechaEntrada()+" "+t.getHoraSalida());
			preparedStmt.setString (3, t.getFechaSalida()+" "+t.getHoraEntrada());
			preparedStmt.setInt(4, t.getUsuario_cedula());
			result= preparedStmt.execute();
	    } catch (SQLException e) {
			e.printStackTrace();
		}
		return result;        
}

    @Override
    public boolean Actualizar(Reserva t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Borrar(Reserva t) {
    boolean result=false;
	   Connection connection = conexion.getConnection();
	   String query = "delete from reserva where id_Reserva = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setInt(1, t.getId_reserva());
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return result;    
    }

    @Override
    public Reserva Buscar(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
