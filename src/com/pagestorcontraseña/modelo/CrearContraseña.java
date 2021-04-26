package com.pagestorcontraseña.modelo;

public class CrearContraseña {

    private int idCrearContraseña;
    private String usuario;
    private String contraseña;

    public CrearContraseña() {
    }

    public CrearContraseña(int idCrearContraseña, String usuario, String contraseña) {
        this.idCrearContraseña = idCrearContraseña;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public int getIdCrearContraseña() {
        return idCrearContraseña;
    }

    public void setIdCrearContraseña(int idCrearContraseña) {
        this.idCrearContraseña = idCrearContraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "CrearContrase\u00f1a{" + "idCrearContrase\u00f1a=" + idCrearContraseña + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

}
