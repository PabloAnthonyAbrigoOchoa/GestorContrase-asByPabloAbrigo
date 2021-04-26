package com.pagestorcontraseña.controlador;

import com.pagestorcontraseña.conexionBaseDatosMySQL.ConexionBaseDatosMYSQL;
import com.pagestorcontraseña.modelo.CrearContraseña;
import com.pagestorcontraseña.modelo.GuardarContraseña;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GuardarPersonadb {

    //Metodo que se utiliza para poder Guardar una Contraseña
    public boolean guardarContraseña(GuardarContraseña guardarContraseña) {

        boolean guardar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "INSERT INTO `gestorcontraseñas`.`guardarcontraseña` (`letraDeTuNombre`, `letraDeTuApellido`, `UnNumeroDeTuCedula`, `DiaEnQueNaciste`, `MesEnQueNaciste`) VALUES ('" + guardarContraseña.getLetraDeTuNombre() + "', '" + guardarContraseña.getLetraDeTuApellido() + "', '" + guardarContraseña.getUnNumeroDeTuCedula() + "', '" + guardarContraseña.getDiaEnQueNaciste() + "', '" + guardarContraseña.getMesEnQueNaciste() + "');";
        try {
            ConexionBaseDatosMYSQL conexion = new ConexionBaseDatosMYSQL();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            guardar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return guardar;

    }

    //Metodo que se utiliza para poder Editar una Contraseña
    public boolean editarContraseña(GuardarContraseña guardarContraseña) {

        boolean editar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "UPDATE `gestorcontraseñas`.`guardarcontraseña` SET `letraDeTuNombre` = '" + guardarContraseña.getLetraDeTuNombre() + "', `letraDeTuApellido` = '" + guardarContraseña.getLetraDeTuApellido() + "', `UnNumeroDeTuCedula` = '" + guardarContraseña.getUnNumeroDeTuCedula() + "', `DiaEnQueNaciste` = '" + guardarContraseña.getDiaEnQueNaciste() + "', `MesEnQueNaciste` = '" + guardarContraseña.getMesEnQueNaciste() + "' WHERE (`idguardarContraseña` = '" + guardarContraseña.getIdguardarContraseña() + "');";
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

    //Metodo que se utiliza para poder Eliminar una Contraseña
    public boolean eliminarContraseña2(GuardarContraseña guardarContraseña) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM `gestorcontraseñas`.`guardarcontraseña` WHERE (`idguardarContraseña` = '" + guardarContraseña.getIdguardarContraseña() + "');";
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

    // Metodo que se utiliza para obtener todas las contraseñas de nuestra Base de Datos
    public List<GuardarContraseña> obtenerContraseñas2() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;//Sentencia del JDBC para obtener valores de la BD
        String sql = "SELECT * FROM gestorcontraseñas.guardarcontraseña";
        List<GuardarContraseña> listaContraseñas2 = new ArrayList<GuardarContraseña>();
        try {
            con = new ConexionBaseDatosMYSQL().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                GuardarContraseña c = new GuardarContraseña();
                c.setIdguardarContraseña(rs.getInt(1));
                c.setLetraDeTuNombre(rs.getString(2));
                c.setLetraDeTuApellido(rs.getString(3));
                c.setUnNumeroDeTuCedula(rs.getString(4));
                c.setDiaEnQueNaciste(rs.getString(5));
                c.setMesEnQueNaciste(rs.getString(6));
                listaContraseñas2.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaContraseñas2;

    }

    public GuardarContraseña getLetraNombre(String letraDeTuNombre) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;//Sentencia del JDBC para obtener valores de la BD
        GuardarContraseña g = null;
        String sql = "SELECT * FROM gestorcontraseñas.guardarcontraseña where letraDeTuNombre like '" + letraDeTuNombre + "';";
        try {
            con = new ConexionBaseDatosMYSQL().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                g = new GuardarContraseña();
                g.setIdguardarContraseña(rs.getInt(1));
                g.setLetraDeTuNombre(rs.getString(2));
                g.setLetraDeTuApellido(rs.getString(3));
                g.setUnNumeroDeTuCedula(rs.getString(4));
                g.setDiaEnQueNaciste(rs.getString(5));
                g.setMesEnQueNaciste(rs.getString(6));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return g;

    }

}
