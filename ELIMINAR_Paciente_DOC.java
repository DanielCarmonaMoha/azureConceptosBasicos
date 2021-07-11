
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ELIMINAR_Paciente_DOC extends javax.swing.JFrame {

    conexion conexion = new conexion();
    FileInputStream fis;
    int longitudBytes;

    Connection cn;
    Statement st;
    ResultSet rs;
    
    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");


    public ELIMINAR_Paciente_DOC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCabecera = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblCabecera = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        IDPaciente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtIDPaciente = new javax.swing.JTextField();
        cbxTipoDocumento = new javax.swing.JComboBox<>();
        lblDocumento = new javax.swing.JLabel();
        lblImagenPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PanelCabecera.setBackground(new java.awt.Color(0, 102, 153));
        PanelCabecera.setForeground(new java.awt.Color(0, 102, 153));
        PanelCabecera.setLayout(null);

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        PanelCabecera.add(btnCancelar);
        btnCancelar.setBounds(40, 900, 200, 50);

        lblTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Clinica Maria");
        PanelCabecera.add(lblTitulo);
        lblTitulo.setBounds(30, 200, 210, 44);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        PanelCabecera.add(lblImagen);
        lblImagen.setBounds(70, 50, 128, 130);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\Cabecera.jpg")); // NOI18N
        PanelCabecera.add(lblCabecera);
        lblCabecera.setBounds(0, 0, 275, 1080);

        getContentPane().add(PanelCabecera);
        PanelCabecera.setBounds(0, 0, 275, 1080);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 102, 153));
        lblSubtitulo.setText("Eliminar Documentos de Pacientes");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(450, 70, 570, 40);

        IDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        IDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        IDPaciente.setText("ID PACIENTE:");
        getContentPane().add(IDPaciente);
        IDPaciente.setBounds(360, 240, 150, 29);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("TIPO DE DOCUMENTO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 370, 250, 29);

        btnEliminar.setBackground(new java.awt.Color(51, 153, 0));
        btnEliminar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(640, 500, 300, 40);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(640, 230, 300, 40);

        cbxTipoDocumento.setBackground(new java.awt.Color(255, 255, 255));
        cbxTipoDocumento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxTipoDocumento.setForeground(new java.awt.Color(0, 0, 0));
        cbxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTA DE NACIMIENTO", "CURP", "INE" }));
        cbxTipoDocumento.setSelectedIndex(-1);
        cbxTipoDocumento.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTipoDocumento);
        cbxTipoDocumento.setBounds(640, 360, 300, 40);

        lblDocumento.setText("jLabel1");
        lblDocumento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 2));
        getContentPane().add(lblDocumento);
        lblDocumento.setBounds(1110, 50, 750, 975);

        lblImagenPaciente.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\paciente (1).png")); // NOI18N
        getContentPane().add(lblImagenPaciente);
        lblImagenPaciente.setBounds(360, 50, 70, 80);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoDocumentoActionPerformed
        String sqlacta = "SELECT acta_nacimiento FROM MARIA.PACIENTE_DOC WHERE pk_idPaciente = '" + txtIDPaciente.getText() + "'";
        String sqlcurp = "SELECT curp FROM MARIA.PACIENTE_DOC WHERE pk_idPaciente = '" + txtIDPaciente.getText() + "'";
        String sqline = "SELECT ine FROM MARIA.PACIENTE_DOC WHERE pk_idPaciente = '" + txtIDPaciente.getText() + "'";
        ImageIcon doc;
        InputStream is;

        if (txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA EL ID DEL PACIENTE",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            if (cbxTipoDocumento.getSelectedIndex() == 0) {
                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    rs = st.executeQuery(sqlacta);

                    while (rs.next()) {

                        is = rs.getBinaryStream(1);

                        BufferedImage bi = ImageIO.read(is);
                        doc = new ImageIcon(bi);

                        Image img = doc.getImage();
                        Image newimg = img.getScaledInstance(740, 970, java.awt.Image.SCALE_SMOOTH);

                        ImageIcon newicon = new ImageIcon(newimg);

                        lblDocumento.setIcon(newicon);

                        JOptionPane.showMessageDialog(null, "EL ACTA DE NACIMIENTO HA SIDO ENCONTRADA", "ACTA ENCONTRADA",
                                JOptionPane.DEFAULT_OPTION, confirmar);
                    }
                } catch (IOException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "exception: " + ex.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else if (cbxTipoDocumento.getSelectedIndex() == 1) {
                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    rs = st.executeQuery(sqlcurp);

                    while (rs.next()) {

                        is = rs.getBinaryStream(1);

                        BufferedImage bi = ImageIO.read(is);
                        doc = new ImageIcon(bi);

                        Image img = doc.getImage();
                        Image newimg = img.getScaledInstance(740, 970, java.awt.Image.SCALE_SMOOTH);

                        ImageIcon newicon = new ImageIcon(newimg);

                        lblDocumento.setIcon(newicon);

                          JOptionPane.showMessageDialog(null, "LA CURP DEL PACIENTE HA SIDO ENCONTRADA", "CURP ENCONTRADA",
                                JOptionPane.DEFAULT_OPTION, confirmar);
                    }
                } catch (IOException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "exception: " + ex.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else if (cbxTipoDocumento.getSelectedIndex() == 2) {
                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    rs = st.executeQuery(sqline);

                    while (rs.next()) {

                        is = rs.getBinaryStream(1);

                        BufferedImage bi = ImageIO.read(is);
                        doc = new ImageIcon(bi);

                        Image img = doc.getImage();
                        Image newimg = img.getScaledInstance(740, 970, java.awt.Image.SCALE_SMOOTH);

                        ImageIcon newicon = new ImageIcon(newimg);

                        lblDocumento.setIcon(newicon);

                        JOptionPane.showMessageDialog(null, "INE DEL PACIENTE HA SIDO ENCONTRADA", "INE ENCONTRADA",
                                JOptionPane.DEFAULT_OPTION, confirmar);
                    }
                } catch (IOException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "exception: " + ex.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);;
                }
            }
        }
    }//GEN-LAST:event_cbxTipoDocumentoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String idPaciente = txtIDPaciente.getText();

        if (cbxTipoDocumento.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "ELIJA PRIMERO EL DOCUMENTO A ELIMINAR", "PRIMERO BUSQUE EL DOCUMENTO", 
                    JOptionPane.DEFAULT_OPTION, pregunta);
        } else if (txtIDPaciente.getText().isEmpty() || txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO BUSQUE AL PACIENTE",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR LOS DOCUMENTOS DEL PACIENTE?", "¿SEGURO?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, pregunta);
            if (res == 0) {
                String sql = "DELETE FROM MARIA.PACIENTE WHERE pk_idPaciente = '" + idPaciente + "'";

                try {
                    PreparedStatement ps;
                    ps = conexion.getConection().prepareStatement(sql);
                    ps.execute();
                    ps.close();

                    lblDocumento.setIcon(null);
                    txtIDPaciente.setText("");
                    cbxTipoDocumento.setSelectedIndex(-1);

                    JOptionPane.showMessageDialog(null, "DOCUMENTOS DE PACIENTE ELIMINADOS", "DCOUMENTOS ELIMINADOS",
                            JOptionPane.DEFAULT_OPTION, confirmar);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else {
                JOptionPane.showMessageDialog(null, "OK, LOS DOCUMENTOS DEL PACIENTE NO HAN SIDO BORRADOS", "DOCUMENTOS NO BORRADOS", 
                        JOptionPane.DEFAULT_OPTION, pregunta);
            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL VEN = new VENTANA_PRINCIPAL();
        VEN.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ELIMINAR_Paciente_DOC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDPaciente;
    private javax.swing.JPanel PanelCabecera;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbxTipoDocumento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenPaciente;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIDPaciente;
    // End of variables declaration//GEN-END:variables
}
