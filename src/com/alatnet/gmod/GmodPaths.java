/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alatnet.gmod;

import javax.swing.JFileChooser;

/**
 *
 * @author alatnet
 */
public class GmodPaths extends javax.swing.JDialog {
    private String gmpublishPath, gmpublishProgram, gmadPath, gmadProgram;
    private boolean pressOK=false;
    
    private JFileChooser fileChooser;

    /**
     * Creates new form GmodPaths
     */
    public GmodPaths(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initComponents2();
    }
    
    public void setData(String gmpublishPath, String gmpublishProgram, String gmadPath, String gmadProgram){
        this.gmadPath = gmadPath;
        this.gmadProgram = gmadProgram;
        this.gmpublishPath = gmpublishPath;
        this.gmpublishProgram = gmpublishProgram;
        this.txtGmadPath.setText(gmadPath);
        this.txtGmadProgram.setText(gmadProgram);
        this.txtGmpublishPath.setText(gmpublishPath);
        this.txtGmpublishProgram.setText(gmpublishProgram);
    }
    public String getGmpublishPath(){
        //return this.txtGmpublishPath.getText();
        return this.gmpublishPath;
    }
    public String getGmpublishProgram(){
        //return this.txtGmpublishProgram.getText();
        return this.gmpublishProgram;
    }
    public String getGmadPath(){
        //return this.txtGmadPath.getText();
        return this.gmadPath;
    }
    public String getGmadProgram(){
        //return this.txtGmadProgram.getText();
        return this.gmadProgram;
    }
    
    public boolean pressedOK(){
        return this.pressOK;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGmpublishPath = new javax.swing.JButton();
        btnGmpublishProgram = new javax.swing.JButton();
        txtGmpublishPath = new javax.swing.JTextField();
        txtGmpublishProgram = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGmadPath = new javax.swing.JTextField();
        txtGmadProgram = new javax.swing.JTextField();
        btnGmadPath = new javax.swing.JButton();
        btnGmadProgram = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GMod Paths");
        setModal(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("gmpublish"));

        jLabel1.setText("Path: ");

        jLabel2.setText("Program: ");

        btnGmpublishPath.setText("Folder");
        btnGmpublishPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGmpublishPathActionPerformed(evt);
            }
        });

        btnGmpublishProgram.setText("File");
        btnGmpublishProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGmpublishProgramActionPerformed(evt);
            }
        });

        txtGmpublishProgram.setText("gmpublish.exe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGmpublishPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGmpublishPath))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGmpublishProgram, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGmpublishProgram)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnGmpublishPath)
                    .addComponent(txtGmpublishPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnGmpublishProgram)
                    .addComponent(txtGmpublishProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("gmad"));

        jLabel3.setText("Path: ");

        jLabel4.setText("Program: ");

        txtGmadProgram.setText("gmad.exe");

        btnGmadPath.setText("Folder");
        btnGmadPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGmadPathActionPerformed(evt);
            }
        });

        btnGmadProgram.setText("File");
        btnGmadProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGmadProgramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGmadPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGmadPath))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGmadProgram)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGmadProgram)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGmadPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGmadPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGmadProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGmadProgram)))
        );

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponents2() {
        fileChooser = new JFileChooser();
    }
    
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        this.gmadPath = this.txtGmadPath.getText();
        this.gmadProgram = this.txtGmadProgram.getText();
        this.gmpublishPath = this.txtGmpublishPath.getText();
        this.gmpublishProgram = this.txtGmpublishProgram.getText();
        this.pressOK=true;
        this.dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnGmpublishPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGmpublishPathActionPerformed
        this.fileChooser.setDialogTitle("Choose gmpublish path.");
        this.fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (this.fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            this.gmpublishPath = this.fileChooser.getSelectedFile().getPath();
            this.txtGmpublishPath.setText(this.gmpublishPath);
        }
    }//GEN-LAST:event_btnGmpublishPathActionPerformed

    private void btnGmadPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGmadPathActionPerformed
       this.fileChooser.setDialogTitle("Choose gmad path.");
        this.fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (this.fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            this.gmadPath = this.fileChooser.getSelectedFile().getPath();
            this.txtGmadPath.setText(this.gmadPath);
        }
    }//GEN-LAST:event_btnGmadPathActionPerformed

    private void btnGmpublishProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGmpublishProgramActionPerformed
        this.fileChooser.setDialogTitle("Choose gmpublish program.");
        this.fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (this.fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            this.gmpublishProgram = this.fileChooser.getSelectedFile().getName();
            this.txtGmpublishProgram.setText(this.gmpublishProgram);
        }
    }//GEN-LAST:event_btnGmpublishProgramActionPerformed

    private void btnGmadProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGmadProgramActionPerformed
        this.fileChooser.setDialogTitle("Choose gmad program.");
        this.fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (this.fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            this.gmadProgram = this.fileChooser.getSelectedFile().getName();
            this.txtGmadProgram.setText(this.gmadProgram);
        }
    }//GEN-LAST:event_btnGmadProgramActionPerformed

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
            java.util.logging.Logger.getLogger(GmodPaths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GmodPaths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GmodPaths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GmodPaths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GmodPaths dialog = new GmodPaths(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnGmadPath;
    private javax.swing.JButton btnGmadProgram;
    private javax.swing.JButton btnGmpublishPath;
    private javax.swing.JButton btnGmpublishProgram;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtGmadPath;
    private javax.swing.JTextField txtGmadProgram;
    private javax.swing.JTextField txtGmpublishPath;
    private javax.swing.JTextField txtGmpublishProgram;
    // End of variables declaration//GEN-END:variables
}
