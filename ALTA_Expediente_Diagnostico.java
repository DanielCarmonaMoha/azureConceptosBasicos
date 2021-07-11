
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
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

public class ALTA_Expediente_Diagnostico extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    //FECHA
    Calendar calendario = new GregorianCalendar();

    int año = calendario.get(Calendar.YEAR);
    int mes = calendario.get(Calendar.MONTH);
    int dia = calendario.get(Calendar.DAY_OF_MONTH);
    String fechaActual = año + "-" + mes + "-" + dia;

    //HORARIO
    int hora = calendario.get(Calendar.HOUR_OF_DAY);
    int minutos = calendario.get(Calendar.MINUTE);
    int segundos = calendario.get(Calendar.SECOND);
    String horaActual = hora + ":" + minutos + ":" + segundos;

    public ALTA_Expediente_Diagnostico() {
        initComponents();
        Incrementar();
        lblFecha.setText(fechaActual);
        lblHora.setText(horaActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFolio = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        lblIDEspecialista = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lblPresion = new javax.swing.JLabel();
        txtPresion = new javax.swing.JTextField();
        lblSubtitulo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblHorarioActual = new javax.swing.JLabel();
        txtIDEspecialista = new javax.swing.JTextField();
        lblDiagnostico = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        lblMotivo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        lblRecetario = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRecetario = new javax.swing.JTextArea();
        lblIMC = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        lblNivelPeso = new javax.swing.JLabel();
        txtNivelPeso = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnReceta = new javax.swing.JButton();
        lblIDPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblCabecera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("ALTA_Expediente_Diagnostisco"); // NOI18N
        getContentPane().setLayout(null);

        lblFolio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFolio.setForeground(new java.awt.Color(0, 102, 153));
        lblFolio.setText("FOLIO");
        getContentPane().add(lblFolio);
        lblFolio.setBounds(340, 210, 80, 29);

        txtFolio.setEditable(false);
        txtFolio.setBackground(new java.awt.Color(255, 255, 255));
        txtFolio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFolio.setForeground(new java.awt.Color(0, 0, 0));
        txtFolio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFolio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        txtFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioActionPerformed(evt);
            }
        });
        getContentPane().add(txtFolio);
        txtFolio.setBounds(120, 250, 500, 40);

        lblIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDEspecialista.setForeground(new java.awt.Color(0, 102, 153));
        lblIDEspecialista.setText("ID ESPECIALISTA");
        getContentPane().add(lblIDEspecialista);
        lblIDEspecialista.setBounds(810, 210, 220, 29);

        lblPeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(0, 102, 153));
        lblPeso.setText("PESO");
        getContentPane().add(lblPeso);
        lblPeso.setBounds(460, 350, 70, 29);

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtPeso);
        txtPeso.setBounds(390, 390, 225, 40);

        lblAltura.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblAltura.setForeground(new java.awt.Color(0, 102, 153));
        lblAltura.setText("ALTURA");
        getContentPane().add(lblAltura);
        lblAltura.setBounds(730, 350, 130, 29);

        txtAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtAltura.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtAltura.setForeground(new java.awt.Color(0, 0, 0));
        txtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAltura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        txtAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAlturaFocusLost(evt);
            }
        });
        getContentPane().add(txtAltura);
        txtAltura.setBounds(680, 390, 225, 40);

        lblPresion.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPresion.setForeground(new java.awt.Color(0, 102, 153));
        lblPresion.setText("PRESIÓN ARTERIAL");
        getContentPane().add(lblPresion);
        lblPresion.setBounds(1530, 350, 250, 29);

        txtPresion.setBackground(new java.awt.Color(255, 255, 255));
        txtPresion.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtPresion.setForeground(new java.awt.Color(0, 0, 0));
        txtPresion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPresion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtPresion);
        txtPresion.setBounds(1530, 390, 225, 40);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Registro de Expediente de Diagnóstico");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(590, 30, 840, 80);

        lblFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("0000-00-00");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(1590, 80, 130, 30);

        lblHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 0, 0));
        lblHora.setText("00:00:00");
        getContentPane().add(lblHora);
        lblHora.setBounds(1770, 80, 100, 30);

        lblHorarioActual.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHorarioActual.setForeground(new java.awt.Color(255, 255, 255));
        lblHorarioActual.setText("HORARIO ACTUAL");
        getContentPane().add(lblHorarioActual);
        lblHorarioActual.setBounds(1620, 30, 230, 30);

        txtIDEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        txtIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        txtIDEspecialista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDEspecialista);
        txtIDEspecialista.setBounds(680, 250, 500, 40);

        lblDiagnostico.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblDiagnostico.setForeground(new java.awt.Color(0, 102, 153));
        lblDiagnostico.setText("DIAGNÓSTICO");
        getContentPane().add(lblDiagnostico);
        lblDiagnostico.setBounds(1260, 520, 180, 29);

        txtDiagnostico.setBackground(new java.awt.Color(255, 255, 255));
        txtDiagnostico.setColumns(20);
        txtDiagnostico.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtDiagnostico.setForeground(new java.awt.Color(0, 0, 0));
        txtDiagnostico.setLineWrap(true);
        txtDiagnostico.setRows(5);
        txtDiagnostico.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane2.setViewportView(txtDiagnostico);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(990, 560, 760, 140);

        lblMotivo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblMotivo.setForeground(new java.awt.Color(0, 102, 153));
        lblMotivo.setText("MOTIVO DE CONSULTA");
        getContentPane().add(lblMotivo);
        lblMotivo.setBounds(360, 520, 300, 29);

        txtMotivo.setBackground(new java.awt.Color(255, 255, 255));
        txtMotivo.setColumns(20);
        txtMotivo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtMotivo.setForeground(new java.awt.Color(0, 0, 0));
        txtMotivo.setLineWrap(true);
        txtMotivo.setRows(5);
        txtMotivo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane1.setViewportView(txtMotivo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 560, 770, 140);

        lblRecetario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblRecetario.setForeground(new java.awt.Color(0, 102, 153));
        lblRecetario.setText("RECETARIO");
        getContentPane().add(lblRecetario);
        lblRecetario.setBounds(870, 770, 140, 29);

        txtRecetario.setBackground(new java.awt.Color(255, 255, 255));
        txtRecetario.setColumns(20);
        txtRecetario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtRecetario.setForeground(new java.awt.Color(0, 0, 0));
        txtRecetario.setLineWrap(true);
        txtRecetario.setRows(5);
        txtRecetario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane3.setViewportView(txtRecetario);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(540, 810, 760, 140);

        lblIMC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIMC.setForeground(new java.awt.Color(0, 102, 153));
        lblIMC.setText("IMC");
        getContentPane().add(lblIMC);
        lblIMC.setBounds(1040, 350, 50, 29);

        txtIMC.setEditable(false);
        txtIMC.setBackground(new java.awt.Color(255, 255, 255));
        txtIMC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIMC.setForeground(new java.awt.Color(0, 0, 0));
        txtIMC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIMC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIMC);
        txtIMC.setBounds(960, 390, 225, 40);

        lblNivelPeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNivelPeso.setForeground(new java.awt.Color(0, 102, 153));
        lblNivelPeso.setText("NIVEL PESO");
        getContentPane().add(lblNivelPeso);
        lblNivelPeso.setBounds(1300, 350, 150, 29);

        txtNivelPeso.setEditable(false);
        txtNivelPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtNivelPeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNivelPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtNivelPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNivelPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNivelPeso);
        txtNivelPeso.setBounds(1260, 390, 225, 40);

        lblEdad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(0, 102, 153));
        lblEdad.setText("EDAD");
        getContentPane().add(lblEdad);
        lblEdad.setBounds(200, 350, 70, 29);

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtEdad);
        txtEdad.setBounds(120, 390, 225, 40);

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
        btnConfirmar.setBounds(1620, 810, 250, 50);

        btnReceta.setBackground(new java.awt.Color(0, 102, 153));
        btnReceta.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnReceta.setForeground(new java.awt.Color(255, 255, 255));
        btnReceta.setText("IMPRIMIR RECETA");
        btnReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetaActionPerformed(evt);
            }
        });
        getContentPane().add(btnReceta);
        btnReceta.setBounds(1620, 900, 250, 50);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(1450, 210, 150, 29);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(1260, 250, 500, 40);

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
        lblImagen.setBounds(50, 10, 130, 130);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblCabecera);
        lblCabecera.setBounds(0, 0, 1920, 150);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    public void Incrementar(){
        String sql = " SELECT folio FROM MARIA.EXPEDIENTE_DIAGNOSTICO ORDER BY folio DESC LIMIT 1; ";
        String folio = null;

        try {
            cn = conexion.getConection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                folio = rs.getString("folio");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
            System.out.println(e);
        }

        if (folio == null) {
            txtFolio.setText("00000001");
        } else {
            int FolioInc = Integer.parseInt(folio) + 1;

            if (FolioInc <= 9) {
                txtFolio.setText("0000000" + FolioInc);
            } else if (FolioInc <= 10 || FolioInc <= 100) {
                txtFolio.setText("000000" + FolioInc);
            }

        }
    }
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String folio = txtFolio.getText();
        String idEspecialista = txtIDEspecialista.getText();
        String idPaciente = txtIDPaciente.getText();
        String edad = txtEdad.getText();
        String peso = txtPeso.getText();
        String altura = txtAltura.getText();
        String IMC = txtIMC.getText();
        String nivel_peso = txtNivelPeso.getText();
        String presion = txtPresion.getText();
        String motivo = txtMotivo.getText();
        String diagnostico = txtDiagnostico.getText();
        String recetario = txtRecetario.getText();
        String fecha = lblFecha.getText();
        String hora = lblHora.getText();

        String sql = "INSERT INTO MARIA.EXPEDIENTE_DIAGNOSTICO VALUES ('" + folio + "', '" + idEspecialista + "', '"+idPaciente+"',"
                + "'" + edad + "', '" + peso + "', '" + altura + "', '" + IMC + "', '" + nivel_peso + "', '" + presion + "', "
                + "'" + motivo + "', '" + diagnostico + "', '" + recetario + "', "
                + "'" + fecha + "', '" + hora + "')";

        if (txtFolio.getText().isEmpty()|| txtRecetario.getText().isEmpty()
                || txtAltura.getText().isEmpty() || txtDiagnostico.getText().isEmpty() || txtMotivo.getText().isEmpty()
                || txtPeso.getText().isEmpty() || txtPresion.getText().isEmpty() || txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA TODAS LAS ENTRADAS DE TEXTO",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {
                cn = conexion.getConection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "DIAGNOSTICO DE ESPECIALISTA CREADO", "EL DIAGNSOTICO DEL ESPECIALISTA "
                        + "A SIDO CREADO EXITOSAMENTE", JOptionPane.DEFAULT_OPTION, confirmar);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlturaFocusLost
        int peso = Integer.valueOf(txtPeso.getText());
        float altura = Float.valueOf(txtAltura.getText());

        DecimalFormat formato = new DecimalFormat("#.0");
        String imc = formato.format(peso / (altura * altura));

        txtIMC.setText(imc);

        float imc_int = Float.valueOf(imc);

        if (imc_int < 18.5) {
            txtNivelPeso.setText("BAJO PESO");
        } else if ((imc_int > 18.5) && (imc_int < 24.9)) {
            txtNivelPeso.setText("N0RMAL");
        } else if ((imc_int > 25.0) && (imc_int < 29.9)) {
            txtNivelPeso.setText("SOBREPESO");
        } else if (imc_int > 30.0) {
            txtNivelPeso.setText("OBESIDAD");
        }
    }//GEN-LAST:event_txtAlturaFocusLost

    private void btnRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetaActionPerformed

        if (txtFolio.getText().isEmpty() || txtRecetario.getText().isEmpty()
                || txtAltura.getText().isEmpty() || txtDiagnostico.getText().isEmpty() || txtMotivo.getText().isEmpty()
                || txtPeso.getText().isEmpty() || txtPresion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA TODAS LAS ENTRADAS DE TEXTO",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {
                String dir = "C:\\Users\\danie\\Documents\\NetBeansProjects\\Proyecto_TBD\\src\\REPORTE_Recetario.jrxml";
                Map parametros = new HashMap();
                parametros.put("folio", txtFolio.getText());
                JasperReport reporteJasper = JasperCompileManager.compileReport(dir);
                JasperPrint mostrarReporte = JasperFillManager.fillReport(reporteJasper, parametros, conexion.getConection());
                JasperViewer.viewReport(mostrarReporte);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnRecetaActionPerformed

    private void txtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALTA_Expediente_Diagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnReceta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblHorarioActual;
    private javax.swing.JLabel lblIDEspecialista;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblNivelPeso;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPresion;
    private javax.swing.JLabel lblRecetario;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFolio;
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
