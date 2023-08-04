/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sofishtication.Views;

import javax.swing.BoxLayout;
import sofishtication.Controllers.SQLController;
import sofishtication.Controllers.StateController;


/**
 *
 * @author user-pc
 */
public class MainGui extends javax.swing.JFrame {
    static SQLController sqlCon = new SQLController();
    
    public MainGui() {
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

        Profile = new javax.swing.JTabbedPane();
        Home = new sofishtication.Views.JokesPanel();
        myJokesPanel1 = new sofishtication.Views.MyJokesPanel();
        userPanel1 = new sofishtication.Views.UserPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Profile.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ProfileStateChanged(evt);
            }
        });
        Profile.addTab("Home", Home);

        javax.swing.GroupLayout myJokesPanel1Layout = new javax.swing.GroupLayout(myJokesPanel1);
        myJokesPanel1.setLayout(myJokesPanel1Layout);
        myJokesPanel1Layout.setHorizontalGroup(
            myJokesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        myJokesPanel1Layout.setVerticalGroup(
            myJokesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        Profile.addTab("MyJokes", myJokesPanel1);
        Profile.addTab("Profile", userPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Profile, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Profile)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ProfileStateChanged
        if(Profile.getSelectedIndex() == 0) {
            //FeedPanel feedPanel = JokesPanel.
        }
        
      
    }//GEN-LAST:event_ProfileStateChanged

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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //StateController.initiate();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new MainGui().setVisible(true);
               //StateController.initiate();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sofishtication.Views.JokesPanel Home;
    private javax.swing.JTabbedPane Profile;
    private sofishtication.Views.MyJokesPanel myJokesPanel1;
    private sofishtication.Views.UserPanel userPanel1;
    // End of variables declaration//GEN-END:variables
}
