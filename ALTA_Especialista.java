
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ALTA_Especialista extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public ALTA_Especialista() {
        initComponents();
        Incrementar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfirmar = new javax.swing.JButton();
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
        cbxSexo = new javax.swing.JComboBox<>();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblEspecialidad = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblCURP = new javax.swing.JLabel();
        txtCURP = new javax.swing.JTextField();
        lblTelefonoFijo = new javax.swing.JLabel();
        txtTelefonoFijo = new javax.swing.JTextField();
        cbxEspecialidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblCabecera = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        btnConfirmar.setBackground(new java.awt.Color(0, 153, 51));
        btnConfirmar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar);
        btnConfirmar.setBounds(1620, 920, 200, 50);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Registro de Especialistas");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(670, 50, 570, 58);

        lblIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDEspecialista.setForeground(new java.awt.Color(0, 102, 153));
        lblIDEspecialista.setText("ID ESPECIALISTA");
        getContentPane().add(lblIDEspecialista);
        lblIDEspecialista.setBounds(850, 240, 200, 29);

        txtIDEspecialista.setEditable(false);
        txtIDEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        txtIDEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        txtIDEspecialista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDEspecialista);
        txtIDEspecialista.setBounds(700, 280, 500, 40);

        lblNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 102, 153));
        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(270, 370, 130, 29);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(90, 410, 500, 40);

        lblApePaterno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApePaterno.setForeground(new java.awt.Color(0, 102, 153));
        lblApePaterno.setText("APELLIDO PATERNO");
        getContentPane().add(lblApePaterno);
        lblApePaterno.setBounds(830, 370, 240, 29);

        txtApePaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtApePaterno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApePaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApePaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApePaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApePaterno);
        txtApePaterno.setBounds(710, 410, 500, 40);

        lblApeMaterno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApeMaterno.setForeground(new java.awt.Color(0, 102, 153));
        lblApeMaterno.setText("APELLIDO MATERNO");
        getContentPane().add(lblApeMaterno);
        lblApeMaterno.setBounds(1450, 370, 240, 29);

        txtApeMaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtApeMaterno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApeMaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApeMaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApeMaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApeMaterno);
        txtApeMaterno.setBounds(1320, 410, 500, 40);

        lblTelefonoCel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTelefonoCel.setForeground(new java.awt.Color(0, 102, 153));
        lblTelefonoCel.setText("TELEFONO CELULAR");
        getContentPane().add(lblTelefonoCel);
        lblTelefonoCel.setBounds(520, 810, 260, 29);

        txtTelefonoCel.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoCel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtTelefonoCel.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoCel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoCel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtTelefonoCel);
        txtTelefonoCel.setBounds(400, 850, 500, 40);

        lblSexo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(0, 102, 153));
        lblSexo.setText("SEXO");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(910, 520, 70, 29);

        cbxSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbxSexo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        cbxSexo.setSelectedIndex(-1);
        cbxSexo.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxSexo);
        cbxSexo.setBounds(830, 560, 250, 40);

        lblFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(0, 102, 153));
        lblFechaNacimiento.setText("FECHA NACIMIENTO");
        getContentPane().add(lblFechaNacimiento);
        lblFechaNacimiento.setBounds(1450, 520, 230, 29);

        txtFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setText("AAAA/MM/DD");
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtFechaNacimiento);
        txtFechaNacimiento.setBounds(1320, 560, 500, 40);

        lblEspecialidad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblEspecialidad.setForeground(new java.awt.Color(0, 102, 153));
        lblEspecialidad.setText("ESPECIALIDAD");
        getContentPane().add(lblEspecialidad);
        lblEspecialidad.setBounds(230, 520, 180, 29);

        lblCedula.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 102, 153));
        lblCedula.setText("NUMERO CEDULA PROFESIONAL");
        getContentPane().add(lblCedula);
        lblCedula.setBounds(790, 660, 380, 30);

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCedula.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCedula);
        txtCedula.setBounds(720, 700, 500, 40);

        lblRFC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblRFC.setForeground(new java.awt.Color(0, 102, 153));
        lblRFC.setText("RFC");
        getContentPane().add(lblRFC);
        lblRFC.setBounds(1540, 660, 50, 29);

        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRFC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtRFC);
        txtRFC.setBounds(1320, 700, 500, 40);

        lblCURP.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCURP.setForeground(new java.awt.Color(0, 102, 153));
        lblCURP.setText("CURP");
        getContentPane().add(lblCURP);
        lblCURP.setBounds(280, 660, 80, 29);

        txtCURP.setBackground(new java.awt.Color(255, 255, 255));
        txtCURP.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCURP.setForeground(new java.awt.Color(0, 0, 0));
        txtCURP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCURP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCURP);
        txtCURP.setBounds(90, 700, 500, 40);

        lblTelefonoFijo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTelefonoFijo.setForeground(new java.awt.Color(0, 102, 153));
        lblTelefonoFijo.setText("TELEFONO FIJO");
        getContentPane().add(lblTelefonoFijo);
        lblTelefonoFijo.setBounds(1180, 810, 180, 29);

        txtTelefonoFijo.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoFijo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtTelefonoFijo.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoFijo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoFijo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtTelefonoFijo);
        txtTelefonoFijo.setBounds(1030, 850, 500, 40);

        cbxEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        cbxEspecialidad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxEspecialidad.setForeground(new java.awt.Color(0, 0, 0));
        cbxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEDICO GENERAL", "MEDICO INTERNISTA", "CARDIOLOGÍA", "GASTROENTOROLOGÍA", "NEFROLOGÍA", " " }));
        cbxEspecialidad.setSelectedIndex(-1);
        cbxEspecialidad.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxEspecialidad);
        cbxEspecialidad.setBounds(90, 560, 500, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 130, 140);

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
        btnCancelar.setBounds(100, 920, 200, 50);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    public void Incrementar() {
        String id = null;
        String sql = "SELECT pk_idEspecialista FROM MARIA.ESPECIALISTA ORDER BY pk_idEspecialista DESC LIMIT 1 ";

        try {
            cn = conexion.getConection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                id = rs.getString("pk_idEspecialista");
            }
        } catch (SQLException e) {

        }

        if (id == null) {
            txtIDEspecialista.setText("ME-0001");
        } else {
            String idEspe = id.substring(4, 7);
            int idEspeInc = Integer.parseInt(idEspe) + 1;

            if (idEspeInc <= 9) {
                txtIDEspecialista.setText("ME-000" + idEspeInc);
            } else if (idEspeInc <= 10 || idEspeInc <= 100) {
                txtIDEspecialista.setText("ME-00" + idEspeInc);
            }
        }
    }

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        String id = txtIDEspecialista.getText();
        String nomb = txtNombre.getText();
        String apep = txtApePaterno.getText();
        String apem = txtApeMaterno.getText();
        String sexo = (String) cbxSexo.getSelectedItem();
        String fecha_nac = txtFechaNacimiento.getText();
        String espe = (String) cbxEspecialidad.getSelectedItem();
        String cedula = txtCedula.getText();
        String rfc = txtRFC.getText();
        String curp = txtCURP.getText();

        String telCel = txtTelefonoCel.getText();
        String telFijo = txtTelefonoFijo.getText();

        if (txtIDEspecialista.getText().isEmpty() || txtApeMaterno.getText().isEmpty() || txtApePaterno.getText().isEmpty()
                || txtNombre.getText().isEmpty() || txtCURP.getText().isEmpty()
                || txtCedula.getText().isEmpty() || txtFechaNacimiento.getText().isEmpty() || txtRFC.getText().isEmpty()
                || txtTelefonoCel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA TODAS LAS ENTRADAS DE TEXTO",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {

                String sql = "INSERT INTO MARIA.ESPECIALISTA VALUES ('" + id + "', '" + nomb + "', '" + apep + "', '" + apem + "', "
                        + "'" + sexo + "', '" + fecha_nac + "', '" + espe + "', '" + cedula + "', '" + rfc + "', '" + curp + "')";

                cn = conexion.getConection();
                st = cn.createStatement();
                st.executeUpdate(sql);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }

            try {
                String sqlTel = "INSERT INTO MARIA.TELEFONO_ESP VALUES ('" + id + "' ,'" + telCel + "', '" + telFijo + "')";

                cn = conexion.getConection();
                st = cn.createStatement();
                st.executeUpdate(sqlTel);

                JOptionPane.showMessageDialog(null, "ESPECIALISTA AGREGADO", "EL ESPECIALISTA HA SIDO AGREGADO CORRECTAMENTE",
                        JOptionPane.DEFAULT_OPTION, confirmar);

                VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
                Ven.setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }
        }

        //BUSCAR CITA PARA BORRAR
        String aux = "null";
        String sqlAux = "SELECT fk_idespecialista FROM MARIA.TELEFONO_ESP WHERE fk_idespecialista = '" + id + "'";
        try {
            cn = conexion.getConection();
            st = cn.createStatement();
            rs = st.executeQuery(sqlAux);

            while (rs.next()) {
                aux = rs.getString("fk_idespecialista");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        if (aux.equals("null")) {
            String sqlBorrarCita = "DELETE FROM MARIA.ESPECIALISTA WHERE fk_idespecialista= '" + id + "'";
            try {
                PreparedStatement ps;
                ps = conexion.getConection().prepareStatement(sqlBorrarCita);
                ps.execute();
                ps.close();

                JOptionPane.showMessageDialog(null, "ESPECIALISTA NO AGREGADO", "ERROR", JOptionPane.DEFAULT_OPTION, error);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
            }
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALTA_Especialista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cbxEspecialidad;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApeMaterno;
    private javax.swing.JLabel lblApePaterno;
    private javax.swing.JLabel lblCURP;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIDEspecialista;
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
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIDEspecialista;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefonoCel;
    private javax.swing.JTextField txtTelefonoFijo;
    // End of variables declaration//GEN-END:variables
}
