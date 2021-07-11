
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ELIMINAR_Expediente_Diagnostico extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public ELIMINAR_Expediente_Diagnostico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSubtitulo = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        lblIDEspecialista = new javax.swing.JLabel();
        txtIDEspecialista = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lblIMC = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        lblPresion = new javax.swing.JLabel();
        txtPresion = new javax.swing.JTextField();
        txtNivelPeso = new javax.swing.JTextField();
        lblMotivo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        lblDiagnostico = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        lblRecetario = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRecetario = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblHoraExp = new javax.swing.JLabel();
        lblFechaExp = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        lblIDPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblImagenCabecera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Eliminar Diágnostico de Especialista");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(540, 50, 810, 58);

        lblFolio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFolio.setForeground(new java.awt.Color(0, 102, 153));
        lblFolio.setText("FOLIO");
        getContentPane().add(lblFolio);
        lblFolio.setBounds(910, 190, 70, 29);

        txtFolio.setBackground(new java.awt.Color(255, 255, 255));
        txtFolio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFolio.setForeground(new java.awt.Color(0, 0, 0));
        txtFolio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFolio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtFolio);
        txtFolio.setBounds(700, 230, 500, 40);

        lblIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDEspecialista.setForeground(new java.awt.Color(0, 102, 153));
        lblIDEspecialista.setText("ID ESPECIALISTA");
        getContentPane().add(lblIDEspecialista);
        lblIDEspecialista.setBounds(250, 300, 200, 29);

        txtIDEspecialista.setEditable(false);
        txtIDEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        txtIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        txtIDEspecialista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDEspecialista);
        txtIDEspecialista.setBounds(110, 340, 500, 40);

        lblEdad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(0, 102, 153));
        lblEdad.setText("EDAD");
        getContentPane().add(lblEdad);
        lblEdad.setBounds(140, 420, 120, 29);

        txtEdad.setEditable(false);
        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtEdad);
        txtEdad.setBounds(110, 460, 225, 40);

        lblPeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(0, 102, 153));
        lblPeso.setText("PESO");
        getContentPane().add(lblPeso);
        lblPeso.setBounds(380, 420, 120, 29);

        txtPeso.setEditable(false);
        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtPeso);
        txtPeso.setBounds(380, 460, 225, 40);

        lblAltura.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblAltura.setForeground(new java.awt.Color(0, 102, 153));
        lblAltura.setText("ALTURA");
        getContentPane().add(lblAltura);
        lblAltura.setBounds(710, 420, 120, 29);

        txtAltura.setEditable(false);
        txtAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtAltura.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtAltura.setForeground(new java.awt.Color(0, 0, 0));
        txtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAltura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtAltura);
        txtAltura.setBounds(710, 460, 225, 40);

        lblIMC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIMC.setForeground(new java.awt.Color(0, 102, 153));
        lblIMC.setText("IMC");
        getContentPane().add(lblIMC);
        lblIMC.setBounds(990, 420, 120, 29);

        txtIMC.setEditable(false);
        txtIMC.setBackground(new java.awt.Color(255, 255, 255));
        txtIMC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIMC.setForeground(new java.awt.Color(0, 0, 0));
        txtIMC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIMC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIMC);
        txtIMC.setBounds(990, 460, 225, 40);

        lblPresion.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPresion.setForeground(new java.awt.Color(0, 102, 153));
        lblPresion.setText("PRESIÓN ARTERIAL");
        getContentPane().add(lblPresion);
        lblPresion.setBounds(1600, 420, 220, 29);

        txtPresion.setEditable(false);
        txtPresion.setBackground(new java.awt.Color(255, 255, 255));
        txtPresion.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtPresion.setForeground(new java.awt.Color(0, 0, 0));
        txtPresion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPresion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtPresion);
        txtPresion.setBounds(1600, 460, 225, 40);

        txtNivelPeso.setEditable(false);
        txtNivelPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtNivelPeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNivelPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtNivelPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNivelPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNivelPeso);
        txtNivelPeso.setBounds(1330, 460, 225, 40);

        lblMotivo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblMotivo.setForeground(new java.awt.Color(0, 102, 153));
        lblMotivo.setText("MOTIVO DE CONSULTA");
        getContentPane().add(lblMotivo);
        lblMotivo.setBounds(110, 540, 270, 29);

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("NIVEL PESO");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1330, 420, 160, 29);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        txtMotivo.setEditable(false);
        txtMotivo.setBackground(new java.awt.Color(255, 255, 255));
        txtMotivo.setColumns(20);
        txtMotivo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtMotivo.setForeground(new java.awt.Color(0, 0, 0));
        txtMotivo.setRows(5);
        jScrollPane1.setViewportView(txtMotivo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 580, 760, 130);

        lblDiagnostico.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblDiagnostico.setForeground(new java.awt.Color(0, 102, 153));
        lblDiagnostico.setText("DIAGNOSTICO");
        getContentPane().add(lblDiagnostico);
        lblDiagnostico.setBounds(1070, 550, 170, 29);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        txtDiagnostico.setEditable(false);
        txtDiagnostico.setBackground(new java.awt.Color(255, 255, 255));
        txtDiagnostico.setColumns(20);
        txtDiagnostico.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtDiagnostico.setForeground(new java.awt.Color(0, 0, 0));
        txtDiagnostico.setRows(5);
        jScrollPane2.setViewportView(txtDiagnostico);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1070, 590, 760, 130);

        lblRecetario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblRecetario.setForeground(new java.awt.Color(0, 102, 153));
        lblRecetario.setText("RECETARIO");
        getContentPane().add(lblRecetario);
        lblRecetario.setBounds(900, 750, 140, 29);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));

        txtRecetario.setEditable(false);
        txtRecetario.setBackground(new java.awt.Color(255, 255, 255));
        txtRecetario.setColumns(20);
        txtRecetario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtRecetario.setForeground(new java.awt.Color(0, 0, 0));
        txtRecetario.setRows(5);
        txtRecetario.setBorder(null);
        jScrollPane3.setViewportView(txtRecetario);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(580, 790, 760, 130);

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
        btnBuscar.setBounds(830, 290, 250, 40);

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
        btnEliminar.setBounds(1630, 900, 250, 40);

        lblHoraExp.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHoraExp.setForeground(new java.awt.Color(0, 102, 153));
        lblHoraExp.setText("HORA EXPEDIDA");
        getContentPane().add(lblHoraExp);
        lblHoraExp.setBounds(1650, 70, 220, 40);

        lblFechaExp.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFechaExp.setForeground(new java.awt.Color(0, 102, 153));
        lblFechaExp.setText("FECHA EXPEDIDA");
        getContentPane().add(lblFechaExp);
        lblFechaExp.setBounds(1640, 10, 220, 40);

        txtFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setText("0000-00-00");
        getContentPane().add(txtFecha);
        txtFecha.setBounds(1680, 40, 140, 40);

        txtHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setText("00:00:00");
        getContentPane().add(txtHora);
        txtHora.setBounds(1700, 100, 90, 40);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(1330, 290, 200, 29);

        txtIDPaciente.setEditable(false);
        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(1330, 330, 500, 40);

        btnCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(60, 900, 200, 40);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(lblImagen);
        lblImagen.setBounds(80, 20, 130, 120);

        lblImagenCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblImagenCabecera);
        lblImagenCabecera.setBounds(0, 0, 1920, 150);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String folio = txtFolio.getText();

        String sql = "SELECT * FROM MARIA.EXPEDIENTE_DIAGNOSTICO WHERE folio = '" + folio + "'";

        if (txtFolio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA FOLIO DE EXPEDIENTE",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {
                cn = conexion.getConection();
                st = cn.createStatement();
                rs = st.executeQuery(sql);

                while (rs.next()) {

                    txtIDEspecialista.setText(rs.getString("fk_idEspecialista"));
                    txtIDPaciente.setText(rs.getString("fk_idPaciente"));
                    txtEdad.setText(rs.getString("edad_Paciente"));
                    txtPeso.setText(rs.getString("peso"));
                    txtAltura.setText(rs.getString("altura"));
                    txtIMC.setText(rs.getString("imc"));
                    txtNivelPeso.setText(rs.getString("nivel_peso"));
                    txtPresion.setText(rs.getString("presionarterial"));
                    txtMotivo.setText(rs.getString("motivoconsulta"));
                    txtDiagnostico.setText(rs.getString("diagnostico"));
                    txtRecetario.setText(rs.getString("recetario"));
                    txtFecha.setText(rs.getString("fechaexp"));
                    txtHora.setText(rs.getString("horaexp"));

                    JOptionPane.showMessageDialog(null, "EL DIAGNOSTICO DEL PACIENTE HA SIDO ENCONTRADO", "DIAGNOSTICO ENCONTRADO",
                            JOptionPane.DEFAULT_OPTION, confirmar);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }
        }

        if (txtIDEspecialista.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "EL DIAGNOSTICO DEL PACIENTE NO HA SIDO ENCONTRADO", "DIAGNOSTICO NO ENCONTRADO",
                    JOptionPane.DEFAULT_OPTION, error);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String folio = txtFolio.getText();

        String sql = "DELETE FROM MARIA.EXPEDIENTE_DIAGNOSTICO WHERE folio = '" + folio + "'";

        if (txtFolio.getText().isEmpty() || txtIDEspecialista.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO BUSQUE LA CITA MEDICA",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR LOS DATOS DE DIAGNOSTICO?", "¿SEGURO?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, pregunta);

            if (res == 0) {
                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);

                    JOptionPane.showMessageDialog(null, "LOS DATOS SE HAN SIDO ELIMINADO CORRECTAMENTE", "DIAGNOSTICO ELIMINADO",
                            JOptionPane.DEFAULT_OPTION, confirmar);

                            txtAltura.setText("");
                            txtDiagnostico.setText("");
                            txtEdad.setText("");
                            txtFecha.setText("");
                            txtFolio.setText("");
                            txtHora.setText("");
                            txtIDEspecialista.setText("");
                            txtIMC.setText("");
                            txtMotivo.setText("");
                            txtNivelPeso.setText("");
                            txtPeso.setText("");
                            txtPresion.setText("");
                            txtRecetario.setText("");
                            txtIDPaciente.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else if (res == 1) {
                JOptionPane.showMessageDialog(null, "OK, LOS DATOS DEL DIAGNOSTICO NO HAN SIDO BORRADOS", "DATOS NO BORRADOS",
                        JOptionPane.DEFAULT_OPTION, pregunta);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ELIMINAR_Expediente_Diagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblFechaExp;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblHoraExp;
    private javax.swing.JLabel lblIDEspecialista;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenCabecera;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPresion;
    private javax.swing.JLabel lblRecetario;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JLabel txtHora;
    private javax.swing.JTextField txtIDEspecialista;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextField txtIMC;
    private javax.swing.JTextArea txtMotivo;
    private javax.swing.JTextField txtNivelPeso;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPresion;
    private javax.swing.JTextArea txtRecetario;
    // End of variables declaration//GEN-END:variables
}
