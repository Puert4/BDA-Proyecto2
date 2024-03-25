/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciatributarianegocio.control;

import com.mycompany.agenciatributariapresentacion.LicenciaLlenadoDatos;
import com.mycompany.agenciatributariapresentacion.PaginaInicio;
import javax.swing.JOptionPane;

/**
 *
 * @author JESUS
 */
public class control implements Icontrol{
    
    
    @Override
    public void inicioSesion(String usuario,String contraseña,Icontrol control){
        
        if (usuario.equalsIgnoreCase("admin") && contraseña.equalsIgnoreCase("1234")) {
            PaginaInicio frmInicio=new PaginaInicio(control);
            frmInicio.setVisible(true);
            JOptionPane.showMessageDialog(frmInicio, "Inicio de sesion exitoso","!! EXITOSO ¡¡",JOptionPane.INFORMATION_MESSAGE);
        }else if (!usuario.equalsIgnoreCase("admin")) {
            JOptionPane.showMessageDialog(null, "El usuario es incorrecta","!! ALERTA ¡¡",JOptionPane.ERROR_MESSAGE);
        }else if (!contraseña.equalsIgnoreCase("1234") ) {
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta","!! ALERTA ¡¡",JOptionPane.ERROR_MESSAGE);
        }
         
    }

    @Override
    public void agregaPersonas() {
        try {
            //Codigo con la union de negocio
            
            JOptionPane.showMessageDialog(null,"Se ha agregado 20 personas","!! EXITO ¡¡",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido agregar a las personas","",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    @Override
    public void registrarLicencia() {
        LicenciaLlenadoDatos frmLicencias=new LicenciaLlenadoDatos();
        frmLicencias.setVisible(true);
        if (frmLicencias.cambioBoton()) {
            System.out.println("das"+frmLicencias.rfc());            
        }

    }
    
    
    
}
