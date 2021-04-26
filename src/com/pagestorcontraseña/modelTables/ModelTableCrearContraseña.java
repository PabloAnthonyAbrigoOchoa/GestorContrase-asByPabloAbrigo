package com.pagestorcontraseña.modelTables;

import com.pagestorcontraseña.modelo.CrearContraseña;
import com.pagestorcontraseña.vistas.PaginaPrincipal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableCrearContraseña extends AbstractTableModel {

    //Arreglo con el nombre de las columnas
    private String[] m_colNames = {"USUARIO", "CONTRASEÑA"};
    private List<CrearContraseña> crearContraseñas;
    private PaginaPrincipal Pprincipal;

    public ModelTableCrearContraseña(List<CrearContraseña> crearContraseñas, PaginaPrincipal Pprincipal) {
        this.crearContraseñas = crearContraseñas;
        this.Pprincipal = Pprincipal;
    }

    //Numero de filas de mi tabla
    @Override
    public int getRowCount() {
        return crearContraseñas.size();
    }

    //Numero de columnas de mi tabla
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CrearContraseña crearContraseña = crearContraseñas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return crearContraseña.getUsuario();
            case 1:
                return crearContraseña.getContraseña();
        }
        return new String();
    }

    //Metodo para definir los nombres de las columnas de mi Tabla
    @Override
    public String getColumnName(int column) {
        return m_colNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        Pprincipal.clickCrearCrontraseña(crearContraseñas.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

}
