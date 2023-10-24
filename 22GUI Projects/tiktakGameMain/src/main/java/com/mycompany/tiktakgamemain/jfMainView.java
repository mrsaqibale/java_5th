package com.mycompany.tiktakgamemain;

import javax.swing.JOptionPane;

/**
 *
 * @author Saqib Ale
 */
public class jfMainView extends javax.swing.JFrame {
    private boolean[] chkBtnFlag;
    
    //code var
    private int playerNo;
    
    
    public jfMainView() {
        initComponents();
        chkBtnFlag =new boolean[9];
        for(int i =0 ; i<9; i++){
            chkBtnFlag[i] = true; 
        }
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
        jPanel2 = new javax.swing.JPanel();
        btnBox2 = new javax.swing.JButton();
        btnBox1 = new javax.swing.JButton();
        btnBox3 = new javax.swing.JButton();
        btnBox4 = new javax.swing.JButton();
        btnBox5 = new javax.swing.JButton();
        btnBox6 = new javax.swing.JButton();
        btnBox8 = new javax.swing.JButton();
        btnBox7 = new javax.swing.JButton();
        btnBox9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPlayerNo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tik Tak");

        btnBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBox2ActionPerformed(evt);
            }
        });

        btnBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBox1ActionPerformed(evt);
            }
        });

        btnBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBox3ActionPerformed(evt);
            }
        });

        btnBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBox4ActionPerformed(evt);
            }
        });

        btnBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBox5ActionPerformed(evt);
            }
        });

        btnBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBox6ActionPerformed(evt);
            }
        });

        btnBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBox8ActionPerformed(evt);
            }
        });

        btnBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBox7ActionPerformed(evt);
            }
        });

        btnBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBox9ActionPerformed(evt);
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
                        .addComponent(btnBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("Player No:");

        lblPlayerNo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPlayerNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(86, 86, 86))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("New Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Exit Game");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Help");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    create a programmer define methods 
    here only defined function by the codder
    */
    //check button is available for click or not
    boolean isAvailable(int getFlagValue){
        if(chkBtnFlag[getFlagValue] == true ){
            chkBtnFlag[getFlagValue] = false;
            return true;
        }
        return false;
    }
    
    //which player have turn 
    private int whichPlayer(){
        return playerNo;
    }
    
    //which player play now change lablel
    private void setPlayerLabel(int val){
        playerNo = val;
        lblPlayerNo.setText(val+"");
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        // File>New game button 
        new jfMainView().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        //exit the game 
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        //this method calls the about seccion of form
        new jfAbout().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        //this method shows the help seccion
        new jfHelpView().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBox2ActionPerformed
        // TODO add your handling code here:
        //for box 02
        if(isAvailable(2)){
            if(whichPlayer() == 1){
                btnBox2.setText("X");
                setPlayerLabel(2);
            }
            else{
                btnBox2.setText("O");
                setPlayerLabel(1);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Already Checked");
        }
    }//GEN-LAST:event_btnBox2ActionPerformed

    private void btnBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBox1ActionPerformed
        // TODO add your handling code here:
        //if press btnBox1
        if(isAvailable(1)){
            if(whichPlayer() == 1){
                btnBox1.setText("X");
                setPlayerLabel(2);
            }
            else{
                btnBox1.setText("O");
                setPlayerLabel(1);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Already Checked");
        }
    }//GEN-LAST:event_btnBox1ActionPerformed

    private void btnBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBox3ActionPerformed
        // TODO add your handling code here:
        //box 3
        if(isAvailable(3)){
            if(whichPlayer() == 1){
                btnBox3.setText("X");
                setPlayerLabel(2);
            }
            else{
                btnBox3.setText("O");
                setPlayerLabel(1);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Already Checked");
        }
    }//GEN-LAST:event_btnBox3ActionPerformed

    private void btnBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBox4ActionPerformed
        // TODO add your handling code here:
        //box 4
                if(isAvailable(4)){
            if(whichPlayer() == 1){
                btnBox4.setText("X");
                setPlayerLabel(2);
            }
            else{
                btnBox4.setText("O");
                setPlayerLabel(1);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Already Checked");
        }
    }//GEN-LAST:event_btnBox4ActionPerformed

    private void btnBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBox5ActionPerformed
        // TODO add your handling code here:
//        box5
        if(isAvailable(5)){
            if(whichPlayer() == 1){
                btnBox5.setText("X");
                setPlayerLabel(2);
            }
            else{
                btnBox5.setText("O");
                setPlayerLabel(1);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Already Checked");
        }
    }//GEN-LAST:event_btnBox5ActionPerformed

    private void btnBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBox6ActionPerformed
        // TODO add your handling code here:
        //box 6
        if(isAvailable(6)){
            if(whichPlayer() == 1){
                btnBox6.setText("X");
                setPlayerLabel(2);
            }
            else{
                btnBox6.setText("O");
                setPlayerLabel(1);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Already Checked");
        }
    }//GEN-LAST:event_btnBox6ActionPerformed

    private void btnBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBox7ActionPerformed
        // TODO add your handling code here:
//        box 7
        if(isAvailable(7)){
            if(whichPlayer() == 1){
                btnBox7.setText("X");
                setPlayerLabel(2);
            }
            else{
                btnBox7.setText("O");
                setPlayerLabel(1);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Already Checked");
        }
    }//GEN-LAST:event_btnBox7ActionPerformed

    private void btnBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBox8ActionPerformed
        // TODO add your handling code here:
        //box 8
                if(isAvailable(8)){
            if(whichPlayer() == 1){
                btnBox8.setText("X");
                setPlayerLabel(2);
            }
            else{
                btnBox8.setText("O");
                setPlayerLabel(1);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Already Checked");
        }
    }//GEN-LAST:event_btnBox8ActionPerformed

    private void btnBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBox9ActionPerformed
        // TODO add your handling code here:
        //box 9
                if(isAvailable(9)){
            if(whichPlayer() == 1){
                btnBox9.setText("X");
                setPlayerLabel(2);
            }
            else{
                btnBox9.setText("O");
                setPlayerLabel(1);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Already Checked");
        }
    }//GEN-LAST:event_btnBox9ActionPerformed

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
            java.util.logging.Logger.getLogger(jfMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfMainView().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBox1;
    private javax.swing.JButton btnBox2;
    private javax.swing.JButton btnBox3;
    private javax.swing.JButton btnBox4;
    private javax.swing.JButton btnBox5;
    private javax.swing.JButton btnBox6;
    private javax.swing.JButton btnBox7;
    private javax.swing.JButton btnBox8;
    private javax.swing.JButton btnBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPlayerNo;
    // End of variables declaration//GEN-END:variables
}
