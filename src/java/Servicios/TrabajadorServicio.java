/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.TrabajadorDao;
import VO.Trabajador;

/**
 *
 * @author Asus
 */
public class TrabajadorServicio {
     private TrabajadorDao dao = new TrabajadorDao();

    public int compara(Trabajador c) {
        System.out.println("servicio"+c);
        System.out.println(this.dao.ingresar(c));
       return this.dao.ingresar(c);
    }
     public TrabajadorServicio(TrabajadorDao dao ){
      this.dao = dao;
    }
    
}
