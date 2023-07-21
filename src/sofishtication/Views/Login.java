/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sofishtication.Views;

import java.awt.CardLayout;
import sofishtication.Controllers.SQLController;
import sofishtication.Controllers.StateController;
import sofishtication.Models.UserModel;

/**
 *
 * @author user-pc
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
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

        detailsPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        passwordField2 = new javax.swing.JTextField();
        usernameField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        signupEmail = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        confirmField = new javax.swing.JTextField();
        signupBtn = new javax.swing.JButton();
        signupPageBtn = new javax.swing.JButton();
        loginPageBtn = new javax.swing.JButton();

        detailsPanel.setLayout(new java.awt.CardLayout());

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        passwordField2.setText("Password");

        usernameField2.setText("Username");

        jLabel2.setText("Welcome!");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordField2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(usernameField2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(70, 70, 70))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginBtn)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        detailsPanel.add(loginPanel, "login");

        signupEmail.setMaximumSize(new java.awt.Dimension(32767, 40000));

        jLabel1.setText("Welcome!");

        emailField.setText("Email");

        firstNameField.setText("First Name");
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        lastNameField.setText("Last Name");
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        usernameField.setText("Username");

        passwordField.setText("Password");

        confirmField.setText("Confirm Password");

        signupBtn.setText("Signup");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signupEmailLayout = new javax.swing.GroupLayout(signupEmail);
        signupEmail.setLayout(signupEmailLayout);
        signupEmailLayout.setHorizontalGroup(
            signupEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signupEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signupEmailLayout.createSequentialGroup()
                        .addGroup(signupEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lastNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(signupEmailLayout.createSequentialGroup()
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(signupEmailLayout.createSequentialGroup()
                .addGroup(signupEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signupEmailLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(signupEmailLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(confirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signupEmailLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(signupBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        signupEmailLayout.setVerticalGroup(
            signupEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupEmailLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signupBtn)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        detailsPanel.add(signupEmail, "signup");

        signupPageBtn.setText("Signup");
        signupPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupPageBtnActionPerformed(evt);
            }
        });

        loginPageBtn.setText("Login");
        loginPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPageBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(signupPageBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPageBtn)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupPageBtn)
                    .addComponent(loginPageBtn))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPageBtnActionPerformed
        setCard("login");
    }//GEN-LAST:event_loginPageBtnActionPerformed

    private void signupPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupPageBtnActionPerformed
        setCard("signup");
    }//GEN-LAST:event_signupPageBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String username = usernameField2.getText();
        String password = passwordField2.getText();
        
        UserModel user = new UserModel(password, username);
        System.out.println(user.toString());
        StateController.login(user);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        String username = usernameField.getText();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirm = confirmField.getText();

        UserModel user = new UserModel(email, password, confirm, username, firstName, lastName);
        System.out.println(user.toString());
        StateController.signup(user);
    }//GEN-LAST:event_signupBtnActionPerformed

    private void setCard(String card) {
        CardLayout cardLayout = (CardLayout) detailsPanel.getLayout();
        cardLayout.show(detailsPanel, card);
        //getParent().getParent().revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmField;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton loginPageBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField passwordField2;
    private javax.swing.JButton signupBtn;
    private javax.swing.JPanel signupEmail;
    private javax.swing.JButton signupPageBtn;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usernameField2;
    // End of variables declaration//GEN-END:variables
}
