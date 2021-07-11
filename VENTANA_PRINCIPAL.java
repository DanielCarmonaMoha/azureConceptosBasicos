
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VENTANA_PRINCIPAL extends javax.swing.JFrame {

    conexion conexion = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    ImageIcon paciente = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/paciente_32.png");
    ImageIcon especialista = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/doctor.png");
    ImageIcon cita = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/cita.png");
    ImageIcon error = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/no.png");
    ImageIcon pregunta = new ImageIcon("C:/Users/danie/Downloads/CLINICA_MARIA_IMG/pregunta.png");

    public VENTANA_PRINCIPAL() {
        initComponents();
        this.setLocationRelativeTo(null);
        Usuario();
        lblUsuario.setText(LOGIN.txtUsuario.getText());
    }

    public void Usuario() {
        String user = LOGIN.txtUsuario.getText();
        String pass = LOGIN.txtPassword.getText();
        String aux = null;

        String sql = "SELECT categoria FROM MARIA.USUARIO WHERE usuario = '" + user + "' AND password = '" + pass + "'";

        try {
            cn = conexion.getConection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                aux = rs.getString("categoria");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }

        if (Integer.parseInt(aux) == 1) {
            cbxAltasCapturista.setVisible(false);
            cbxEliminarCapturiista.setVisible(false);
            cbxModificarCapturista.setVisible(false);

            cbxAltasEspecialista.setVisible(false);
            cbxEliminarEspecialista.setVisible(false);
            cbxModificarEspecialista.setVisible(false);
        } else if (Integer.parseInt(aux) == 2) {
            cbxAltas.setVisible(false);
            cbxEliminar.setVisible(false);
            cbxModificar.setVisible(false);

            cbxAltasEspecialista.setVisible(false);
            cbxEliminarEspecialista.setVisible(false);
            cbxModificarEspecialista.setVisible(false);

            cbxAltasCapturista.setBounds(50, 500, 400, 40);
            cbxModificarCapturista.setBounds(510, 500, 400, 40);
            cbxEliminarCapturiista.setBounds(980, 500, 400, 40);
        } else if (Integer.parseInt(aux) == 3) {
            cbxAltas.setVisible(false);
            cbxEliminar.setVisible(false);
            cbxModificar.setVisible(false);

            cbxAltasCapturista.setVisible(false);
            cbxEliminarCapturiista.setVisible(false);
            cbxModificarCapturista.setVisible(false);

            cbxAltasEspecialista.setBounds(50, 500, 400, 40);
            cbxModificarEspecialista.setBounds(510, 500, 400, 40);
            cbxEliminarEspecialista.setBounds(980, 500, 400, 40);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSubtitulo = new javax.swing.JLabel();
        cbxAltasCapturista = new javax.swing.JComboBox<>();
        lblSubtituloAltas = new javax.swing.JLabel();
        cbxEliminarCapturiista = new javax.swing.JComboBox<>();
        lblSubtituloEliminar = new javax.swing.JLabel();
        cbxModificarCapturista = new javax.swing.JComboBox<>();
        lblSubtituloModificar = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblCabecera = new javax.swing.JLabel();
        cbxAltas = new javax.swing.JComboBox<>();
        cbxModificar = new javax.swing.JComboBox<>();
        cbxEliminar = new javax.swing.JComboBox<>();
        cbxReportes = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        cbxAltasEspecialista = new javax.swing.JComboBox<>();
        cbxEliminarEspecialista = new javax.swing.JComboBox<>();
        cbxModificarEspecialista = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        getContentPane().setLayout(null);

        lblSubtitulo.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Menú de Opciones");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(780, 50, 400, 58);

        cbxAltasCapturista.setBackground(new java.awt.Color(255, 255, 255));
        cbxAltasCapturista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxAltasCapturista.setForeground(new java.awt.Color(0, 0, 0));
        cbxAltasCapturista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PACIENTE", "DOCUMENTOS DE PACIENTE", "EXPEDIENTE DE PACIENTE", "CITA" }));
        cbxAltasCapturista.setSelectedIndex(-1);
        cbxAltasCapturista.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxAltasCapturista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAltasCapturistaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxAltasCapturista);
        cbxAltasCapturista.setBounds(50, 580, 400, 40);

        lblSubtituloAltas.setBackground(new java.awt.Color(255, 255, 255));
        lblSubtituloAltas.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblSubtituloAltas.setForeground(new java.awt.Color(0, 102, 153));
        lblSubtituloAltas.setText("ALTAS");
        getContentPane().add(lblSubtituloAltas);
        lblSubtituloAltas.setBounds(210, 460, 73, 29);

        cbxEliminarCapturiista.setBackground(new java.awt.Color(255, 255, 255));
        cbxEliminarCapturiista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxEliminarCapturiista.setForeground(new java.awt.Color(0, 0, 0));
        cbxEliminarCapturiista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PACIENTE", "DOCUMENTOS DE PACIENTE", "EXPEDIENTE DE PACIENTE", "CITA" }));
        cbxEliminarCapturiista.setSelectedIndex(-1);
        cbxEliminarCapturiista.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxEliminarCapturiista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEliminarCapturiistaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxEliminarCapturiista);
        cbxEliminarCapturiista.setBounds(980, 570, 400, 40);

        lblSubtituloEliminar.setBackground(new java.awt.Color(255, 255, 255));
        lblSubtituloEliminar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblSubtituloEliminar.setForeground(new java.awt.Color(0, 102, 153));
        lblSubtituloEliminar.setText("ELIMINAR");
        getContentPane().add(lblSubtituloEliminar);
        lblSubtituloEliminar.setBounds(1130, 460, 130, 30);

        cbxModificarCapturista.setBackground(new java.awt.Color(255, 255, 255));
        cbxModificarCapturista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxModificarCapturista.setForeground(new java.awt.Color(0, 0, 0));
        cbxModificarCapturista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PACIENTE", "DOCUMENTOS DE PACIENTE", "EXPEDIENTE DE PACIENTE", "CITA" }));
        cbxModificarCapturista.setSelectedIndex(-1);
        cbxModificarCapturista.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxModificarCapturista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxModificarCapturistaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxModificarCapturista);
        cbxModificarCapturista.setBounds(510, 580, 400, 40);

        lblSubtituloModificar.setBackground(new java.awt.Color(255, 255, 255));
        lblSubtituloModificar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblSubtituloModificar.setForeground(new java.awt.Color(0, 102, 153));
        lblSubtituloModificar.setText("MODIFICAR");
        getContentPane().add(lblSubtituloModificar);
        lblSubtituloModificar.setBounds(640, 460, 130, 30);

        lblEstado.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("BIENVENIDO USUARIO:");
        getContentPane().add(lblEstado);
        lblEstado.setBounds(1560, 30, 270, 40);

        lblUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("USUARIO");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(1640, 80, 200, 40);

        lblReportes.setBackground(new java.awt.Color(255, 255, 255));
        lblReportes.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(0, 102, 153));
        lblReportes.setText("REPORTES");
        getContentPane().add(lblReportes);
        lblReportes.setBounds(1590, 460, 130, 30);

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\clinica (3).png")); // NOI18N
        getContentPane().add(lblImagen);
        lblImagen.setBounds(70, 10, 130, 130);

        lblCabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\CABECERA_2.jpg")); // NOI18N
        getContentPane().add(lblCabecera);
        lblCabecera.setBounds(0, 0, 1920, 150);

        cbxAltas.setBackground(new java.awt.Color(255, 255, 255));
        cbxAltas.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxAltas.setForeground(new java.awt.Color(0, 0, 0));
        cbxAltas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PACIENTE", "DOCUMENTOS DE PACIENTE", "EXPEDIENTE DE PACIENTE", "CITA", "DIAGNOSTICO ", "ESPECIALISTA" }));
        cbxAltas.setSelectedIndex(-1);
        cbxAltas.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAltasActionPerformed(evt);
            }
        });
        getContentPane().add(cbxAltas);
        cbxAltas.setBounds(50, 500, 400, 40);

        cbxModificar.setBackground(new java.awt.Color(255, 255, 255));
        cbxModificar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxModificar.setForeground(new java.awt.Color(0, 0, 0));
        cbxModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PACIENTE", "DOCUMENTOS DE PACIENTE", "EXPEDIENTE DE PACIENTE", "CITA", "DIAGNOSTICO", "ESPECIALISTA" }));
        cbxModificar.setSelectedIndex(-1);
        cbxModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxModificarActionPerformed(evt);
            }
        });
        getContentPane().add(cbxModificar);
        cbxModificar.setBounds(510, 500, 400, 40);

        cbxEliminar.setBackground(new java.awt.Color(255, 255, 255));
        cbxEliminar.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxEliminar.setForeground(new java.awt.Color(0, 0, 0));
        cbxEliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PACIENTE", "DOCUMENTOS DE PACIENTE", "EXPEDIENTE DE PACIENTE", "CITA", "DIAGNOSTICO", "ESPECIALISTA" }));
        cbxEliminar.setSelectedIndex(-1);
        cbxEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(cbxEliminar);
        cbxEliminar.setBounds(980, 500, 400, 40);

        cbxReportes.setBackground(new java.awt.Color(255, 255, 255));
        cbxReportes.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxReportes.setForeground(new java.awt.Color(0, 0, 0));
        cbxReportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXPEDIENTE Y DIAGNOSTICOS DE PACIENTE", "CITAS ASIGNADAS", "CITAS CANCELADAS", "CITAS ASIGNADAS A ESPECIALISTA" }));
        cbxReportes.setSelectedIndex(-1);
        cbxReportes.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxReportesActionPerformed(evt);
            }
        });
        getContentPane().add(cbxReportes);
        cbxReportes.setBounds(1450, 500, 400, 40);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Downloads\\CLINICA_MARIA_IMG\\cerrar-sesion.png")); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(1770, 870, 90, 90);

        cbxAltasEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        cbxAltasEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxAltasEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        cbxAltasEspecialista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIAGNOSTICO" }));
        cbxAltasEspecialista.setSelectedIndex(-1);
        cbxAltasEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxAltasEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAltasEspecialistaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxAltasEspecialista);
        cbxAltasEspecialista.setBounds(50, 660, 400, 40);

        cbxEliminarEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        cbxEliminarEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxEliminarEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        cbxEliminarEspecialista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIAGNOSTICO" }));
        cbxEliminarEspecialista.setSelectedIndex(-1);
        cbxEliminarEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxEliminarEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEliminarEspecialistaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxEliminarEspecialista);
        cbxEliminarEspecialista.setBounds(980, 660, 400, 40);

        cbxModificarEspecialista.setBackground(new java.awt.Color(255, 255, 255));
        cbxModificarEspecialista.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cbxModificarEspecialista.setForeground(new java.awt.Color(0, 0, 0));
        cbxModificarEspecialista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIAGNOSTICO" }));
        cbxModificarEspecialista.setSelectedIndex(-1);
        cbxModificarEspecialista.setBorder(javax.swing.BorderFactory.createMatteBorder(-1, 2, -1, 2, new java.awt.Color(0, 102, 153)));
        cbxModificarEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxModificarEspecialistaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxModificarEspecialista);
        cbxModificarEspecialista.setBounds(510, 660, 400, 40);

        setBounds(0, 0, 1938, 1127);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxAltasCapturistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAltasCapturistaActionPerformed
        if (cbxAltasCapturista.getSelectedIndex() == 0) {
            ALTA_Paciente A_Paciente = new ALTA_Paciente();
            A_Paciente.setVisible(true);
            this.setVisible(false);
        } else if (cbxAltasCapturista.getSelectedIndex() == 1) {
            ALTA_Paciente_DOC A_Paciente_DOC = new ALTA_Paciente_DOC();
            A_Paciente_DOC.setVisible(true);
            this.setVisible(false);
        } else if (cbxAltasCapturista.getSelectedIndex() == 2) {
            ALTA_Expediente A_Expe = new ALTA_Expediente();
            A_Expe.setVisible(true);
            this.setVisible(false);
        } else if (cbxAltasCapturista.getSelectedIndex() == 3) {
            ALTA_Cita A_Cita = new ALTA_Cita();
            A_Cita.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cbxAltasCapturistaActionPerformed

    private void cbxModificarCapturistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxModificarCapturistaActionPerformed
        if (cbxModificarCapturista.getSelectedIndex() == 0) {
            MODIFICAR_Paciente M_Paciente = new MODIFICAR_Paciente();
            M_Paciente.setVisible(true);
            this.setVisible(false);
        } else if (cbxModificarCapturista.getSelectedIndex() == 1) {
            MODIFICAR_Paciente_DOC M_Paciente_DOC = new MODIFICAR_Paciente_DOC();
            M_Paciente_DOC.setVisible(true);
            this.setVisible(false);
        } else if (cbxModificarCapturista.getSelectedIndex() == 2) {
            MODIFICAR_Expediente M_Expediente = new MODIFICAR_Expediente();
            M_Expediente.setVisible(true);
            this.setVisible(false);
        } else if (cbxModificarCapturista.getSelectedIndex() == 3) {
            MODIFICAR_Cita M_Cita = new MODIFICAR_Cita();
            M_Cita.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cbxModificarCapturistaActionPerformed

    private void cbxEliminarCapturiistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEliminarCapturiistaActionPerformed
        if (cbxEliminarCapturiista.getSelectedIndex() == 0) {
            ELIMINAR_Paciente E_Paciente = new ELIMINAR_Paciente();
            E_Paciente.setVisible(true);
            this.setVisible(false);
        } else if (cbxEliminarCapturiista.getSelectedIndex() == 1) {
            ELIMINAR_Paciente_DOC E_Paciente_DOC = new ELIMINAR_Paciente_DOC();
            E_Paciente_DOC.setVisible(true);
            this.setVisible(false);
        } else if (cbxEliminarCapturiista.getSelectedIndex() == 2) {
            ELIMINAR_Expediente E_Expediente = new ELIMINAR_Expediente();
            E_Expediente.setVisible(true);
            this.setVisible(false);
        } else if (cbxEliminarCapturiista.getSelectedIndex() == 3) {
            ELIMINAR_Cita E_Cita = new ELIMINAR_Cita();
            E_Cita.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cbxEliminarCapturiistaActionPerformed

    private void cbxAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAltasActionPerformed
        if (cbxAltas.getSelectedIndex() == 0) {
            ALTA_Paciente A_Paciente = new ALTA_Paciente();
            A_Paciente.setVisible(true);
            this.setVisible(false);
        } else if (cbxAltas.getSelectedIndex() == 1) {
            ALTA_Paciente_DOC A_Paciente_DOC = new ALTA_Paciente_DOC();
            A_Paciente_DOC.setVisible(true);
            this.setVisible(false);
        } else if (cbxAltas.getSelectedIndex() == 2) {
            ALTA_Expediente A_Expe = new ALTA_Expediente();
            A_Expe.setVisible(true);
            this.setVisible(false);
        } else if (cbxAltas.getSelectedIndex() == 3) {
            ALTA_Cita A_Cita = new ALTA_Cita();
            A_Cita.setVisible(true);
            this.setVisible(false);
        } else if (cbxAltas.getSelectedIndex() == 4) {
            ALTA_Expediente_Diagnostico A_Expe_D = new ALTA_Expediente_Diagnostico();
            A_Expe_D.setVisible(true);
            this.setVisible(false);
        } else if (cbxAltas.getSelectedIndex() == 5) {
            ALTA_Especialista A_Especialista = new ALTA_Especialista();
            A_Especialista.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cbxAltasActionPerformed

    private void cbxModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxModificarActionPerformed
        if (cbxModificar.getSelectedIndex() == 0) {
            MODIFICAR_Paciente M_Paciente = new MODIFICAR_Paciente();
            M_Paciente.setVisible(true);
            this.setVisible(false);
        } else if (cbxModificar.getSelectedIndex() == 1) {
            MODIFICAR_Paciente_DOC M_Paciente_DOC = new MODIFICAR_Paciente_DOC();
            M_Paciente_DOC.setVisible(true);
            this.setVisible(false);
        } else if (cbxModificar.getSelectedIndex() == 2) {
            MODIFICAR_Expediente M_Expediente = new MODIFICAR_Expediente();
            M_Expediente.setVisible(true);
            this.setVisible(false);
        } else if (cbxModificar.getSelectedIndex() == 3) {
            MODIFICAR_Cita M_Cita = new MODIFICAR_Cita();
            M_Cita.setVisible(true);
            this.setVisible(false);
        } else if (cbxModificar.getSelectedIndex() == 4) {
            MODIFICAR_Expediente_Diagnostico M_Expe_D = new MODIFICAR_Expediente_Diagnostico();
            M_Expe_D.setVisible(true);
            this.setVisible(false);
        } else if (cbxModificar.getSelectedIndex() == 5) {
            MODIFICAR_Especialista M_Especialista = new MODIFICAR_Especialista();
            M_Especialista.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cbxModificarActionPerformed

    private void cbxEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEliminarActionPerformed
        if (cbxEliminar.getSelectedIndex() == 0) {
            ELIMINAR_Paciente E_Paciente = new ELIMINAR_Paciente();
            E_Paciente.setVisible(true);
            this.setVisible(false);
        } else if (cbxEliminar.getSelectedIndex() == 1) {
            ELIMINAR_Paciente_DOC E_Paciente_DOC = new ELIMINAR_Paciente_DOC();
            E_Paciente_DOC.setVisible(true);
            this.setVisible(false);
        } else if (cbxEliminar.getSelectedIndex() == 2) {
            ELIMINAR_Expediente E_Expediente = new ELIMINAR_Expediente();
            E_Expediente.setVisible(true);
            this.setVisible(false);
        } else if (cbxEliminar.getSelectedIndex() == 3) {
            ELIMINAR_Cita E_Cita = new ELIMINAR_Cita();
            E_Cita.setVisible(true);
            this.setVisible(false);
        } else if (cbxEliminar.getSelectedIndex() == 4) {
            ELIMINAR_Expediente_Diagnostico E_Expe_D = new ELIMINAR_Expediente_Diagnostico();
            E_Expe_D.setVisible(true);
            this.setVisible(false);
        } else if (cbxEliminar.getSelectedIndex() == 5) {
            ELIMINAR_Especialista E_Especialista = new ELIMINAR_Especialista();
            E_Especialista.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cbxEliminarActionPerformed

    private void cbxReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxReportesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LOGIN login = new LOGIN();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbxAltasEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAltasEspecialistaActionPerformed
        if (cbxAltasEspecialista.getSelectedIndex() == 0) {
            ALTA_Expediente_Diagnostico A_Expe_D = new ALTA_Expediente_Diagnostico();
            A_Expe_D.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cbxAltasEspecialistaActionPerformed

    private void cbxEliminarEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEliminarEspecialistaActionPerformed
        if (cbxModificarEspecialista.getSelectedIndex() == 0) {
            MODIFICAR_Expediente_Diagnostico M_Expe_D = new MODIFICAR_Expediente_Diagnostico();
            M_Expe_D.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cbxEliminarEspecialistaActionPerformed

    private void cbxModificarEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxModificarEspecialistaActionPerformed
        if (cbxEliminar.getSelectedIndex() == 0) {
            ELIMINAR_Expediente_Diagnostico E_Expe_D = new ELIMINAR_Expediente_Diagnostico();
            E_Expe_D.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cbxModificarEspecialistaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTANA_PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxAltas;
    private javax.swing.JComboBox<String> cbxAltasCapturista;
    private javax.swing.JComboBox<String> cbxAltasEspecialista;
    private javax.swing.JComboBox<String> cbxEliminar;
    private javax.swing.JComboBox<String> cbxEliminarCapturiista;
    private javax.swing.JComboBox<String> cbxEliminarEspecialista;
    private javax.swing.JComboBox<String> cbxModificar;
    private javax.swing.JComboBox<String> cbxModificarCapturista;
    private javax.swing.JComboBox<String> cbxModificarEspecialista;
    private javax.swing.JComboBox<String> cbxReportes;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblSubtituloAltas;
    private javax.swing.JLabel lblSubtituloEliminar;
    private javax.swing.JLabel lblSubtituloModificar;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
