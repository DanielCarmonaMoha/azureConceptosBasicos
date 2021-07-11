
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class conexion {

    Connection con = null;

    ImageIcon confirmar = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/si.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");

    public conexion() {
        String url = "jdbc:postgresql://localhost:5432/clinica_maria_2";

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, "postgres", "daniel71298");
            System.out.println("conectado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "LA CONEXION NO HA SIDO EXITOSA: " + e, "ERROR DE CONEXION",
                    JOptionPane.DEFAULT_OPTION, error);
        }

    }

    public Connection getConection() {
        return con;
    }

}
