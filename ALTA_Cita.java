
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public final class ALTA_Cita extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    //FECHA
    Calendar calendario = new GregorianCalendar();

    int año = calendario.get(Calendar.YEAR);
    String añoActual = "" + año;
    int mes = calendario.get(Calendar.MONTH);
    String mesActual = "" + mes;
    int dia = calendario.get(Calendar.DAY_OF_MONTH);
    String diaActual = "" + dia;

    String fechaActual = año + "-" + mes + "-" + dia;

    //HORARIO
    int hora = calendario.get(Calendar.HOUR_OF_DAY);
    int minutos = calendario.get(Calendar.MINUTE);
    int segundos = calendario.get(Calendar.SECOND);
    String horaActual = hora + ":" + minutos + ":" + segundos;

    ImageIcon advertencia_t = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/advertencia.png");
    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public ALTA_Cita() {
        initComponents();
        lblFechaActual.setText(fechaActual);
        lblHoraActual.setText(horaActual);
        cbxAño.setSelectedItem(añoActual);
        cbxMes.setSelectedIndex(mes);
        cbxDia.setSelectedIndex(dia);
        Incrementar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIDCita = new javax.swing.JLabel();
        txtIDCita = new javax.swing.JTextField();
        lblSubtitulo = new javax.swing.JLabel();
        lblHoraActual = new javax.swing.JLabel();
        lblFechaActual = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        lblHoraCita = new javax.swing.JLabel();
        txtIDEspecialista = new javax.swing.JTextField();
        lblIDEspecialista = new javax.swing.JLabel();
        cbxDia = new javax.swing.JComboBox<>();
        cbxMinuto = new javax.swing.JComboBox<>();
        cbxHora = new javax.swing.JComboBox<>();
        lblFecha = new javax.swing.JLabel();
        cbxConsultorio = new javax.swing.JComboBox<>();
        cbxAño = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        lblConsultorio = new javax.swing.JLabel();
        lblPaciente1 = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        cbxTurno = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnImprimir = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblCabecera = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnBuscarPaciente = new javax.swing.JButton();
        btnBuscarEspe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Cita Medica");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        lblIDCita.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDCita.setForeground(new java.awt.Color(0, 102, 153));
        lblIDCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDCita.setText("ID CITA");
        getContentPane().add(lblIDCita);
        lblIDCita.setBounds(340, 240, 80, 29);

        txtIDCita.setEditable(false);
        txtIDCita.setBackground(new java.awt.Color(255, 255, 255));
        txtIDCita.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDCita.setForeground(new java.awt.Color(0, 0, 0));
        txtIDCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDCita.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        txtIDCita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtIDCita);
        txtIDCita.setBounds(130, 280, 500, 40);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Registro de Citas Médicas");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(670, 50, 570, 60);

        lblHoraActual.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHoraActual.setForeground(new java.awt.Color(0, 0, 0));
        lblHoraActual.setText("00:00:00");
        getContentPane().add(lblHoraActual);
        lblHoraActual.setBounds(1790, 100, 100, 29);

        lblFechaActual.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFechaActual.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaActual.setText("0000/00/00");
        getContentPane().add(lblFechaActual);
        lblFechaActual.setBounds(1650, 100, 130, 29);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(700, 280, 500, 40);

        lblHoraCita.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHoraCita.setForeground(new java.awt.Color(0, 102, 153));
        lblHoraCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoraCita.setText("HORA");
        getContentPane().add(lblHoraCita);
        lblHoraCita.setBounds(1510, 420, 80, 29);

        txtIDEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        txtIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        txtIDEspecialista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDEspecialista);
        txtIDEspecialista.setBounds(1300, 280, 500, 40);

        lblIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDEspecialista.setForeground(new java.awt.Color(0, 102, 153));
        lblIDEspecialista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDEspecialista.setText("ID ESPECIALISTA");
        getContentPane().add(lblIDEspecialista);
        lblIDEspecialista.setBounds(1440, 240, 200, 29);

        cbxDia.setBackground(new java.awt.Color(255, 255, 255));
        cbxDia.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxDia.setForeground(new java.awt.Color(0, 0, 0));
        cbxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbxDia.setSelectedIndex(-1);
        cbxDia.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxDia);
        cbxDia.setBounds(1050, 460, 150, 40);

        cbxMinuto.setBackground(new java.awt.Color(255, 255, 255));
        cbxMinuto.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxMinuto.setForeground(new java.awt.Color(0, 0, 0));
        cbxMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));
        cbxMinuto.setSelectedIndex(-1);
        cbxMinuto.setSelectedItem(-1);
        cbxMinuto.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxMinuto);
        cbxMinuto.setBounds(1560, 460, 150, 40);

        cbxHora.setBackground(new java.awt.Color(255, 255, 255));
        cbxHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxHora.setForeground(new java.awt.Color(0, 0, 0));
        cbxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        cbxHora.setSelectedIndex(-1);
        cbxHora.setSelectedItem(-1);
        cbxHora.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHoraActionPerformed(evt);
            }
        });
        getContentPane().add(cbxHora);
        cbxHora.setBounds(1390, 460, 150, 40);

        lblFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 102, 153));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("FECHA");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(900, 420, 100, 29);

        cbxConsultorio.setBackground(new java.awt.Color(255, 255, 255));
        cbxConsultorio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxConsultorio.setForeground(new java.awt.Color(0, 0, 0));
        cbxConsultorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONSULTORIO 1", "CONSULTORIO 2", "CONSULTORIO 3", "CONSULTORIO 4", "CONSULTORIO 5" }));
        cbxConsultorio.setSelectedIndex(-1);
        cbxConsultorio.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxConsultorio);
        cbxConsultorio.setBounds(130, 460, 500, 40);

        cbxAño.setBackground(new java.awt.Color(255, 255, 255));
        cbxAño.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxAño.setForeground(new java.awt.Color(0, 0, 0));
        cbxAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022" }));
        cbxAño.setSelectedIndex(-1);
        cbxAño.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxAño);
        cbxAño.setBounds(710, 460, 150, 40);

        cbxMes.setBackground(new java.awt.Color(255, 255, 255));
        cbxMes.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxMes.setForeground(new java.awt.Color(0, 0, 0));
        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbxMes.setSelectedIndex(-1);
        cbxMes.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxMes);
        cbxMes.setBounds(880, 460, 150, 40);

        lblConsultorio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblConsultorio.setForeground(new java.awt.Color(0, 102, 153));
        lblConsultorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultorio.setText("CONSULTORIO");
        getContentPane().add(lblConsultorio);
        lblConsultorio.setBounds(300, 420, 170, 29);

        lblPaciente1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPaciente1.setForeground(new java.awt.Color(0, 102, 153));
        lblPaciente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPaciente1.setText("ID PACIENTE");
        getContentPane().add(lblPaciente1);
        lblPaciente1.setBounds(870, 240, 150, 29);

        lblTurno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(0, 102, 153));
        lblTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTurno.setText("TURNO");
        getContentPane().add(lblTurno);
        lblTurno.setBounds(1230, 600, 90, 29);

        lblObservaciones.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(0, 102, 153));
        lblObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObservaciones.setText("OBSERVACIONES PREVIAS");
        getContentPane().add(lblObservaciones);
        lblObservaciones.setBounds(810, 760, 320, 33);

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtStatus.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(0, 0, 0));
        txtStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStatus.setText("EN ESPERA");
        txtStatus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        txtStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtStatus);
        txtStatus.setBounds(400, 640, 500, 40);

        cbxTurno.setBackground(new java.awt.Color(255, 255, 255));
        cbxTurno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxTurno.setForeground(new java.awt.Color(0, 0, 0));
        cbxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATUTINO", "VESPERTINO" }));
        cbxTurno.setSelectedIndex(-1);
        cbxTurno.setSelectedItem(-1);
        cbxTurno.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxTurno);
        cbxTurno.setBounds(1020, 640, 500, 40);

        lblStatus.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 102, 153));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("STATUS");
        getContentPane().add(lblStatus);
        lblStatus.setBounds(600, 600, 100, 29);

        lblHorario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(255, 255, 255));
        lblHorario.setText("HORARIO ACTUAL");
        getContentPane().add(lblHorario);
        lblHorario.setBounds(1650, 40, 210, 33);

        btnConfirmar.setBackground(new java.awt.Color(0, 153, 0));
        btnConfirmar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar);
        btnConfirmar.setBounds(1670, 810, 200, 50);

        txtObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        txtObservaciones.setRows(5);
        txtObservaciones.setText("NA");
        txtObservaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane1.setViewportView(txtObservaciones);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(440, 810, 1050, 83);

        btnImprimir.setBackground(new java.awt.Color(0, 102, 153));
        btnImprimir.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("IMPRIMIR CITA");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(1675, 900, 200, 50);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        lblImagen.setText("jLabel1");
        getContentPane().add(lblImagen);
        lblImagen.setBounds(40, 10, 130, 128);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblCabecera);
        lblCabecera.setBounds(0, 0, 1920, 150);

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
        btnCancelar.setBounds(60, 900, 200, 50);

        btnBuscarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPaciente.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\lupa.png")); // NOI18N
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarPaciente);
        btnBuscarPaciente.setBounds(1040, 240, 50, 30);

        btnBuscarEspe.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarEspe.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEspe.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\lupa.png")); // NOI18N
        btnBuscarEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEspeActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarEspe);
        btnBuscarEspe.setBounds(1650, 240, 50, 30);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    public void Incrementar() {
        String id = null;
        String sql = "SELECT fk_idCita FROM MARIA.AGENDAR_CITA ORDER BY fk_idCita DESC LIMIT 1 ";

        try {
            cn = conexion.getConection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                id = rs.getString("fk_idCita");
            }
        } catch (SQLException e) {

        }

        if (id == null) {
            txtIDCita.setText("CM-0001");
        } else {
            String idCita = id.substring(4, 7);
            int idCitaInc = Integer.parseInt(idCita) + 1;

            if (idCitaInc <= 9) {
                txtIDCita.setText("CM-000" + idCitaInc);
            } else if (idCitaInc <= 10 || idCitaInc <= 100) {
                txtIDCita.setText("CM-00" + idCitaInc);
            }
        }
    }
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String idCita = txtIDCita.getText();
        String idPaciente = txtIDPaciente.getText();

        String idEspecialista = txtIDEspecialista.getText();
        String consul = (String) cbxConsultorio.getSelectedItem();

        String añoC = (String) cbxAño.getSelectedItem();
        String mesC = (String) cbxMes.getSelectedItem();
        String diaC = (String) cbxDia.getSelectedItem();
        String fechaCita = añoC + "-" + mesC + "-" + diaC;

        String horaCita = (String) cbxHora.getSelectedItem();
        String minCita = (String) cbxMinuto.getSelectedItem();
        String horarioCita = horaCita + ":" + minCita;

        String turno = (String) cbxTurno.getSelectedItem();
        String status = txtStatus.getText();
        String obs = txtObservaciones.getText();

        //COMPARAR FECHASS
        int año1 = Integer.parseInt(añoC);
        int mes1 = Integer.parseInt(mesC);
        int dia1 = Integer.parseInt(diaC);

        LocalDate fechaCitaC = LocalDate.of(año1, mes1, dia1);

        LocalDate fechaActualC = LocalDate.of(año, mes, dia);

        if (txtIDCita.getText().isEmpty() || txtIDPaciente.getText().isEmpty() || txtIDEspecialista.getText().isEmpty()
                || cbxConsultorio.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA TODAS LAS ENTRADAS DE TEXTO",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            if (fechaCitaC.isBefore(fechaActualC)) {
                JOptionPane.showMessageDialog(null, "NO PUEDE INTRODUCIR FECHAS ANTERIORES", "ERROR DE FECHAS",
                        JOptionPane.DEFAULT_OPTION, error);
            } else {
                String sqlCita = "INSERT INTO MARIA.CITA VALUES ('" + idCita + "', '" + idPaciente + "', "
                        + "'" + fechaActual + "', '" + horaActual + "')";

                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    st.executeUpdate(sqlCita);

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.DEFAULT_OPTION, error);
                    System.out.println(e);
                }

                String sqlAgendarCita = "INSERT INTO MARIA.AGENDAR_CITA VALUES ('" + idCita + "', '" + idEspecialista + "', '" + consul + "', "
                        + "'" + fechaCita + "', '" + horarioCita + "', '" + turno + "', '" + status + "', '" + obs + "')";
                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    st.executeUpdate(sqlAgendarCita);
                    JOptionPane.showMessageDialog(null, "LA CITA HA SIDO AGENDADA", "CITA AGENDADA", JOptionPane.DEFAULT_OPTION, confirmar);
                    VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
                    Ven.setVisible(true);
                    this.setVisible(false);

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.DEFAULT_OPTION, advertencia_t);

                    System.out.println(e);
                }

                //BUSCAR CITA PARA BORRAR
                String aux = "null";
                String sqlAux = "SELECT fk_idCita FROM MARIA.AGENDAR_CITA WHERE fk_idCita = '" + idCita + "'";
                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    rs = st.executeQuery(sqlAux);

                    while (rs.next()) {
                        aux = rs.getString("fk_idCita");
                    }

                } catch (SQLException e) {
                    System.out.println(e);
                }

                if (aux.equals("null")) {
                    String sqlBorrarCita = "DELETE FROM MARIA.CITA WHERE pk_idCita= '" + idCita + "'";
                    try {
                        PreparedStatement ps;
                        ps = conexion.getConection().prepareStatement(sqlBorrarCita);
                        ps.execute();
                        ps.close();

                        JOptionPane.showMessageDialog(null, "CITA NO AGENDADA", "ERROR", JOptionPane.DEFAULT_OPTION, error);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
                    }
                }

            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cbxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHoraActionPerformed
        // TODO add your handling code here:
        String horaA = (String) cbxHora.getSelectedItem();
        int horaC = Integer.parseInt(horaA);

        if (horaC < 12) {
            cbxTurno.setSelectedIndex(0);
        } else {
            cbxTurno.setSelectedIndex(1);
        }
    }//GEN-LAST:event_cbxHoraActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        if (txtIDCita.getText().isEmpty() || txtIDPaciente.getText().isEmpty() || txtIDEspecialista.getText().isEmpty()
                || cbxConsultorio.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA TODAS LAS ENTRADAS DE TEXTO",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {
                conexion.getConection();
                String dir = "C:\\Users\\danie\\Documents\\NetBeansProjects\\Proyecto_TBD\\src\\REPORTE_Cita.jrxml";
                Map parametros = new HashMap();
                parametros.put("idCita", txtIDCita.getText());
                parametros.put("idPaciente", txtIDPaciente.getText());
                parametros.put("idEspecialista", txtIDEspecialista.getText());
                JasperReport reporteJasper = JasperCompileManager.compileReport(dir);
                JasperPrint mostrarReporte = JasperFillManager.fillReport(reporteJasper, parametros, conexion.getConection());
                JasperViewer.viewReport(mostrarReporte);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println("" + ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        BUSCAR_Paciente_Tabla B_Paciente_T = new BUSCAR_Paciente_Tabla();
        B_Paciente_T.setVisible(true);
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnBuscarEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEspeActionPerformed
        BUSCAR_Especialista_Tabla B_Espe_T = new BUSCAR_Especialista_Tabla();
        B_Espe_T.setVisible(true);
    }//GEN-LAST:event_btnBuscarEspeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALTA_Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEspe;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> cbxAño;
    private javax.swing.JComboBox<String> cbxConsultorio;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxHora;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxMinuto;
    private javax.swing.JComboBox<String> cbxTurno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblConsultorio;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblHoraActual;
    private javax.swing.JLabel lblHoraCita;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblIDCita;
    private javax.swing.JLabel lblIDEspecialista;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblPaciente1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JTextField txtIDCita;
    public static javax.swing.JTextField txtIDEspecialista;
    public static javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
