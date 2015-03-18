/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InputDialog.java
 *
 * Created on 15 août 2011, 15:23:06
 */
package clib.dialog;

/**
 * @author The Wingate 2940
 */
public class InputDialog extends javax.swing.JDialog {

    private ButtonPressed bp;
    private String typedText = "";

    public enum ButtonPressed{
        NONE, OK_BUTTON, CANCEL_BUTTON;
    }
    
    /** <p>Creates new form InputDialog.<br />
     * Crée un nouveau formulaire InputDialog.</p>
     * @param parent
     * @param modal */
    public InputDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        bp = ButtonPressed.NONE;
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTypedText = new javax.swing.JLabel();
        tfTypedText = new javax.swing.JTextField();
        OK_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTypedText.setText("Choose a number :");

        tfTypedText.setText("0");
        tfTypedText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTypedTextKeyReleased(evt);
            }
        });

        OK_Button.setText("OK");
        OK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTypedText, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addComponent(lblTypedText, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addComponent(OK_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTypedText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTypedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OK_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void tfTypedTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTypedTextKeyReleased
    typedText = tfTypedText.getText();
}//GEN-LAST:event_tfTypedTextKeyReleased

private void OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_ButtonActionPerformed
    bp = ButtonPressed.OK_BUTTON;
    dispose();
}//GEN-LAST:event_OK_ButtonActionPerformed

    /** <p>Set the text of the field.<br />
      * Détermine le texte du champ.</p>
     * @param typedText */
    public void setText(String typedText){
        this.typedText = typedText;
        tfTypedText.setText(typedText);
    }

    /** <p>Get the text of the field.<br />
      * Récupère le texte du champ.</p>
     * @return  */
    public String getText(){
        return typedText;
    }
    
    /** <p>Open the dialog box and return a result when a button is pressed.
     * <br />Ouvre un boîte de dialogue et retourne un résultat quand on appuie
     * sur un bouton.</p>
     * @param typedText
     * @return  */
    public String showDialog(String typedText){
        if(typedText!=null && typedText.isEmpty()==false){
            setText(typedText);
        }
        setLocationRelativeTo(null);
        setVisible(true);

        if(bp.equals(ButtonPressed.OK_BUTTON)){
            return getText();
        }else{
            return typedText;
        }
    }
    
    /** <p>Set the message of the label.<br />
     * Définit le texte de l'encadré.</p>
     * @param message */
    public void setDialogMessage(String message){
        lblTypedText.setText(message);
    }
    
    /** <p>Set the title.<br />
     * Définit le titre.</p>
     * @param title */
    public void setDialogTitle(String title){
        setTitle(title);
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                InputDialog dialog = new InputDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton OK_Button;
    private javax.swing.JLabel lblTypedText;
    private javax.swing.JTextField tfTypedText;
    // End of variables declaration//GEN-END:variables
}