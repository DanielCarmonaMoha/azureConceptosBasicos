
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BUSCAR_Paciente_Tabla extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    
    public static String ID;

    public BUSCAR_Paciente_Tabla() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        lblApellidoM = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoP = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPaciente = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblCabecera = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(40, 250, 250, 40);

        txtApellidoM.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoM.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        txtApellidoM.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApellidoM);
        txtApellidoM.setBounds(600, 250, 250, 40);

        txtApellidoP.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        txtApellidoP.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtApellidoP);
        txtApellidoP.setBounds(320, 250, 250, 40);

        lblApellidoM.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lblApellidoM.setForeground(new java.awt.Color(0, 102, 153));
        lblApellidoM.setText("APELLIDO MATERNO");
        getContentPane().add(lblApellidoM);
        lblApellidoM.setBounds(640, 220, 180, 22);

        lblNombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 102, 153));
        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(120, 220, 90, 16);

        lblApellidoP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lblApellidoP.setForeground(new java.awt.Color(0, 102, 153));
        lblApellidoP.setText("APELLIDO PATERNO");
        getContentPane().add(lblApellidoP);
        lblApellidoP.setBounds(360, 220, 180, 20);

        btnBuscar.setBackground(new java.awt.Color(0, 102, 153));
        btnBuscar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(320, 350, 250, 40);

        TablaPaciente.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TablaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "FECHA NACIMIENTO", "CIUDAD", "COLONIA", "CALLE"
            }
        ));
        TablaPaciente.setGridColor(new java.awt.Color(0, 102, 153));
        TablaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPaciente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 440, 790, 360);

        lblTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("BUSCAR PACIENTE POR NOMBRE");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(240, 60, 390, 20);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblCabecera);
        lblCabecera.setBounds(0, 0, 900, 150);

        btnBuscar1.setBackground(new java.awt.Color(153, 0, 0));
        btnBuscar1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setText("CANCELAR");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1);
        btnBuscar1.setBounds(50, 840, 250, 40);

        setBounds(0, 0, 918, 977);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nomb = txtNombre.getText();
        String apeP = txtApellidoP.getText();
        String apeM = txtApellidoM.getText();

        String sql= "SELECT pk_idPaciente, fechanacimiento, ciudad, colonia, calle "
                + "FROM MARIA.PACIENTE WHERE nombre = '"+nomb+"'"
                + "AND apepaterno = '"+apeP+"' AND apematerno = '"+apeM+"'";
        
        try {
            cn = conexion.getConection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] Paciente = new Object[5];
            modelo = (DefaultTableModel) TablaPaciente.getModel();

            while (rs.next()) {
                Paciente[0] = rs.getString("pk_idPaciente");
                Paciente[1] = rs.getString("fechanacimiento");
                Paciente[2] = rs.getString("ciudad");
                Paciente[3] = rs.getString("colonia");
                Paciente[4] = rs.getString("calle");
                modelo.addRow(Paciente);
            }
            TablaPaciente.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
            System.out.println("" + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void TablaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPacienteMouseClicked
        int fila = TablaPaciente.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "PACIENTE NO SELECCIONADO");
        }else{
            ID = (String) TablaPaciente.getValueAt(fila, 0);
            
            ALTA_Cita.txtIDPaciente.setText(ID);
            
            this.dispose();
        }
    }//GEN-LAST:event_TablaPacienteMouseClicked

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSCAR_Paciente_Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPaciente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
