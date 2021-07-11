
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ELIMINAR_Cita extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public ELIMINAR_Cita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDCita = new javax.swing.JTextField();
        lblIDCita = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtIDPaciente = new javax.swing.JTextField();
        lblPaciente = new javax.swing.JLabel();
        txtIDEspecialista = new javax.swing.JTextField();
        lblIDEspecialista = new javax.swing.JLabel();
        txtConsultorio = new javax.swing.JTextField();
        lblConsultorio = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        lblTurno = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        lblCancelar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblImagenCabecera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eliminar Cita Médica");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(780, 50, 460, 58);

        txtIDCita.setBackground(new java.awt.Color(255, 255, 255));
        txtIDCita.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDCita.setForeground(new java.awt.Color(0, 0, 0));
        txtIDCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDCita.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDCita);
        txtIDCita.setBounds(700, 220, 500, 40);

        lblIDCita.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDCita.setForeground(new java.awt.Color(0, 102, 153));
        lblIDCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDCita.setText("ID CITA");
        getContentPane().add(lblIDCita);
        lblIDCita.setBounds(900, 180, 90, 29);

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
        btnBuscar.setBounds(850, 280, 200, 40);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(150, 370, 500, 40);

        lblPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPaciente.setText("ID PACIENTE");
        getContentPane().add(lblPaciente);
        lblPaciente.setBounds(330, 330, 150, 29);

        txtIDEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        txtIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        txtIDEspecialista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDEspecialista);
        txtIDEspecialista.setBounds(1270, 370, 500, 40);

        lblIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDEspecialista.setForeground(new java.awt.Color(0, 102, 153));
        lblIDEspecialista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDEspecialista.setText("ID ESPECIALISTA");
        getContentPane().add(lblIDEspecialista);
        lblIDEspecialista.setBounds(1420, 330, 200, 29);

        txtConsultorio.setBackground(new java.awt.Color(255, 255, 255));
        txtConsultorio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtConsultorio.setForeground(new java.awt.Color(0, 0, 0));
        txtConsultorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConsultorio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtConsultorio);
        txtConsultorio.setBounds(150, 530, 500, 40);

        lblConsultorio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblConsultorio.setForeground(new java.awt.Color(0, 102, 153));
        lblConsultorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultorio.setText("CONSULTORIO");
        getContentPane().add(lblConsultorio);
        lblConsultorio.setBounds(320, 490, 160, 29);

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtFecha);
        txtFecha.setBounds(710, 530, 500, 40);

        lblFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 102, 153));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("FECHA");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(930, 490, 74, 29);

        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtHora);
        txtHora.setBounds(1270, 530, 500, 40);

        lblHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 102, 153));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("HORA");
        getContentPane().add(lblHora);
        lblHora.setBounds(1490, 490, 70, 29);

        txtStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtStatus.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(0, 0, 0));
        txtStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStatus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtStatus);
        txtStatus.setBounds(150, 690, 500, 40);

        lblStatus.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 102, 153));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("STATUS");
        getContentPane().add(lblStatus);
        lblStatus.setBounds(370, 650, 90, 29);

        txtTurno.setBackground(new java.awt.Color(255, 255, 255));
        txtTurno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtTurno.setForeground(new java.awt.Color(0, 0, 0));
        txtTurno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTurno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtTurno);
        txtTurno.setBounds(1270, 700, 500, 40);

        lblTurno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(0, 102, 153));
        lblTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTurno.setText("TURNO");
        getContentPane().add(lblTurno);
        lblTurno.setBounds(1490, 660, 80, 29);

        lblObservaciones.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(0, 102, 153));
        lblObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObservaciones.setText("OBSERVACIONES PREVIAS");
        getContentPane().add(lblObservaciones);
        lblObservaciones.setBounds(820, 790, 310, 29);

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

        txtObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane1.setViewportView(txtObservaciones);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(470, 830, 1020, 100);

        lblCancelar.setBackground(new java.awt.Color(204, 0, 0));
        lblCancelar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setText("CANCELAR");
        lblCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(lblCancelar);
        lblCancelar.setBounds(60, 900, 200, 50);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(lblImagen);
        lblImagen.setBounds(40, 10, 128, 130);

        lblImagenCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblImagenCabecera);
        lblImagenCabecera.setBounds(0, 0, 1920, 150);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String idCita = txtIDCita.getText();
        String sqlCita = "SELECT pk_idCita, fk_idPaciente FROM MARIA.CITA WHERE pk_idCita = '" + idCita + "'";

        if (txtIDCita.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA EL ID DE CITA",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {
                cn = conexion.getConection();
                st = cn.createStatement();
                rs = st.executeQuery(sqlCita);

                while (rs.next()) {

                    txtIDCita.setText(rs.getString("pk_idCita"));
                    txtIDPaciente.setText(rs.getString("fk_idPaciente"));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "exception: " + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }

            String sqlAgendar_Cita = "SELECT * FROM MARIA.AGENDAR_CITA WHERE fk_idCita = '" + idCita + "'";

            try {
                cn = conexion.getConection();
                st = cn.createStatement();
                rs = st.executeQuery(sqlAgendar_Cita);

                while (rs.next()) {

                    txtIDEspecialista.setText(rs.getString("fk_idEspecialista"));
                    txtConsultorio.setText(rs.getString("consultorio"));
                    txtFecha.setText(rs.getString("fechacita"));
                    txtHora.setText(rs.getString("horacita"));
                    txtTurno.setText(rs.getString("turno"));
                    txtStatus.setText(rs.getString("status"));
                    txtObservaciones.setText(rs.getString("observaciones"));

                    JOptionPane.showMessageDialog(null, "LA CITA DEL PACIENTE HA SIDO ENCONTRADA",
                            "CITA ENCONTRADA", JOptionPane.DEFAULT_OPTION, confirmar);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "exception: " + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }

        }

        if (txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LA CITA DEL PACIENTE NO HA SIDO ENCONTRADA",
                    "CITA NO ENCONTRADA", JOptionPane.DEFAULT_OPTION, error);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String idCita = txtIDCita.getText();

        String sql = "DELETE FROM MARIA.CITA WHERE pk_idCita = '" + idCita + "'";

        if (txtIDCita.getText().isEmpty() || txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO BUSQUE LA CITA MEDICA",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR LOS DATOS DE LA CITA MEDICA?", "¿SEGURO?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, pregunta);

            if (res == 0) {
                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);

                    JOptionPane.showMessageDialog(null, "LA CITA HA SIDO ELIMINADO CORRECTAMENTE", "CITA ELIMINADA",
                            JOptionPane.DEFAULT_OPTION, confirmar);

                    txtConsultorio.setText("");
                    txtFecha.setText("");
                    txtHora.setText("");
                    txtIDCita.setText("");
                    txtIDEspecialista.setText("");
                    txtIDPaciente.setText("");
                    txtObservaciones.setText("");
                    txtStatus.setText("");
                    txtTurno.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else if (res == 1) {
                JOptionPane.showMessageDialog(null, "OK, LOS DATOS DE LA CITA MEDICA NO HAN SIDO BORRADOS", "DATOS NO BORRADOS",
                        JOptionPane.DEFAULT_OPTION, pregunta);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void lblCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ELIMINAR_Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lblCancelar;
    private javax.swing.JLabel lblConsultorio;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIDCita;
    private javax.swing.JLabel lblIDEspecialista;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenCabecera;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JTextField txtConsultorio;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIDCita;
    private javax.swing.JTextField txtIDEspecialista;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
