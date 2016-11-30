package armus.ide.gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class configuraciones extends javax.swing.JFrame {

    public configuraciones() {
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        obtenerValoresParametros();
    }

    private void obtenerValoresParametros() {
        int[] parametros = {1024, 1024, 20, 150, 1024, 123456, 99999};
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
                    bw.write("1024\n1024\n20\n150\n1024\n123456\n99999\n");
                    bw.close();
                } catch (IOException ex1) {
                    JOptionPane.showMessageDialog(null, "Por favor revisa tus "
                            + "permisos sobre el directorio /opt/armus y sus archivos", "Error de escritura", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(configuraciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        sp_linea.setValue(parametros[0]);
        sp_id.setValue(parametros[1]);
        sp_digito.setValue(parametros[2]);
        sp_file.setValue(parametros[3]);
        sp_namefile.setValue(parametros[4]);
        sp_cadena.setValue(parametros[5]);
        sp_sizearchivo.setValue(parametros[6]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sp_linea = new javax.swing.JSpinner();
        sp_id = new javax.swing.JSpinner();
        sp_digito = new javax.swing.JSpinner();
        sp_file = new javax.swing.JSpinner();
        sp_namefile = new javax.swing.JSpinner();
        sp_cadena = new javax.swing.JSpinner();
        sp_sizearchivo = new javax.swing.JSpinner();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONFIGURACIÓN");
        setPreferredSize(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(412, 353));

        btn_Guardar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_Guardar.setText("Guardar");
        btn_Guardar.setBorder(null);
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Máximo de líneas:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Longitud máxima para identificadores:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad máxima de dígitos:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número máximo de archivos a incluir:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Longitud máxima de la ruta para archivos:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Longitud máxima de cadena:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tamaño máximo de archivo:");

        sp_linea.setModel(new javax.swing.SpinnerNumberModel(1024, 30, null, 1));
        sp_linea.setEditor(new javax.swing.JSpinner.NumberEditor(sp_linea, ""));

        sp_id.setModel(new javax.swing.SpinnerNumberModel(1024, 30, null, 1));
        sp_id.setEditor(new javax.swing.JSpinner.NumberEditor(sp_id, ""));

        sp_digito.setModel(new javax.swing.SpinnerNumberModel(20, 10, null, 1));
        sp_digito.setEditor(new javax.swing.JSpinner.NumberEditor(sp_digito, ""));

        sp_file.setModel(new javax.swing.SpinnerNumberModel(150, 30, null, 1));
        sp_file.setEditor(new javax.swing.JSpinner.NumberEditor(sp_file, ""));

        sp_namefile.setModel(new javax.swing.SpinnerNumberModel(11264, 30, null, 1));
        sp_namefile.setEditor(new javax.swing.JSpinner.NumberEditor(sp_namefile, ""));

        sp_cadena.setModel(new javax.swing.SpinnerNumberModel(1024, 30, null, 1));
        sp_cadena.setEditor(new javax.swing.JSpinner.NumberEditor(sp_cadena, ""));

        sp_sizearchivo.setModel(new javax.swing.SpinnerNumberModel(999, 30, null, 1));
        sp_sizearchivo.setEditor(new javax.swing.JSpinner.NumberEditor(sp_sizearchivo, ""));

        btn_cerrar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_sizearchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_cadena, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_file, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_digito, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_linea, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_namefile, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sp_linea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sp_digito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sp_file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sp_namefile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sp_cadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sp_sizearchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        String sFichero = "/opt/armus/setings.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
            bw.write(sp_linea.getValue().toString() + "\n"
                    + sp_id.getValue().toString() + "\n"
                    + sp_digito.getValue().toString() + "\n"
                    + sp_file.getValue().toString() + "\n"
                    + sp_namefile.getValue().toString() + "\n"
                    + sp_cadena.getValue().toString() + "\n"
                    + sp_sizearchivo.getValue().toString() + "\n");
            bw.close();
        } catch (IOException ex1) {
            JOptionPane.showMessageDialog(null, "Porvafor revisa tus "
                    + "permisos sobre el directorio /opt/armus y sus archivos",
                    "Error de escritura", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Se guardo correctamente");
        this.dispose();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner sp_cadena;
    private javax.swing.JSpinner sp_digito;
    private javax.swing.JSpinner sp_file;
    private javax.swing.JSpinner sp_id;
    private javax.swing.JSpinner sp_linea;
    private javax.swing.JSpinner sp_namefile;
    private javax.swing.JSpinner sp_sizearchivo;
    // End of variables declaration//GEN-END:variables
}
