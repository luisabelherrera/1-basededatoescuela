
package prin;
import java.io.IOException;
//diseño y archivo pdf
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfNumber;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

import config2.Conexion;



//conexion sql
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// libreria para buscar
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.io.BufferedWriter;

import java.io.FileOutputStream;
import java.io.FileWriter;

import javax.swing.RowFilter;

//importaciones necesarias para ejecutar pdf  en 644
import javax.swing.JFileChooser;


import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;




/**
 *
 * @author luisabel
 */


public class datospersonales extends javax.swing.JFrame {

   Exportar obj;
    
 Conexion con2= new Conexion();
 Connection conet;
 DefaultTableModel modelo;
 Statement st;
 ResultSet rs;
 int idc;
 



private TableRowSorter trsfiltro;

String filtro;
  
    
private TableRowSorter trsgrados;
String grados ; 
   

    public datospersonales() {

        initComponents();
        setLocationRelativeTo(null);
        consultar();
   
       
        //centrar letras
  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tabla.setDefaultRenderer(Object.class, centerRenderer);
        
        // llamar la clase estadocellrender
        
            ColumnaAmarillaRenderer columnaAmarillaRenderer = new ColumnaAmarillaRenderer(0);
tabla.getColumnModel().getColumn(0).setCellRenderer(columnaAmarillaRenderer);
            


        
    }
 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JLabel();
        txtANombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtacudiente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtidentidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtgrado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtgrados = new javax.swing.JTextField();
        pdftabla = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnexportar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID automatico");

        txtid.setEditable(false);
        txtid.setEnabled(false);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        NOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        NOMBRE.setText("NOMBRE");

        txtANombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtANombreKeyTyped(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EDAD");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATOS PERSONALES");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACUDIENTE");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("F NACIMIENTO");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("TI O CC");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("N.U CELULAR 1");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GRADO ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(314, 314, 314))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(NOMBRE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtANombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtacudiente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel20)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtidentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOMBRE)
                    .addComponent(txtANombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtacudiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPERACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        btnAgregar.setText("agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnmodificar.setText("modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jButton1.setText("buscar nombre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        jButton2.setText("buscar grados ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtgrados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgradosKeyTyped(evt);
            }
        });

        pdftabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/PDF_24287.png"))); // NOI18N
        pdftabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdftablaActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/txt_text_file_format_extension_icon_124600.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnexportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Excel_2013_23480.png"))); // NOI18N
        btnexportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportarActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IMPORTAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtgrados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(82, 82, 82))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pdftabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnexportar)
                            .addComponent(jButton6))
                        .addGap(19, 19, 19))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar)
                    .addComponent(btnNuevo))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pdftabla)
                            .addComponent(jButton6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtgrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnexportar)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BASE DE DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "apellido", "edad", "acudiente", "grado", "correo", "documento", "f nacimiento", "celular"
            }
        ));
        tabla.setRowHeight(24);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(1);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(5);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(5);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     Agregar();
     consultar();
    
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       int fila = tabla.getSelectedRow();
       if (fila == -1)  {
           JOptionPane.showMessageDialog(null,"no se selecciono fila");
       }else{
           idc = Integer.parseInt((String) tabla.getValueAt (fila,0)  .toString());
           String nom = (String)  tabla.getValueAt (fila, 1);
             String ape = (String) tabla.getValueAt(fila, 2);
             int edad = Integer.parseInt((String) tabla.getValueAt(fila, 3) .toString());
            String acu = (String) tabla.getValueAt(fila, 4);
            String grado = (String) tabla.getValueAt(fila, 5);
            String correo = (String) tabla.getValueAt(fila, 6);
             String identidad = (String) tabla.getValueAt(fila, 7);
              String fecha = (String) tabla.getValueAt(fila, 8);
              String celular = (String) tabla.getValueAt(fila, 9);
              
                     
                     
             txtid.setText(""+idc);
            txtANombre.setText(nom);
            txtApe.setText(ape);
            txtEdad.setText(""+edad);
            txtacudiente.setText(acu);
            txtgrado.setText(grado);
            txtcorreo.setText(correo);
            txtidentidad.setText(identidad);
           txtfecha.setText(fecha);
             txtcelular.setText(celular);
       }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
      Modificar();
      consultar();
      Nuevo();
    }
      void Modificar(){
        String nom = txtANombre.getText();
        String ape = txtApe.getText();
        String edad = txtEdad.getText();
        String acu = txtacudiente.getText();
        String grado = txtgrado.getText();
        String correo = txtcorreo.getText();
        String identidad = txtidentidad.getText();
         String fecha = txtfecha.getText();
         String celular = txtcelular.getText();
        try {
            if (nom.equals("")|| ape.equals("")|| edad.equals("")|| acu.equals("")|| grado.equals("")|| correo.equals("")|| identidad.equals("")||fecha.equals("")|| celular.equals("")) {
                JOptionPane.showMessageDialog(null,"Faltan ingresar datos");
                limipiarTabla();
            }else{
                String sql = "Update cliente set id='"+idc+"',nombre='" +nom+"',apellido="
                        + "'" +ape+"',edad='"+edad+"'"
                        + ",acudiente='"+acu+"',grado='"+grado+"',correo='" +correo+"',identidad='"+identidad+"',fecha='"+fecha+"',celular='"+celular+"' where id=" +idc;
          conet = con2.getConnection2();
          st = conet.createStatement();
          st.executeUpdate(sql);
          JOptionPane.showMessageDialog(null,"Datos de cliente modificados");
          limipiarTabla();
            }
        }catch (Exception e){
    
        
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      Nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      txtbuscar.addKeyListener(new KeyAdapter () {
     
     public void keyReleased (final KeyEvent e) {
         String cadena = txtbuscar.getText ();
         txtbuscar.setText (cadena);
         repaint ();
        filtro();
      }
              });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtANombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtANombreKeyTyped


    }//GEN-LAST:event_txtANombreKeyTyped

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
       trsfiltro = new TableRowSorter (tabla.getModel());
tabla.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      txtgrados.addKeyListener(new KeyAdapter () {
     
     public void keyReleased (final KeyEvent e) {
         String cadena = txtgrados.getText ();
         txtgrados.setText (cadena);
         repaint ();
        grados();
      }
              });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtgradosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgradosKeyTyped
       trsgrados= new TableRowSorter (tabla.getModel());
tabla.setRowSorter(trsgrados);
        
        
    }//GEN-LAST:event_txtgradosKeyTyped




         
    
    private void pdftablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdftablaActionPerformed
  String path = "";
JFileChooser j = new JFileChooser();
j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
int x = j.showSaveDialog(this);
if (x == JFileChooser.APPROVE_OPTION) {
    path = j.getSelectedFile().getPath();
}
 Document doc = new Document(new Rectangle(1200, 2000));
try {
    PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(path + "abelito.pdf"));

    // Implementar la clase PdfPageEventHelper
    writer.setPageEvent(new PdfPageEventHelper() {
        @Override
        public void onEndPage(PdfWriter writer, Document document) {
            // Rotar la página 90 grados en sentido antihorario
            writer.addPageDictEntry(PdfName.ROTATE, new PdfNumber(90));
        }
    });

    doc.open();

    PdfPTable tbl = new PdfPTable(9);
    tbl.addCell("nombre");
    tbl.addCell("apellido");
    tbl.addCell("edad");
    tbl.addCell("acudiente");
    tbl.addCell("grado");
    tbl.addCell("correo");
    tbl.addCell("documento");
    tbl.addCell("f nacimiento");
    tbl.addCell("celular");

    for (int i = 0; i < tabla.getRowCount(); i++) {
        String LN = tabla.getValueAt(i, 1).toString();
        String MN = tabla.getValueAt(i, 2).toString();
        String QN = tabla.getValueAt(i, 3).toString();
        String PN = tabla.getValueAt(i, 4).toString();
        String KN = tabla.getValueAt(i, 5).toString();
        String AN = tabla.getValueAt(i, 6).toString();
        String EN = tabla.getValueAt(i, 7).toString();
        String WN = tabla.getValueAt(i, 8).toString();
        String ÑN = tabla.getValueAt(i, 9).toString();

        tbl.addCell(LN);
        tbl.addCell(MN);
        tbl.addCell(QN);
        tbl.addCell(PN);
        tbl.addCell(KN);
        tbl.addCell(AN);
        tbl.addCell(EN);
        tbl.addCell(WN);
        tbl.addCell(ÑN);
    }

    doc.add(tbl);
    JOptionPane.showMessageDialog(null, "PDF GENERADO");

} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "no se pudo generar el mensaje");
} finally {
    if (doc != null) {
        doc.close();
    }
}

  
    }//GEN-LAST:event_pdftablaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     this.setExtendedState(1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       pantalladedatos a = new pantalladedatos();
  a.setVisible(true);
  this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      String path = "";
JFileChooser j = new JFileChooser();
j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
int x = j.showSaveDialog(this);
if (x == JFileChooser.APPROVE_OPTION) {
    path = j.getSelectedFile().getPath();
}
try {
    FileWriter fw = new FileWriter(path + "DATOS PERSONALES.txt");
    BufferedWriter bw = new BufferedWriter(fw);
    for (int i = 0; i < tabla.getRowCount(); i++) {
        String LN = tabla.getValueAt(i, 1).toString();
        String MN = tabla.getValueAt(i, 2).toString();
        String QN = tabla.getValueAt(i, 3).toString();
        String PN = tabla.getValueAt(i, 4).toString();
        String KN = tabla.getValueAt(i, 5).toString();
        String AN = tabla.getValueAt(i, 6).toString();
        String EN = tabla.getValueAt(i, 7).toString();
        String WN = tabla.getValueAt(i, 8).toString();
        String ÑN = tabla.getValueAt(i, 9).toString();
        bw.write(LN + "\t" + MN + "\t" + QN + "\t" + PN + "\t" + KN + "\t" + AN + "\t" + EN + "\t" + WN + "\t" + ÑN);
        bw.newLine();
    }
    bw.close();
    JOptionPane.showMessageDialog(null,"Archivo TXT generado");
} catch (Exception e) {
    JOptionPane.showMessageDialog(null,e);
}
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnexportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportarActionPerformed
        try {
            obj = new Exportar();
            obj.exportarExcel(tabla);
        } catch (IOException ex) {
        }
    

        
        
    }//GEN-LAST:event_btnexportarActionPerformed
public void grados(){
    grados = txtgrados.getText ();
trsgrados.setRowFilter (RowFilter. regexFilter (txtgrados.getText(), 5));
}
    public void filtro(){
    filtro = txtbuscar.getText ();
trsfiltro.setRowFilter (RowFilter. regexFilter (txtbuscar.getText(), 1));
}
 

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(datospersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datospersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datospersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datospersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
try {
   // UIManager.setLookAndFeel( new FlatLightLaf() ); 
   FlatDarkPurpleIJTheme.setup();
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datospersonales().setVisible(true);
              
            }
        });
    }
    void consultar() {
        String sql = "select * from cliente ";
        try {
            conet = con2.getConnection2();
         st = conet.createStatement();
         rs = st.executeQuery(sql);
         Object []  cliente = new Object [10];
         modelo = (DefaultTableModel) tabla.getModel();
         while (rs.next()){
             cliente [0] = rs.getInt("id");
              cliente [1] = rs.getString("nombre");
               cliente [2] = rs.getString("apellido");
                cliente [3] = rs.getInt("edad");
                 cliente [4] = rs.getString("acudiente");
                 cliente [5] = rs.getString("grado");
                 cliente [6] = rs.getString("correo");
                 cliente [7] = rs.getString("identidad");
                 cliente [8] = rs.getString("fecha");
                  cliente [9] = rs.getString("celular");
                 
                modelo.addRow(cliente);
         }
         tabla.setModel(modelo);
         
       }catch (Exception e){
    }
    }
    
    void Agregar(){
        String nom = txtANombre.getText();
        String ape = txtApe.getText();
        String edad = txtEdad.getText();
        String acu = txtacudiente.getText();
        String grado = txtgrado.getText();
        String correo = txtcorreo.getText();
        String identidad = txtidentidad.getText();
     String fecha = txtfecha.getText();
         String celular = txtcelular.getText();
        try {
            if (nom.equals("")|| ape.equals("")|| edad.equals("")|| acu.equals("")|| grado.equals("") || correo.equals ("")|| identidad.equals("")||fecha.equals("")|| celular.equals("")) {
                JOptionPane.showMessageDialog(null,"Faltan ingresar datos");
                limipiarTabla();
            }else{
                String sql = "insert into cliente(nombre, apellido, edad, acudiente, grado, correo, identidad, fecha, celular) values ('"+nom+"','"+ape+"','"+edad+"','"+acu+"','"+grado+"','"+correo+"','"+identidad+"','"+fecha+"','"+celular+"')";
          conet = con2.getConnection2();
          st = conet.createStatement();
          st.executeUpdate(sql);
          JOptionPane.showMessageDialog(null,"nuevo cliente registrado");
          limipiarTabla();
            }
        }catch (Exception e){
    }
    }
    
    void limipiarTabla(){
        for (int i = 0; i <= tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
        
        
    

    }
    
    void eliminar(){
        int fila = tabla.getSelectedRow();
        try {
            if(fila<0) {
                JOptionPane.showMessageDialog(null,"cliente no seleccionado");
              
                limipiarTabla();
            }
            else {
                String sql = "delete from cliente where id="+idc;
                 conet = con2.getConnection2();
          st = conet.createStatement();
          st.executeUpdate(sql);
          JOptionPane.showMessageDialog(null,"alumno eliminado");
                
                limipiarTabla();
            
            }
        }catch (Exception e){
            
        }}
        
        void Nuevo(){
        txtid.setText("");
        txtANombre.setText("");
        txtApe.setText("");
        txtEdad.setText("");
        txtid.requestFocus();
        txtacudiente.setText("");
        txtgrado.setText("");
        txtcorreo.setText("");
        txtidentidad.setText("");
        txtfecha.setText("");
        txtcelular.setText("");
        
    
    
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnexportar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pdftabla;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtANombre;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtacudiente;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtgrado;
    private javax.swing.JTextField txtgrados;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidentidad;
    // End of variables declaration//GEN-END:variables

}