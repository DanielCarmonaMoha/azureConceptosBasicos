
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class BUSCAR_Expediente_Diagnostico extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public BUSCAR_Expediente_Diagnostico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblCabecera = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblIDEspecialista = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblPresion = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        lblDiagnostico = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        txtPresion = new javax.swing.JTextField();
        txtIDEspecialista = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        lblImagenExpediente = new javax.swing.JLabel();
        lblRecetario = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRecetario = new javax.swing.JTextArea();
        lblIMC = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        lblIMC1 = new javax.swing.JLabel();
        txtNivelPeso = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblIDPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Clinica Maria");
        jPanel2.add(lblTitulo);
        lblTitulo.setBounds(30, 190, 220, 44);

        btnCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(40, 900, 200, 50);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        jPanel2.add(lblImagen);
        lblImagen.setBounds(70, 40, 130, 130);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\Cabecera.jpg")); // NOI18N
        jPanel2.add(lblCabecera);
        lblCabecera.setBounds(0, 0, 275, 1080);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 275, 1080);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 102, 153));
        lblSubtitulo.setText("Búsqueda de Expediente Diagnóstico");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(430, 50, 610, 44);

        lblFolio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFolio.setForeground(new java.awt.Color(0, 102, 153));
        lblFolio.setText("FOLIO:");
        getContentPane().add(lblFolio);
        lblFolio.setBounds(330, 180, 80, 29);

        txtFolio.setBackground(new java.awt.Color(255, 255, 255));
        txtFolio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFolio.setForeground(new java.awt.Color(0, 0, 0));
        txtFolio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFolio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtFolio);
        txtFolio.setBounds(450, 170, 380, 40);

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
        btnBuscar.setBounds(870, 170, 200, 40);

        lblIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDEspecialista.setForeground(new java.awt.Color(0, 102, 153));
        lblIDEspecialista.setText("ID ESPECIALISTA");
        getContentPane().add(lblIDEspecialista);
        lblIDEspecialista.setBounds(330, 270, 220, 29);

        lblPeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(0, 102, 153));
        lblPeso.setText("PESO:");
        getContentPane().add(lblPeso);
        lblPeso.setBounds(600, 400, 80, 29);

        lblAltura.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblAltura.setForeground(new java.awt.Color(0, 102, 153));
        lblAltura.setText("ALTURA:");
        getContentPane().add(lblAltura);
        lblAltura.setBounds(870, 400, 110, 29);

        lblPresion.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPresion.setForeground(new java.awt.Color(0, 102, 153));
        lblPresion.setText("PRESIÓN ARTERIAL:");
        getContentPane().add(lblPresion);
        lblPresion.setBounds(1660, 400, 230, 29);

        lblMotivo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblMotivo.setForeground(new java.awt.Color(0, 102, 153));
        lblMotivo.setText("MOTIVO DE CONSULTA:");
        getContentPane().add(lblMotivo);
        lblMotivo.setBounds(330, 550, 270, 29);

        lblDiagnostico.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblDiagnostico.setForeground(new java.awt.Color(0, 102, 153));
        lblDiagnostico.setText("DIAGNÓSTICO:");
        getContentPane().add(lblDiagnostico);
        lblDiagnostico.setBounds(1140, 550, 240, 29);

        lblFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 102, 153));
        lblFecha.setText("FECHA EXPEDIDA:");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(1460, 70, 210, 29);

        txtFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setText("0000-00-00");
        getContentPane().add(txtFecha);
        txtFecha.setBounds(1700, 70, 150, 29);

        lblHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 102, 153));
        lblHora.setText("HORA EXPEDIDA:");
        getContentPane().add(lblHora);
        lblHora.setBounds(1460, 130, 210, 29);

        txtHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setText("00:00:00");
        getContentPane().add(txtHora);
        txtHora.setBounds(1700, 130, 150, 29);

        txtPresion.setEditable(false);
        txtPresion.setBackground(new java.awt.Color(255, 255, 255));
        txtPresion.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtPresion.setForeground(new java.awt.Color(0, 0, 0));
        txtPresion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPresion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtPresion);
        txtPresion.setBounds(1660, 440, 225, 40);

        txtIDEspecialista.setEditable(false);
        txtIDEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        txtIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        txtIDEspecialista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDEspecialista);
        txtIDEspecialista.setBounds(330, 310, 500, 40);

        txtAltura.setEditable(false);
        txtAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtAltura.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtAltura.setForeground(new java.awt.Color(0, 0, 0));
        txtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAltura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtAltura);
        txtAltura.setBounds(870, 440, 225, 40);

        txtPeso.setEditable(false);
        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtPeso);
        txtPeso.setBounds(600, 440, 225, 40);

        txtDiagnostico.setBackground(new java.awt.Color(255, 255, 255));
        txtDiagnostico.setColumns(20);
        txtDiagnostico.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtDiagnostico.setForeground(new java.awt.Color(0, 0, 0));
        txtDiagnostico.setLineWrap(true);
        txtDiagnostico.setRows(5);
        txtDiagnostico.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane1.setViewportView(txtDiagnostico);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1140, 590, 750, 140);

        txtMotivo.setBackground(new java.awt.Color(255, 255, 255));
        txtMotivo.setColumns(20);
        txtMotivo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtMotivo.setForeground(new java.awt.Color(0, 0, 0));
        txtMotivo.setLineWrap(true);
        txtMotivo.setRows(5);
        txtMotivo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane2.setViewportView(txtMotivo);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(330, 590, 760, 140);

        lblImagenExpediente.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\Diagnostico.png")); // NOI18N
        getContentPane().add(lblImagenExpediente);
        lblImagenExpediente.setBounds(340, 40, 70, 70);

        lblRecetario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblRecetario.setForeground(new java.awt.Color(0, 102, 153));
        lblRecetario.setText("RECETARIO");
        getContentPane().add(lblRecetario);
        lblRecetario.setBounds(330, 779, 240, 30);

        txtRecetario.setBackground(new java.awt.Color(255, 255, 255));
        txtRecetario.setColumns(20);
        txtRecetario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtRecetario.setForeground(new java.awt.Color(0, 0, 0));
        txtRecetario.setLineWrap(true);
        txtRecetario.setRows(5);
        txtRecetario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane3.setViewportView(txtRecetario);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(330, 830, 760, 140);

        lblIMC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIMC.setForeground(new java.awt.Color(0, 102, 153));
        lblIMC.setText("IMC");
        getContentPane().add(lblIMC);
        lblIMC.setBounds(1140, 400, 110, 29);

        txtIMC.setEditable(false);
        txtIMC.setBackground(new java.awt.Color(255, 255, 255));
        txtIMC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIMC.setForeground(new java.awt.Color(0, 0, 0));
        txtIMC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIMC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIMC);
        txtIMC.setBounds(1140, 440, 225, 40);

        lblIMC1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIMC1.setForeground(new java.awt.Color(0, 102, 153));
        lblIMC1.setText("NIVEL PESO");
        getContentPane().add(lblIMC1);
        lblIMC1.setBounds(1410, 400, 140, 29);

        txtNivelPeso.setEditable(false);
        txtNivelPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtNivelPeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNivelPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtNivelPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNivelPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNivelPeso);
        txtNivelPeso.setBounds(1410, 440, 225, 40);

        lblEdad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(0, 102, 153));
        lblEdad.setText("EDAD");
        getContentPane().add(lblEdad);
        lblEdad.setBounds(330, 400, 80, 29);

        txtEdad.setEditable(false);
        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtEdad);
        txtEdad.setBounds(330, 440, 225, 40);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(870, 270, 220, 29);

        txtIDPaciente.setEditable(false);
        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(870, 310, 500, 40);

        btnImprimir.setBackground(new java.awt.Color(0, 153, 0));
        btnImprimir.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("IMPRIMIR RECETARIO");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(1595, 900, 280, 50);

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

        if (txtFolio.getText().isEmpty() || txtIDEspecialista.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "EL DIAGNOSTICO DEL PACIENTE NO HA SIDO ENCONTRADO", "DIAGNOSTICO NO ENCONTRADO",
                    JOptionPane.DEFAULT_OPTION, error);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
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
    }//GEN-LAST:event_btnImprimirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSCAR_Expediente_Diagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JLabel lblIDEspecialista;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLabel lblIMC1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenExpediente;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPresion;
    private javax.swing.JLabel lblRecetario;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
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
