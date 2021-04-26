package com.pagestorcontraseña.vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InicioSistema extends javax.swing.JFrame {

    public InicioSistema() {
        initComponents();
        setLocationRelativeTo(null);

        btnSalirSistema.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnSalirSistema.getText() == "Salir") {
                    System.exit(0);
                } else {
                    dispose();
                }
            }

        });

        btnIngresarSistema.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Cree dos Variables para que en este caso los dueños del Sistema solo tengan acceso ellos.
                String usuario = "Pablo Abrigo";
                String contraseña = "54321";
                String pass = new String(txtContraLogin.getText());
                if (txtUsuarioLogin.getText().equals(usuario) && pass.equals(contraseña)) {
                    PaginaPrincipal p = new PaginaPrincipal();
                    p.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado:\n" + "Por favor ingrese su usuario y contraseña correctos", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                    limpiarCamposLogin();
                    txtUsuarioLogin.requestFocus();
                    return;
                }
            }

            private void limpiarCamposLogin() {
                txtUsuarioLogin.setText("");
                txtContraLogin.setText("");
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInicioSistema = new javax.swing.JPanel();
        lblTituloVentana = new javax.swing.JLabel();
        lbLogoGrande = new javax.swing.JLabel();
        lbUsuarioLogin = new javax.swing.JLabel();
        lbContraLogin = new javax.swing.JLabel();
        btnIngresarSistema = new javax.swing.JButton();
        btnSalirSistema = new javax.swing.JButton();
        txtUsuarioLogin = new javax.swing.JTextField();
        txtContraLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("L O G I N");
        setResizable(false);

        lblTituloVentana.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblTituloVentana.setText("PA - GESTOR DE CONTRASEÑAS");

        lbLogoGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pagestorcontraseña/imagenes/administrador-de-contrasenas.png"))); // NOI18N

        lbUsuarioLogin.setText("Usuario :");

        lbContraLogin.setText("Contraseña :");

        btnIngresarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pagestorcontraseña/imagenes/entrarSistema.png"))); // NOI18N
        btnIngresarSistema.setText("INGRESAR");

        btnSalirSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pagestorcontraseña/imagenes/salirSistema.png"))); // NOI18N
        btnSalirSistema.setText("SALIR");

        javax.swing.GroupLayout jPanelInicioSistemaLayout = new javax.swing.GroupLayout(jPanelInicioSistema);
        jPanelInicioSistema.setLayout(jPanelInicioSistemaLayout);
        jPanelInicioSistemaLayout.setHorizontalGroup(
            jPanelInicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelInicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelInicioSistemaLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(lblTituloVentana))
                        .addGroup(jPanelInicioSistemaLayout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(lbLogoGrande)))
                    .addGroup(jPanelInicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbUsuarioLogin)
                        .addGroup(jPanelInicioSistemaLayout.createSequentialGroup()
                            .addComponent(btnIngresarSistema)
                            .addGap(101, 101, 101)
                            .addComponent(btnSalirSistema))
                        .addComponent(lbContraLogin))
                    .addGroup(jPanelInicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtContraLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelInicioSistemaLayout.setVerticalGroup(
            jPanelInicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloVentana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLogoGrande)
                .addGap(18, 18, 18)
                .addGroup(jPanelInicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuarioLogin)
                    .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelInicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContraLogin)
                    .addComponent(txtContraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelInicioSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirSistema))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanelInicioSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelInicioSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarSistema;
    private javax.swing.JButton btnSalirSistema;
    private javax.swing.JPanel jPanelInicioSistema;
    private javax.swing.JLabel lbContraLogin;
    private javax.swing.JLabel lbLogoGrande;
    private javax.swing.JLabel lbUsuarioLogin;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JTextField txtContraLogin;
    private javax.swing.JTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables
}

//PaginaPrincipal dialog = new PaginaPrincipal();
//        dialog.setVisible(true);



// System.exit(WIDTH);
