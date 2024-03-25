/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciatributarianegocio.control;

/**
 *
 * @author JESUS
 */
public interface Icontrol {
    
    public void inicioSesion(String usuario,String contraseña,Icontrol control);
    
    public void agregaPersonas();
    
    public void registrarLicencia();
}
