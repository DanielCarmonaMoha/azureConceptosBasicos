
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MODIFICAR_Paciente extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    
    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public MODIFICAR_Paciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModificar = new javax.swing.JButton();
        lblIDPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        lblApellidoP = new javax.swing.JLabel();
        lblApellidoM = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNumInt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNumExt = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblCabecera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        btnModificar.setBackground(new java.awt.Color(0, 153, 0));
        btnModificar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(1675, 900, 200, 50);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(900, 190, 150, 29);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(740, 230, 500, 40);

        lblNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 102, 153));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(320, 360, 120, 29);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(130, 400, 500, 40);

        txtApellidoP.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoP.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApellidoP.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApellidoP);
        txtApellidoP.setBounds(740, 400, 500, 40);

        lblApellidoP.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellidoP.setForeground(new java.awt.Color(0, 102, 153));
        lblApellidoP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoP.setText("APELLIDO PATERNO");
        getContentPane().add(lblApellidoP);
        lblApellidoP.setBounds(850, 360, 250, 29);

        lblApellidoM.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellidoM.setForeground(new java.awt.Color(0, 102, 153));
        lblApellidoM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoM.setText("APELLIDO MATERNO");
        getContentPane().add(lblApellidoM);
        lblApellidoM.setBounds(1460, 360, 240, 29);

        txtApellidoM.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoM.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApellidoM.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApellidoM);
        txtApellidoM.setBounds(1330, 400, 500, 40);

        lblCalle.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(0, 102, 153));
        lblCalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalle.setText("CALLE");
        getContentPane().add(lblCalle);
        lblCalle.setBounds(330, 670, 95, 30);

        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCalle.setForeground(new java.awt.Color(0, 0, 0));
        txtCalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCalle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCalle);
        txtCalle.setBounds(140, 710, 500, 40);

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("COLONIA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(930, 670, 120, 29);

        txtColonia.setBackground(new java.awt.Color(255, 255, 255));
        txtColonia.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtColonia.setForeground(new java.awt.Color(0, 0, 0));
        txtColonia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColonia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtColonia);
        txtColonia.setBounds(750, 710, 500, 40);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NUM INT");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1380, 670, 100, 39);

        txtNumInt.setBackground(new java.awt.Color(255, 255, 255));
        txtNumInt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNumInt.setForeground(new java.awt.Color(0, 0, 0));
        txtNumInt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumInt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNumInt);
        txtNumInt.setBounds(1330, 710, 200, 40);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NUM EXT");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1650, 670, 110, 29);

        txtNumExt.setBackground(new java.awt.Color(255, 255, 255));
        txtNumExt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNumExt.setForeground(new java.awt.Color(0, 0, 0));
        txtNumExt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumExt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNumExt);
        txtNumExt.setBounds(1610, 710, 200, 40);

        lblCiudad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(0, 102, 153));
        lblCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad.setText("CIUDAD");
        getContentPane().add(lblCiudad);
        lblCiudad.setBounds(940, 850, 100, 29);

        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCiudad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCiudad);
        txtCiudad.setBounds(750, 890, 500, 40);

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
        btnBuscar.setBounds(880, 290, 200, 40);

        lblFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(0, 102, 153));
        lblFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaNacimiento.setText("FECHA NACIMIENTO");
        getContentPane().add(lblFechaNacimiento);
        lblFechaNacimiento.setBounds(570, 510, 240, 29);

        txtFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtFechaNacimiento);
        txtFechaNacimiento.setBounds(440, 550, 500, 40);

        lblSexo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(0, 102, 153));
        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSexo.setText("GÉNERO");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(1240, 510, 100, 29);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Modificación datos de Paciente");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(650, 60, 680, 50);

        cbxSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbxSexo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        cbxSexo.setSelectedIndex(-1);
        cbxSexo.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -3, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxSexo);
        cbxSexo.setBounds(1170, 550, 250, 40);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(lblImagen);
        lblImagen.setBounds(70, 0, 140, 150);

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(60, 900, 200, 50);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblCabecera);
        lblCabecera.setBounds(0, 0, 1920, 150);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

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
                    txtApellidoP.setText(rs.getString("apepaterno"));
                    txtApellidoM.setText(rs.getString("apematerno"));
                    txtFechaNacimiento.setText(rs.getString("fechaNacimiento"));
                    cbxSexo.setSelectedItem(rs.getString("sexo"));
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
            JOptionPane.showMessageDialog(null,"EL PACIENTE NO FUE ENCONTRADO", "PACIENTE NO ENCONTRADO", 
                    JOptionPane.DEFAULT_OPTION, error);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String id = txtIDPaciente.getText();
        String nomb = txtNombre.getText();
        String ape1 = txtApellidoP.getText();
        String ape2 = txtApellidoM.getText();
        String fechaN = txtFechaNacimiento.getText();
        String sexo = (String) cbxSexo.getSelectedItem();
        String calle = txtCalle.getText();
        String colonia = txtColonia.getText();
        String numint = txtNumInt.getText();
        String numext = txtNumExt.getText();
        String ciudad = txtCiudad.getText();

        String sql = "UPDATE MARIA.PACIENTE SET nombre='" + nomb + "', apepaterno='" + ape1 + "', apematerno='" + ape2 + "', "
                + "fechaNacimiento = '" + fechaN + "', sexo = '" + sexo + "',"
                + "calle='" + calle + "', numin='" + numint + "', numext='" + numext + "', colonia='" + colonia + "',"
                + "ciudad='" + ciudad + "' WHERE pk_idPaciente = '" + id + "'";

        if (txtIDPaciente.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellidoM.getText().isEmpty()
                || txtApellidoP.getText().isEmpty() || txtCalle.getText().isEmpty() || txtCiudad.getText().isEmpty() 
                || txtColonia.getText().isEmpty() || txtFechaNacimiento.getText().isEmpty() || txtNumExt.getText().isEmpty()
                || txtNumInt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "POR FAVOR, RELLENE TODAS LAS ENTRADAS REQUERIDAS",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO EN MODIFICAR LOS DATOS DEL PACIENTE?", "¿SSEGURO?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, pregunta);
            if (res == 0) {
                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"EL PACIENTE HA SIDO MODIFICADO EXITOSAMENTE", "PACIENTE MODIFICADO", 
                            JOptionPane.DEFAULT_OPTION, confirmar);

                    txtApellidoM.setText("");
                    txtApellidoP.setText("");
                    txtCalle.setText("");
                    txtCiudad.setText("");
                    txtColonia.setText("");
                    txtFechaNacimiento.setText("");
                    cbxSexo.setSelectedItem("");
                    txtIDPaciente.setText("");
                    txtNombre.setText("");
                    txtNumExt.setText("");
                    txtNumInt.setText("");
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else {
                JOptionPane.showMessageDialog(null, "OK, LOS DATOS DEL PACIENTE NO HAN SIDO MODIFICADOS", "DATOS NO MODIFICADOS",
                        JOptionPane.DEFAULT_OPTION, pregunta);
            }

        }
        

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL VEN = new VENTANA_PRINCIPAL();
        VEN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODIFICAR_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumExt;
    private javax.swing.JTextField txtNumInt;
    // End of variables declaration//GEN-END:variables
}
