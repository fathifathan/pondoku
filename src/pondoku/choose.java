/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pondoku;

/**
 *
 * @author HP
 */
public class choose extends javax.swing.JFrame {

    /**
     * Creates new form choose
     */
    public choose() {
        initComponents();
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
        btnsalafy = new javax.swing.JLabel();
        btnmodern = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsalafy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pondok salafy.png"))); // NOI18N
        btnsalafy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalafyMouseClicked(evt);
            }
        });
        jPanel1.add(btnsalafy, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        btnmodern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/6.png"))); // NOI18N
        btnmodern.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmodernMouseClicked(evt);
            }
        });
        jPanel1.add(btnmodern, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/choose.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmodernMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodernMouseClicked
        // TODO add your handling code here:
        modern md = new modern();
        md.setLocationRelativeTo(null);
        md.setVisible(true);
        this.setVisible(false);
        System.out.println("modern form berhasil");
    }//GEN-LAST:event_btnmodernMouseClicked

    private void btnsalafyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalafyMouseClicked
        // TODO add your handling code here:
        salafy sl = new salafy();
        sl.setLocationRelativeTo(null);
        sl.setVisible(true);
        this.setVisible(false);
        System.out.println("salafy form berhasil");
    }//GEN-LAST:event_btnsalafyMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                choose ch = new choose();
                ch.setVisible(true);
                ch.setLocationRelativeTo(null);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnmodern;
    public javax.swing.JLabel btnsalafy;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}