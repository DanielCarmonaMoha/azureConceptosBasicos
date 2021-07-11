
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ELIMINAR_Paciente extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public ELIMINAR_Paciente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIDPaciente = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtIDPaciente = new javax.swing.JTextField();
        lblPaciente = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidoP = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        lblApellidoM = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        lblCalle1 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        lblNumInt = new javax.swing.JLabel();
        txtNumInt = new javax.swing.JTextField();
        lblNumExt = new javax.swing.JLabel();
        txtNumExt = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        lblSubtitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblCabcera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(880, 210, 150, 29);

        btnEliminar.setBackground(new java.awt.Color(0, 153, 0));
        btnEliminar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(1675, 900, 200, 50);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(710, 250, 500, 40);

        lblPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPaciente.setText("NOMBRE");
        getContentPane().add(lblPaciente);
        lblPaciente.setBounds(300, 390, 110, 29);

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(110, 430, 500, 40);

        lblApellidoP.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellidoP.setForeground(new java.awt.Color(0, 102, 153));
        lblApellidoP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoP.setText("APELLIDO PATERNO");
        getContentPane().add(lblApellidoP);
        lblApellidoP.setBounds(850, 390, 230, 30);

        txtApellidoP.setEditable(false);
        txtApellidoP.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoP.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApellidoP.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApellidoP);
        txtApellidoP.setBounds(720, 430, 500, 40);

        lblApellidoM.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellidoM.setForeground(new java.awt.Color(0, 102, 153));
        lblApellidoM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoM.setText("APELLIDO MATERNO");
        getContentPane().add(lblApellidoM);
        lblApellidoM.setBounds(1440, 390, 250, 29);

        txtApellidoM.setEditable(false);
        txtApellidoM.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoM.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApellidoM.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApellidoM);
        txtApellidoM.setBounds(1320, 430, 500, 40);

        lblCalle.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(0, 102, 153));
        lblCalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalle.setText("CALLE");
        getContentPane().add(lblCalle);
        lblCalle.setBounds(310, 690, 80, 29);

        txtCalle.setEditable(false);
        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCalle.setForeground(new java.awt.Color(0, 0, 0));
        txtCalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCalle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCalle);
        txtCalle.setBounds(110, 730, 500, 40);

        lblCalle1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCalle1.setForeground(new java.awt.Color(0, 102, 153));
        lblCalle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalle1.setText("COLONIA");
        getContentPane().add(lblCalle1);
        lblCalle1.setBounds(920, 690, 110, 29);

        txtColonia.setEditable(false);
        txtColonia.setBackground(new java.awt.Color(255, 255, 255));
        txtColonia.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtColonia.setForeground(new java.awt.Color(0, 0, 0));
        txtColonia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColonia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtColonia);
        txtColonia.setBounds(720, 730, 500, 40);

        lblNumInt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNumInt.setForeground(new java.awt.Color(0, 102, 153));
        lblNumInt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumInt.setText("NUM INT");
        getContentPane().add(lblNumInt);
        lblNumInt.setBounds(1380, 690, 110, 29);

        txtNumInt.setEditable(false);
        txtNumInt.setBackground(new java.awt.Color(255, 255, 255));
        txtNumInt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNumInt.setForeground(new java.awt.Color(0, 0, 0));
        txtNumInt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumInt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNumInt);
        txtNumInt.setBounds(1340, 730, 200, 40);

        lblNumExt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNumExt.setForeground(new java.awt.Color(0, 102, 153));
        lblNumExt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumExt.setText("NUM EXT");
        getContentPane().add(lblNumExt);
        lblNumExt.setBounds(1650, 690, 110, 30);

        txtNumExt.setEditable(false);
        txtNumExt.setBackground(new java.awt.Color(255, 255, 255));
        txtNumExt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNumExt.setForeground(new java.awt.Color(0, 0, 0));
        txtNumExt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumExt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNumExt);
        txtNumExt.setBounds(1610, 730, 200, 40);

        lblCiudad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(0, 102, 153));
        lblCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad.setText("CIUDAD");
        getContentPane().add(lblCiudad);
        lblCiudad.setBounds(930, 830, 110, 29);

        txtCiudad.setEditable(false);
        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCiudad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCiudad);
        txtCiudad.setBounds(730, 870, 500, 40);

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
        btnBuscar.setBounds(870, 310, 200, 45);

        lblFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(0, 102, 153));
        lblFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaNacimiento.setText("FECHA NACIMIENTO");
        getContentPane().add(lblFechaNacimiento);
        lblFechaNacimiento.setBounds(600, 540, 220, 29);

        txtFechaNacimiento.setEditable(false);
        txtFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtFechaNacimiento);
        txtFechaNacimiento.setBounds(460, 580, 500, 40);

        lblSexo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(0, 102, 153));
        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSexo.setText("GENERO");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(1200, 540, 110, 29);

        txtSexo.setEditable(false);
        txtSexo.setBackground(new java.awt.Color(255, 255, 255));
        txtSexo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(0, 0, 0));
        txtSexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSexo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtSexo);
        txtSexo.setBounds(1000, 580, 500, 40);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Eliminación de Datos de Paciente");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(600, 60, 720, 40);

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

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(lblImagen);
        lblImagen.setBounds(60, 10, 130, 130);

        lblCabcera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblCabcera);
        lblCabcera.setBounds(0, 0, 1920, 150);

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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = txtIDPaciente.getText();

        String sql = "DELETE FROM MARIA.PACIENTE WHERE pk_idPaciente = '" + id + "'";

        if (txtIDPaciente.getText().isEmpty() || txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO BUSQUE AL PACIENTE",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR LOS DATOS DEL PACIENTE?", "¿SEGURO?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, pregunta);

            if (res == 0) {
                try {

                    cn = conexion.getConection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);

                    JOptionPane.showMessageDialog(null, "EL PACIENTE HA SIDO ELIMINADO CORRECTAMENTE", "PACIENTE ELIMINADO",
                            JOptionPane.DEFAULT_OPTION, confirmar);

                    txtApellidoM.setText("");
                    txtApellidoP.setText("");
                    txtCalle.setText("");
                    txtCiudad.setText("");
                    txtColonia.setText("");
                    txtIDPaciente.setText("");
                    txtNombre.setText("");
                    txtNumExt.setText("");
                    txtNumInt.setText("");
                    txtFechaNacimiento.setText("");
                    txtSexo.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else if (res == 1) {
                JOptionPane.showMessageDialog(null, "OK, LOS DATOS DEL PACIENTE NO HAN SIDO BORRADOS", "DATOS NO BORRADOS",
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
                new ELIMINAR_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblCabcera;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCalle1;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNumExt;
    private javax.swing.JLabel lblNumInt;
    private javax.swing.JLabel lblPaciente;
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
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
