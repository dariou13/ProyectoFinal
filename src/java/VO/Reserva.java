/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.util.Date;



/**
 *
 * @author Andres Felipe Bernal
 */
public class Reserva {
    private int id_reserva;
    private String fechaSalida;
    private String horaSalida;
    private String fechaEntrada;
    private String horaEntrada;
    private String tipo;
    private int Usuario_cedula;
    

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    
    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    
    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getUsuario_cedula() {
        return Usuario_cedula;
    }

    public void setUsuario_cedula(int Usuario_cedula) {
        this.Usuario_cedula = Usuario_cedula;
    }


    @Override
    public String toString() {
        return "Reserva{" + "id_reserva=" + id_reserva + ", tipo=" + tipo +", fechaSalida=" + fechaSalida + ", fechaEntrada=" + fechaEntrada +  ", Usuario_cedula=" + Usuario_cedula + '}';
    }

    
}