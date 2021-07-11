
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BUSCAR_Especialista_Tabla extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    
    public static String ID;
    
    public BUSCAR_Especialista_Tabla() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxEspecialidad = new javax.swing.JComboBox<>();
        lblEspecialidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEspecialista = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblCabecera = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        cbxEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        cbxEspecialidad.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbxEspecialidad.setForeground(new java.awt.Color(0, 0, 0));
        cbxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEDICO GENERAL", "MEDICO INTERNISTA", "CARDIOLOGÍA", "GASTROENTOROLOGÍA", "NEFROLOGÍA" }));
        cbxEspecialidad.setSelectedIndex(-1);
        cbxEspecialidad.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 3, -1, 3, new java.awt.Color(0, 102, 153)));
        cbxEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(cbxEspecialidad);
        cbxEspecialidad.setBounds(240, 220, 400, 40);

        lblEspecialidad.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lblEspecialidad.setForeground(new java.awt.Color(0, 102, 153));
        lblEspecialidad.setText("ESPECIALIDAD");
        getContentPane().add(lblEspecialidad);
        lblEspecialidad.setBounds(370, 190, 130, 22);

        TablaEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        TablaEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TablaEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        TablaEspecialista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "CEDULA"
            }
        ));
        TablaEspecialista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEspecialistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEspecialista);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 320, 780, 403);

        lblTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("BUSCAR POR ESPECIALIDAD");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(270, 60, 330, 29);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblCabecera);
        lblCabecera.setBounds(0, 0, 900, 150);

        btnCancelar.setBackground(new java.awt.Color(153, 0, 51));
        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(60, 810, 250, 40);

        setBounds(0, 0, 918, 977);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEspecialidadActionPerformed
        String espe = (String) cbxEspecialidad.getSelectedItem();
        
        String sql = "SELECT pk_idEspecialista, nombre_esp, apepaterno_esp, apematerno_esp, num_cedula " 
                    +"FROM MARIA.ESPECIALISTA WHERE especialidad = '"+espe+"'";
        
        try {
            cn = conexion.getConection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] Paciente = new Object[5];
            modelo = (DefaultTableModel) TablaEspecialista.getModel();

            while (rs.next()) {
                Paciente[0] = rs.getString("pk_idEspecialista");
                Paciente[1] = rs.getString("nombre_esp");
                Paciente[2] = rs.getString("apepaterno_esp");
                Paciente[3] = rs.getString("apematerno_esp");
                Paciente[4] = rs.getString("num_cedula");
                modelo.addRow(Paciente);
            }
            TablaEspecialista.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
            System.out.println("" + e.getMessage());
        }
    }//GEN-LAST:event_cbxEspecialidadActionPerformed

    private void TablaEspecialistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEspecialistaMouseClicked
       int fila = TablaEspecialista.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "ESPECIALISTA NO SELECCIONADO");
        }else{
            ID = (String) TablaEspecialista.getValueAt(fila, 0);
            
            ALTA_Cita.txtIDEspecialista.setText(ID);
            
            this.dispose();
        }
    }//GEN-LAST:event_TablaEspecialistaMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSCAR_Especialista_Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEspecialista;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxEspecialidad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
