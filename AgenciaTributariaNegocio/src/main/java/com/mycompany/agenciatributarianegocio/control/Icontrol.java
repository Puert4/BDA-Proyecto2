package com.mycompany.agenciatributarianegocio.control;

/**
 *
 * @author JESUS
 */
public interface Icontrol {

    public void inicioSesion(String usuario, String contraseña, Icontrol control);

    public void agregaPersonas();

    public void registrarLicencia();
}
