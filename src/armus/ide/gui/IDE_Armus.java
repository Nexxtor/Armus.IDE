package armus.ide.gui;

import java.io.File;
import javax.swing.JFileChooser;
import armus.ide.utilites.manejoArchivos;
import java.awt.Color;
import java.awt.Desktop;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import javax.swing.*;
import armus.lib.scanner.Scanner;
import armus.lib.parser.Parser;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.util.HashMap;
import java.util.Map;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class IDE_Armus extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    //Creamos el filtro
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.acl", "acl");
    File archivo;
    manejoArchivos gestion = new manejoArchivos();
    Map<Integer, String> ruta = new HashMap<Integer, String>();
    int NumPestana = 0; ////cambiar

    public IDE_Armus() {
        initComponents();
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        seleccionado.setFileFilter(filtro); //Le indicamos el filtro acl
        panelesTexto.put(0, new JTextPane());
        panelesTexto.get(0).setStyledDocument(new Guapiador());
        scrollTexto.put(0, new JScrollPane(panelesTexto.get(0)));
        TextLineNumber tln3 = new TextLineNumber(panelesTexto.get(0));
        scrollTexto.get(0).setRowHeaderView(tln3);
        jTabbedPane1.add(scrollTexto.get(0));
        jTabbedPane1.setTitleAt(0, "nuevo");

        try { //agrega un icono a la aplicación
            setIconImage(new ImageIcon("/opt/armus/Logo.png").getImage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        setVisible(true);

    }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaConsola = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaErrores = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtAreaResultado = new javax.swing.JTextArea();
        btnCorrer = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        menuNuevo = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        menuGuardarComo = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        MenuEditar = new javax.swing.JMenu();
        menuCopiar = new javax.swing.JMenuItem();
        menuCortar = new javax.swing.JMenuItem();
        menuPegar = new javax.swing.JMenuItem();
        MenuAnalizadores = new javax.swing.JMenu();
        btnEjecutar = new javax.swing.JRadioButtonMenuItem();
        btnEjecutarParser = new javax.swing.JMenuItem();
        MenuPreferencias = new javax.swing.JMenu();
        SubMenuTemas = new javax.swing.JMenu();
        estandarTema = new javax.swing.JMenuItem();
        menuColor1 = new javax.swing.JMenuItem();
        menuColor2 = new javax.swing.JMenuItem();
        menuColor3 = new javax.swing.JMenuItem();
        menuColor4 = new javax.swing.JMenuItem();
        menuColor5 = new javax.swing.JMenuItem();
        menuConfigurarParametros = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenuItem();
        MenuAcercaDe = new javax.swing.JMenuItem();

        jMenu11.setText("jMenu11");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Armus");
        setIconImage(getIconImage());
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

        jScrollPane1.setToolTipText("");

        TxtAreaConsola.setEditable(false);
        TxtAreaConsola.setColumns(20);
        TxtAreaConsola.setRows(5);
        TxtAreaConsola.setToolTipText("Muestra la lista de lexemas con su correspondiente token");
        jScrollPane1.setViewportView(TxtAreaConsola);

        jTabbedPane2.addTab("Console", jScrollPane1);

        TablaErrores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Archivo", "Línea", "Columna", "Error"
            }
        ));
        TablaErrores.setToolTipText("Muestra la lista de errores encontrados en el código");
        TablaErrores.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TablaErrores);

        jTabbedPane2.addTab("Errores", jScrollPane2);

        TxtAreaResultado.setColumns(20);
        TxtAreaResultado.setRows(5);
        jScrollPane3.setViewportView(TxtAreaResultado);
        TxtAreaResultado.getAccessibleContext().setAccessibleName("TxtAreaResultado");
        TxtAreaResultado.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane2.addTab("Resultados", jScrollPane3);

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
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE))
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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        MenuArchivo.setText("Archivo");
        MenuArchivo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        menuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAbrir.setText("Abrir");
        menuAbrir.setToolTipText("Abrir archivo");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        MenuArchivo.add(menuAbrir);

        menuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNuevo.setText("Nuevo");
        menuNuevo.setToolTipText("Nuevo archivo");
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        MenuArchivo.add(menuNuevo);

        menuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        menuGuardar.setText("Guardar");
        menuGuardar.setToolTipText("Guardar el archivo actual");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        MenuArchivo.add(menuGuardar);

        menuGuardarComo.setText("Guardar Como...");
        menuGuardarComo.setToolTipText("Guarda el archivo actual con otro nombre");
        menuGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarComoActionPerformed(evt);
            }
        });
        MenuArchivo.add(menuGuardarComo);

        menuSalir.setText("Salir");
        menuSalir.setToolTipText("Salir del editor");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        MenuArchivo.add(menuSalir);

        BarraMenu.add(MenuArchivo);

        MenuEditar.setText("Editar");
        MenuEditar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        menuCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuCopiar.setText("Copiar");
        menuCopiar.setToolTipText("Copiar el texto seleccionado");
        menuCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCopiarActionPerformed(evt);
            }
        });
        MenuEditar.add(menuCopiar);

        menuCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuCortar.setText("Cortar");
        menuCortar.setToolTipText("Cortar el texto seleccionado");
        menuCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCortarActionPerformed(evt);
            }
        });
        MenuEditar.add(menuCortar);

        menuPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        menuPegar.setText("Pegar");
        menuPegar.setToolTipText("Pegar un texto");
        menuPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPegarActionPerformed(evt);
            }
        });
        MenuEditar.add(menuPegar);

        BarraMenu.add(MenuEditar);

        MenuAnalizadores.setText("Analizadores");
        MenuAnalizadores.setActionCommand("");
        MenuAnalizadores.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        btnEjecutar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        btnEjecutar.setText("Ejecutar Analizador Lexicografico");
        btnEjecutar.setToolTipText("Obtiene la lista de lexemas y tokens del código");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        MenuAnalizadores.add(btnEjecutar);

        btnEjecutarParser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        btnEjecutarParser.setText("Ejecutar Parser");
        btnEjecutarParser.setToolTipText("Verifica la sintaxis, muestra los errores encontrados");
        btnEjecutarParser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarParserActionPerformed(evt);
            }
        });
        MenuAnalizadores.add(btnEjecutarParser);

        BarraMenu.add(MenuAnalizadores);

        MenuPreferencias.setText("Preferencias");
        MenuPreferencias.setActionCommand("Opciones");
        MenuPreferencias.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        SubMenuTemas.setText("Temas");
        SubMenuTemas.setToolTipText("Cambia la apariencia del editor");

        estandarTema.setText("Standard");
        estandarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estandarTemaActionPerformed(evt);
            }
        });
        SubMenuTemas.add(estandarTema);

        menuColor1.setText("Pink");
        menuColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColor1ActionPerformed(evt);
            }
        });
        SubMenuTemas.add(menuColor1);

        menuColor2.setText("Blue");
        menuColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColor2ActionPerformed(evt);
            }
        });
        SubMenuTemas.add(menuColor2);

        menuColor3.setText("Green");
        menuColor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColor3ActionPerformed(evt);
            }
        });
        SubMenuTemas.add(menuColor3);

        menuColor4.setText("DarkRed");
        menuColor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColor4ActionPerformed(evt);
            }
        });
        SubMenuTemas.add(menuColor4);

        menuColor5.setText("Aqua");
        menuColor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColor5ActionPerformed(evt);
            }
        });
        SubMenuTemas.add(menuColor5);

        MenuPreferencias.add(SubMenuTemas);

        menuConfigurarParametros.setText("Configurar Parametros");
        menuConfigurarParametros.setToolTipText("Configura los parametros del compilador");
        menuConfigurarParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConfigurarParametrosActionPerformed(evt);
            }
        });
        MenuPreferencias.add(menuConfigurarParametros);

        BarraMenu.add(MenuPreferencias);

        MenuAyuda.setText("Ayuda");
        MenuAyuda.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        menuAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuAyuda.setText("Ayuda");
        menuAyuda.setToolTipText("Muestra el archivo de ayuda");
        menuAyuda.setActionCommand("");
        menuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAyudaActionPerformed(evt);
            }
        });
        MenuAyuda.add(menuAyuda);

        MenuAcercaDe.setText("Acerca de...");
        MenuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcercaDeActionPerformed(evt);
            }
        });
        MenuAyuda.add(MenuAcercaDe);

        BarraMenu.add(MenuAyuda);

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
        //Panel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        Panel.setBackground(new Color(231, 81, 166));
        BarraMenu.setBackground(new Color(250, 145, 204));
    }//GEN-LAST:event_menuColor1ActionPerformed

    private void menuColor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor5ActionPerformed
        Panel.setBackground(new Color(53, 202, 192));
        BarraMenu.setBackground(new Color(121, 229, 222));
    }//GEN-LAST:event_menuColor5ActionPerformed

    private void menuColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor2ActionPerformed
        Panel.setBackground(new Color(53, 106, 180));
        BarraMenu.setBackground(new Color(88, 138, 208));
    }//GEN-LAST:event_menuColor2ActionPerformed

    private void menuColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor3ActionPerformed
        Panel.setBackground(new Color(35, 170, 53));
        BarraMenu.setBackground(new Color(106, 223, 122));
    }//GEN-LAST:event_menuColor3ActionPerformed

    private void menuColor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor4ActionPerformed
        Panel.setBackground(new Color(148, 13, 13));
        BarraMenu.setBackground(new Color(222, 118, 118));
    }//GEN-LAST:event_menuColor4ActionPerformed

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
        Panel.setBackground(new Color(26, 115, 126));
        BarraMenu.setBackground(new Color(60, 59, 55));
    }//GEN-LAST:event_estandarTemaActionPerformed

    private void btnEjecutarParserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarParserActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = new DefaultTableModel();
        TablaErrores.setModel(modelo);

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
        } else {
            JOptionPane.showMessageDialog(null, "El numnero de pestañas maximo es de 10, por favor cierre una para abrir otra");
        }
    }

    private void btnCerrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarPActionPerformed
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

    private void MenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcercaDeActionPerformed
        AcercaDe acercad = new AcercaDe();
        acercad.setVisible(true);
    }//GEN-LAST:event_MenuAcercaDeActionPerformed

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
                JOptionPane.showMessageDialog(null, "Ya no se pueden abrir más pestañas");
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
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?") == 0) {
            System.exit(0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem MenuAcercaDe;
    private javax.swing.JMenu MenuAnalizadores;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuEditar;
    private javax.swing.JMenu MenuPreferencias;
    private javax.swing.JPanel Panel;
    private javax.swing.JMenu SubMenuTemas;
    private javax.swing.JTable TablaErrores;
    private javax.swing.JTextArea TxtAreaConsola;
    private javax.swing.JTextArea TxtAreaResultado;
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
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
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
    // End of variables declaration//GEN-END:variables

    Map<Integer, javax.swing.JTextPane> panelesTexto = new HashMap<Integer, javax.swing.JTextPane>();
    Map<Integer, javax.swing.JScrollPane> scrollTexto = new HashMap<Integer, javax.swing.JScrollPane>();
}
