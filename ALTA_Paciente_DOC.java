
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

public class ALTA_Paciente_DOC extends javax.swing.JFrame {

    conexion conexion = new conexion();
    FileInputStream fis;
    int longitudBytes;

    Connection cn;
    Statement st;
    ResultSet rs;
    
    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public ALTA_Paciente_DOC() {
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
        btnBuscar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        lblBuscar1 = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
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
        lblTitulo.setBounds(30, 190, 210, 60);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        PanelCabecera.add(lblImagen);
        lblImagen.setBounds(70, 50, 130, 128);

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

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\Cabecera.jpg")); // NOI18N
        PanelCabecera.add(lblCabecera);
        lblCabecera.setBounds(0, 0, 275, 1080);

        getContentPane().add(PanelCabecera);
        PanelCabecera.setBounds(0, 0, 275, 1080);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 102, 153));
        lblSubtitulo.setText("Registo de Documentos de Paciente");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(420, 60, 580, 44);

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
        btnBuscar.setBounds(620, 220, 300, 40);

        lblBuscar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(0, 102, 153));
        lblBuscar.setText("BUSCAR DOCUMENTO:");
        getContentPane().add(lblBuscar);
        lblBuscar.setBounds(330, 230, 260, 29);

        lblBuscar1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblBuscar1.setForeground(new java.awt.Color(0, 102, 153));
        lblBuscar1.setText("ID DE PACIENTE:");
        getContentPane().add(lblBuscar1);
        lblBuscar1.setBounds(330, 370, 260, 29);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(620, 360, 300, 40);

        lblTipo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 102, 153));
        lblTipo.setText("TIPO DE DOCUMENTO:");
        getContentPane().add(lblTipo);
        lblTipo.setBounds(330, 510, 260, 29);

        cbxTipo.setBackground(new java.awt.Color(255, 255, 255));
        cbxTipo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTA DE NACIMIENTO", "CURP", "INE" }));
        cbxTipo.setSelectedIndex(-1);
        cbxTipo.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTipo);
        cbxTipo.setBounds(620, 510, 300, 40);

        lblDocumento.setText("doc");
        lblDocumento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 2, true));
        getContentPane().add(lblDocumento);
        lblDocumento.setBounds(1110, 30, 750, 975);

        lblImagenPaciente.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\paciente (1).png")); // NOI18N
        getContentPane().add(lblImagenPaciente);
        lblImagenPaciente.setBounds(330, 40, 70, 80);

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

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        String id = txtIDPaciente.getText();

        if (txtIDPaciente.getText().isEmpty() || lblImagen.getIcon().equals(null)) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA TODAS LAS ENTRADAS DE TEXTO",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            if (cbxTipo.getSelectedIndex() == 0) {
                try {
                    String sql = "INSERT INTO MARIA.PACIENTE_DOC (pk_idPaciente, acta_nacimiento) VALUES (?, ?)";

                    PreparedStatement ps = null;

                    ps = conexion.getConection().prepareStatement(sql);

                    ps.setString(1, (txtIDPaciente.getText()));
                    ps.setBinaryStream(2, fis, longitudBytes);
                    ps.execute();
                    ps.close();

                    lblDocumento.setIcon(null);
                    cbxTipo.setSelectedItem(null);

                    JOptionPane.showMessageDialog(null, "ACTA DE NACIMIENTO GUARDADA CORRECTAMENTE", 
                            "GUARDADA CORRECTAMENTE", JOptionPane.DEFAULT_OPTION, confirmar);
                } catch (SQLException | NumberFormatException | HeadlessException x) {
                    JOptionPane.showMessageDialog(null, x.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error );
                }
            } else if (cbxTipo.getSelectedIndex() == 1) {
                try {
                    String sql = "UPDATE MARIA.PACIENTE_DOC SET curp = ? WHERE pk_idPaciente = '" + id + "' ";

                    PreparedStatement ps = null;

                    ps = conexion.getConection().prepareStatement(sql);

                    ps.setBinaryStream(1, fis, longitudBytes);
                    ps.execute();
                    ps.close();

                    lblDocumento.setIcon(null);
                    cbxTipo.setSelectedItem(null);

                     JOptionPane.showMessageDialog(null, "CURP GUARDADA CORRECTAMENTE", 
                            "GUARDADA CORRECTAMENTE", JOptionPane.DEFAULT_OPTION, confirmar);
                } catch (SQLException | NumberFormatException | HeadlessException x) {
                   JOptionPane.showMessageDialog(null, x.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error );
                }
            } else if (cbxTipo.getSelectedIndex() == 2) {
                try {
                    String sql = "UPDATE MARIA.PACIENTE_DOC SET ine = ? WHERE pk_idPaciente = '" + id + "' ";

                    PreparedStatement ps = null;

                    ps = conexion.getConection().prepareStatement(sql);

                    ps.setBinaryStream(1, fis, longitudBytes);
                    ps.execute();
                    ps.close();

                    lblDocumento.setIcon(null);
                    txtIDPaciente.setText("");
                    cbxTipo.setSelectedItem(null);

                    JOptionPane.showMessageDialog(null, "INE GUARDADA CORRECTAMENTE", 
                            "GUARDADA CORRECTAMENTE", JOptionPane.DEFAULT_OPTION, confirmar);
                } catch (SQLException | NumberFormatException | HeadlessException x) {
                    JOptionPane.showMessageDialog(null, x.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error );
                }
            }
        }
        
       

    }//GEN-LAST:event_cbxTipoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL VEN = new VENTANA_PRINCIPAL();
        VEN.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALTA_Paciente_DOC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCabecera;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBuscar1;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenPaciente;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIDPaciente;
    // End of variables declaration//GEN-END:variables
}
