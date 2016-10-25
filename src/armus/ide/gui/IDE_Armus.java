/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.swing.text.*;
/**
 *
 * @author stefa_000
 */
public class IDE_Armus extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    manejoArchivos gestion = new manejoArchivos();
    String ruta = "";
    //***************************************************************************
    private int findLastNonWordChar (String text, int index) {
        while (--index >= 0) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
        }
        return index;
    }

    private int findFirstNonWordChar (String text, int index) {
        while (index < text.length()) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
            index++;
        }
        return index;
    }
    //***************************************************************************
    public IDE_Armus() {
        initComponents();
        initTextLineNumber();//inicializa complemento enumerado de lineas de codigo fuente
        //***************************************************************************
      final StyleContext cont = StyleContext.getDefaultStyleContext();
        final AttributeSet attr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLUE);
        final SimpleAttributeSet sas = new SimpleAttributeSet(); 
        StyleConstants.setBold(sas, true);
        final AttributeSet attrBlack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);
        DefaultStyledDocument doc = new DefaultStyledDocument() {
            public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
                super.insertString(offset, str, a);

                String text = getText(0, getLength());
                int before = findLastNonWordChar(text, offset);
                if (before < 0) before = 0;
                int after = findFirstNonWordChar(text, offset + str.length());
                int wordL = before;
                int wordR = before;

                while (wordR <= after) {
                    if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
                        if (text.substring(wordL, wordR).matches("(\\W)*(entero|byte|real|vacio|booleano|cadena|caracter|Objeto|Archivo|si|sino|probar|caso|defecto|romper|mientras|para|hacer|para_cada|Sistema|obtenerEntero|obtenerReal|\n" +
"obtenerCadena|obtenerCaracter|mostrar|publica|privada|retornar|Arreglo|agregar|obtener|cuantos|quitar|abrir|leerLinea|volcado|cerrar|concatenar|parteEntera|comparar|\n" +
"mayor|menor|esPar|decimalBin|pontencia|absoluto|modulo|longitudCadena|clase|incluir|verdadero|false|obtenerBooleano)")){
                            setCharacterAttributes(wordL, wordR - wordL, sas, false);
                            setCharacterAttributes(wordL, wordR - wordL, attr, false);
                        }else
                            setCharacterAttributes(wordL, wordR - wordL, attrBlack, false);
                        wordL = wordR;
                    }
                    wordR++;
                }
            }

            public void remove (int offs, int len) throws BadLocationException {
                super.remove(offs, len);

                String text = getText(0, getLength());
                int before = findLastNonWordChar(text, offs);
                if (before < 0) before = 0;
                int after = findFirstNonWordChar(text, offs);

                if (text.substring(before, after).matches("(\\W)*(entero|byte|real|vacio|booleano|cadena|caracter|Objeto|Archivo|si|sino|probar|caso|defecto|romper|mientras|para|hacer|para_cada|Sistema|obtenerEntero|obtenerReal|\n" +
"obtenerCadena|obtenerCaracter|mostrar|publica|privada|retornar|Arreglo|agregar|obtener|cuantos|quitar|abrir|leerLinea|volcado|cerrar|concatenar|parteEntera|comparar|\n" +
"mayor|menor|esPar|decimalBin|pontencia|absoluto|modulo|longitudCadena|clase|incluir|verdadero|false|obtenerBooleano)")) {
                    setCharacterAttributes(before, after - before, sas, false);
                    setCharacterAttributes(before, after - before, attr, false);
                } else {
                    setCharacterAttributes(before, after - before, attrBlack, false);
                }
            }
        };
        jTextPane1.setStyledDocument(doc);
        setVisible(true);
        //***************************************************************************
        try { //agrega un icono para la aplicación
            setIconImage(new ImageIcon("/opt/armus/Logo.png").getImage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }

    }
    public  void initTextLineNumber(){
        
       TextLineNumber tln = new TextLineNumber(jTextPane1); 
       jScrollPane2.setRowHeaderView(tln);
}
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        ScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaConsola = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
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

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new-file.png"))); // NOI18N
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        TxtAreaConsola.setEditable(false);
        TxtAreaConsola.setColumns(20);
        TxtAreaConsola.setRows(5);
        TxtAreaConsola.setToolTipText("");
        ScrollPane1.setViewportView(TxtAreaConsola);

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
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
                        .addComponent(btnCopiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addGap(0, 472, Short.MAX_VALUE))
                    .addComponent(ScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPegar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCortar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
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

        menuCopiar.setText("Copiar");
        menuCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCopiarActionPerformed(evt);
            }
        });
        jMenu1.add(menuCopiar);

        menuCortar.setText("Cortar");
        menuCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCortarActionPerformed(evt);
            }
        });
        jMenu1.add(menuCortar);

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
        jTextPane1.copy();
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
        if (archivo == null) {
            guardarComo();
        } else {
            guardarArchivo();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComoActionPerformed
        guardarComo();
    }//GEN-LAST:event_btnGuardarComoActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        jTextPane1.cut();
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        jTextPane1.paste();
    }//GEN-LAST:event_btnPegarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        /* manejoArchivos archivoN = new manejoArchivos();
        archivoN.crear();*/

        if (!(jTextPane1.getText().equals("")) || archivo != null) {
            if (((JOptionPane.showConfirmDialog(null, "Desea utilizar una nueva hoja de trabajo? \n\t Si acepta se borrara todos los cambios sin guardar")) == 0)) {
                archivo = null;
                jTextPane1.setText("");
            }
        }

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        if (archivo == null) {
            guardarComo();
        } else {
            guardarArchivo();
        }

    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarComoActionPerformed
        guardarComo();
    }//GEN-LAST:event_menuGuardarComoActionPerformed

    private void menuCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCopiarActionPerformed
        jTextPane1.copy();
    }//GEN-LAST:event_menuCopiarActionPerformed

    private void menuCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCortarActionPerformed
        jTextPane1.cut();
    }//GEN-LAST:event_menuCortarActionPerformed

    private void menuPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPegarActionPerformed
        jTextPane1.paste();
    }//GEN-LAST:event_menuPegarActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        salir();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor1ActionPerformed
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        jTextPane1.setFont(font);
        jTextPane1.setForeground(new Color(228, 114, 210));
        jTextPane1.setBackground(new Color(255,255,255));
        Panel.setBackground(new Color(231, 81, 166));
        BarraMenu.setBackground(new Color(250, 145, 204));
    }//GEN-LAST:event_menuColor1ActionPerformed

    private void menuColor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor5ActionPerformed
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        jTextPane1.setFont(font);
        jTextPane1.setForeground(new Color(218, 141, 70));
        jTextPane1.setBackground(new Color(255,255,255));
        Panel.setBackground(new Color(53, 202, 192));
        BarraMenu.setBackground(new Color(121, 229, 222));
    }//GEN-LAST:event_menuColor5ActionPerformed

    private void menuColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor2ActionPerformed
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        jTextPane1.setFont(font);
        jTextPane1.setForeground(new Color(102, 110, 222));
        jTextPane1.setBackground(new Color(255,255,255));
        Panel.setBackground(new Color(53, 106, 180));
        BarraMenu.setBackground(new Color(88, 138, 208));
    }//GEN-LAST:event_menuColor2ActionPerformed

    private void menuColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor3ActionPerformed
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        jTextPane1.setFont(font);
        jTextPane1.setForeground(new Color(100, 198, 125));
        jTextPane1.setBackground(new Color(255,255,255));
        Panel.setBackground(new Color(35, 170, 53));
        BarraMenu.setBackground(new Color(106, 223, 122));
    }//GEN-LAST:event_menuColor3ActionPerformed

    private void menuColor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColor4ActionPerformed
        Font font = new Font("Lucida Sans Unicode", Font.BOLD, 14);
        jTextPane1.setFont(font);
        jTextPane1.setForeground(new Color(208, 67, 67));
        jTextPane1.setBackground(new Color(255,255,255));
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
           
                String contenido = jTextPane1.getText();
                String respuesta = gestion.guardarTexto(archivo, contenido);
                if (respuesta == null) {
                    JOptionPane.showMessageDialog(null, "Error al guardar el texto");
                }
        }
            try {
                Scanner scanner = new Scanner();
                String[] listaArchivos = scanner.lsFiles(ruta);
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
        jTextPane1.setFont(font);
        jTextPane1.setForeground(new Color(228, 114, 210));
        jTextPane1.setBackground(new Color(255,255,255));
        Panel.setBackground(new Color(26,115,126));
        BarraMenu.setBackground(new Color(250, 145, 204));
    }//GEN-LAST:event_estandarTemaActionPerformed

    private void btnEjecutarParserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarParserActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnEjecutarParserActionPerformed
    private void guardarArchivo() {
        if (archivo != null) {
            String contenido = jTextPane1.getText();
            String respuesta = gestion.guardarTexto(archivo, contenido);
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
                String contenido = jTextPane1.getText();
                String respuesta = gestion.guardarTexto(archivo, contenido);
                ruta = seleccionado.getSelectedFile().getAbsolutePath();
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
        if (seleccionado.showDialog(this, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("acl")) {
                    String contenido = gestion.abrirTexto(archivo);
                    jTextPane1.setText(contenido);
                    ruta = seleccionado.getSelectedFile().getAbsolutePath();
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
    private javax.swing.JButton btnCopiar;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
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
}
