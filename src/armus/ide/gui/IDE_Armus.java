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
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class IDE_Armus extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    //Creamos el filtro
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.acl", "acl");
    File archivo;
    manejoArchivos gestion = new manejoArchivos();
    ArrayList <String> ruta = new ArrayList<>();
    
    int NumPestana = 0; ////cambiar
    int numTabs=0;

    public IDE_Armus() {
        initComponents();
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        seleccionado.setFileFilter(filtro); //Le indicamos el filtro acl
        panelesTexto.add(0, new JTextPane());
        panelesTexto.get(0).setStyledDocument(new Guapiador());
        scrollTexto.add(0, new JScrollPane(panelesTexto.get(0)));
        TextLineNumber tln3 = new TextLineNumber(panelesTexto.get(0));
        scrollTexto.get(0).setRowHeaderView(tln3);
        jTabbedPane1.add(scrollTexto.get(0), "nuevo " + String.valueOf(numTabs), numTabs++);
        jTabbedPane1.setTitleAt(0, "nuevo");
        jTabbedPane1.setTabComponentAt(0, new DemoCustomTab(this));
        //creo la pestaña de agregar +
        
        jTabbedPane1.add(new JPanel(),new ImageIcon(getClass().getResource("/icons/agregar-16.png")), numTabs++);
        jTabbedPane1.addChangeListener(changeListener);
        ruta.add(0, null);
        menuEmergenteArchivos(); //muestra el popupmenu
        establecerTemaConfig(); //obtiene el tema guardado y lo establece
        try { //agrega un icono a la aplicación
            setIconImage(new ImageIcon("/opt/armus/Logo.png").getImage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu11 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Panel = new javax.swing.JPanel();
        btn_abrir = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_guardar_como = new javax.swing.JButton();
        btn_cortar = new javax.swing.JButton();
        btn_pegar = new javax.swing.JButton();
        btn_copiar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaConsola = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaErrores = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtAreaResultado = new javax.swing.JTextArea();
        btn_compilar = new javax.swing.JButton();
        btn_lexema_token = new javax.swing.JButton();
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
        btnEjecutarLexemaToken = new javax.swing.JMenuItem();
        btnEjecutarParser = new javax.swing.JMenuItem();
        MenuPreferencias = new javax.swing.JMenu();
        SubMenuTemas = new javax.swing.JMenu();
        oscuro = new javax.swing.JMenuItem();
        fucsia = new javax.swing.JMenuItem();
        verde = new javax.swing.JMenuItem();
        ocre = new javax.swing.JMenuItem();
        aqua = new javax.swing.JMenuItem();
        azul = new javax.swing.JMenuItem();
        rosado = new javax.swing.JMenuItem();
        cafe = new javax.swing.JMenuItem();
        gris = new javax.swing.JMenuItem();
        olivo = new javax.swing.JMenuItem();
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
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Panel.setBackground(new java.awt.Color(66, 66, 66));

        btn_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/abrir.png"))); // NOI18N
        btn_abrir.setToolTipText("Abrir código fuente");
        btn_abrir.setAlignmentX(0.5F);
        btn_abrir.setBorder(null);
        btn_abrir.setBorderPainted(false);
        btn_abrir.setContentAreaFilled(false);
        btn_abrir.setFocusPainted(false);
        btn_abrir.setSelected(true);
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png"))); // NOI18N
        btn_guardar.setToolTipText("Guardar");
        btn_guardar.setBorder(null);
        btn_guardar.setBorderPainted(false);
        btn_guardar.setContentAreaFilled(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_guardar_como.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar-como.png"))); // NOI18N
        btn_guardar_como.setToolTipText("Guardar como...");
        btn_guardar_como.setBorder(null);
        btn_guardar_como.setBorderPainted(false);
        btn_guardar_como.setContentAreaFilled(false);
        btn_guardar_como.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_comoActionPerformed(evt);
            }
        });

        btn_cortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cortar.png"))); // NOI18N
        btn_cortar.setToolTipText("Cortar");
        btn_cortar.setBorder(null);
        btn_cortar.setBorderPainted(false);
        btn_cortar.setContentAreaFilled(false);
        btn_cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cortarActionPerformed(evt);
            }
        });

        btn_pegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pegar.png"))); // NOI18N
        btn_pegar.setToolTipText("Pegar");
        btn_pegar.setBorder(null);
        btn_pegar.setBorderPainted(false);
        btn_pegar.setContentAreaFilled(false);
        btn_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pegarActionPerformed(evt);
            }
        });

        btn_copiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copiar1.png"))); // NOI18N
        btn_copiar.setToolTipText("Copiar");
        btn_copiar.setBorderPainted(false);
        btn_copiar.setContentAreaFilled(false);
        btn_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_copiarActionPerformed(evt);
            }
        });

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nuevo.png"))); // NOI18N
        btn_nuevo.setToolTipText("Nuevo");
        btn_nuevo.setBorder(null);
        btn_nuevo.setBorderPainted(false);
        btn_nuevo.setContentAreaFilled(false);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setToolTipText("");

        jTabbedPane2.setName(""); // NOI18N

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setToolTipText("Consola");

        TxtAreaConsola.setEditable(false);
        TxtAreaConsola.setColumns(20);
        TxtAreaConsola.setRows(5);
        TxtAreaConsola.setToolTipText("Muestra la lista de lexemas con su correspondiente token");
        jScrollPane1.setViewportView(TxtAreaConsola);

        jTabbedPane2.addTab("Consola", new javax.swing.ImageIcon(getClass().getResource("/icons/lexema-token-16.png")), jScrollPane1); // NOI18N

        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setToolTipText("Errores");

        TablaErrores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Archivo", "Línea", "Columna", "Error"
            }
        ));
        TablaErrores.setToolTipText("Muestra la lista de errores encontrados en el código");
        TablaErrores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        TablaErrores.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TablaErrores);

        jTabbedPane2.addTab("Errores", new javax.swing.ImageIcon(getClass().getResource("/icons/negativo-16.png")), jScrollPane2); // NOI18N

        jScrollPane3.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setToolTipText("Resultados");

        TxtAreaResultado.setColumns(20);
        TxtAreaResultado.setRows(5);
        jScrollPane3.setViewportView(TxtAreaResultado);
        TxtAreaResultado.getAccessibleContext().setAccessibleName("TxtAreaResultado");
        TxtAreaResultado.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane2.addTab("Resultados", new javax.swing.ImageIcon(getClass().getResource("/icons/resultados-16.png")), jScrollPane3); // NOI18N

        btn_compilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ejecutar2.png"))); // NOI18N
        btn_compilar.setToolTipText("Compilar programa");
        btn_compilar.setBorder(null);
        btn_compilar.setBorderPainted(false);
        btn_compilar.setContentAreaFilled(false);
        btn_compilar.setMaximumSize(new java.awt.Dimension(33, 33));
        btn_compilar.setMinimumSize(new java.awt.Dimension(33, 33));
        btn_compilar.setPreferredSize(new java.awt.Dimension(33, 33));
        btn_compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compilarActionPerformed(evt);
            }
        });

        btn_lexema_token.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lexema-token1.png"))); // NOI18N
        btn_lexema_token.setToolTipText("Analizador Lexicográfico");
        btn_lexema_token.setBorder(null);
        btn_lexema_token.setBorderPainted(false);
        btn_lexema_token.setContentAreaFilled(false);
        btn_lexema_token.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lexema_tokenActionPerformed(evt);
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
                        .addComponent(btn_abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guardar_como, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cortar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pegar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_lexema_token, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_compilar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_pegar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cortar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar_como, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_compilar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_lexema_token, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        BarraMenu.setBackground(new java.awt.Color(54, 54, 54));

        MenuArchivo.setText("Archivo");
        MenuArchivo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        menuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/abrir-16.png"))); // NOI18N
        menuAbrir.setText("Abrir");
        menuAbrir.setToolTipText("Abrir archivo");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        MenuArchivo.add(menuAbrir);

        menuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nuevo-16.png"))); // NOI18N
        menuNuevo.setText("Nuevo");
        menuNuevo.setToolTipText("Nuevo archivo");
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        MenuArchivo.add(menuNuevo);

        menuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        menuGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar-16.png"))); // NOI18N
        menuGuardar.setText("Guardar");
        menuGuardar.setToolTipText("Guardar el archivo actual");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        MenuArchivo.add(menuGuardar);

        menuGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar-como-16.png"))); // NOI18N
        menuGuardarComo.setText("Guardar Como...");
        menuGuardarComo.setToolTipText("Guarda el archivo actual con otro nombre");
        menuGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarComoActionPerformed(evt);
            }
        });
        MenuArchivo.add(menuGuardarComo);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salida-16.png"))); // NOI18N
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
        menuCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copiar1-16.png"))); // NOI18N
        menuCopiar.setText("Copiar");
        menuCopiar.setToolTipText("Copiar el texto seleccionado");
        menuCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCopiarActionPerformed(evt);
            }
        });
        MenuEditar.add(menuCopiar);

        menuCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cortar-16.png"))); // NOI18N
        menuCortar.setText("Cortar");
        menuCortar.setToolTipText("Cortar el texto seleccionado");
        menuCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCortarActionPerformed(evt);
            }
        });
        MenuEditar.add(menuCortar);

        menuPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        menuPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pegar-16.png"))); // NOI18N
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

        btnEjecutarLexemaToken.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        btnEjecutarLexemaToken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lexema-token-16.png"))); // NOI18N
        btnEjecutarLexemaToken.setText("Ejecutar Analizador Lexicográfico");
        btnEjecutarLexemaToken.setToolTipText("Obtiene la lista de lexemas y tokens del código");
        btnEjecutarLexemaToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarLexemaTokenActionPerformed(evt);
            }
        });
        MenuAnalizadores.add(btnEjecutarLexemaToken);

        btnEjecutarParser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        btnEjecutarParser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ejecutar1-16.png"))); // NOI18N
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

        SubMenuTemas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/colores-16.png"))); // NOI18N
        SubMenuTemas.setText("Temas");
        SubMenuTemas.setToolTipText("Cambia la apariencia del editor");

        oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bote de pintura-16.png"))); // NOI18N
        oscuro.setText("Oscuro (por defecto)");
        oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oscuroActionPerformed(evt);
            }
        });
        SubMenuTemas.add(oscuro);

        fucsia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bote de pintura-16.png"))); // NOI18N
        fucsia.setText("Fucsia");
        fucsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fucsiaActionPerformed(evt);
            }
        });
        SubMenuTemas.add(fucsia);

        verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bote de pintura-16.png"))); // NOI18N
        verde.setText("Verde");
        verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeActionPerformed(evt);
            }
        });
        SubMenuTemas.add(verde);

        ocre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bote de pintura-16.png"))); // NOI18N
        ocre.setText("Ocre");
        ocre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocreActionPerformed(evt);
            }
        });
        SubMenuTemas.add(ocre);

        aqua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bote de pintura-16.png"))); // NOI18N
        aqua.setText("Aqua");
        aqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aquaActionPerformed(evt);
            }
        });
        SubMenuTemas.add(aqua);

        azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bote de pintura-16.png"))); // NOI18N
        azul.setText("Azul");
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });
        SubMenuTemas.add(azul);

        rosado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bote de pintura-16.png"))); // NOI18N
        rosado.setText("Rosado");
        rosado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rosadoActionPerformed(evt);
            }
        });
        SubMenuTemas.add(rosado);

        cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bote de pintura-16.png"))); // NOI18N
        cafe.setText("Café");
        cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeActionPerformed(evt);
            }
        });
        SubMenuTemas.add(cafe);

        gris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bote de pintura-16.png"))); // NOI18N
        gris.setText("Gris");
        gris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grisActionPerformed(evt);
            }
        });
        SubMenuTemas.add(gris);

        olivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bote de pintura-16.png"))); // NOI18N
        olivo.setText("Olivo");
        olivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olivoActionPerformed(evt);
            }
        });
        SubMenuTemas.add(olivo);

        MenuPreferencias.add(SubMenuTemas);

        menuConfigurarParametros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/preferencias-16.png"))); // NOI18N
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
        MenuAyuda.setToolTipText("Menú de ayuda");
        MenuAyuda.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        menuAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ayuda-16.png"))); // NOI18N
        menuAyuda.setText("Ayuda");
        menuAyuda.setToolTipText("Muestra el archivo de ayuda");
        menuAyuda.setActionCommand("");
        menuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAyudaActionPerformed(evt);
            }
        });
        MenuAyuda.add(menuAyuda);

        MenuAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info-16.png"))); // NOI18N
        MenuAcercaDe.setText("Acerca de...");
        MenuAcercaDe.setToolTipText("Acerca de...");
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

    ChangeListener changeListener = (ChangeEvent e) -> {
        crearVentanaE();
    };

    private void btn_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_copiarActionPerformed
        panelesTexto.get(jTabbedPane1.getSelectedIndex()).copy();
    }//GEN-LAST:event_btn_copiarActionPerformed

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (ruta.get(jTabbedPane1.getSelectedIndex()) == null) {
            guardarComo();
        } else {
            guardarArchivo();
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_guardar_comoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_comoActionPerformed
        guardarComo();
    }//GEN-LAST:event_btn_guardar_comoActionPerformed

    private void btn_cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cortarActionPerformed
        panelesTexto.get(jTabbedPane1.getSelectedIndex()).cut();
    }//GEN-LAST:event_btn_cortarActionPerformed

    private void btn_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pegarActionPerformed
        panelesTexto.get(jTabbedPane1.getSelectedIndex()).paste();
    }//GEN-LAST:event_btn_pegarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        crearVentanaE();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        crearVentanaE();
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

    private void fucsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fucsiaActionPerformed
        BarraMenu.setBackground(new Color(136, 0, 112)); //morado oscuro
        Panel.setBackground(new Color(172, 0, 142)); //morado claro
        guardarTemaConfig(1);
    }//GEN-LAST:event_fucsiaActionPerformed

    private void aquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquaActionPerformed
        BarraMenu.setBackground(new Color(0, 109, 136)); //oscuro
        Panel.setBackground(new Color(0, 138, 172)); //claro
        guardarTemaConfig(4);
    }//GEN-LAST:event_aquaActionPerformed

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        BarraMenu.setBackground(new Color(21, 83, 136)); //azul oscuro
        Panel.setBackground(new Color(26, 104, 172)); //azul claro
        guardarTemaConfig(5);
    }//GEN-LAST:event_azulActionPerformed

    private void verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeActionPerformed
        BarraMenu.setBackground(new Color(10, 81, 64)); //oscuro
        Panel.setBackground(new Color(14, 109, 86)); //claro
        guardarTemaConfig(0);
    }//GEN-LAST:event_verdeActionPerformed

    private void ocreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocreActionPerformed
        BarraMenu.setBackground(new Color(117, 20, 20)); //oscuro
        Panel.setBackground(new Color(158, 19, 28)); //claro
        guardarTemaConfig(3);
    }//GEN-LAST:event_ocreActionPerformed

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

    private void menuConfigurarParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConfigurarParametrosActionPerformed
        configuraciones ventanita = new configuraciones();
        ventanita.setVisible(true);
    }//GEN-LAST:event_menuConfigurarParametrosActionPerformed

    private void oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oscuroActionPerformed
        BarraMenu.setBackground(new Color(54, 54, 54)); //oscuro
        Panel.setBackground(new Color(66, 66, 66)); //claro
        guardarTemaConfig(0);
    }//GEN-LAST:event_oscuroActionPerformed

    private void btnEjecutarParserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarParserActionPerformed
        ejecutarParser();
    }//GEN-LAST:event_btnEjecutarParserActionPerformed

    private void crearVentanaE() {
        int index = numTabs - 1;
        if (jTabbedPane1.getSelectedIndex() == index) {
            //System.out.print("Crear index " + String.valueOf(index) + "/");
            panelesTexto.add(new JTextPane());
            panelesTexto.get(index).setStyledDocument(new Guapiador());
            scrollTexto.add(new JScrollPane(panelesTexto.get(index)));
            TextLineNumber tln3 = new TextLineNumber(panelesTexto.get(index));
            scrollTexto.get(index).setRowHeaderView(tln3);
            jTabbedPane1.add(scrollTexto.get(index), "nuevo " + String.valueOf(index),index);
            ruta.add(null);
            
            /* Establece una pestania perzonalizada */
            jTabbedPane1.setTabComponentAt(index, new DemoCustomTab(this));
            jTabbedPane1.removeChangeListener(changeListener);
            jTabbedPane1.setSelectedIndex(index);
            jTabbedPane1.addChangeListener(changeListener);
            numTabs++;
            //System.out.println(String.valueOf(numTabs));
            /*Crea el popup menu para cada nueva pestaña*/
            menuEmergenteArchivos();
        }
    }
    
    public void removePestania(int index) {
        if(JOptionPane.showConfirmDialog(null, "Esta seguro que desea cerrar la pestania") ==0){
            //System.out.println("elimin index " + String.valueOf(index));
            jTabbedPane1.remove(index);
            //System.out.println("a");
            //jTabbedPane1.remove(scrollTexto.get(index));
            scrollTexto.remove(index);
            //System.out.println("b");
            panelesTexto.remove(index);
            //System.out.println("a");
            //jTabbedPane1.remove(index);
            ruta.remove(index);

            numTabs--;
            //System.out.println(String.valueOf(numTabs));
            if (index == numTabs - 1 && index > 0) {
                jTabbedPane1.setSelectedIndex(numTabs - 2);
            } else {
                jTabbedPane1.setSelectedIndex(index);
            }

            if (numTabs == 1) {
                crearVentanaE();
            }
        }
    }
    

    private void btn_compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compilarActionPerformed
        ejecutarParser();
    }//GEN-LAST:event_btn_compilarActionPerformed

    private void MenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcercaDeActionPerformed
        AcercaDe acercad = new AcercaDe();
        acercad.setVisible(true);
    }//GEN-LAST:event_MenuAcercaDeActionPerformed

    private void rosadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rosadoActionPerformed
        BarraMenu.setBackground(new Color(203, 78, 145)); //oscuro
        Panel.setBackground(new Color(207, 110, 164)); //claro
        guardarTemaConfig(6);
    }//GEN-LAST:event_rosadoActionPerformed

    private void cafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeActionPerformed
        BarraMenu.setBackground(new Color(87, 68, 53)); //oscuro
        Panel.setBackground(new Color(111, 86, 65)); //claro
        guardarTemaConfig(7);
    }//GEN-LAST:event_cafeActionPerformed

    private void grisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grisActionPerformed
        BarraMenu.setBackground(new Color(150, 150, 150)); //oscuro
        Panel.setBackground(new Color(196, 196, 196)); //claro
        guardarTemaConfig(8);
    }//GEN-LAST:event_grisActionPerformed

    private void olivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olivoActionPerformed
        BarraMenu.setBackground(new Color(43, 73, 39)); //oscuro
        Panel.setBackground(new Color(92, 99, 29)); //claro
        guardarTemaConfig(9);
    }//GEN-LAST:event_olivoActionPerformed

    private void btn_lexema_tokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lexema_tokenActionPerformed
        ejecutarAnalizadorLexicografico();
    }//GEN-LAST:event_btn_lexema_tokenActionPerformed

    private void btnEjecutarLexemaTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarLexemaTokenActionPerformed
        ejecutarAnalizadorLexicografico();
    }//GEN-LAST:event_btnEjecutarLexemaTokenActionPerformed
/*
   /* 
    //****************************************************************************************
    //coloreo de linea de error
      public void PintarLineaConError(JTextPane txt, int i) throws BadLocationException{
        int TotalLineas = txt.getText().split("\n").length;
        int totalCaracteres = 0;
        int indexLine = 1;
        
        String[] lines = txt.getText().split("\\n");

        while(indexLine<=TotalLineas){
        
        int fin = lines[indexLine-1].length() + totalCaracteres;
        
            if(i==indexLine){
                DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
                txt.getHighlighter().addHighlight(fin-lines[indexLine-1].length(), fin, highlightPainter);
            }
            
            
            
            //DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
            
            
            
            totalCaracteres = fin+1;
            indexLine++;
        }
    }
    */

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
                ruta.set(jTabbedPane1.getSelectedIndex(), seleccionado.getSelectedFile().getAbsolutePath());
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
            crearVentanaE();
        }

        if (seleccionado.showDialog(this, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("acl")) {
                    String contenido = gestion.abrirTexto(archivo);
                    //System.out.printf("%i\n", jTabbedPane1.getSelectedIndex());
                    panelesTexto.get(jTabbedPane1.getSelectedIndex()).setText(contenido);
                    ruta.add(jTabbedPane1.getSelectedIndex(), seleccionado.getSelectedFile().getAbsolutePath());
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

    private void nuevoArchivo() {
        if (!(panelesTexto.get(jTabbedPane1.getSelectedIndex()).getText().equals("")) || archivo != null) {
            if (((JOptionPane.showConfirmDialog(null, "¿Desea utilizar una nueva hoja de trabajo? \n\t Si acepta se borraran todos los cambios sin guardar")) == 0)) {
                archivo = null;
                panelesTexto.get(jTabbedPane1.getSelectedIndex()).setText("");
                jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(), "nuevo(" + jTabbedPane1.getSelectedIndex() + ")");
                ruta.remove(jTabbedPane1.getSelectedIndex());
            }
        }
    }

    private void ejecutarParser() {
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
            for (String respuesta1 : respuesta) {
                System.out.println(respuesta1);
                modelo.addRow((Object[]) respuesta1.split(","));
            }
        }
        jTabbedPane2.setSelectedIndex(1);
    }

    private void ejecutarAnalizadorLexicografico() {
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
    }

    private void establecerTemaConfig() {
        int[] parametros = {1024, 1024, 20, 150, 1024, 123456, 99999, 0};
        try {
            String cadena;
            FileReader f;
            f = new FileReader("/opt/armus/setings.txt");
            BufferedReader b = new BufferedReader(f);
            int i = 0;
            while ((cadena = b.readLine()) != null) {
                parametros[i] = Integer.parseInt(cadena);
                i++;
            }
            b.close();
        } catch (FileNotFoundException ex) {
            String sFichero = "/opt/armus/setings.txt";
            File fichero = new File(sFichero);

            if (!fichero.exists()) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
                    bw.write("1024\n1024\n20\n150\n1024\n123456\n99999\n0\n");
                    bw.close();
                } catch (IOException ex1) {
                    JOptionPane.showMessageDialog(null, "Por favor revisa tus "
                            + "permisos sobre el directorio /opt/armus y sus archivos", "Error de escritura", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(configuraciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch (parametros[7]) {
            case 0:
                BarraMenu.setBackground(new Color(54, 54, 54)); //oscuro
                Panel.setBackground(new Color(66, 66, 66)); //claro
                break;
            case 1:
                BarraMenu.setBackground(new Color(136, 0, 112)); //morado oscuro
                Panel.setBackground(new Color(172, 0, 142)); //morado claro
                break;
            case 2:
                BarraMenu.setBackground(new Color(10, 81, 64)); //oscuro
                Panel.setBackground(new Color(14, 109, 86)); //claro
                break;
            case 3:
                BarraMenu.setBackground(new Color(117, 20, 20)); //oscuro
                Panel.setBackground(new Color(158, 19, 28)); //claro
                break;
            case 4:
                BarraMenu.setBackground(new Color(0, 109, 136)); //oscuro
                Panel.setBackground(new Color(0, 138, 172)); //claro
                break;
            case 5:
                BarraMenu.setBackground(new Color(21, 83, 136)); //azul oscuro
                Panel.setBackground(new Color(26, 104, 172)); //azul claro
                break;
            case 6:
                BarraMenu.setBackground(new Color(203, 78, 145)); //oscuro
                Panel.setBackground(new Color(207, 110, 164)); //claro
                break;
            case 7:
                BarraMenu.setBackground(new Color(87, 68, 53)); //oscuro
                Panel.setBackground(new Color(111, 86, 65)); //claro
                break;
            case 8:
                BarraMenu.setBackground(new Color(150, 150, 150)); //oscuro
                Panel.setBackground(new Color(196, 196, 196)); //claro
                break;
            case 9:
                BarraMenu.setBackground(new Color(43, 73, 39)); //oscuro
                Panel.setBackground(new Color(92, 99, 29)); //claro
                break;
        }
    }

    private void guardarTemaConfig(int tema) {
        String sFichero = "/opt/armus/setings.txt";
        int[] parametros = {1024, 1024, 20, 150, 1024, 123456, 99999, 0};
        try {
            //Lee el archivo de configuración y almacena los parametros
            String cadena;
            FileReader f;
            f = new FileReader("/opt/armus/setings.txt");
            try (BufferedReader b = new BufferedReader(f)) {
                int i = 0;
                while ((cadena = b.readLine()) != null) {
                    parametros[i] = Integer.parseInt(cadena);
                    i++;
                }
            }

            try ( //guarda la configuración asignada
                    BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero))) {
                bw.write(Integer.toString(parametros[0]) + "\n"
                        + Integer.toString(parametros[1]) + "\n"
                        + Integer.toString(parametros[2]) + "\n"
                        + Integer.toString(parametros[3]) + "\n"
                        + Integer.toString(parametros[4]) + "\n"
                        + Integer.toString(parametros[5]) + "\n"
                        + Integer.toString(parametros[6]) + "\n"
                        + Integer.toString(tema) + "\n");
            }
        } catch (IOException ex1) {
            JOptionPane.showMessageDialog(null, "Porvafor revisa tus "
                    + "permisos sobre el directorio /opt/armus y sus archivos",
                    "Error de escritura", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void menuEmergenteArchivos() {
        /*Crea el popup menu para cada nueva pestaña*/
        JPopupMenu menupp = new JPopupMenu();
        JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon(getClass().getResource("/icons/cortar-16.png")));
        JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon(getClass().getResource("/icons/copiar1-16.png")));
        JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon(getClass().getResource("/icons/pegar-16.png")));
        menupp.add(copiar);
        menupp.add(cortar);
        menupp.add(pegar);
        copiar.addActionListener((ActionEvent ae) -> {
            panelesTexto.get(jTabbedPane1.getSelectedIndex()).copy();
        });
        cortar.addActionListener((ActionEvent ae) -> {
            panelesTexto.get(jTabbedPane1.getSelectedIndex()).cut();
        });
        pegar.addActionListener((ActionEvent ae) -> {
            panelesTexto.get(jTabbedPane1.getSelectedIndex()).paste();
        });
        panelesTexto.get(jTabbedPane1.getSelectedIndex()).setComponentPopupMenu(menupp);
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
    private javax.swing.JMenuItem aqua;
    private javax.swing.JMenuItem azul;
    private javax.swing.JMenuItem btnEjecutarLexemaToken;
    private javax.swing.JMenuItem btnEjecutarParser;
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_compilar;
    private javax.swing.JButton btn_copiar;
    private javax.swing.JButton btn_cortar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar_como;
    private javax.swing.JButton btn_lexema_token;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_pegar;
    private javax.swing.JMenuItem cafe;
    private javax.swing.JMenuItem fucsia;
    private javax.swing.JMenuItem gris;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuAyuda;
    private javax.swing.JMenuItem menuConfigurarParametros;
    private javax.swing.JMenuItem menuCopiar;
    private javax.swing.JMenuItem menuCortar;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuGuardarComo;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JMenuItem menuPegar;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem ocre;
    private javax.swing.JMenuItem olivo;
    private javax.swing.JMenuItem oscuro;
    private javax.swing.JMenuItem rosado;
    private javax.swing.JMenuItem verde;
    // End of variables declaration//GEN-END:variables

   ArrayList  <JTextPane> panelesTexto = new ArrayList <>();
   ArrayList  <JScrollPane> scrollTexto = new ArrayList <>();
}
