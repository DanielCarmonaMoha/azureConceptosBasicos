
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

public class BUSCAR_Cita extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public BUSCAR_Cita() {
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
        lblIDCita = new javax.swing.JLabel();
        txtIDCita = new javax.swing.JTextField();
        lblPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        lblIDEspecialista = new javax.swing.JLabel();
        txtIDEspecialista = new javax.swing.JTextField();
        txtConsultorio = new javax.swing.JTextField();
        lblConsultorio = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        lblTurno = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblSubtitulo = new javax.swing.JLabel();
        lblImagenCita = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Clinica María");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(30, 170, 230, 80);

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
        lblImagen.setBounds(70, 40, 130, 130);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\Cabecera.jpg")); // NOI18N
        jPanel1.add(lblCabecera);
        lblCabecera.setBounds(0, 0, 275, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 275, 1080);

        lblIDCita.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDCita.setForeground(new java.awt.Color(0, 102, 153));
        lblIDCita.setText("ID CITA");
        getContentPane().add(lblIDCita);
        lblIDCita.setBounds(310, 210, 120, 29);

        txtIDCita.setBackground(new java.awt.Color(255, 255, 255));
        txtIDCita.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDCita.setForeground(new java.awt.Color(0, 0, 0));
        txtIDCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDCita.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDCita);
        txtIDCita.setBounds(310, 250, 500, 40);

        lblPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblPaciente.setText("ID PACIENTE");
        getContentPane().add(lblPaciente);
        lblPaciente.setBounds(310, 370, 180, 29);

        txtIDPaciente.setEditable(false);
        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(310, 410, 500, 40);

        lblIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDEspecialista.setForeground(new java.awt.Color(0, 102, 153));
        lblIDEspecialista.setText("ID ESPECIALISTA");
        getContentPane().add(lblIDEspecialista);
        lblIDEspecialista.setBounds(860, 370, 250, 29);

        txtIDEspecialista.setEditable(false);
        txtIDEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        txtIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        txtIDEspecialista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDEspecialista);
        txtIDEspecialista.setBounds(860, 410, 500, 40);

        txtConsultorio.setEditable(false);
        txtConsultorio.setBackground(new java.awt.Color(255, 255, 255));
        txtConsultorio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtConsultorio.setForeground(new java.awt.Color(0, 0, 0));
        txtConsultorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConsultorio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtConsultorio);
        txtConsultorio.setBounds(310, 550, 500, 40);

        lblConsultorio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblConsultorio.setForeground(new java.awt.Color(0, 102, 153));
        lblConsultorio.setText("CONSULTORIO");
        getContentPane().add(lblConsultorio);
        lblConsultorio.setBounds(310, 510, 180, 29);

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtFecha);
        txtFecha.setBounds(860, 550, 500, 40);

        lblFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 102, 153));
        lblFecha.setText("FECHA");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(860, 510, 110, 29);

        txtHora.setEditable(false);
        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtHora);
        txtHora.setBounds(1400, 550, 500, 40);

        lblHora.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 102, 153));
        lblHora.setText("HORA");
        getContentPane().add(lblHora);
        lblHora.setBounds(1410, 500, 100, 29);

        txtTurno.setEditable(false);
        txtTurno.setBackground(new java.awt.Color(255, 255, 255));
        txtTurno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtTurno.setForeground(new java.awt.Color(0, 0, 0));
        txtTurno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTurno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtTurno);
        txtTurno.setBounds(860, 690, 500, 40);

        lblTurno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(0, 102, 153));
        lblTurno.setText("TURNO");
        getContentPane().add(lblTurno);
        lblTurno.setBounds(860, 640, 130, 40);

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtStatus.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(0, 0, 0));
        txtStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStatus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtStatus);
        txtStatus.setBounds(310, 690, 500, 40);

        lblStatus.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 102, 153));
        lblStatus.setText("STATUS");
        getContentPane().add(lblStatus);
        lblStatus.setBounds(310, 650, 100, 29);

        lblObservaciones.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(0, 102, 153));
        lblObservaciones.setText("OBSERVACIONES PREVIAS");
        getContentPane().add(lblObservaciones);
        lblObservaciones.setBounds(310, 790, 400, 29);

        btnBuscar.setBackground(new java.awt.Color(0, 102, 153));
        btnBuscar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(860, 250, 200, 40);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 102, 153));
        lblSubtitulo.setText("Búsqueda de Cita Medica");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(400, 60, 410, 80);

        lblImagenCita.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\cita.png")); // NOI18N
        getContentPane().add(lblImagenCita);
        lblImagenCita.setBounds(320, 70, 70, 60);

        txtObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane1.setViewportView(txtObservaciones);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 830, 1050, 100);

        btnImprimir.setBackground(new java.awt.Color(0, 153, 0));
        btnImprimir.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("IMPRIMIR CITA");
        btnImprimir.setBorder(null);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(1675, 900, 200, 40);

        setSize(new java.awt.Dimension(1938, 1132));
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
                    txtConsultorio.setText(rs.getString("consultorio"));
                    txtFecha.setText(rs.getString("fechacita"));
                    txtHora.setText(rs.getString("horacita"));
                    txtTurno.setText(rs.getString("turno"));
                    txtStatus.setText(rs.getString("status"));
                    txtObservaciones.setText(rs.getString("observaciones"));

                    JOptionPane.showMessageDialog(null, "LA CITA HA SIDO ENCONTRADA",
                            "CITA ENCONTRADA", JOptionPane.DEFAULT_OPTION, confirmar);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }
        }

        if (txtIDCita.getText().isEmpty() || txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LA CITA NO HA SIDO ENCONTRADA",
                    "CITA NO ENCONTRADA", JOptionPane.DEFAULT_OPTION, error);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        if (txtIDCita.getText().isEmpty() || txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "PRIMERO BUSQUE LA CITA O RELLENE TODOS LOS CAMPOS", 
                    "ERROR DE ENTRADA", JOptionPane.DEFAULT_OPTION, pregunta);
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSCAR_Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblConsultorio;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIDCita;
    private javax.swing.JLabel lblIDEspecialista;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenCita;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
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
