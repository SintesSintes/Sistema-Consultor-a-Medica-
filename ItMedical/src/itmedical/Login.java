
package itmedical;
import javax.swing.*;
import java.awt.*;
import BD.LoginDAO;


public class Login extends javax.swing.JFrame {
    int ejex;
    int ejey;
    public Login() {
        initComponents();
        LoginDAO loginDAO = new LoginDAO();
        
    }

    public void validar() {
    String usuario = usuariobtn.getText().trim();
    String contraseña = new String(passbtn.getPassword()).trim();

    if (!usuario.equals("") && !contraseña.equals("")) {
        LoginDAO loginDao = new LoginDAO();          
        boolean correcto = loginDao.validarUsuario(usuario, contraseña); 
        if (correcto) {
            JOptionPane.showMessageDialog(this, "Bienvenido " + usuario);
            Sistema sis = new Sistema();  
            sis.setVisible(true);
            this.dispose();               
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Debe ingresar usuario y contraseña");
    }
}



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usuariobtn = new javax.swing.JTextField();
        passbtn = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        Enterbtn = new javax.swing.JPanel();
        Entrarbtn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cerrarbtn = new javax.swing.JPanel();
        Xbtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelbtn = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(500, 800));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, 60));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INICIO SESIÓN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 790, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("USUARIO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 210, 20));

        usuariobtn.setBackground(new java.awt.Color(204, 204, 204));
        usuariobtn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        usuariobtn.setForeground(new java.awt.Color(0, 0, 0));
        usuariobtn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuariobtn.setText("Ingrese su usuario");
        usuariobtn.setBorder(null);
        usuariobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariobtnMousePressed(evt);
            }
        });
        getContentPane().add(usuariobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 210, 30));

        passbtn.setBackground(new java.awt.Color(204, 204, 204));
        passbtn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        passbtn.setForeground(new java.awt.Color(0, 0, 0));
        passbtn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passbtn.setText("*********");
        passbtn.setBorder(null);
        passbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passbtnMousePressed(evt);
            }
        });
        passbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passbtnActionPerformed(evt);
            }
        });
        getContentPane().add(passbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 210, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Instituto Medico / Base de Datos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 800, -1));

        Enterbtn.setBackground(new java.awt.Color(0, 157, 217));
        Enterbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Enterbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnterbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnterbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnterbtnMouseExited(evt);
            }
        });

        Entrarbtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Entrarbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Entrarbtn.setText("Entrar");
        Entrarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EnterbtnLayout = new javax.swing.GroupLayout(Enterbtn);
        Enterbtn.setLayout(EnterbtnLayout);
        EnterbtnLayout.setHorizontalGroup(
            EnterbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entrarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        EnterbtnLayout.setVerticalGroup(
            EnterbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Entrarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Enterbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, 50));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CONTRASEÑA:");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 210, -1));

        cerrarbtn.setBackground(new java.awt.Color(255, 255, 255));
        cerrarbtn.setForeground(new java.awt.Color(255, 255, 255));
        cerrarbtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cerrarbtnMouseDragged(evt);
            }
        });
        cerrarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarbtnMousePressed(evt);
            }
        });

        Xbtn.setBackground(new java.awt.Color(0, 0, 0));
        Xbtn.setFont(new java.awt.Font("Roboto SemiCondensed Black", 0, 18)); // NOI18N
        Xbtn.setForeground(new java.awt.Color(0, 0, 0));
        Xbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Xbtn.setText("X");
        Xbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Xbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarbtnLayout = new javax.swing.GroupLayout(cerrarbtn);
        cerrarbtn.setLayout(cerrarbtnLayout);
        cerrarbtnLayout.setHorizontalGroup(
            cerrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cerrarbtnLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(Xbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cerrarbtnLayout.setVerticalGroup(
            cerrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Xbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(cerrarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 60, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ITMEDICAL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 800, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoit.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        panelbtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelbtnMouseDragged(evt);
            }
        });
        panelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelbtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelbtnLayout = new javax.swing.GroupLayout(panelbtn);
        panelbtn.setLayout(panelbtnLayout);
        panelbtnLayout.setHorizontalGroup(
            panelbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        panelbtnLayout.setVerticalGroup(
            panelbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(panelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarbtnMousePressed
        
    }//GEN-LAST:event_cerrarbtnMousePressed

    private void cerrarbtnMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarbtnMouseDragged
        
    }//GEN-LAST:event_cerrarbtnMouseDragged

    private void panelbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbtnMousePressed
       ejex = evt.getX();
       ejey = evt.getY();
    }//GEN-LAST:event_panelbtnMousePressed

    private void panelbtnMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbtnMouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - ejex,y - ejey);
    }//GEN-LAST:event_panelbtnMouseDragged

    private void XbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XbtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XbtnMouseClicked

    private void XbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XbtnMouseEntered
       cerrarbtn.setBackground(Color.red);
       Xbtn.setForeground(Color.white);
    }//GEN-LAST:event_XbtnMouseEntered

    private void XbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XbtnMouseExited
        cerrarbtn.setBackground( Color.white);
        Xbtn.setForeground(Color.black);
    }//GEN-LAST:event_XbtnMouseExited

    private void EnterbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterbtnMouseEntered
        Enterbtn.setBackground(new Color (0,127,237));
        
    }//GEN-LAST:event_EnterbtnMouseEntered

    private void EnterbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterbtnMouseExited
        Enterbtn.setBackground(new Color (0,157,217));
    }//GEN-LAST:event_EnterbtnMouseExited

    private void usuariobtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariobtnMousePressed
        usuariobtn.setText(" ");
        usuariobtn.setForeground(Color.black);
        usuariobtn.setText(" ");
        usuariobtn.setForeground(Color.gray);
    }//GEN-LAST:event_usuariobtnMousePressed

    private void passbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passbtnMousePressed
        passbtn.setText("Ingrese el usuario");
        passbtn.setForeground(Color.gray);
        passbtn.setText("");
        passbtn.setForeground(Color.black);
    }//GEN-LAST:event_passbtnMousePressed

    private void EntrarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarbtnMouseClicked
        validar();
    }//GEN-LAST:event_EntrarbtnMouseClicked

    private void passbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passbtnActionPerformed

    private void EnterbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterbtnMouseClicked

    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Enterbtn;
    private javax.swing.JLabel Entrarbtn;
    private javax.swing.JLabel Xbtn;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel cerrarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelbtn;
    private javax.swing.JPasswordField passbtn;
    private javax.swing.JTextField usuariobtn;
    // End of variables declaration//GEN-END:variables
}
