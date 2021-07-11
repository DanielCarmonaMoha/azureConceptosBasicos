
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LOGIN extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    public LOGIN() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagenLogin = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblImagenLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\usuario.png")); // NOI18N
        getContentPane().add(lblImagenLogin);
        lblImagenLogin.setBounds(280, 190, 260, 270);

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(200, 540, 400, 50);

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(0, 102, 153)));
        getContentPane().add(txtPassword);
        txtPassword.setBounds(200, 650, 400, 50);

        lblPassword.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 102, 153));
        lblPassword.setText("Contraseña");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(340, 610, 140, 40);

        lblBienvenido.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(0, 102, 153));
        lblBienvenido.setText("BIENVENIDO!");
        getContentPane().add(lblBienvenido);
        lblBienvenido.setBounds(290, 60, 250, 40);

        lblUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 102, 153));
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(360, 500, 90, 40);

        btnIngresar.setBackground(new java.awt.Color(0, 102, 153));
        btnIngresar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(200, 790, 400, 50);

        jSeparator1.setForeground(new java.awt.Color(0, 102, 153));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(190, 112, 450, 20);

        lblMensaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(204, 0, 51));
        getContentPane().add(lblMensaje);
        lblMensaje.setBounds(260, 730, 320, 40);

        setBounds(0, 0, 818, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String user = txtUsuario.getText();
        String pass = txtPassword.getText();
        int res = 0;

        String sql = "SELECT usuario,password FROM MARIA.USUARIO WHERE usuario = '" + user + "' AND password = '" + pass + "'";

        try {
            cn = conexion.getConection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                res = 1;
                if (res == 1) {
                    VENTANA_PRINCIPAL ven = new VENTANA_PRINCIPAL();
                    ven.setVisible(true);
                    this.dispose();
                }
            } else {
               lblMensaje.setText("Su usuario o contraseña no coinciden");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
        
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblImagenLogin;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    public static javax.swing.JPasswordField txtPassword;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
