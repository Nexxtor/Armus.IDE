/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armus.ide.gui;
import java.io.File;
import javax.swing.JFileChooser;
import armus.ide.utilites.manejoArchivos;
import javax.swing.*;

/**
 *
 * @author stefa_000
 */
public class IDE_Armus extends javax.swing.JFrame {
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    manejoArchivos gestion = new manejoArchivos();
    String ruta = "";
    
    
    public IDE_Armus() {
        initComponents();
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
        ScrollPanel = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarComo = new javax.swing.JButton();
        btnCortar = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        menuNuevo = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        menuGuardarComo = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuCopiar = new javax.swing.JMenuItem();
        menuCortar = new javax.swing.JMenuItem();
        menuPegar = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();

        jMenu11.setText("jMenu11");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Armus");
        setMinimumSize(new java.awt.Dimension(500, 300));

        Panel.setBackground(new java.awt.Color(51, 51, 51));

        TxtArea.setBackground(new java.awt.Color(250, 222, 255));
        TxtArea.setColumns(20);
        TxtArea.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        TxtArea.setRows(5);
        TxtArea.setTabSize(4);
        TxtArea.setBorder(null);
        ScrollPanel.setViewportView(TxtArea);

        btnAbrir.setText("A");
        btnAbrir.setToolTipText("");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setText("G");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnGuardarComo.setText("GC");
        btnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComoActionPerformed(evt);
            }
        });

        btnCortar.setText("C");
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });

        btnPegar.setText("P");
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });

        btnCopiar.setText("Cp");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnNuevo.setText("N");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPanel)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
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
                        .addGap(0, 956, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraMenu.setBackground(new java.awt.Color(255, 255, 255));

        jMenu3.setText("Archivo");
        jMenu3.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N

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
        jMenu1.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N

        jMenu5.setText("Configurar Vista");

        jMenuItem3.setText("jMenuItem3");
        jMenu5.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("jMenuItem7");
        jMenu5.add(jMenuItem7);

        jMenu1.add(jMenu5);

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

        MenuAyuda.setText("Analizador Lexicográfico");
        MenuAyuda.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N

        jMenu13.setText("Ejecutar Analizador Lexicográfico");
        MenuAyuda.add(jMenu13);

        jMenu14.setText("Configurar Parametros");
        MenuAyuda.add(jMenu14);

        BarraMenu.add(MenuAyuda);

        jMenu12.setText("Ayuda");
        jMenu12.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        BarraMenu.add(jMenu12);

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
        TxtArea.copy();     
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        /*JFileChooser dialogo = new JFileChooser(); //creo objeto filechooser
        int ventanaDialogo = dialogo.showOpenDialog(this); // abro la ventana del dialogo
        if(ventanaDialogo == JFileChooser.APPROVE_OPTION){ //si hace click en el boton abrir del dialogo
            String rutaNombreArchivo = dialogo.getSelectedFile().getPath();
            String NombreArchivo = dialogo.getSelectedFile().getName();
        }*/
        
        if(seleccionado.showDialog(this, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("acl")){
                    String contenido = gestion.abrirTexto(archivo);
                    TxtArea.setText(contenido);  
                    ruta = seleccionado.getSelectedFile().getAbsolutePath();
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo .txt");
                }
            }
        }
        
        
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(archivo != null){
            String contenido = TxtArea.getText();
                String respuesta = gestion.guardarTexto(archivo, contenido);
                if(respuesta != null){
                    JOptionPane.showMessageDialog(null, respuesta);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar el texto");
                }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione la opcion guardar como ");
        }
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComoActionPerformed
        if(seleccionado.showDialog(null, "Guardar Texto") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.getName().endsWith("acl")){
                String contenido = TxtArea.getText();
                String respuesta = gestion.guardarTexto(archivo, contenido);
                ruta = seleccionado.getSelectedFile().getAbsolutePath();
                if(respuesta != null){
                    JOptionPane.showMessageDialog(null, respuesta);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar el texto");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El texto se debe guardar con extencion .txt");
            }
            
        }
    }//GEN-LAST:event_btnGuardarComoActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        TxtArea.cut();
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        TxtArea.paste();
    }//GEN-LAST:event_btnPegarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
       /* manejoArchivos archivoN = new manejoArchivos();
        archivoN.crear();*/
       
       if(!(TxtArea.getText().equals("")) || archivo != null){
            if(((JOptionPane.showConfirmDialog(null, "Desea utilizar una nueva hoja de trabajo? \n\t Si acepta se borrara todos los cambios sin guardar")) == 0)){
             archivo = null;
             TxtArea.setText("");
            }
      }  
         
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        if(seleccionado.showDialog(this, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("acl")){
                    String contenido = gestion.abrirTexto(archivo);
                    TxtArea.setText(contenido); 
                    ruta = seleccionado.getSelectedFile().getAbsolutePath();
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo .txt");
                }
            }
        }
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
    if(archivo != null){
            String contenido = TxtArea.getText();
                String respuesta = gestion.guardarTexto(archivo, contenido);
                if(respuesta != null){
                    JOptionPane.showMessageDialog(null, respuesta);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar el texto");
                }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione la opcion guardar como ");
        }     
    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarComoActionPerformed
        
        if(seleccionado.showDialog(null, "Guardar Texto") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.getName().endsWith("acl")){
                String contenido = TxtArea.getText();
                String respuesta = gestion.guardarTexto(archivo, contenido);
                ruta = seleccionado.getSelectedFile().getAbsolutePath();
                if(respuesta != null){
                    JOptionPane.showMessageDialog(null, respuesta);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar el texto");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El texto se debe guardar con extencion .txt");
            }
            
        }
    }//GEN-LAST:event_menuGuardarComoActionPerformed

    private void menuCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCopiarActionPerformed
        TxtArea.copy();
    }//GEN-LAST:event_menuCopiarActionPerformed

    private void menuCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCortarActionPerformed
        TxtArea.cut();
    }//GEN-LAST:event_menuCortarActionPerformed

    private void menuPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPegarActionPerformed
        TxtArea.paste();
    }//GEN-LAST:event_menuPegarActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        
        if(JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?") == 0){
            System.exit(0);
        }  
    }//GEN-LAST:event_menuSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JPanel Panel;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JTextArea TxtArea;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarComo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPegar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuCopiar;
    private javax.swing.JMenuItem menuCortar;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuGuardarComo;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JMenuItem menuPegar;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}
