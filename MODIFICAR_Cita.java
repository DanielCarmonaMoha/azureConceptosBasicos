
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MODIFICAR_Cita extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public MODIFICAR_Cita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDCita = new javax.swing.JTextField();
        lblIDPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        lblIDEspecialista = new javax.swing.JLabel();
        txtIDEspecialista = new javax.swing.JTextField();
        lblConsultorio = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        lblObservaciones = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        cbxConsultorio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        cbxStatus = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        lblCabecera = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificar Datos de Cita Médica");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(680, 50, 680, 58);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("ID CITA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(900, 200, 90, 30);

        txtIDCita.setBackground(new java.awt.Color(255, 255, 255));
        txtIDCita.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDCita.setForeground(new java.awt.Color(0, 0, 0));
        txtIDCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDCita.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDCita);
        txtIDCita.setBounds(710, 240, 500, 40);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(300, 350, 150, 30);

        txtIDPaciente.setEditable(false);
        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(130, 390, 500, 40);

        lblIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDEspecialista.setForeground(new java.awt.Color(0, 102, 153));
        lblIDEspecialista.setText("ID ESPECIALISTA");
        getContentPane().add(lblIDEspecialista);
        lblIDEspecialista.setBounds(1430, 350, 190, 30);

        txtIDEspecialista.setEditable(false);
        txtIDEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        txtIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        txtIDEspecialista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDEspecialista);
        txtIDEspecialista.setBounds(1280, 390, 500, 40);

        lblConsultorio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblConsultorio.setForeground(new java.awt.Color(0, 102, 153));
        lblConsultorio.setText("CONSULTORIO");
        getContentPane().add(lblConsultorio);
        lblConsultorio.setBounds(300, 480, 170, 30);

        lblFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 102, 153));
        lblFecha.setText("FECHA");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(920, 480, 80, 30);

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        txtFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFocusLost(evt);
            }
        });
        getContentPane().add(txtFecha);
        txtFecha.setBounds(710, 520, 500, 40);

        lblHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 102, 153));
        lblHora.setText("HORA");
        getContentPane().add(lblHora);
        lblHora.setBounds(1500, 480, 70, 30);

        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        txtHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraFocusLost(evt);
            }
        });
        getContentPane().add(txtHora);
        txtHora.setBounds(1280, 520, 500, 40);

        lblStatus.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 102, 153));
        lblStatus.setText("STATUS");
        getContentPane().add(lblStatus);
        lblStatus.setBounds(610, 610, 90, 30);

        lblTurno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(0, 102, 153));
        lblTurno.setText("TURNO");
        getContentPane().add(lblTurno);
        lblTurno.setBounds(1190, 610, 90, 30);

        txtTurno.setEditable(false);
        txtTurno.setBackground(new java.awt.Color(255, 255, 255));
        txtTurno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtTurno.setForeground(new java.awt.Color(0, 0, 0));
        txtTurno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTurno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtTurno);
        txtTurno.setBounds(990, 650, 500, 40);

        lblObservaciones.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(0, 102, 153));
        lblObservaciones.setText("OBSERVACIONES PREVIAS");
        getContentPane().add(lblObservaciones);
        lblObservaciones.setBounds(790, 750, 300, 30);

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
        btnBuscar.setBounds(850, 300, 200, 40);

        cbxConsultorio.setBackground(new java.awt.Color(255, 255, 255));
        cbxConsultorio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxConsultorio.setForeground(new java.awt.Color(0, 0, 0));
        cbxConsultorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONSULTORIO 1", "CONSULTORIO 2", "CONSULTORIO 3", "CONSULTORIO 4", "CONSULTORIO 5" }));
        cbxConsultorio.setSelectedIndex(-1);
        cbxConsultorio.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxConsultorio);
        cbxConsultorio.setBounds(130, 520, 500, 40);

        txtObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane1.setViewportView(txtObservaciones);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(440, 800, 1030, 83);

        cbxStatus.setBackground(new java.awt.Color(255, 255, 255));
        cbxStatus.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxStatus.setForeground(new java.awt.Color(0, 0, 0));
        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EN ESPERA", "CANCELADA" }));
        cbxStatus.setSelectedIndex(-1);
        cbxStatus.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxStatus);
        cbxStatus.setBounds(400, 650, 500, 40);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(lblImagen);
        lblImagen.setBounds(70, 20, 128, 120);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblCabecera);
        lblCabecera.setBounds(0, 0, 1920, 150);

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

        setSize(new java.awt.Dimension(1938, 1127));
        setLocationRelativeTo(null);
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
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }

            String sqlAgendar_Cita = "SELECT * FROM MARIA.AGENDAR_CITA WHERE fk_idCita = '" + idCita + "'";

            try {
                cn = conexion.getConection();
                st = cn.createStatement();
                rs = st.executeQuery(sqlAgendar_Cita);

                while (rs.next()) {

                    txtIDEspecialista.setText(rs.getString("fk_idEspecialista"));
                    cbxConsultorio.setSelectedItem(rs.getString("consultorio"));
                    txtFecha.setText(rs.getString("fechacita"));
                    txtHora.setText(rs.getString("horacita"));
                    txtTurno.setText(rs.getString("turno"));
                    cbxStatus.setSelectedItem(rs.getString("status"));
                    txtObservaciones.setText(rs.getString("observaciones"));

                    JOptionPane.showMessageDialog(null, "LA CITA DEL PACIENTE HA SIDO ENCONTRADA", "CITA ENCONTRADA",
                            JOptionPane.DEFAULT_OPTION, confirmar);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }

        }

        if (txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LA CITA DEL PACIENTE NO FUE ENCONTRADA", "CITA NO ENCONTRADA",
                    JOptionPane.DEFAULT_OPTION, error);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        Calendar calendario = new GregorianCalendar();

        int año = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        String fecha1 = txtFecha.getText();

        LocalDate fechaCita = LocalDate.parse(fecha1);
        LocalDate fechaActual = LocalDate.of(año, mes, dia);

        String idCita = txtIDCita.getText();
        String consul = (String) cbxConsultorio.getSelectedItem();
        String fecha = txtFecha.getText();
        String hora = txtHora.getText();
        String status = (String) cbxStatus.getSelectedItem();
        String turno = txtTurno.getText();
        String obser = txtObservaciones.getText();

        String sql = "UPDATE MARIA.AGENDAR_CITA SET consultorio = '" + consul + "', fechacita = '" + fecha + "', "
                + "horacita = '" + hora + "', status = '" + status + "', turno = '" + turno + "', "
                + "observaciones = '" + obser + "' WHERE fk_idCita = '" + idCita + "'";

        if (txtIDCita.getText().isEmpty() || txtHora.getText().isEmpty() || txtFecha.getText().isEmpty()
                || txtObservaciones.getText().isEmpty() || txtTurno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, RELLENE TODOS LOS CAMPOS",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else if (fechaCita.isBefore(fechaActual)) {
            JOptionPane.showMessageDialog(null, "NO PUEDE INTRODUCIR FECHAS ANTERIORES", "ERROR DE FECHA",
                    JOptionPane.DEFAULT_OPTION, error);
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO EN MODIFICAR LOS DATOS DE LA CITA MEDICA?", "¿SSEGURO?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, pregunta);
            if (res == 0) {
                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "LA CITA MEDICA HA SIDO MODIFICADA", "CITA MEDICA MODIFICADA",
                            JOptionPane.DEFAULT_OPTION, confirmar);

                    cbxConsultorio.setSelectedIndex(-1);
                    txtFecha.setText("");
                    txtHora.setText("");
                    txtIDCita.setText("");
                    txtIDEspecialista.setText("");
                    txtIDPaciente.setText("");
                    txtObservaciones.setText("");
                    cbxStatus.setSelectedIndex(-1);
                    txtTurno.setText("");

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else {
                JOptionPane.showMessageDialog(null, "OK, LOS DATOS DE LA CITA MEDICA NO HAN SIDO MODIFICADOS", "DATOS NO MODIFICADOS",
                        JOptionPane.DEFAULT_OPTION, error);
            }

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusLost

        Calendar calendario = new GregorianCalendar();

        int año = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        String fecha1 = txtFecha.getText();

        LocalDate fechaCita = LocalDate.parse(fecha1);
        LocalDate fechaActual = LocalDate.of(año, mes, dia);

        if (fechaCita.isBefore(fechaActual)) {
            JOptionPane.showMessageDialog(null, "NO PUEDE INTRODUCIR FECHAS ANTERIORES", "ERROR DE FECHA",
                    JOptionPane.DEFAULT_OPTION, error);
        }
    }//GEN-LAST:event_txtFechaFocusLost

    private void txtHoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFocusLost

        String hora = txtHora.getText();

        String horaCadena = hora.substring(0, 2);

        int horaC = Integer.parseInt(horaCadena);
        System.out.println(horaC);

        if (horaC < 12) {
            txtTurno.setText("MATUTINO");
        } else {
            txtTurno.setText("VESPERTINO");
        }
    }//GEN-LAST:event_txtHoraFocusLost

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODIFICAR_Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxConsultorio;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblConsultorio;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIDEspecialista;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIDCita;
    private javax.swing.JTextField txtIDEspecialista;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
