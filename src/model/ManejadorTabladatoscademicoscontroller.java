/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Conexion.Conexion;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author abel
 */
public class ManejadorTabladatoscademicoscontroller {

 
    Conexion con1 = new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    private JTable tabladedatosacademicos;
    private JTextField txtid;
    private JTextField txtdocumento;
    private JTextField txtnombre;
    private JTextField txtingreso;
    private JTextField txtobservacion;
    private JTextField txtprocedencia;
    private JTextField txtcondicion;
    private JTextField txtgrado;

    public ManejadorTabladatoscademicoscontroller(JTable tabla, JTextField txtid, JTextField txtdocumento, JTextField txtnombre, JTextField txtingreso, JTextField txtobservacion, JTextField txtprocedencia, JTextField txtcondicion, JTextField txtgrado) {
        this.tabladedatosacademicos = tabla;
        this.txtid = txtid;
        this.txtdocumento = txtdocumento;
        this.txtnombre = txtnombre;
        this.txtingreso = txtingreso;
        this.txtobservacion = txtobservacion;
        this.txtprocedencia = txtprocedencia;
        this.txtcondicion = txtcondicion;
        this.txtgrado = txtgrado;
    }

    public void manejarTablaClick(MouseEvent evt) {
        int fila = tabladedatosacademicos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó fila");
        } else {
            int idc = (int) tabladedatosacademicos.getValueAt(fila, 0);
            String docum = (String) tabladedatosacademicos.getValueAt(fila, 1);
            String nom = (String) tabladedatosacademicos.getValueAt(fila, 2);
            String ingreso = (String) tabladedatosacademicos.getValueAt(fila, 3);
            String obser = (String) tabladedatosacademicos.getValueAt(fila, 4);
            String proce = (String) tabladedatosacademicos.getValueAt(fila, 5);
            String condic = (String) tabladedatosacademicos.getValueAt(fila, 6);
            String gra = (String) tabladedatosacademicos.getValueAt(fila, 7);

            txtid.setText(String.valueOf(idc));
            txtdocumento.setText(docum);
            txtnombre.setText(nom);
            txtingreso.setText(ingreso);
            txtobservacion.setText(obser);
            txtprocedencia.setText(proce);
            txtcondicion.setText(condic);
            txtgrado.setText(gra);
        }
    }

    



    
}
