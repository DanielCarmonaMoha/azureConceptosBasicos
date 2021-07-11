
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ELIMINAR_Especialista extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public ELIMINAR_Especialista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSubtitulo = new javax.swing.JLabel();
        lblIDEspecialista = new javax.swing.JLabel();
        txtIDEspecialista = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApePaterno = new javax.swing.JLabel();
        txtApePaterno = new javax.swing.JTextField();
        lblApeMaterno = new javax.swing.JLabel();
        txtApeMaterno = new javax.swing.JTextField();
        lblTelefonoCel = new javax.swing.JLabel();
        txtTelefonoCel = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblEspecialidad = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblCURP = new javax.swing.JLabel();
        txtCURP = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblTelefonoFijo = new javax.swing.JLabel();
        txtTelefonoFijo = new javax.swing.JTextField();
        lblImagenClinica = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblImagenCabecera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Elimininación de Datos de Especialista");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(590, 50, 860, 50);

        lblIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDEspecialista.setForeground(new java.awt.Color(0, 102, 153));
        lblIDEspecialista.setText("ID ESPECIALISTA");
        getContentPane().add(lblIDEspecialista);
        lblIDEspecialista.setBounds(870, 210, 230, 40);

        txtIDEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        txtIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        txtIDEspecialista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDEspecialista);
        txtIDEspecialista.setBounds(730, 260, 500, 40);

        lblNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 102, 153));
        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(320, 400, 120, 40);

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(140, 450, 500, 40);

        lblApePaterno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApePaterno.setForeground(new java.awt.Color(0, 102, 153));
        lblApePaterno.setText("APELLIDO PATERNO");
        getContentPane().add(lblApePaterno);
        lblApePaterno.setBounds(850, 400, 280, 40);

        txtApePaterno.setEditable(false);
        txtApePaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtApePaterno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApePaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApePaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApePaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApePaterno);
        txtApePaterno.setBounds(730, 450, 500, 40);

        lblApeMaterno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApeMaterno.setForeground(new java.awt.Color(0, 102, 153));
        lblApeMaterno.setText("APELLIDO MATERNO");
        getContentPane().add(lblApeMaterno);
        lblApeMaterno.setBounds(1460, 400, 230, 40);

        txtApeMaterno.setEditable(false);
        txtApeMaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtApeMaterno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApeMaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApeMaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApeMaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApeMaterno);
        txtApeMaterno.setBounds(1320, 450, 500, 40);

        lblTelefonoCel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTelefonoCel.setForeground(new java.awt.Color(0, 102, 153));
        lblTelefonoCel.setText("TELEFONO CELULAR");
        getContentPane().add(lblTelefonoCel);
        lblTelefonoCel.setBounds(620, 810, 250, 40);

        txtTelefonoCel.setEditable(false);
        txtTelefonoCel.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoCel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtTelefonoCel.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoCel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoCel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtTelefonoCel);
        txtTelefonoCel.setBounds(470, 860, 500, 40);

        lblSexo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(0, 102, 153));
        lblSexo.setText("SEXO");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(950, 530, 70, 40);

        txtSexo.setEditable(false);
        txtSexo.setBackground(new java.awt.Color(255, 255, 255));
        txtSexo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(0, 0, 0));
        txtSexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSexo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtSexo);
        txtSexo.setBounds(860, 580, 250, 40);

        lblFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(0, 102, 153));
        lblFechaNacimiento.setText("FECHA NACIMIENTO");
        getContentPane().add(lblFechaNacimiento);
        lblFechaNacimiento.setBounds(1450, 540, 240, 40);

        txtFechaNacimiento.setEditable(false);
        txtFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtFechaNacimiento);
        txtFechaNacimiento.setBounds(1320, 590, 500, 40);

        lblEspecialidad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblEspecialidad.setForeground(new java.awt.Color(0, 102, 153));
        lblEspecialidad.setText("ESPECIALIDAD");
        getContentPane().add(lblEspecialidad);
        lblEspecialidad.setBounds(290, 530, 190, 40);

        txtEspecialidad.setEditable(false);
        txtEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtEspecialidad.setForeground(new java.awt.Color(0, 0, 0));
        txtEspecialidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtEspecialidad);
        txtEspecialidad.setBounds(140, 580, 500, 40);

        lblCedula.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 102, 153));
        lblCedula.setText("NUMERO CEDULA PROFESIONAL");
        getContentPane().add(lblCedula);
        lblCedula.setBounds(810, 660, 380, 40);

        txtCedula.setEditable(false);
        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCedula.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCedula);
        txtCedula.setBounds(740, 710, 500, 40);

        lblRFC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblRFC.setForeground(new java.awt.Color(0, 102, 153));
        lblRFC.setText("RFC");
        getContentPane().add(lblRFC);
        lblRFC.setBounds(1540, 660, 60, 40);

        txtRFC.setEditable(false);
        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRFC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtRFC);
        txtRFC.setBounds(1320, 710, 500, 40);

        lblCURP.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCURP.setForeground(new java.awt.Color(0, 102, 153));
        lblCURP.setText("CURP");
        getContentPane().add(lblCURP);
        lblCURP.setBounds(360, 660, 70, 40);

        txtCURP.setEditable(false);
        txtCURP.setBackground(new java.awt.Color(255, 255, 255));
        txtCURP.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCURP.setForeground(new java.awt.Color(0, 0, 0));
        txtCURP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCURP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCURP);
        txtCURP.setBounds(140, 710, 500, 40);

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
        btnBuscar.setBounds(880, 320, 200, 40);

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

        lblTelefonoFijo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTelefonoFijo.setForeground(new java.awt.Color(0, 102, 153));
        lblTelefonoFijo.setText("TELEFONO FIJO");
        getContentPane().add(lblTelefonoFijo);
        lblTelefonoFijo.setBounds(1170, 810, 180, 40);

        txtTelefonoFijo.setEditable(false);
        txtTelefonoFijo.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoFijo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtTelefonoFijo.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoFijo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoFijo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtTelefonoFijo);
        txtTelefonoFijo.setBounds(1000, 860, 500, 40);

        lblImagenClinica.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(lblImagenClinica);
        lblImagenClinica.setBounds(60, 10, 130, 130);

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

        lblImagenCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblImagenCabecera);
        lblImagenCabecera.setBounds(0, 0, 1920, 150);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String idEspecialista = txtIDEspecialista.getText();

        if (txtIDEspecialista.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA EL ID DE ESPECIALISTA",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {
                String sql = "SELECT * FROM MARIA.ESPECIALISTA WHERE pk_idEspecialista = '" + idEspecialista + "'";
                cn = conexion.getConection();
                st = cn.createStatement();
                rs = st.executeQuery(sql);

                while (rs.next()) {
                    txtNombre.setText(rs.getString("nombre_esp"));
                    txtApePaterno.setText(rs.getString("apepaterno_esp"));
                    txtApeMaterno.setText(rs.getString("apematerno_esp"));
                    txtSexo.setText(rs.getString("sexo_esp"));
                    txtFechaNacimiento.setText(rs.getString("fechanacimiento_esp"));
                    txtEspecialidad.setText(rs.getString("especialidad"));
                    txtCedula.setText(rs.getString("num_cedula"));
                    txtRFC.setText(rs.getString("rfc_esp"));
                    txtCURP.setText(rs.getString("curp_esp"));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }

            try {
                String sql = "SELECT * FROM MARIA.TELEFONO_ESP WHERE fk_idEspecialista = '" + idEspecialista + "'";
                cn = conexion.getConection();
                st = cn.createStatement();
                rs = st.executeQuery(sql);

                while (rs.next()) {
                    txtTelefonoCel.setText(rs.getString("telefono_cel"));
                    txtTelefonoFijo.setText(rs.getString("telefono_casa"));
                    JOptionPane.showMessageDialog(null, "EL ESPECIALISTA HA SIDO ENCONTRADO",
                            "ESPECIALISTA ENCONTRADA", JOptionPane.DEFAULT_OPTION, confirmar);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }

            if (txtIDEspecialista.getText().isEmpty() || txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "EL ESPECIALISTA NO HA SIDO ENCONTRADO",
                        "ESPECIALISTA NO ENCONTRADA", JOptionPane.DEFAULT_OPTION, error);

            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String idEspecialista = txtIDEspecialista.getText();

        if (txtIDEspecialista.getText().isEmpty() || txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO BUSQUE LOS DATOS DE PACIENTE",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR LOS DATOS DEL ESPECIALISTA?", "¿SEGURO?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, pregunta);
            if (res == 0) {

                String sql = "DELETE FROM MARIA.ESPECIALISTA WHERE pk_idEspecialista = '" + idEspecialista + "'";

                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }

                String sqlTel = "DELETE FROM MARIA.TELEFONO_ESP WHERE fk_idEspecialista = '" + idEspecialista + "'";

                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    st.executeUpdate(sqlTel);

                    JOptionPane.showMessageDialog(null, "EL EL ESPECIALISTA HA SIDO ELIMINADO CORRECTAMENTE", "ESPECIALISTA ELIMINADO",
                            JOptionPane.DEFAULT_OPTION, confirmar);

                    txtApeMaterno.setText("");
                    txtApePaterno.setText("");
                    txtCURP.setText("");
                    txtCedula.setText("");
                    txtEspecialidad.setText("");
                    txtFechaNacimiento.setText("");
                    txtIDEspecialista.setText("");
                    txtNombre.setText("");
                    txtRFC.setText("");
                    txtSexo.setText("");
                    txtTelefonoCel.setText("");
                    txtTelefonoFijo.setText("");

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "OK, LOS DATOS DEL ESPECIALISTA NO HAN SIDO ELIMINADOS", "DATOS NO ELIMINADOS",
                        JOptionPane.DEFAULT_OPTION, pregunta);
            }

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ELIMINAR_Especialista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblApeMaterno;
    private javax.swing.JLabel lblApePaterno;
    private javax.swing.JLabel lblCURP;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIDEspecialista;
    private javax.swing.JLabel lblImagenCabecera;
    private javax.swing.JLabel lblImagenClinica;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTelefonoCel;
    private javax.swing.JLabel lblTelefonoFijo;
    private javax.swing.JTextField txtApeMaterno;
    private javax.swing.JTextField txtApePaterno;
    private javax.swing.JTextField txtCURP;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIDEspecialista;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefonoCel;
    private javax.swing.JTextField txtTelefonoFijo;
    // End of variables declaration//GEN-END:variables
}
