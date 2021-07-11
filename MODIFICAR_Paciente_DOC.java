
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MODIFICAR_Paciente_DOC extends javax.swing.JFrame {

    conexion conexion = new conexion();
    FileInputStream fis;
    int longitudBytes;

    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public MODIFICAR_Paciente_DOC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCabecera = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblCabecera = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblBuscarDocumento = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblIDPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxTipoDocumento = new javax.swing.JComboBox<>();
        lblDocumento = new javax.swing.JLabel();
        lblImagenPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PanelCabecera.setBackground(new java.awt.Color(0, 102, 153));
        PanelCabecera.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Clinica Maria");
        PanelCabecera.add(lblTitulo);
        lblTitulo.setBounds(30, 200, 210, 44);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        PanelCabecera.add(lblImagen);
        lblImagen.setBounds(70, 50, 130, 120);

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
        btnCancelar.setBounds(40, 900, 200, 70);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\Cabecera.jpg")); // NOI18N
        PanelCabecera.add(lblCabecera);
        lblCabecera.setBounds(0, 0, 275, 1080);

        getContentPane().add(PanelCabecera);
        PanelCabecera.setBounds(0, 0, 275, 1080);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 102, 153));
        lblSubtitulo.setText("Modificar Documentos de Paciente");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(430, 60, 560, 60);

        lblBuscarDocumento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblBuscarDocumento.setForeground(new java.awt.Color(0, 102, 153));
        lblBuscarDocumento.setText("BUSCAR DOCUMENTO:");
        getContentPane().add(lblBuscarDocumento);
        lblBuscarDocumento.setBounds(340, 230, 270, 29);

        btnBuscar.setBackground(new java.awt.Color(0, 102, 153));
        btnBuscar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(650, 220, 300, 40);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(340, 380, 150, 29);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(650, 370, 300, 40);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("TIPO DE DOCUMENTO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 540, 260, 29);

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
        cbxTipoDocumento.setBounds(650, 530, 300, 39);

        lblDocumento.setText("doc");
        lblDocumento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 2));
        getContentPane().add(lblDocumento);
        lblDocumento.setBounds(1110, 40, 750, 975);

        lblImagenPaciente.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\paciente (1).png")); // NOI18N
        getContentPane().add(lblImagenPaciente);
        lblImagenPaciente.setBounds(340, 50, 70, 70);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        lblDocumento.setIcon(null);
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());
                //necesitamos saber la cantidad de bytes
                this.longitudBytes = (int) j.getSelectedFile().length();
                try {
                    Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(lblDocumento.getWidth(), lblDocumento.getHeight(), Image.SCALE_DEFAULT);
                    lblDocumento.setIcon(new ImageIcon(icono));
                    lblDocumento.updateUI();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "imagen: " + ex);
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbxTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoDocumentoActionPerformed
        String idPaciente = txtIDPaciente.getText();

        if (txtIDPaciente.getText().isEmpty() && lblImagen.getText() == "doc") {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA EL ID DEL PACIENTE",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            if (cbxTipoDocumento.getSelectedIndex() == 0) {
                String sql = "UPDATE MARIA.PACIENTE_DOC SET acta_nacimiento = ? WHERE pk_idPaciente = '" + idPaciente + "'";
                try {

                    PreparedStatement ps = conexion.getConection().prepareStatement(sql);

                    ps.setBinaryStream(1, fis, longitudBytes);

                    ps.execute();
                    ps.close();

                    lblDocumento.setIcon(null);
                    txtIDPaciente.setText("");
                    cbxTipoDocumento.setSelectedIndex(-1);

                    JOptionPane.showMessageDialog(null, "EL ACTA DE NACIMIENTO HA SIDO MODIFICADA CORRECTAMENTE", "ACTA MODIFICADA",
                            JOptionPane.DEFAULT_OPTION, confirmar);
                } catch (SQLException | NumberFormatException | HeadlessException x) {
                    JOptionPane.showMessageDialog(null, "exception: " + x.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else if (cbxTipoDocumento.getSelectedIndex() == 1) {
                String sql = "UPDATE MARIA.PACIENTE_DOC SET curp = ? WHERE pk_idPaciente = '" + idPaciente + "'";
                try {

                    PreparedStatement ps = conexion.getConection().prepareStatement(sql);

                    ps.setBinaryStream(1, fis, longitudBytes);

                    ps.execute();
                    ps.close();

                    lblDocumento.setIcon(null);
                    txtIDPaciente.setText("");
                    cbxTipoDocumento.setSelectedIndex(-1);

                    JOptionPane.showMessageDialog(null, "LA CURP DEL PACIENTE HA SIDO MODIFICADA CORRECTAMENTE", "CURP MODIFICADA",
                            JOptionPane.DEFAULT_OPTION, confirmar);
                } catch (SQLException | NumberFormatException | HeadlessException x) {
                    JOptionPane.showMessageDialog(null, "exception: " + x.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else {
                String sql = "UPDATE MARIA.PACIENTE_DOC SET INE = ? WHERE pk_idPaciente = '" + idPaciente + "'";
                try {

                    PreparedStatement ps = conexion.getConection().prepareStatement(sql);

                    ps.setBinaryStream(1, fis, longitudBytes);

                    ps.execute();
                    ps.close();

                    lblDocumento.setIcon(null);
                    txtIDPaciente.setText("");
                    cbxTipoDocumento.setSelectedIndex(-1);

                    JOptionPane.showMessageDialog(null, "EL INE DEL PACIENTE HA SIDO MODIFICADA CORRECTAMENTE", "INE MODIFICADA",
                            JOptionPane.DEFAULT_OPTION, confirmar);
                } catch (SQLException | NumberFormatException | HeadlessException x) {
                    JOptionPane.showMessageDialog(null, "exception: " + x.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            }
        }

    }//GEN-LAST:event_cbxTipoDocumentoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL VEN = new VENTANA_PRINCIPAL();
        VEN.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODIFICAR_Paciente_DOC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCabecera;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxTipoDocumento;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBuscarDocumento;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenPaciente;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIDPaciente;
    // End of variables declaration//GEN-END:variables
}
