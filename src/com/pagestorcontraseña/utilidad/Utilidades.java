package com.pagestorcontraseña.utilidad;

public class Utilidades {

    public boolean validarNumeros(String dato) {
        return dato.matches("[0-9]");

    }

    public boolean validarLetras(String letra) {
        return letra.matches("[a-zA-Z]");
    }
//    public boolean validarNumeros2(String dato2){
//        return dato2.matches("[0-10]");
//    }
}
