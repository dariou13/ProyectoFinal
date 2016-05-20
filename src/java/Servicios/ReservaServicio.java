/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.IbaseDatos;
import VO.Reserva;
import java.util.List;

/**
 *
 * @author Andres Felipe Bernal
 */
public class ReservaServicio {
      private IbaseDatos dao = null;
    
    public ReservaServicio(IbaseDatos dao ){
      this.dao = dao;
    }
    
    public List<Reserva> listar() {
      return this.dao.Listar();
    }
    
    public boolean insert(Reserva t){
      return this.dao.Crear(t);
    }
    
    public boolean delete(Reserva t) {
       return this.dao.Borrar(t);
    }
}
