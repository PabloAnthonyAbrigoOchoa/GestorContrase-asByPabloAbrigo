package com.pagestorcontraseña.modelo;

public class GuardarContraseña {

    private int idguardarContraseña;
    private String letraDeTuNombre;
    private String letraDeTuApellido;
    private String UnNumeroDeTuCedula;
    private String DiaEnQueNaciste;
    private String MesEnQueNaciste;

    public GuardarContraseña() {
    }

    public GuardarContraseña(int idguardarContraseña, String letraDeTuNombre, String letraDeTuApellido, String UnNumeroDeTuCedula, String DiaEnQueNaciste, String MesEnQueNaciste) {
        this.idguardarContraseña = idguardarContraseña;
        this.letraDeTuNombre = letraDeTuNombre;
        this.letraDeTuApellido = letraDeTuApellido;
        this.UnNumeroDeTuCedula = UnNumeroDeTuCedula;
        this.DiaEnQueNaciste = DiaEnQueNaciste;
        this.MesEnQueNaciste = MesEnQueNaciste;
    }

    public int getIdguardarContraseña() {
        return idguardarContraseña;
    }

    public void setIdguardarContraseña(int idguardarContraseña) {
        this.idguardarContraseña = idguardarContraseña;
    }

    public String getLetraDeTuNombre() {
        return letraDeTuNombre;
    }

    public void setLetraDeTuNombre(String letraDeTuNombre) {
        this.letraDeTuNombre = letraDeTuNombre;
    }

    public String getLetraDeTuApellido() {
        return letraDeTuApellido;
    }

    public void setLetraDeTuApellido(String letraDeTuApellido) {
        this.letraDeTuApellido = letraDeTuApellido;
    }

    public String getUnNumeroDeTuCedula() {
        return UnNumeroDeTuCedula;
    }

    public void setUnNumeroDeTuCedula(String UnNumeroDeTuCedula) {
        this.UnNumeroDeTuCedula = UnNumeroDeTuCedula;
    }

    public String getDiaEnQueNaciste() {
        return DiaEnQueNaciste;
    }

    public void setDiaEnQueNaciste(String DiaEnQueNaciste) {
        this.DiaEnQueNaciste = DiaEnQueNaciste;
    }

    public String getMesEnQueNaciste() {
        return MesEnQueNaciste;
    }

    public void setMesEnQueNaciste(String MesEnQueNaciste) {
        this.MesEnQueNaciste = MesEnQueNaciste;
    }

    @Override
    public String toString() {
        return "GuardarContrase\u00f1a{" + "idguardarContrase\u00f1a=" + idguardarContraseña + ", letraDeTuNombre=" + letraDeTuNombre + ", letraDeTuApellido=" + letraDeTuApellido + ", UnNumeroDeTuCedula=" + UnNumeroDeTuCedula + ", DiaEnQueNaciste=" + DiaEnQueNaciste + ", MesEnQueNaciste=" + MesEnQueNaciste + '}';
    }

}
