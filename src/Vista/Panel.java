package cx;

import Vista.Login;
import pantalla.Notasdelalumno;
import pantalla.Datospersonales;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import desplazable.Desface;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import pantalla.Boletinnotas;
import pantalla.Imagenes;
import pantalla.Informacion;
import pantalla.Pagodematricula;
import pantalla.Datosacademicos;
import pantalla.Panelbibliotecanobiblioteca;
import renderizador.AnimacionBorderPanel;

/**
 *
 * @author abel
 */
public class Panel extends javax.swing.JFrame {

    Desface desplace;

    public Panel() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        desplace = new Desface();
        //[1200, 522]
        setSize(1240, 680);
        // redimencionar la pagina por el usuario
        setResizable(false);
        setLocationRelativeTo(null);

        AnimacionBorderPanel animatedBorder = new AnimacionBorderPanel(panelprincipal, jLabel4);
        mostrarHoraDeColombia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        MenuPlegable = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelprincipal = new javax.swing.JPanel();

        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setText("X");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        MenuPlegable.setBackground(new java.awt.Color(0, 0, 0));
        MenuPlegable.setForeground(new java.awt.Color(0, 0, 0));
        MenuPlegable.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("IMAGENES ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setIconTextGap(15);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel1);
        jLabel1.setBounds(30, 290, 220, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("INICIO");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel3.setIconTextGap(15);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel3);
        jLabel3.setBounds(30, 10, 220, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DATOS PERSONALES ");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel4.setIconTextGap(15);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel4);
        jLabel4.setBounds(-40, 100, 300, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DATOS ACADEMICOS ");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel5.setIconTextGap(15);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel5);
        jLabel5.setBounds(-30, 150, 290, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("INFORMACION BIBLIOTECA");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel6.setIconTextGap(15);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel6);
        jLabel6.setBounds(30, 200, 220, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("INFORMACION ");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel7.setIconTextGap(15);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel7);
        jLabel7.setBounds(10, 240, 240, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menu2.png"))); // NOI18N
        jLabel2.setLabelFor(MenuPlegable);
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel2);
        jLabel2.setBounds(250, 10, 50, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/notaima.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel11);
        jLabel11.setBounds(260, 60, 30, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("NOTAS ");
        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel12.setIconTextGap(15);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel12);
        jLabel12.setBounds(30, 60, 220, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/imagen.png"))); // NOI18N
        jLabel13.setText("jLabel11");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel13);
        jLabel13.setBounds(260, 300, 30, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/informacion-personal.png"))); // NOI18N
        jLabel14.setText("jLabel11");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel14);
        jLabel14.setBounds(260, 110, 30, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/educacion.png"))); // NOI18N
        jLabel15.setText("jLabel11");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel15);
        jLabel15.setBounds(260, 160, 30, 40);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/biblioteca.png"))); // NOI18N
        jLabel16.setText("jLabel11");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel16);
        jLabel16.setBounds(260, 210, 30, 40);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/metodo-de-pago (1).png"))); // NOI18N
        jLabel17.setText("jLabel11");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel17);
        jLabel17.setBounds(260, 390, 30, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("PAGO DE MATRICULA");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel8.setIconTextGap(15);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel8);
        jLabel8.setBounds(10, 390, 240, 50);

        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel18);
        jLabel18.setBounds(260, 350, 30, 40);

        a.setBackground(new java.awt.Color(255, 255, 255));
        a.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a.setText("jLabel9");
        MenuPlegable.add(a);
        a.setBounds(0, 460, 180, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("BOLETIN DE NOTAS");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel9.setIconTextGap(15);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel9);
        jLabel9.setBounds(10, 340, 240, 50);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/acerca-de.png"))); // NOI18N
        jLabel19.setText("jLabel11");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel19);
        jLabel19.setBounds(260, 250, 30, 40);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/tomar-nota.png"))); // NOI18N
        jLabel20.setText("jLabel11");
        MenuPlegable.add(jLabel20);
        jLabel20.setBounds(260, 350, 30, 40);

        getContentPane().add(MenuPlegable);
        MenuPlegable.setBounds(0, 30, 300, 490);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(70, 0, 38, 25);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("X");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(10, 0, 41, 25);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 0, 100, 25);

        panelprincipal.setLayout(null);
        getContentPane().add(panelprincipal);
        panelprincipal.setBounds(300, 30, 990, 850);

        setBounds(0, 0, 718, 498);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -250, 5, 0);
        } else if (MenuPlegable.getX() == -250) {
            desplace.desplazarDerecha(MenuPlegable, MenuPlegable.getX(), 0, 5, 0);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        MenuPlegable.setSize(new Dimension(MenuPlegable.getWidth(), this.getHeight()));
    }//GEN-LAST:event_formComponentResized

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        panelprincipal.removeAll(); // Elimina todos los componentes dentro del panel.
        panelprincipal.revalidate(); // Revalida el panel para que se ajuste a los cambios.
        panelprincipal.repaint();

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        //[1244, 541]
        //[1359, 622]
        Datosacademicos pl = new Datosacademicos();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        Panelbibliotecanobiblioteca pl = new Panelbibliotecanobiblioteca();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login k = new Login();
        k.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        Datospersonales pp = new Datospersonales();
        pp.setSize(1244, 941);
        pp.setLocation(5, 5);
        panelprincipal.removeAll();
        panelprincipal.add(pp, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();

        AnimacionBorderPanel animatedBorder = new AnimacionBorderPanel(panelprincipal, jLabel4);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

        //[1244, 541]
        //[1359, 622]
        Notasdelalumno pl = new Notasdelalumno();
        pl.setSize(1244, 641);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        Notasdelalumno pl = new Notasdelalumno();
        pl.setSize(1244, 641);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();


    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        Datospersonales pp = new Datospersonales();
        pp.setSize(1244, 941);
        pp.setLocation(5, 5);
        panelprincipal.removeAll();
        panelprincipal.add(pp, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();


    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        //[1244, 541]
        //[1359, 622]
        Datosacademicos pl = new Datosacademicos();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Pagodematricula pl = new Pagodematricula();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        Informacion pl = new Informacion();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();


    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        Boletinnotas pl = new Boletinnotas();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();


    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        Panelbibliotecanobiblioteca pl = new Panelbibliotecanobiblioteca();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();


    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked

        Informacion pl = new Informacion();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();


    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Imagenes pl = new Imagenes();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();


    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        Imagenes pl = new Imagenes();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();


    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked

        Boletinnotas pl = new Boletinnotas();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();

    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

        Boletinnotas pl = new Boletinnotas();
        pl.setSize(948, 941);
        pl.setLocation(5, 5);

        panelprincipal.removeAll();
        panelprincipal.add(pl, BorderLayout.CENTER);
        panelprincipal.revalidate();
        panelprincipal.repaint();

    }//GEN-LAST:event_jLabel17MouseClicked

    void mostrarHoraDeColombia() {

        ZoneId zonaColombia = ZoneId.of("America/Bogota");
        LocalTime horaColombia = LocalTime.now(zonaColombia);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaColombiaFormateada = horaColombia.format(formatoHora);
        a.setText("HORA " + horaColombiaFormateada);
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatDarkPurpleIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JLabel a;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelprincipal;
    // End of variables declaration//GEN-END:variables
}
