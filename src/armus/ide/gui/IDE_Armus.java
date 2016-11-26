package armus.ide.gui;

import java.io.File;
import javax.swing.JFileChooser;
import armus.ide.utilites.manejoArchivos;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.*;
import armus.lib.scanner.Scanner;
import armus.lib.parser.Parser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import armus.ide.gui.TextLineNumber;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.*;

public class IDE_Armus extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    manejoArchivos gestion = new manejoArchivos();
    Map<Integer, String> ruta = new HashMap<Integer, String>();
    int NumPestana = 0; ////cambiar

    public IDE_Armus() {
        initComponents();
        //initTextLineNumber();//inicializa complemento enumerado de lineas de codigo fuente

        //DefaultStyledDocument doc = ;
        //ruta.put(0, "");
        //jTextPane1.setStyledDocument(new Guapiador());
        panelesTexto.put(0, new JTextPane());
        panelesTexto.get(0).setStyledDocument(new Guapiador());
        scrollTexto.put(0, new JScrollPane(panelesTexto.get(0)));
        TextLineNumber tln3 = new TextLineNumber(panelesTexto.get(0));
        scrollTexto.get(0).setRowHeaderView(tln3);
        jTabbedPane1.add(scrollTexto.get(0));
        jTabbedPane1.setTitleAt(0, "nuevo");

        //ruta.put(0, "");
        JFrame.setDefaultLookAndFeelDecorated(true);

        //***************************************************************************
        try { //agrega un icono para la aplicación
            setIconImage(new ImageIcon("/opt/armus/Logo.png").getImage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        setVisible(true);

    }

    /* public void initTextLineNumber() {

        TextLineNumber tln = new TextLineNumber(jTextPane1);
        jScrollPane2.setRowHeaderView(tln);
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu11 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Panel = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarComo = new javax.swing.JButton();
        btnCortar = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnAbrirP = new javax.swing.JButton();
        btnCerrarP = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        ScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaConsola = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCorrer = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        menuNuevo = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        menuGuardarComo = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuCopiar = new javax.swing.JMenuItem();
        menuCortar = new javax.swing.JMenuItem();
        menuPegar = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        btnEjecutar = new javax.swing.JRadioButtonMenuItem();
        btnEjecutarParser = new javax.swing.JMenuItem();
        preferencia = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        estandarTema = new javax.swing.JMenuItem();
        menuColor1 = new javax.swing.JMenuItem();
        menuColor2 = new javax.swing.JMenuItem();
        menuColor3 = new javax.swing.JMenuItem();
        menuColor4 = new javax.swing.JMenuItem();
        menuColor5 = new javax.swing.JMenuItem();
        menuConfigurarParametros = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenuItem();

        jMenu11.setText("jMenu11");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Armus");
        setMinimumSize(new java.awt.Dimension(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Panel.setBackground(new java.awt.Color(26, 115, 126));

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder.png"))); // NOI18N
        btnAbrir.setToolTipText("");
        btnAbrir.setBorder(null);
        btnAbrir.setBorderPainted(false);
        btnAbrir.setContentAreaFilled(false);
        btnAbrir.setFocusPainted(false);
        btnAbrir.setSelected(true);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save1.png"))); // NOI18N
        btnGuardarComo.setBorder(null);
        btnGuardarComo.setBorderPainted(false);
        btnGuardarComo.setContentAreaFilled(false);
        btnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComoActionPerformed(evt);
            }
        });

        btnCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors.png"))); // NOI18N
        btnCortar.setBorder(null);
        btnCortar.setBorderPainted(false);
        btnCortar.setContentAreaFilled(false);
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });

        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paste.png"))); // NOI18N
        btnPegar.setBorder(null);
        btnPegar.setBorderPainted(false);
        btnPegar.setContentAreaFilled(false);
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copy.png"))); // NOI18N
        btnCopiar.setBorderPainted(false);
        btnCopiar.setContentAreaFilled(false);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/file (3).png"))); // NOI18N
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jTabbedPane1.setToolTipText("");

        btnAbrirP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/file (2).png"))); // NOI18N
        btnAbrirP.setBorderPainted(false);
        btnAbrirP.setContentAreaFilled(false);
        btnAbrirP.setMaximumSize(new java.awt.Dimension(33, 33));
        btnAbrirP.setMinimumSize(new java.awt.Dimension(33, 33));
        btnAbrirP.setPreferredSize(new java.awt.Dimension(33, 33));
        btnAbrirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirPActionPerformed(evt);
            }
        });

        btnCerrarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/file (1).png"))); // NOI18N
        btnCerrarP.setBorderPainted(false);
        btnCerrarP.setContentAreaFilled(false);
        btnCerrarP.setPreferredSize(new java.awt.Dimension(33, 33));
        btnCerrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarPActionPerformed(evt);
            }
        });

        jTabbedPane2.setName(""); // NOI18N

        TxtAreaConsola.setEditable(false);
        TxtAreaConsola.setColumns(20);
        TxtAreaConsola.setRows(5);
        TxtAreaConsola.setToolTipText("");
        ScrollPane1.setViewportView(TxtAreaConsola);

        jTabbedPane2.addTab("Console", ScrollPane1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Archivo", "Linea", "Columna", "Error"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane2.addTab("Errores", jScrollPane1);

        btnCorrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reply.png"))); // NOI18N
        btnCorrer.setBorderPainted(false);
        btnCorrer.setContentAreaFilled(false);
        btnCorrer.setMaximumSize(new java.awt.Dimension(33, 33));
        btnCorrer.setMinimumSize(new java.awt.Dimension(33, 33));
        btnCorrer.setPreferredSize(new java.awt.Dimension(33, 33));
        btnCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarComo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCortar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPegar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCorrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPegar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCortar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrarP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbrirP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCorrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        BarraMenu.setBackground(new java.awt.Color(255, 255, 255));

        jMenu3.setText("Archivo");
        jMenu3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        jMenu3.add(menuAbrir);

        menuNuevo.setText("Nuevo");
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        jMenu3.add(menuNuevo);

        menuGuardar.setText("Guardar");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu3.add(menuGuardar);

        menuGuardarComo.setText("Guardar Como...");
        menuGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarComoActionPerformed(evt);
            }
        });
        jMenu3.add(menuGuardarComo);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu3.add(menuSalir);

        BarraMenu.add(jMenu3);

        jMenu1.setText("Editar");
        jMenu1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        menuCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuCopiar.setText("Copiar");
        menuCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCopiarActionPerformed(evt);
            }
        });
        jMenu1.add(menuCopiar);

        menuCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuCortar.setText("Cortar");
        menuCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCortarActionPerformed(evt);
            }
        });
        jMenu1.add(menuCortar);

        menuPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        menuPegar.setText("Pegar");
        menuPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPegarActionPerformed(evt);
            }
        });
        jMenu1.add(menuPegar);

        BarraMenu.add(jMenu1);

        MenuAyuda.setText("Analizadores");
        MenuAyuda.setActionCommand("");
        MenuAyuda.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        btnEjecutar.setSelected(true);
        btnEjecutar.setText("Ejecutar Analizador Lexicografico");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        MenuAyuda.add(btnEjecutar);

        btnEjecutarParser.setText("Ejecutar Parser");
        btnEjecutarParser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarParserActionPerformed(evt);
            }
        });
        MenuAyuda.add(btnEjecutarParser);

        BarraMenu.add(MenuAyuda);

        preferencia.setText("Preferencias");
        preferencia.setActionCommand("Opciones");
        preferencia.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        preferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferenciaActionPerformed(evt);
            }
        });

        jMenu5.setText("Temas");

        estandarTema.setText("Standard");
        estandarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estandarTemaActionPerformed(evt);
            }
        });
        jMenu5.add(estandarTema);

        menuColor1.setText("Pink");
        menuColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColor1ActionPerformed(evt);
            }
        });
        jMenu5.add(menuColor1);

        menuColor2.setText("Blue");
        menuColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColor2ActionPerformed(evt);
            }
        });
        jMenu5.add(menuColor2);

        menuColor3.setText("Green");
        menuColor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColor3ActionPerformed(evt);
            }
        });
        jMenu5.add(menuColor3);

        menuColor4.setText("DarkRed");
        menuColor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColor4ActionPerformed(evt);
            }
        });
        jMenu5.add(menuColor4);

        menuColor5.setText("Aqua");
        menuColor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColor5ActionPerformed(evt);
            }
        });
        jMenu5.add(menuColor5);

        preferencia.add(jMenu5);

        menuConfigurarParametros.setText("Configurar Parametros");
        menuConfigurarParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConfigurarParametrosActionPerformed(evt);
            }
        });
        preferencia.add(menuConfigurarParametros);

        menuAyuda.setText("Ayuda");
        menuAyuda.setActionCommand("");
        menuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAyudaActionPerformed(evt);
            }
        });
        preferencia.add(menuAyuda);

        BarraMenu.add(preferencia);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        panelesTexto.get(jTabbedPane1.getSelectedIndex()).copy();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        /*JFileChooser dialogo = new JFileChooser(); //creo objeto filechooser
        int ventanaDialogo = dialogo.showOpenDialog(this); // abro la ventana del dialogo
        if(ventanaDialogo == JFileChooser.APPROVE_OPTION){ //si hace click en el boton abrir del dialogo
            String rutaNombreArchivo = dialogo.getSelectedFile().getPath();
            String NombreArchivo = dialogo.getSelectedFile().getName();
        }*/
        abrirArchivo();


    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (ruta.get(jTabbedPane1.getSelectedIndex()) == null) {
            guardarComo();
        } else {
            guardarArchivo();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComoActionPerformed
        guardarComo();
    }//GEN-LAST:event_btnGuardarComoActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        panelesTexto.get(jTabbedPane1.getSelectedIndex()).cut();
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        panelesTexto.get(jTabbedPane1.getSelectedIndex()).paste();
    }//GEN-LAST:event_btnPegarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        /* manejoArchivos archivoN = new manejoArchivos();
        archivoN.crear();*/

        if (!(panelesTexto.get(jTabbedPane1.getSelectedIndex()).getText().equals("")) || archivo != null) {
            if (((JOptionPane.showConfirmDialog(null, "Desea utilizar una nueva hoja de trabajo? \n\t Si acepta se borrara todos los cambios sin guardar")) == 0)) {
                archivo = null;
                panelesTexto.get(jTabbedPane1.getSelectedIndex()).setText("");
                jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(), "nuevo(" + jTabbedPane1.getSelectedIndex() + ")");
                ruta.remove(jTabbedPane1.getSelectedIndex());
            }
        }

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        // TODO add your handling code here:
        if (!(panelesTexto.get(jTabbedPane1.getSelectedIndex()).getText().equals("")) || archivo != null) {
            if (((JOptionPane.showConfirmDialog(null, "Desea utilizar una nueva hoja de trabajo? \n\t Si acepta se borrara todos los cambios sin guardar")) == 0)) {
                archivo = null;
                panelesTexto.get(jTabbedPane1.getSelectedIndex()).setText("");
                jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(), "nuevo(" + jTabbedPane1.getSelectedIndex() + ")");
                ruta.remove(jTabbedPane1.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        if (ruta.get(jTabbedPane1.getSelectedIndex()) == null) {
            guardarComo();
        } else {
            guardarArchivo();
        }

    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarComoActionPerformed
        guardarComo();
    }//GEN-LAST:event_menuGuardarComoActionPerformed

    private void menuCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCopiarActionPerformed
        panelesTexto.get(jTabbedPane1.getSelectedIndex()).copy();
    }//GEN-LAST:event_menuCopiarActionPerformed

    private void menuCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCortarActionPerformed
        panelesTexto.get(jTabbedPane1.getSelectedIndex()).cut();
    }//GEN-LAST:event_menuCortarActionPerformed

    private void menuPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPegarActionPerformed
        panelesTexto.get(jTabbedPane1.getSelectedIndex()).paste();
    }//GEN-LAST:event_menuPegarActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        salir();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor1ActionPerformed
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        //jTextPane1.setFont(font);
        //jTextPane1.setForeground(new Color(228, 114, 210));
        //jTextPane1.setBackground(new Color(255, 255, 255));
        Panel.setBackground(new Color(231, 81, 166));
        BarraMenu.setBackground(new Color(250, 145, 204));
    }//GEN-LAST:event_menuColor1ActionPerformed

    private void menuColor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor5ActionPerformed
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        //jTextPane1.setFont(font);
        //jTextPane1.setForeground(new Color(218, 141, 70));
        //jTextPane1.setBackground(new Color(255, 255, 255));
        Panel.setBackground(new Color(53, 202, 192));
        BarraMenu.setBackground(new Color(121, 229, 222));
    }//GEN-LAST:event_menuColor5ActionPerformed

    private void menuColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor2ActionPerformed
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        //jTextPane1.setFont(font);
        //jTextPane1.setForeground(new Color(102, 110, 222));
        //jTextPane1.setBackground(new Color(255, 255, 255));
        Panel.setBackground(new Color(53, 106, 180));
        BarraMenu.setBackground(new Color(88, 138, 208));
    }//GEN-LAST:event_menuColor2ActionPerformed

    private void menuColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor3ActionPerformed
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        //jTextPane1.setFont(font);
        //jTextPane1.setForeground(new Color(100, 198, 125));
        //jTextPane1.setBackground(new Color(255, 255, 255));
        Panel.setBackground(new Color(35, 170, 53));
        BarraMenu.setBackground(new Color(106, 223, 122));
    }//GEN-LAST:event_menuColor3ActionPerformed

    private void menuColor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor4ActionPerformed
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        //jTextPane1.setFont(font);
        //jTextPane1.setForeground(new Color(208, 67, 67));
        //jTextPane1.setBackground(new Color(255, 255, 255));
        Panel.setBackground(new Color(148, 13, 13));
        BarraMenu.setBackground(new Color(222, 118, 118));
    }//GEN-LAST:event_menuColor4ActionPerformed

    private void preferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferenciaActionPerformed

    }//GEN-LAST:event_preferenciaActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        if (archivo == null) {
            if (JOptionPane.showConfirmDialog(null, "Desea guardar el archivo") == 0) {
                guardarComo();
            } else {
                return;
            }
        } else {

            String contenido = panelesTexto.get(jTabbedPane1.getSelectedIndex()).getText();
            String respuesta = gestion.guardarTexto(archivo, contenido);
            if (respuesta == null) {
                JOptionPane.showMessageDialog(null, "Error al guardar el texto");
            }
        }
        try {
            Scanner scanner = new Scanner();
            String[] listaArchivos = scanner.lsFiles(ruta.get(jTabbedPane1.getSelectedIndex()));
            /// Poner un error aqui si listaArchivos es nulo
            if (listaArchivos == null) {
                anadirErrores();
                return;
            }
            TxtAreaConsola.setText("Se encontraron los siguientes archivos a Tokenizar \n");
            for (String valor : listaArchivos) {
                TxtAreaConsola.append(valor + "\n");
            }
            TxtAreaConsola.append("____________________________________________________________________________\n");
            String[] tokens = scanner.lsTokens(listaArchivos);

            if (tokens == null) {
                anadirErrores();
            }

            String cadena;
            FileReader f;
            BufferedReader b;
            f = new FileReader("lsToken.tok");
            b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                TxtAreaConsola.append(cadena + "\n");
            }
            b.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "No se puede cargar la libreria del Scanner\n" + e.getMessage(),
                    "Error cargando libreria", JOptionPane.ERROR_MESSAGE);
        }

        jTabbedPane2.setSelectedIndex(0);

    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void menuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAyudaActionPerformed
        try {
            File directorio = new File("temp"); //Creas un nuevo directorio a nivel del jar.
            directorio.mkdirs();
            directorio.setWritable(true);
            //copia la direccion donde estará en archivo creado (copia)
            String art = directorio.getCanonicalPath() + File.separator + "Ayuda.pdf";
            //nuevo archivo en esa direccion
            File temp = new File(art);
            InputStream is = this.getClass().getResourceAsStream("/Resource/Ayuda.pdf");
            FileOutputStream archivoDestino = new FileOutputStream(temp);
            FileWriter fw = new FileWriter(temp);
            byte[] buffer = new byte[512 * 1024];
            //lee el archivo hasta que se acabe...
            int nbLectura;
            while ((nbLectura = is.read(buffer)) != -1) {
                archivoDestino.write(buffer, 0, nbLectura);
            }
            //cierra el archivo, el inputS y el FileW
            fw.close();
            archivoDestino.close();
            is.close();
            //abre el archivo temporal
            Desktop.getDesktop().open(temp);
        } catch (Exception ex) {
            System.out.println("Problema abriendo el manual de ayuda");
        }
    }//GEN-LAST:event_menuAyudaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        salir();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void menuConfigurarParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConfigurarParametrosActionPerformed
        configuraciones ventanita = new configuraciones();
        ventanita.setVisible(true);
    }//GEN-LAST:event_menuConfigurarParametrosActionPerformed

    private void estandarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estandarTemaActionPerformed
        // TODO add your handling code here:
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        //jTextPane1.setFont(font);
        //jTextPane1.setForeground(new Color(228, 114, 210));
        //jTextPane1.setBackground(new Color(255, 255, 255));
        Panel.setBackground(new Color(26, 115, 126));
        BarraMenu.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_estandarTemaActionPerformed

    private void btnEjecutarParserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarParserActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);

        Scanner s = new Scanner();
        String[] a = s.lsFiles(ruta.get(jTabbedPane1.getSelectedIndex()));

        Parser b = new Parser();
        String[] respuesta = b.run(a);
        if (respuesta == null) {
            modelo.addColumn("Exito");
            String[] ext = {"Compilado con exito"};
            modelo.addRow(ext);
        } else {
            modelo.addColumn("Archivo");
            modelo.addColumn("# Linea");
            modelo.addColumn("# Col");
            modelo.addColumn("Detalles");
            for (int i = 0; i < respuesta.length; i++) {
                System.out.println(respuesta[i]);
                modelo.addRow((Object[]) respuesta[i].split(","));
            }
        }

        jTabbedPane2.setSelectedIndex(1);

    }//GEN-LAST:event_btnEjecutarParserActionPerformed

    private void btnAbrirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirPActionPerformed
        crearVentanaE();
    }//GEN-LAST:event_btnAbrirPActionPerformed

    private void crearVentanaE() {
        if (NumPestana < 9) {
            NumPestana++;
            panelesTexto.put(NumPestana, new JTextPane());
            panelesTexto.get(NumPestana).setStyledDocument(new Guapiador());
            scrollTexto.put(NumPestana, new JScrollPane(panelesTexto.get(NumPestana)));
            TextLineNumber tln3 = new TextLineNumber(panelesTexto.get(NumPestana));
            scrollTexto.get(NumPestana).setRowHeaderView(tln3);
            jTabbedPane1.add(scrollTexto.get(NumPestana));
            jTabbedPane1.setTitleAt(NumPestana, "nuevo(" + NumPestana + ")");
            jTabbedPane1.setSelectedIndex(NumPestana);
            // ruta.put(NumPestana, "");
        } else {
            JOptionPane.showMessageDialog(null, "El numnero de pestañas maximo es de 10, por favor cierre una para abrir otra");
        }
    }

    private void btnCerrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarPActionPerformed
        // AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAqui
        if (NumPestana > 0) {
            if ((panelesTexto.get(NumPestana).getText()).equals("")) {
                removePestania();
                NumPestana--;
            } else if (((JOptionPane.showConfirmDialog(null, "Desea cerrar la pestaña? \nNota: se cerrara la ultima pestaña sin guardar los cambios")) == 0)) {
                removePestania();
                NumPestana--;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ya no hay pestañas que cerrar");
            NumPestana = 0;
        }
    }//GEN-LAST:event_btnCerrarPActionPerformed

    private void removePestania() {
        jTabbedPane1.remove(scrollTexto.get(NumPestana));
        scrollTexto.remove(NumPestana);
        panelesTexto.remove(NumPestana);
        ruta.remove(NumPestana);
    }


    private void btnCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorrerActionPerformed

    private void guardarArchivo() {
        if (!(ruta.get(jTabbedPane1.getSelectedIndex()).equals(""))) {
            String contenido = panelesTexto.get(jTabbedPane1.getSelectedIndex()).getText();
            String respuesta = gestion.guardarSencillo(ruta.get(jTabbedPane1.getSelectedIndex()), contenido);
            if (respuesta != null) {
                JOptionPane.showMessageDialog(null, respuesta);
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la opcion guardar como ");
        }
    }

    private void guardarComo() {
        if (seleccionado.showDialog(null, "Guardar Texto") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.getName().endsWith("acl")) {
                String contenido = panelesTexto.get(jTabbedPane1.getSelectedIndex()).getText();
                String respuesta = gestion.guardarTexto(archivo, contenido);
                ruta.put(jTabbedPane1.getSelectedIndex(), seleccionado.getSelectedFile().getAbsolutePath());
                //ruta.replace(jTabbedPane1.getSelectedIndex(), seleccionado.getSelectedFile().getAbsolutePath());
                jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(), archivo.getName());
                if (respuesta != null) {
                    JOptionPane.showMessageDialog(null, respuesta);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar el archivo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El texto se debe guardar con extencion .acl");
            }

        }
    }

    private void abrirArchivo() {
        if ((ruta.get(jTabbedPane1.getSelectedIndex())) != null || !((panelesTexto.get(jTabbedPane1.getSelectedIndex()).getText()).equals(""))) {
            if (NumPestana == 9) {
                JOptionPane.showMessageDialog(null, "Ya no se pueden abrir mas pestañas");
                return;
            }
            crearVentanaE();
        }
        if (seleccionado.showDialog(this, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("acl")) {
                    String contenido = gestion.abrirTexto(archivo);
                    //System.out.printf("%i\n", jTabbedPane1.getSelectedIndex());
                    panelesTexto.get(jTabbedPane1.getSelectedIndex()).setText(contenido);
                    ruta.put(jTabbedPane1.getSelectedIndex(), seleccionado.getSelectedFile().getAbsolutePath());
                    //ruta.replace(jTabbedPane1.getSelectedIndex(), seleccionado.getSelectedFile().getAbsolutePath());
                    jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(), archivo.getName());
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo .acl");
                }
            }
        }
    }

    private void anadirErrores() {
        String cadena;
        FileReader f;
        BufferedReader b;
        try {
            f = new FileReader("log.txt");
            b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                TxtAreaConsola.append(cadena + "\n");
            }
            b.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se puede leer el archivo de errores " + ex.getMessage(), "error", JOptionPane.ERROR);
        }

    }

    private void salir() {
        if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?") == 0) {
            System.exit(0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JPanel Panel;
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JTextArea TxtAreaConsola;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAbrirP;
    private javax.swing.JButton btnCerrarP;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCorrer;
    private javax.swing.JButton btnCortar;
    private javax.swing.JRadioButtonMenuItem btnEjecutar;
    private javax.swing.JMenuItem btnEjecutarParser;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarComo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPegar;
    private javax.swing.JMenuItem estandarTema;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuAyuda;
    private javax.swing.JMenuItem menuColor1;
    private javax.swing.JMenuItem menuColor2;
    private javax.swing.JMenuItem menuColor3;
    private javax.swing.JMenuItem menuColor4;
    private javax.swing.JMenuItem menuColor5;
    private javax.swing.JMenuItem menuConfigurarParametros;
    private javax.swing.JMenuItem menuCopiar;
    private javax.swing.JMenuItem menuCortar;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuGuardarComo;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JMenuItem menuPegar;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu preferencia;
    // End of variables declaration//GEN-END:variables

    Map<Integer, javax.swing.JTextPane> panelesTexto = new HashMap<Integer, javax.swing.JTextPane>();
    Map<Integer, javax.swing.JScrollPane> scrollTexto = new HashMap<Integer, javax.swing.JScrollPane>();
}