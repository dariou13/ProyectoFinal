/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorServlets;

import DAO.EquipoDao;
import DAO.IbaseDatos;
import Servicios.EquipoServicio;
import VO.Equipo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Asus
 */
@WebServlet(name = "EquipoControlador", urlPatterns = {"/EquipoControlador"})
public class EquipoControlador extends HttpServlet {
    
    EquipoDao obj = new EquipoDao();
    Equipo equipos = new Equipo();
    IbaseDatos ojo= new EquipoDao();
    EquipoServicio servi = new EquipoServicio(obj);
        
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static String idBB;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("action");
        if (accion.equals("creaEquipos")) {
            this.creaEquipos(request, response);
        }else 
        if (accion.equals("ModificarEquipos")) {
            this.actualizarEquipo(request, response);
        }else 
        if (accion.equals("eliminarEquipos")){
            this.eliminarEquipo(request, response);
        }
        if (accion.equals("buscarEquipos")){
            this.buscarEquipo(request, response);
        }
    }
    
    private void creaEquipos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        equipos.setNombre_Equipo(request.getParameter("txtNombre"));
        equipos.setModelo_Equipo(request.getParameter("txtModelo"));
        equipos.setReferencia_Equipo(request.getParameter("txtReferencia"));
        equipos.setCantidad_Equipo(Integer.parseInt(request.getParameter("txtCantidad")));
        equipos.setPrograma_Equipo(request.getParameter("txtPrograma"));
        
        try{
            //EquipoServicio obj = null;
            response.sendRedirect("crearEquipo.jsp"); 
            servi.insert(equipos);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void actualizarEquipo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                   
        equipos.setId_Equipo(Integer.parseInt(request.getParameter("txtIDN")));
        equipos.setNombre_Equipo(request.getParameter("txtNombreN"));
        equipos.setModelo_Equipo(request.getParameter("txtModeloN"));
        equipos.setReferencia_Equipo(request.getParameter("txtReferenciaN"));
        equipos.setCantidad_Equipo(Integer.parseInt(request.getParameter("txtCantidadN")));
        equipos.setPrograma_Equipo(request.getParameter("txtProgramaN"));
        
        
        
          try{
           response.sendRedirect("modificarEquipo.jsp"); 
           servi.update(equipos);
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
    private void eliminarEquipo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        equipos.setId_Equipo(Integer.parseInt(request.getParameter("txtIDD")));
        //equipos.setNombre_Equipo(request.getParameter("txtIDD"));
        try{
           response.sendRedirect("eliminarEquipo.jsp"); 
           servi.delete(equipos);
           }catch(Exception e){
            e.printStackTrace();
        }
    
    }
       
    public void buscarEquipo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        idBB=request.getParameter("txtIDB");
        System.out.println(idBB);
        a();
        
         try{
           servi.Buscar(idBB);
           }catch(Exception e){
            e.printStackTrace();
        }   
    }
        
    
    public static String a(){
        return idBB;
    }
    
    public static List<Equipo> listaEquipos(){
        IbaseDatos modelo= new EquipoDao();
        List<Equipo> equipos = modelo.Listar();        
        return equipos;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
            }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
