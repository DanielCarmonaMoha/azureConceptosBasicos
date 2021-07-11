
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MODIFICAR_Expediente extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public MODIFICAR_Expediente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIDPaciente = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblNSS = new javax.swing.JLabel();
        txtNSS = new javax.swing.JTextField();
        lblTipoSangre = new javax.swing.JLabel();
        lblAlergias = new javax.swing.JLabel();
        lblPadecimientosCro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPadecimientosCro = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlergias = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        lblIDPaciente = new javax.swing.JLabel();
        lblFechaCreacion = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        cbxTipoSangre = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblCabcera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtIDPaciente.setBackground(java.awt.Color.white);
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(740, 240, 500, 40);

        lblRFC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblRFC.setForeground(new java.awt.Color(0, 102, 153));
        lblRFC.setText("RFC");
        getContentPane().add(lblRFC);
        lblRFC.setBounds(360, 410, 50, 29);

        txtRFC.setBackground(java.awt.Color.white);
        txtRFC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRFC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtRFC);
        txtRFC.setBounds(130, 450, 500, 40);

        lblNSS.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNSS.setForeground(new java.awt.Color(0, 102, 153));
        lblNSS.setText("NSS");
        getContentPane().add(lblNSS);
        lblNSS.setBounds(950, 410, 60, 29);

        txtNSS.setBackground(java.awt.Color.white);
        txtNSS.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNSS.setForeground(new java.awt.Color(0, 0, 0));
        txtNSS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNSS.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNSS);
        txtNSS.setBounds(740, 450, 500, 40);

        lblTipoSangre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTipoSangre.setForeground(new java.awt.Color(0, 102, 153));
        lblTipoSangre.setText("TIPO DE SANGRE");
        getContentPane().add(lblTipoSangre);
        lblTipoSangre.setBounds(1460, 410, 210, 29);

        lblAlergias.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblAlergias.setForeground(new java.awt.Color(0, 102, 153));
        lblAlergias.setText("ALERGÍAS");
        getContentPane().add(lblAlergias);
        lblAlergias.setBounds(460, 600, 140, 29);

        lblPadecimientosCro.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPadecimientosCro.setForeground(new java.awt.Color(0, 102, 153));
        lblPadecimientosCro.setText("PADECIMIENTOS CRÓNICOS");
        getContentPane().add(lblPadecimientosCro);
        lblPadecimientosCro.setBounds(1260, 600, 340, 29);

        txtPadecimientosCro.setBackground(new java.awt.Color(255, 255, 255));
        txtPadecimientosCro.setColumns(20);
        txtPadecimientosCro.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtPadecimientosCro.setLineWrap(true);
        txtPadecimientosCro.setRows(5);
        txtPadecimientosCro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane1.setViewportView(txtPadecimientosCro);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1020, 640, 790, 110);

        txtAlergias.setBackground(new java.awt.Color(255, 255, 255));
        txtAlergias.setColumns(20);
        txtAlergias.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtAlergias.setLineWrap(true);
        txtAlergias.setRows(5);
        txtAlergias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        jScrollPane2.setViewportView(txtAlergias);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(130, 640, 790, 110);

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
        btnBuscar.setBounds(880, 300, 200, 40);

        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(910, 200, 170, 29);

        lblFechaCreacion.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFechaCreacion.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaCreacion.setText("FECHA DE CREACIÓN:");
        getContentPane().add(lblFechaCreacion);
        lblFechaCreacion.setBounds(1580, 40, 250, 29);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Modificar Expediente de Paciente");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(630, 50, 750, 60);

        txtFecha.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setText("XXXX-XX-XX");
        getContentPane().add(txtFecha);
        txtFecha.setBounds(1630, 80, 150, 29);

        btnModificar.setBackground(new java.awt.Color(51, 153, 0));
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

        cbxTipoSangre.setBackground(new java.awt.Color(255, 255, 255));
        cbxTipoSangre.setEditable(true);
        cbxTipoSangre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxTipoSangre.setForeground(new java.awt.Color(0, 0, 0));
        cbxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A POSITIVO", "A NEGATIVO", "B POSITIVO", "B NEGATIVO", "O POSITIVO", "O NEGATIVO", "AB POSITIVO", "A NEGATIVO" }));
        cbxTipoSangre.setSelectedIndex(-1);
        cbxTipoSangre.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 3, -1, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxTipoSangre);
        cbxTipoSangre.setBounds(1310, 450, 500, 40);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(lblImagen);
        lblImagen.setBounds(60, 10, 130, 140);

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

        lblCabcera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblCabcera);
        lblCabcera.setBounds(0, 0, 1920, 150);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String IDPaciente = txtIDPaciente.getText();

        String sql = "SELECT * FROM MARIA.EXPEDIENTE WHERE pk_idPaciente = '" + IDPaciente + "'";

        if (txtIDPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA ID DE PACIENTE",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {
                cn = conexion.getConection();
                st = cn.createStatement();
                rs = st.executeQuery(sql);

                while (rs.next()) {
                    txtIDPaciente.setText(rs.getString("pk_idPaciente"));
                    txtRFC.setText(rs.getString("rfc_pac"));
                    txtNSS.setText(rs.getString("nss"));
                    cbxTipoSangre.setSelectedItem(rs.getString("tiposangre"));
                    txtAlergias.setText(rs.getString("tipoalergia"));
                    txtPadecimientosCro.setText(rs.getString("padecimientocronico"));
                    txtFecha.setText(rs.getString("fechacreacion"));

                    JOptionPane.showMessageDialog(null, "EL EXPEDIENTE DEL PACIENTE HA SIDO ENCONTRADO", "EXPEDIENTE ENCONTRADO",
                            JOptionPane.DEFAULT_OPTION, confirmar);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }
        }

        if (txtNSS.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "EL EXPEDIENTE DEL PACIENTE NO HA SIDO ENCONTRADO", "EXPEDIENTE NO ENCONTRADO",
                    JOptionPane.DEFAULT_OPTION, error);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String idPaciente = txtIDPaciente.getText();
        String rfc = txtRFC.getText();
        String nss = txtNSS.getText();
        String tipoSangre = (String) cbxTipoSangre.getSelectedItem();
        String alergia = txtAlergias.getText();
        String padecimientoCro = txtPadecimientosCro.getText();

        String sql = "UPDATE MARIA.EXPEDIENTE SET rfc_pac = '" + rfc + "', nss = '" + nss + "', "
                + "tipoSangre = '" + tipoSangre + "', tipoAlergia = '" + alergia + "', padecimientocronico = '" + padecimientoCro + "'"
                + "WHERE pk_idPaciente = '" + idPaciente + "' ";

        if (txtAlergias.getText().isEmpty() || txtIDPaciente.getText().isEmpty() || txtNSS.getText().isEmpty()
                || txtPadecimientosCro.getText().isEmpty() || txtRFC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, RELLENE TODAS LAS ENTRADAS REQUERIDAS",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            int res = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO EN MODIFICAR LOS DATOS DEL EXPEDIENTE DEL PACIENTE?", 
                    "¿SEGURO?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, pregunta);
            if (res == 0) {
                try {
                    cn = conexion.getConection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"EL EXPEDIENTE DEL PACIENTE HA SIDO MOFICADO EXITOSAMENTE", 
                            "EXPEDIENTE MODIFICADO", JOptionPane.DEFAULT_OPTION, confirmar);

                    txtAlergias.setText("");
                    txtFecha.setText("");
                    txtIDPaciente.setText("");
                    txtNSS.setText("");
                    txtPadecimientosCro.setText("");
                    txtRFC.setText("");
                    cbxTipoSangre.setSelectedIndex(-1);
                    
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
                }
            } else {
                JOptionPane.showMessageDialog(null, "OK, LOS DATOS DEL EXPEDIENTE DEL PACIENTE NO HAN SIDO MODIFICADOS",
                        "DATOS NO MODIFICADOS", JOptionPane.DEFAULT_OPTION, pregunta);
            }


        }
    }//GEN-LAST:event_btnModificarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODIFICAR_Expediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxTipoSangre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblCabcera;
    private javax.swing.JLabel lblFechaCreacion;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNSS;
    private javax.swing.JLabel lblPadecimientosCro;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JTextArea txtAlergias;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextField txtNSS;
    private javax.swing.JTextArea txtPadecimientosCro;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
