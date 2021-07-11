
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ALTA_Expediente extends javax.swing.JFrame {

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

    public ALTA_Expediente() {
        initComponents();
        lblFechaActual.setText(fechaActual);
        lblHoraActual.setText(horaActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIDPaciente = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtIDPaciente = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblNSS = new javax.swing.JLabel();
        txtNSS = new javax.swing.JTextField();
        lblTipoSangre = new javax.swing.JLabel();
        cbxTipoSangre = new javax.swing.JComboBox<>();
        lblAlergias = new javax.swing.JLabel();
        lblPadecimientos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPadecimientos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlergias = new javax.swing.JTextArea();
        lblTitulo1 = new javax.swing.JLabel();
        lblFechaActual = new javax.swing.JLabel();
        lblHorarioActual = new javax.swing.JLabel();
        lblHoraActual = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblCabecera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(900, 240, 150, 29);

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 0));
        btnRegistrar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("CONFIRMAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(1650, 900, 200, 50);

        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(730, 280, 500, 40);

        lblRFC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblRFC.setForeground(new java.awt.Color(0, 102, 153));
        lblRFC.setText("RFC");
        getContentPane().add(lblRFC);
        lblRFC.setBounds(340, 410, 70, 29);

        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRFC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtRFC);
        txtRFC.setBounds(120, 450, 500, 40);

        lblNSS.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNSS.setForeground(new java.awt.Color(0, 102, 153));
        lblNSS.setText("NSS");
        getContentPane().add(lblNSS);
        lblNSS.setBounds(950, 410, 60, 30);

        txtNSS.setBackground(new java.awt.Color(255, 255, 255));
        txtNSS.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNSS.setForeground(new java.awt.Color(0, 0, 0));
        txtNSS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNSS.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNSS);
        txtNSS.setBounds(730, 450, 500, 40);

        lblTipoSangre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTipoSangre.setForeground(new java.awt.Color(0, 102, 153));
        lblTipoSangre.setText("TIPO DE SANGRE");
        getContentPane().add(lblTipoSangre);
        lblTipoSangre.setBounds(1490, 410, 210, 29);

        cbxTipoSangre.setBackground(new java.awt.Color(255, 255, 255));
        cbxTipoSangre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxTipoSangre.setForeground(new java.awt.Color(0, 0, 0));
        cbxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A POSITIVO", "A NEGATIVO", "B POSITIVO", "B NEGATIVO", "O POSITIVO", "O NEGATIVO", "AB POSITIVO", "AB NEGATIVO" }));
        cbxTipoSangre.setSelectedIndex(-1);
        cbxTipoSangre.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxTipoSangre);
        cbxTipoSangre.setBounds(1360, 450, 500, 40);

        lblAlergias.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblAlergias.setForeground(new java.awt.Color(0, 102, 153));
        lblAlergias.setText("ALERGÍAS");
        getContentPane().add(lblAlergias);
        lblAlergias.setBounds(420, 610, 130, 29);

        lblPadecimientos.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPadecimientos.setForeground(new java.awt.Color(0, 102, 153));
        lblPadecimientos.setText("PADECIMIENTOS CRÓNICOS");
        getContentPane().add(lblPadecimientos);
        lblPadecimientos.setBounds(1280, 610, 340, 29);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N

        txtPadecimientos.setBackground(new java.awt.Color(255, 255, 255));
        txtPadecimientos.setColumns(20);
        txtPadecimientos.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtPadecimientos.setForeground(new java.awt.Color(0, 0, 0));
        txtPadecimientos.setLineWrap(true);
        txtPadecimientos.setRows(5);
        txtPadecimientos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane1.setViewportView(txtPadecimientos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1080, 650, 780, 100);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N

        txtAlergias.setBackground(new java.awt.Color(255, 255, 255));
        txtAlergias.setColumns(20);
        txtAlergias.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtAlergias.setForeground(new java.awt.Color(0, 0, 0));
        txtAlergias.setLineWrap(true);
        txtAlergias.setRows(5);
        txtAlergias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane2.setViewportView(txtAlergias);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(130, 650, 780, 100);

        lblTitulo1.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Registro Expediente de Paciente");
        getContentPane().add(lblTitulo1);
        lblTitulo1.setBounds(640, 50, 720, 60);

        lblFechaActual.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFechaActual.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaActual.setText("0000-00-00");
        getContentPane().add(lblFechaActual);
        lblFechaActual.setBounds(1580, 100, 130, 20);

        lblHorarioActual.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHorarioActual.setForeground(new java.awt.Color(255, 255, 255));
        lblHorarioActual.setText("HORARIO ACTUAL");
        getContentPane().add(lblHorarioActual);
        lblHorarioActual.setBounds(1600, 40, 240, 30);

        lblHoraActual.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblHoraActual.setForeground(new java.awt.Color(0, 0, 0));
        lblHoraActual.setText("00:00:00");
        getContentPane().add(lblHoraActual);
        lblHoraActual.setBounds(1730, 100, 110, 20);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(lblImagen);
        lblImagen.setBounds(60, 10, 140, 130);

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

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblCabecera);
        lblCabecera.setBounds(0, 0, 1920, 150);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String idPaciente = txtIDPaciente.getText();
        String RFC = txtRFC.getText();
        String NSS = txtNSS.getText();
        String sangre = (String) cbxTipoSangre.getSelectedItem();
        String alergias = txtAlergias.getText();
        String padecimientos = txtPadecimientos.getText();
        String fecha = lblFechaActual.getText();

        String sql = "INSERT INTO MARIA.EXPEDIENTE VALUES ('" + idPaciente + "', '" + RFC + "', '" + NSS + "', "
                + "'" + sangre + "', '" + alergias + "', '" + padecimientos + "', '" + fecha + "')";

        if (txtIDPaciente.getText().isEmpty() || txtRFC.getText().isEmpty() || txtNSS.getText().isEmpty()
                || txtAlergias.getText().isEmpty() || txtPadecimientos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA TODAS LAS ENTRADAS DE TEXTO",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {
                cn = conexion.getConection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "EXPEDIENTE CREADO", "EL EXPEDIENTE DEL PACIENTE HA SIDO CREADO EXITOSAMENTE", 
                        JOptionPane.DEFAULT_OPTION, confirmar);
                
                txtAlergias.setText("");
                txtIDPaciente.setText("");
                txtNSS.setText("");
                txtPadecimientos.setText("");
                txtRFC.setText("");
                cbxTipoSangre.setSelectedIndex(-1);
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }
        }
        
        

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALTA_Expediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxTipoSangre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblHoraActual;
    private javax.swing.JLabel lblHorarioActual;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNSS;
    private javax.swing.JLabel lblPadecimientos;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTextArea txtAlergias;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextField txtNSS;
    private javax.swing.JTextArea txtPadecimientos;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
