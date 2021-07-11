
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ALTA_Paciente extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public ALTA_Paciente() {
        initComponents();
        this.setLocationRelativeTo(null);
        IncrementarID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        lblIDPaciente = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidoM = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        lblApellidoP = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        lblApellidoP1 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        lblColonia = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        lblNumInt = new javax.swing.JLabel();
        txtNumInt = new javax.swing.JTextField();
        lblColonia1 = new javax.swing.JLabel();
        txtNumExt = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        lblApellidoP2 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        lblSubTitulo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblCabecera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAceptar.setBackground(new java.awt.Color(0, 153, 0));
        btnAceptar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("CONFIRMAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(1675, 900, 200, 50);

        lblIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        lblIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(0, 102, 153));
        lblIDPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDPaciente.setText("ID PACIENTE");
        getContentPane().add(lblIDPaciente);
        lblIDPaciente.setBounds(910, 190, 150, 39);

        txtIDPaciente.setEditable(false);
        txtIDPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtIDPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtIDPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txtIDPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtIDPaciente);
        txtIDPaciente.setBounds(740, 240, 500, 40);

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 102, 153));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(330, 340, 110, 29);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(150, 380, 500, 40);

        lblApellidoM.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidoM.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellidoM.setForeground(new java.awt.Color(0, 102, 153));
        lblApellidoM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoM.setText("APELLIDO PATERNO");
        getContentPane().add(lblApellidoM);
        lblApellidoM.setBounds(860, 340, 250, 29);

        txtApellidoP.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoP.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApellidoP.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApellidoP);
        txtApellidoP.setBounds(740, 380, 500, 40);

        lblApellidoP.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidoP.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellidoP.setForeground(new java.awt.Color(0, 102, 153));
        lblApellidoP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoP.setText("APELLIDO MATERNO");
        getContentPane().add(lblApellidoP);
        lblApellidoP.setBounds(1450, 340, 240, 34);

        txtApellidoM.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoM.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtApellidoM.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApellidoM);
        txtApellidoM.setBounds(1320, 380, 500, 40);

        lblApellidoP1.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidoP1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellidoP1.setForeground(new java.awt.Color(0, 102, 153));
        lblApellidoP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoP1.setText("FECHA NACIMIENTO");
        getContentPane().add(lblApellidoP1);
        lblApellidoP1.setBounds(450, 500, 230, 34);

        txtFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setText("AAAA/MM/DD");
        txtFechaNacimiento.setToolTipText("");
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        txtFechaNacimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtFechaNacimiento);
        txtFechaNacimiento.setBounds(320, 540, 500, 40);
        txtFechaNacimiento.getAccessibleContext().setAccessibleName("");

        lblCalle.setBackground(new java.awt.Color(255, 255, 255));
        lblCalle.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(0, 102, 153));
        lblCalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalle.setText("CALLE");
        getContentPane().add(lblCalle);
        lblCalle.setBounds(350, 670, 80, 29);

        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCalle.setForeground(new java.awt.Color(0, 0, 0));
        txtCalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCalle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCalle);
        txtCalle.setBounds(150, 710, 500, 40);

        lblColonia.setBackground(new java.awt.Color(255, 255, 255));
        lblColonia.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblColonia.setForeground(new java.awt.Color(0, 102, 153));
        lblColonia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColonia.setText("COLONIA");
        getContentPane().add(lblColonia);
        lblColonia.setBounds(930, 670, 110, 30);

        txtColonia.setBackground(new java.awt.Color(255, 255, 255));
        txtColonia.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtColonia.setForeground(new java.awt.Color(0, 0, 0));
        txtColonia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColonia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtColonia);
        txtColonia.setBounds(750, 710, 500, 40);

        lblNumInt.setBackground(new java.awt.Color(255, 255, 255));
        lblNumInt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNumInt.setForeground(new java.awt.Color(0, 102, 153));
        lblNumInt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumInt.setText("NUM INT");
        getContentPane().add(lblNumInt);
        lblNumInt.setBounds(1380, 670, 110, 34);

        txtNumInt.setBackground(new java.awt.Color(255, 255, 255));
        txtNumInt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNumInt.setForeground(new java.awt.Color(0, 0, 0));
        txtNumInt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumInt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNumInt);
        txtNumInt.setBounds(1330, 710, 200, 40);

        lblColonia1.setBackground(new java.awt.Color(255, 255, 255));
        lblColonia1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblColonia1.setForeground(new java.awt.Color(0, 102, 153));
        lblColonia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColonia1.setText("NUM EXT");
        getContentPane().add(lblColonia1);
        lblColonia1.setBounds(1640, 670, 120, 40);

        txtNumExt.setBackground(new java.awt.Color(255, 255, 255));
        txtNumExt.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtNumExt.setForeground(new java.awt.Color(0, 0, 0));
        txtNumExt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumExt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNumExt);
        txtNumExt.setBounds(1610, 710, 200, 40);

        lblCiudad.setBackground(new java.awt.Color(255, 255, 255));
        lblCiudad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(0, 102, 153));
        lblCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad.setText("CIUDAD");
        getContentPane().add(lblCiudad);
        lblCiudad.setBounds(940, 820, 100, 29);

        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCiudad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtCiudad);
        txtCiudad.setBounds(750, 870, 500, 40);

        lblApellidoP2.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidoP2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApellidoP2.setForeground(new java.awt.Color(0, 102, 153));
        lblApellidoP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoP2.setText("GENERO");
        getContentPane().add(lblApellidoP2);
        lblApellidoP2.setBounds(1220, 500, 100, 34);

        cbxSexo.setBackground(new java.awt.Color(255, 255, 255));
        cbxSexo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxSexo.setForeground(new java.awt.Color(0, 0, 0));
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        cbxSexo.setSelectedIndex(-1);
        cbxSexo.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        getContentPane().add(cbxSexo);
        cbxSexo.setBounds(1140, 540, 250, 40);

        lblSubTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblSubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitulo.setText("Registro de Paciente");
        getContentPane().add(lblSubTitulo);
        lblSubTitulo.setBounds(750, 50, 480, 60);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(lblImagen);
        lblImagen.setBounds(60, 10, 130, 130);

        btnCancelar.setBackground(new java.awt.Color(153, 0, 51));
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

        setSize(new java.awt.Dimension(1941, 1129));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void IncrementarID() {
        String sql = " SELECT pk_idPaciente FROM MARIA.PACIENTE ORDER BY pk_idPaciente DESC LIMIT 1; ";
        String id = null;

        try {
            cn = conexion.getConection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                id = rs.getString("pk_idPaciente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.DEFAULT_OPTION, error);
            System.out.println(e);
        }

        if (id == null) {
            txtIDPaciente.setText("P-0001");
        } else {
            String idPaciente = id.substring(3, 6);
            int idPacienteInc = Integer.parseInt(idPaciente) + 1;

            if (idPacienteInc <= 9) {
                txtIDPaciente.setText("P-000" + idPacienteInc);
            } else if (idPacienteInc <= 10 || idPacienteInc <= 100) {
                txtIDPaciente.setText("P-00" + idPacienteInc);
            }

        }
    }
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String id = txtIDPaciente.getText();
        String nomb = txtNombre.getText();
        String ape1 = txtApellidoP.getText();
        String ape2 = txtApellidoM.getText();
        String fechaN = txtFechaNacimiento.getText();
        String sexo = (String) cbxSexo.getSelectedItem();
        String calle = txtCalle.getText();
        String colonia = txtColonia.getText();
        String numint = txtNumInt.getText();
        String numext = txtNumExt.getText();
        String ciudad = txtCiudad.getText();

        String sql = "INSERT INTO MARIA.PACIENTE VALUES ('" + id + "', '" + nomb + "', '" + ape1 + "', '" + ape2 + "', '" + sexo + "', '" + fechaN + "',"
                + "'" + calle + "', '" + numint + "', '" + numext + "', '" + colonia + "', '" + ciudad + "')";

        if (txtApellidoM.getText().isEmpty() || txtApellidoP.getText().isEmpty() || txtCalle.getText().isEmpty() || txtCiudad.getText().isEmpty()
                || txtColonia.getText().isEmpty() || txtIDPaciente.getText().isEmpty() || txtNombre.getText().isEmpty()
                || txtNumExt.getText().isEmpty() || txtNumInt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, PRIMERO LLENA TODAS LAS ENTRADAS DE TEXTO",
                    "ERROR EN ENTRADAS DE TEXTO", JOptionPane.DEFAULT_OPTION, pregunta);
        } else {
            try {
                cn = conexion.getConection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "EL PACIENTE HA SIDO AGREGADO EXITOSAMENTE", "PACIENTE AGREGADO",
                        JOptionPane.DEFAULT_OPTION, confirmar);

                VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
                Ven.setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.DEFAULT_OPTION, error);
                System.out.println(e);
            }
        }


    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VENTANA_PRINCIPAL Ven = new VENTANA_PRINCIPAL();
        Ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALTA_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblApellidoP1;
    private javax.swing.JLabel lblApellidoP2;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblColonia1;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumInt;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumExt;
    private javax.swing.JTextField txtNumInt;
    // End of variables declaration//GEN-END:variables
}
