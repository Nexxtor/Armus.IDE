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
        txtlinea.setText(parametros[0] + "");
        txtId.setText(parametros[1] + "");
        txtDigito.setText(parametros[2] + "");
        txtFile.setText(parametros[3] + "");
        txtNameFile.setText(parametros[4] + "");
        txtCadena.setText(parametros[5] + "");
        txtSizeArchivo.setText(parametros[6] + "");
    }

    private boolean validarEntero(String valore) {
        int numerito = 0;
        try {
            numerito = Integer.parseInt(valore);
            if (numerito >= 0) {
                return true;
            } else {
                return false;
            }

        } catch (NumberFormatException e) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtlinea = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtDigito = new javax.swing.JTextField();
        txtFile = new javax.swing.JTextField();
        txtNameFile = new javax.swing.JTextField();
        txtCadena = new javax.swing.JTextField();
        txtSizeArchivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(578, 344));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Máximo de líneas:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Longitud máxima para identificadores:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad máxima de dígitos:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número máximo de archivos a incluir:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Longitud máxima de la ruta para archivos:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Longitud máxima de cadena:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("*Tamaño máximo de archivo:");

        txtlinea.setBackground(new java.awt.Color(240, 240, 240));
        txtlinea.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtlinea.setBorder(null);
        txtlinea.setPreferredSize(new java.awt.Dimension(15, 30));

        txtId.setBackground(new java.awt.Color(240, 240, 240));
        txtId.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtId.setBorder(null);

        txtDigito.setBackground(new java.awt.Color(240, 240, 240));
        txtDigito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDigito.setBorder(null);

        txtFile.setBackground(new java.awt.Color(240, 240, 240));
        txtFile.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFile.setBorder(null);

        txtNameFile.setBackground(new java.awt.Color(240, 240, 240));
        txtNameFile.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNameFile.setBorder(null);

        txtCadena.setBackground(new java.awt.Color(240, 240, 240));
        txtCadena.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCadena.setBorder(null);

        txtSizeArchivo.setBackground(new java.awt.Color(240, 240, 240));
        txtSizeArchivo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSizeArchivo.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlinea, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNameFile, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSizeArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtlinea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameFile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSizeArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCadena, txtDigito, txtFile, txtId, txtNameFile, txtSizeArchivo, txtlinea});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sFichero = "/opt/armus/setings.txt";

        if (validarEntero(txtlinea.getText()) == true && validarEntero(txtId.getText()) == true && validarEntero(txtDigito.getText()) == true && validarEntero(txtFile.getText()) == true && validarEntero(txtNameFile.getText()) == true && validarEntero(txtCadena.getText()) == true && validarEntero(txtSizeArchivo.getText()) == true) {
            if (Integer.parseInt(txtlinea.getText()) >= 30 && Integer.parseInt(txtId.getText()) >= 30 && Integer.parseInt(txtDigito.getText()) >= 30 && Integer.parseInt(txtFile.getText()) >= 30 && Integer.parseInt(txtNameFile.getText()) >= 30 && Integer.parseInt(txtCadena.getText()) >= 30 && Integer.parseInt(txtSizeArchivo.getText()) >= 30) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
                    bw.write(txtlinea.getText() + "\n"
                            + txtId.getText() + "\n"
                            + txtDigito.getText() + "\n"
                            + txtFile.getText() + "\n"
                            + txtNameFile.getText() + "\n"
                            + txtCadena.getText() + "\n"
                            + txtSizeArchivo.getText() + "\n");

                    bw.close();
                } catch (IOException ex1) {
                    JOptionPane.showMessageDialog(null, "Porvafor revisa tus "
                            + "permisos sobre el directorio /opt/armus y sus archivos", "Error de escritura", JOptionPane.ERROR_MESSAGE);
                }

                JOptionPane.showMessageDialog(null, "Se guardo correctamente");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Los parametros no cumplen con el valor minimo establecido. \nMinimo establecido = 30");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los campos deben ser numeros enteros positivos");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCadena;
    private javax.swing.JTextField txtDigito;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNameFile;
    private javax.swing.JTextField txtSizeArchivo;
    private javax.swing.JTextField txtlinea;
    // End of variables declaration//GEN-END:variables
}
