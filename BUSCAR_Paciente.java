
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BUSCAR_Paciente extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public BUSCAR_Paciente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblCabecera = new javax.swing.JLabel();
        lblIDPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido1 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        lblApellido2 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        lblNumInt = new javax.swing.JLabel();
        txtNumInt = new javax.swing.JTextField();
        lblNumExt = new javax.swing.JLabel();
        txtNumExt = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblApellido3 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        lblApellido4 = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblImagenPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Clinica María");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(30, 190, 220, 70);

        btnCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(40, 900, 200, 50);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        jPanel1.add(lblImagen);
        lblImagen.setBounds(80, 40, 130, 140);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\Cabecera.jpg")); // NOI18N
        jPanel1.add(lblCabecera);
        lblCabecera.setBounds(0, 0, 275, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 275, 1080);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(310, 240, 170, 33);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(310, 280, 500, 40);

        lblNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 102, 153));
        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(310, 390, 140, 29);

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(310, 440, 500, 40);

        lblApellido1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellido1.setForeground(new java.awt.Color(0, 102, 153));
        lblApellido1.setText("APELLIDO PATERNO");
        getContentPane().add(lblApellido1);
        lblApellido1.setBounds(840, 390, 260, 30);

        txtApellido1.setEditable(false);
        txtApellido1.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApellido1.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApellido1);
        txtApellido1.setBounds(840, 440, 500, 40);

        lblApellido2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellido2.setForeground(new java.awt.Color(0, 102, 153));
        lblApellido2.setText("APELLIDO MATERNO");
        getContentPane().add(lblApellido2);
        lblApellido2.setBounds(1380, 390, 260, 30);

        txtApellido2.setEditable(false);
        txtApellido2.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApellido2.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApellido2);
        txtApellido2.setBounds(1380, 440, 500, 40);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("COLONIA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(840, 690, 140, 30);

        txtColonia.setEditable(false);
        txtColonia.setBackground(new java.awt.Color(255, 255, 255));
        txtColonia.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtColonia.setForeground(new java.awt.Color(0, 0, 0));
        txtColonia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColonia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtColonia);
        txtColonia.setBounds(840, 740, 500, 40);

        lblCalle.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(0, 102, 153));
        lblCalle.setText("CALLE");
        getContentPane().add(lblCalle);
        lblCalle.setBounds(310, 700, 100, 30);

        txtCalle.setEditable(false);
        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCalle.setForeground(new java.awt.Color(0, 0, 0));
        txtCalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCalle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCalle);
        txtCalle.setBounds(310, 740, 500, 40);

        txtCiudad.setEditable(false);
        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCiudad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCiudad);
        txtCiudad.setBounds(310, 880, 500, 40);

        lblCiudad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(0, 102, 153));
        lblCiudad.setText("CIUDAD");
        getContentPane().add(lblCiudad);
        lblCiudad.setBounds(310, 840, 120, 30);

        lblNumInt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNumInt.setForeground(new java.awt.Color(0, 102, 153));
        lblNumInt.setText("NUM INT");
        getContentPane().add(lblNumInt);
        lblNumInt.setBounds(1390, 690, 140, 30);

        txtNumInt.setEditable(false);
        txtNumInt.setBackground(new java.awt.Color(255, 255, 255));
        txtNumInt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNumInt.setForeground(new java.awt.Color(0, 0, 0));
        txtNumInt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumInt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNumInt);
        txtNumInt.setBounds(1390, 740, 200, 40);

        lblNumExt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNumExt.setForeground(new java.awt.Color(0, 102, 153));
        lblNumExt.setText("NUM EXT");
        getContentPane().add(lblNumExt);
        lblNumExt.setBounds(1680, 690, 150, 30);

        txtNumExt.setEditable(false);
        txtNumExt.setBackground(new java.awt.Color(255, 255, 255));
        txtNumExt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNumExt.setForeground(new java.awt.Color(0, 0, 0));
        txtNumExt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumExt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNumExt);
        txtNumExt.setBounds(1680, 740, 200, 40);

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
        btnBuscar.setBounds(860, 280, 200, 40);

        lblApellido3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellido3.setForeground(new java.awt.Color(0, 102, 153));
        lblApellido3.setText("FECHA NACIMIENTO");
        getContentPane().add(lblApellido3);
        lblApellido3.setBounds(310, 540, 260, 30);

        txtFechaNacimiento.setEditable(false);
        txtFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtFechaNacimiento);
        txtFechaNacimiento.setBounds(310, 590, 500, 40);

        txtSexo.setEditable(false);
        txtSexo.setBackground(new java.awt.Color(255, 255, 255));
        txtSexo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(0, 0, 0));
        txtSexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSexo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtSexo);
        txtSexo.setBounds(840, 590, 500, 40);

        lblApellido4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellido4.setForeground(new java.awt.Color(0, 102, 153));
        lblApellido4.setText("GÉNERO");
        getContentPane().add(lblApellido4);
        lblApellido4.setBounds(840, 540, 110, 30);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 102, 153));
        lblSubtitulo.setText("Búsqueda de Paciente");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(410, 80, 360, 50);

        lblImagenPaciente.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\paciente (1).png")); // NOI18N
        getContentPane().add(lblImagenPaciente);
        lblImagenPaciente.setBounds(320, 60, 70, 80);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL VEN = new VENTANA_PRINCIPAL();
        VEN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = txtIDPaciente.getText();
        String sql = "SELECT * FROM MARIA.PACIENTE WHERE pk_idPaciente = '" + id + "'";

        if (txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA EL ID DEL PACIENTE",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {
                cn = conexion.getConection();
                st = cn.createStatement();
                rs = st.executeQuery(sql);

                while (rs.next()) {

                    txtIDPaciente.setText(rs.getString("pk_idPaciente"));
                    txtNombre.setText(rs.getString("nombre"));
                    txtApellido1.setText(rs.getString("apepaterno"));
                    txtApellido2.setText(rs.getString("apematerno"));
                    txtFechaNacimiento.setText(rs.getString("fechaNacimiento"));
                    txtSexo.setText(rs.getString("sexo"));
                    txtCalle.setText(rs.getString("calle"));
                    txtNumInt.setText(rs.getString("numin"));
                    txtNumExt.setText(rs.getString("numext"));
                    txtColonia.setText(rs.getString("colonia"));
                    txtCiudad.setText(rs.getString("ciudad"));
                    JOptionPane.showMessageDialog(null, "EL PACIENTE HA SIDO ENCONTRADO", "PACIENTE ENCONTRADO",
                            JOptionPane.DEFAULT_OPTION, confirmar);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }
        }

        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "EL PACIENTE NO HA SIDO ENCONTRADO", "PACIENTE NO ENCONTRADO",
                    JOptionPane.DEFAULT_OPTION, error);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSCAR_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblApellido3;
    private javax.swing.JLabel lblApellido4;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenPaciente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumExt;
    private javax.swing.JLabel lblNumInt;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumExt;
    private javax.swing.JTextField txtNumInt;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
