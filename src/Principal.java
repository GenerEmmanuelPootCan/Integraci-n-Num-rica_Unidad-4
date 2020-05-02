
import javax.swing.JOptionPane;
import metodos.Simpson1;
import metodos.Simpson2;
import metodos.Trapecios;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author 
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        bloquearCasillas();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_fx = new javax.swing.JTextField();
        jTextField_B = new javax.swing.JTextField();
        jTextField_A = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSolucion = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jRadioButtonSimpson3_8 = new javax.swing.JRadioButton();
        jRadioButtonTrapecios = new javax.swing.JRadioButton();
        jRadioButtonSimpson1_3 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelTextoParticiones = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_N = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Integración Numérica");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jTextField_fx.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField_fx.setText(" f (x)");
        jTextField_fx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fxActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_fx);
        jTextField_fx.setBounds(60, 40, 170, 30);

        jTextField_B.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField_B.setText(" b");
        jTextField_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_B);
        jTextField_B.setBounds(40, 0, 40, 30);

        jTextField_A.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField_A.setText(" a");
        jTextField_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_A);
        jTextField_A.setBounds(40, 80, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/integral.3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 51, 75);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("dx =");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(234, 40, 60, 30);

        jTextFieldSolucion.setEditable(false);
        jTextFieldSolucion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSolucionActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldSolucion);
        jTextFieldSolucion.setBounds(300, 40, 270, 30);

        jButtonCalcular.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCalcular);
        jButtonCalcular.setBounds(260, 210, 120, 50);

        jRadioButtonSimpson3_8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonSimpson3_8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonSimpson3_8.setText("Simpson 3/8");
        jRadioButtonSimpson3_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSimpson3_8ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonSimpson3_8);
        jRadioButtonSimpson3_8.setBounds(460, 170, 130, 23);

        jRadioButtonTrapecios.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonTrapecios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonTrapecios.setText("Trapecio");
        jRadioButtonTrapecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTrapeciosActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonTrapecios);
        jRadioButtonTrapecios.setBounds(50, 170, 160, 23);

        jRadioButtonSimpson1_3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonSimpson1_3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonSimpson1_3.setText("Simpson 1/3");
        jRadioButtonSimpson1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSimpson1_3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonSimpson1_3);
        jRadioButtonSimpson1_3.setBounds(260, 170, 110, 23);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 120, 630, 10);

        jLabelTextoParticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTextoParticiones.setText("n =");
        jPanel1.add(jLabelTextoParticiones);
        jLabelTextoParticiones.setBounds(100, 80, 30, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Seleccione el método a utilizar:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 130, 220, 17);

        jTextField_N.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_N);
        jTextField_N.setBounds(130, 80, 50, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setText("Nueva Integración");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jMenu1.setText("Menú");

        jMenuItem1.setText("Información del equipo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_fxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fxActionPerformed

    private void jTextField_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BActionPerformed

    private void jTextField_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AActionPerformed

    private void jTextFieldSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSolucionActionPerformed

    private void jRadioButtonTrapeciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTrapeciosActionPerformed
        // TODO add your handling code here:
        // deseleccionamos los radiobutton no seleccionados
        
        jRadioButtonSimpson1_3.setSelected(false);
        jRadioButtonSimpson3_8.setSelected(false);
    }//GEN-LAST:event_jRadioButtonTrapeciosActionPerformed

    private void jRadioButtonSimpson1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSimpson1_3ActionPerformed
        // TODO add your handling code here:
        // deseleccionamos los radiobutton no seleccionados
        jRadioButtonTrapecios.setSelected(false);
        
        jRadioButtonSimpson3_8.setSelected(false);
    }//GEN-LAST:event_jRadioButtonSimpson1_3ActionPerformed

    private void jRadioButtonSimpson3_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSimpson3_8ActionPerformed
        // TODO add your handling code here:
        // deseleccionamos los radiobutton no seleccionados
        jRadioButtonTrapecios.setSelected(false);
        
        jRadioButtonSimpson1_3.setSelected(false);
    }//GEN-LAST:event_jRadioButtonSimpson3_8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiarCasillas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // TODO add your handling code here:
        try {

            String funcion = jTextField_fx.getText();
            String a = jTextField_A.getText();
            String b = jTextField_B.getText();
            int n = Integer.parseInt(jTextField_N.getText());    
             {
                if (jRadioButtonTrapecios.isSelected()) {// si se selecina el metodo de la regla de los trapecios
                    Trapecios m1 = new Trapecios();
                    jTextFieldSolucion.setText(m1.trapecio(funcion, a, b, n)); // llamada al metodo trapecio que calcula la solucion aproximada
                } else {
                    if (jRadioButtonSimpson1_3.isSelected()) {// si se seleciona el metodo de Simpson 1/3
                        if (n % 2 == 0) {
                            Simpson1 m2 = new Simpson1();
                            jTextFieldSolucion.setText(m2.simpson1_3(funcion, a, b, n));// llamada al metodo simpson1_3 que calcula la solucion aproximada
                        } else {
                            JOptionPane.showMessageDialog(null, "El metodo de Simpson 1/3 utiliza un numero de particiones par");
                        }
                    } else {// si se seleciona el metodo de Simpson ); 3/8
                        if (n % 2 != 0) {
                            Simpson2 m3 = new Simpson2();// se crea un objeto de la clase Simpson2
                            jTextFieldSolucion.setText(m3.simpson3_8(funcion, a, b, n));// se llama al metodo simpson3_8 que calcula la solucion aproximada
                        } else {
                            JOptionPane.showMessageDialog(null, "El metodo de Simpson 3/8 utiliza un numero de particiones impar");
                        }


                    }
                }
            }

          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jTextField_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Instituto Tecnológico Superior de Valladolid\n\n"
                 + "Ingenieria en Sistemas Computacionales\n\n"
                 + "Integrantes del equipo:\n"
                 + "1.-Mis Oy Cristina de Jesús\n"
                 + "2.-Poot Can Gener Emmanuel\n"
                 + "3.-Uicab Balam Nanci Arai");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTextoParticiones;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonSimpson1_3;
    private javax.swing.JRadioButton jRadioButtonSimpson3_8;
    private javax.swing.JRadioButton jRadioButtonTrapecios;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldSolucion;
    private javax.swing.JTextField jTextField_A;
    private javax.swing.JTextField jTextField_B;
    private javax.swing.JTextField jTextField_N;
    private javax.swing.JTextField jTextField_fx;
    // End of variables declaration//GEN-END:variables

    private void limpiarCasillas() {
        // activamos los cuadros de texto para ingresar los datos
        jTextField_A.setEnabled(true);
        jTextField_B.setEnabled(true);
        jTextField_fx.setEnabled(true);

        jTextField_A.setText("a");
        jTextField_B.setText("b");
        jTextField_fx.setText(" f (x)");

        jButtonCalcular.setEnabled(true);// activamos el boton calcular

        // activamos los  jRadioButtons
        
        jRadioButtonTrapecios.setEnabled(true);
        jRadioButtonSimpson3_8.setEnabled(true);
        jRadioButtonSimpson1_3.setEnabled(true);

        jLabelTextoParticiones.setEnabled(true);
        jTextField_N.setEnabled(true);


    }

    private void bloquearCasillas() {
        jTextField_A.setEnabled(false);
        jTextField_B.setEnabled(false);
        jTextField_fx.setEnabled(false);


        jButtonCalcular.setEnabled(false);// activamos el boton calcular

        // activamos los  jRadioButtons
        
        jRadioButtonTrapecios.setEnabled(false);
        jRadioButtonSimpson3_8.setEnabled(false);
        jRadioButtonSimpson1_3.setEnabled(false);

        jLabelTextoParticiones.setEnabled(false);
        jTextFieldSolucion.setEnabled(false);
        jTextField_N.setEnabled(false);
    }
}
