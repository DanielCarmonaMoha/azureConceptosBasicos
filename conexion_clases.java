
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class conexion_clases {

    String user = LOGIN.txtUsuario.getText();
    String pass = LOGIN.txtPassword.getText();
    
    Connection con = null;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");

    public conexion_clases() {
        String url = "jdbc:postgresql://localhost:5432/clinica_maria_2";

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("conectado"+user+""+pass);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "LA CONEXION NO HA SIDO EXITOSA: " + e, "ERROR DE CONEXION",
                    JOptionPane.DEFAULT_OPTION, error);
        }

    }

    public Connection getConection() {
        return con;
    }

}
