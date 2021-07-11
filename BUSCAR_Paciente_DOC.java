
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class BUSCAR_Paciente_DOC extends javax.swing.JFrame {

    conexion conexion = new conexion();
    FileInputStream fis;
    int longitudBytes;

    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public BUSCAR_Paciente_DOC() {
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
        jLabel1 = new javax.swing.JLabel();
        lblIDPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
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
        lblTitulo.setBounds(30, 190, 220, 44);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        PanelCabecera.add(lblImagen);
        lblImagen.setBounds(70, 40, 130, 140);

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
        lblSubtitulo.setText("Buscar Documentos de Pacientes");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(430, 60, 560, 44);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("TIPO DE DOCUMENTO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 380, 250, 29);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setText("ID PACIENTE:");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(350, 230, 170, 29);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(610, 220, 300, 40);

        cbxTipo.setBackground(new java.awt.Color(255, 255, 255));
        cbxTipo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTA DE NACIMIENTO", "CURP", "INE" }));
        cbxTipo.setSelectedIndex(-1);
        cbxTipo.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -2, 2, new java.awt.Color(0, 102, 153)));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTipo);
        cbxTipo.setBounds(610, 370, 300, 40);

        lblDocumento.setForeground(new java.awt.Color(204, 204, 204));
        lblDocumento.setText("doc");
        lblDocumento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 2));
        getContentPane().add(lblDocumento);
        lblDocumento.setBounds(1100, 20, 750, 975);

        lblImagenPaciente.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\paciente (1).png")); // NOI18N
        getContentPane().add(lblImagenPaciente);
        lblImagenPaciente.setBounds(340, 40, 70, 90);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed

        String sqlacta = "SELECT acta_nacimiento FROM MARIA.PACIENTE_DOC WHERE pk_idPaciente = '" + txtIDPaciente.getText() + "'";
        String sqlcurp = "SELECT curp FROM MARIA.PACIENTE_DOC WHERE pk_idPaciente = '" + txtIDPaciente.getText() + "'";
        String sqline = "SELECT ine FROM MARIA.PACIENTE_DOC WHERE pk_idPaciente = '" + txtIDPaciente.getText() + "'";
        ImageIcon doc;
        InputStream is;

        if (txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA EL ID DEL PACIENTE",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            if (cbxTipo.getSelectedIndex() == 0) {
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
            } else if (cbxTipo.getSelectedIndex() == 1) {
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
            } else if (cbxTipo.getSelectedIndex() == 2) {
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
                    JOptionPane.showMessageDialog(null, "exception: " + ex.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
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
                new BUSCAR_Paciente_DOC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCabecera;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
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
