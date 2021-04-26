package com.pagestorcontraseña.modelTables;

import com.pagestorcontraseña.modelo.GuardarContraseña;
import com.pagestorcontraseña.vistas.PaginaPrincipal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableGuardarContraseña extends AbstractTableModel {

    //Arreglo con el nombre de las columnas
    private String[] m_colNames = {"LETRA DE TU NOMBRE", "LETRA DE TU APELLIDO", "UN NUMERO DE TÚ CÉDULA", "DÍA EN QUE NACISTE", "MES EN QUE NACISTE"};
    public List<GuardarContraseña> guardarContraseñas;
    private PaginaPrincipal Pprincipal;

    public ModelTableGuardarContraseña(List<GuardarContraseña> crearContraseñas,PaginaPrincipal Pprincipal) {
        this.guardarContraseñas = crearContraseñas;
        this.Pprincipal = Pprincipal;
    }

    //Numero de filas de mi tabla
    @Override
    public int getRowCount() {
        return guardarContraseñas.size();
    }

    //Numero de columnas de mi tabla
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GuardarContraseña guardarContraseña = guardarContraseñas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return guardarContraseña.getLetraDeTuNombre();
            case 1:
                return guardarContraseña.getLetraDeTuApellido();
            case 2:
                return guardarContraseña.getUnNumeroDeTuCedula();
            case 3:
                return guardarContraseña.getDiaEnQueNaciste();
            case 4:
                return guardarContraseña.getMesEnQueNaciste();
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
         Pprincipal.clickGuardarCrontraseña(guardarContraseñas.get(rowIndex));
         return super.isCellEditable(rowIndex, columnIndex);
    }
}
