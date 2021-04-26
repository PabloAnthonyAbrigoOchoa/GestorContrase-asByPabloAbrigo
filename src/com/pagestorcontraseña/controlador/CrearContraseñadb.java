package com.pagestorcontraseña.controlador;

import com.pagestorcontraseña.conexionBaseDatosMySQL.ConexionBaseDatosMYSQL;
import com.pagestorcontraseña.modelo.CrearContraseña;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CrearContraseñadb {

    //Creamos una contraseña en la Base de Datos
    public boolean crearContraseña(CrearContraseña crearContraseña) {
        boolean crear = false;
        Statement stm = null;
        Connection con = null;
        String sql = "INSERT INTO `gestorcontraseñas`.`crearcontraseña` (`Usuario`, `Contraseña`) VALUES ('" + crearContraseña.getUsuario() + "', '" + crearContraseña.getContraseña() + "');";
        try {
            ConexionBaseDatosMYSQL conexion = new ConexionBaseDatosMYSQL();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            crear = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return crear;

    }

    //Actualizamos una contraseña en la Base de Datos
    public boolean editarContraseña(CrearContraseña crearContraseña) {

        boolean editar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "UPDATE `gestorcontraseñas`.`crearcontraseña` SET `Usuario` = '" + crearContraseña.getUsuario() + "', `Contraseña` = '" + crearContraseña.getContraseña() + "' WHERE (`idcrearContraseña` = '" + crearContraseña.getIdCrearContraseña() + "');";
        try {
            ConexionBaseDatosMYSQL conexion = new ConexionBaseDatosMYSQL();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            editar = true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return editar;
    }

    //Eliminamos una contraseña con el respectivo ID en la Base de Datos
    public boolean eliminarContraseña(CrearContraseña crearContraseña) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM `gestorcontraseñas`.`crearcontraseña` WHERE (`idcrearContraseña` = '" + crearContraseña.getIdCrearContraseña() + "');";
        try {
            ConexionBaseDatosMYSQL conexion = new ConexionBaseDatosMYSQL();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            eliminar = true;
            stm.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return eliminar;
    }

    //Obtenemos todas las contraseñas de nuestra Base de Datos
    public List<CrearContraseña> obtenerContraseñas() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;//Sentencia del JDBC para obtener valores de la BD
        String sql = "SELECT * FROM gestorcontraseñas.crearcontraseña";
        List<CrearContraseña> listaContraseñas = new ArrayList<CrearContraseña>();
        try {
            con = new ConexionBaseDatosMYSQL().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                CrearContraseña c = new CrearContraseña();
                c.setIdCrearContraseña(rs.getInt(1));
                c.setUsuario(rs.getString(2));
                c.setContraseña(rs.getString(3));
                listaContraseñas.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaContraseñas;

    }

}
