/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorServlets;

import DAO.TrabajadorDao;
import Servicios.TrabajadorServicio;
import VO.Trabajador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Asus
 */
@WebServlet(name = "LoginControlador", urlPatterns = {"/LoginControlador"})
public class LoginControlador extends HttpServlet {

    
    
        TrabajadorDao dao = new TrabajadorDao();
        Trabajador trabajadores = new Trabajador();
        TrabajadorServicio servi = new TrabajadorServicio(dao);
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("action");
        if (accion.equals("login")) {
            this.login(request, response);
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Trabajador a = new Trabajador();
        
        
        String nombre = request.getParameter("txtNombreT");
        String pass = request.getParameter("txtPassT");
        
        a.setNombre_Trabajador(nombre);
        a.setPass_Trabajador(pass);
        //servi.compara(a);
        
        System.out.println(nombre+"-"+pass);
        
        try{
            
            servi.compara(a);
            int resultado = this.servi.compara(a);
            
            
            if (resultado == -1) {
                response.sendRedirect("login.jsp");
            }else if (resultado == 1) {
                response.sendRedirect("crearEquipo.jsp");
            }else if (resultado == 0) {
                response.sendRedirect("eliminarEquipo.jsp");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
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
