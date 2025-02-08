/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employe;

public class employe extends javax.swing.JFrame {

    public static List<Employe> liste_Employe = new ArrayList<Employe>();

    public void afficherTab() {
        DefaultTableModel model = (DefaultTableModel) Tab_principale.getModel();
        model.setRowCount(0);
        for (Employe e : liste_Employe) {
            String souhaits = String.join(",", e.getSouhaits());
            model.addRow(new Object[]{e.getCode(), e.getNom(), e.getGrade(), e.getSituation(), souhaits});
        }
    }

    public employe() {
        initComponents();
        setTitle("Fiche Employé");
        setSize(900, 600);
        setResizable(false);
        rb_celibataire.setSelected(true);
        bt_modifier.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bt_ajouter = new javax.swing.JButton();
        bt_modifier = new javax.swing.JButton();
        bt_supprimer = new javax.swing.JButton();
        bt_rechercher = new javax.swing.JButton();
        bt_renitialiser = new javax.swing.JButton();
        bt_quitter = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        cb_grade = new javax.swing.JComboBox<>();
        rb_celibataire = new javax.swing.JRadioButton();
        rb_marié = new javax.swing.JRadioButton();
        rb_divorcé = new javax.swing.JRadioButton();
        chb_promotion = new javax.swing.JCheckBox();
        chb_augmentationsalaire = new javax.swing.JCheckBox();
        chb_changementdeposte = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tab_principale = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Fiche Employé");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(45, 45));
        jLabel1.setMinimumSize(new java.awt.Dimension(45, 45));
        jLabel1.setPreferredSize(new java.awt.Dimension(45, 45));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 10, 100, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(290, 10, 220, 40);

        jPanel3.setBackground(new java.awt.Color(255, 0, 255));
        jPanel3.setLayout(null);

        bt_ajouter.setText("Ajouter");
        bt_ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ajouterMouseClicked(evt);
            }
        });
        jPanel3.add(bt_ajouter);
        bt_ajouter.setBounds(20, 20, 100, 23);

        bt_modifier.setText("Modifier");
        bt_modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modifierMouseClicked(evt);
            }
        });
        jPanel3.add(bt_modifier);
        bt_modifier.setBounds(20, 70, 100, 23);

        bt_supprimer.setText("Supprimer");
        bt_supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_supprimerMouseClicked(evt);
            }
        });
        jPanel3.add(bt_supprimer);
        bt_supprimer.setBounds(20, 120, 100, 23);

        bt_rechercher.setText("Rechercher");
        bt_rechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_rechercherMouseClicked(evt);
            }
        });
        jPanel3.add(bt_rechercher);
        bt_rechercher.setBounds(130, 20, 100, 23);

        bt_renitialiser.setText("Renitialiser");
        bt_renitialiser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_renitialiserMouseClicked(evt);
            }
        });
        jPanel3.add(bt_renitialiser);
        bt_renitialiser.setBounds(130, 70, 100, 23);

        bt_quitter.setText("Quitter");
        bt_quitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_quitterMouseClicked(evt);
            }
        });
        jPanel3.add(bt_quitter);
        bt_quitter.setBounds(130, 120, 100, 23);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(600, 70, 250, 180);

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Souhaits");
        jLabel2.setOpaque(true);
        jPanel4.add(jLabel2);
        jLabel2.setBounds(20, 180, 90, 30);

        jLabel3.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Code");
        jLabel3.setOpaque(true);
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 20, 90, 30);

        jLabel4.setBackground(new java.awt.Color(255, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nom");
        jLabel4.setOpaque(true);
        jPanel4.add(jLabel4);
        jLabel4.setBounds(20, 60, 90, 30);

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Grade");
        jLabel5.setOpaque(true);
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 100, 90, 30);

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Situation");
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 140, 90, 30);
        jPanel4.add(txt_code);
        txt_code.setBounds(150, 20, 140, 30);
        jPanel4.add(txt_nom);
        txt_nom.setBounds(150, 60, 140, 30);

        cb_grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingénieur", "Technicien", "Technicien Spécialisé" }));
        jPanel4.add(cb_grade);
        cb_grade.setBounds(150, 100, 140, 30);

        buttonGroup1.add(rb_celibataire);
        rb_celibataire.setText("Célibataire");
        rb_celibataire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_celibataireActionPerformed(evt);
            }
        });
        jPanel4.add(rb_celibataire);
        rb_celibataire.setBounds(150, 150, 79, 21);

        buttonGroup1.add(rb_marié);
        rb_marié.setText("Marié(e)");
        jPanel4.add(rb_marié);
        rb_marié.setBounds(260, 150, 67, 21);

        buttonGroup1.add(rb_divorcé);
        rb_divorcé.setText("Divorcé(e)");
        jPanel4.add(rb_divorcé);
        rb_divorcé.setBounds(370, 150, 77, 21);

        chb_promotion.setText("Promotion");
        chb_promotion.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                chb_promotionAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(chb_promotion);
        chb_promotion.setBounds(150, 180, 80, 20);

        chb_augmentationsalaire.setText("Augmentation de salaire");
        jPanel4.add(chb_augmentationsalaire);
        chb_augmentationsalaire.setBounds(150, 200, 152, 20);

        chb_changementdeposte.setText("Changement de poste");
        jPanel4.add(chb_changementdeposte);
        chb_changementdeposte.setBounds(150, 220, 170, 20);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 70, 540, 260);

        jPanel5.setBackground(new java.awt.Color(255, 102, 204));
        jPanel5.setLayout(null);

        Tab_principale.setBackground(new java.awt.Color(255, 153, 153));
        Tab_principale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Code", "Nom", "Grade", "Situation", "Souhaits"
            }
        ));
        jScrollPane1.setViewportView(Tab_principale);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(50, 0, 790, 170);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 340, 890, 170);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_celibataireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_celibataireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_celibataireActionPerformed

    private void chb_promotionAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_chb_promotionAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_promotionAncestorAdded

    private void bt_ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ajouterMouseClicked
        // TODO add your handling code here:
        try {
            String code = txt_code.getText().trim();
            String nom = txt_nom.getText().trim();
            String grade = String.valueOf(cb_grade.getSelectedItem());

            if (code.isEmpty()) {
                throw new Exception("Le champ 'Code' est vide.");
            }
            if (nom.isEmpty()) {
                throw new Exception("Le champ 'Nom' est vide.");
            }
            if (grade.equals("Sélectionner")) {
                throw new Exception("Veuillez sélectionner un grade.");
            }

            String situation = "";
            if (rb_celibataire.isSelected()) {
                situation = rb_celibataire.getText();
            } else if (rb_divorcé.isSelected()) {
                situation = rb_divorcé.getText();
            } else if (rb_marié.isSelected()) {
                situation = rb_marié.getText();
            } else {
                throw new Exception("Veuillez sélectionner une situation familiale.");
            }

            List<String> souhaits = new ArrayList<>();
            if (chb_promotion.isSelected()) {
                souhaits.add(chb_promotion.getText());
            }
            if (chb_augmentationsalaire.isSelected()) {
                souhaits.add(chb_augmentationsalaire.getText());
            }
            if (chb_changementdeposte.isSelected()) {
                souhaits.add(chb_changementdeposte.getText());
            }

            if (souhaits.isEmpty()) {
                throw new Exception("Veuillez sélectionner au moins un souhait.");
            }

            liste_Employe.add(new Employe(code, nom, grade, situation, souhaits));

            JOptionPane.showMessageDialog(null, "Employé ajouté avec succès !");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur : " + ex.getMessage(), "Erreur d'ajout", JOptionPane.ERROR_MESSAGE);
        } finally {
            afficherTab();
            bt_renitialiserMouseClicked(evt);
            bt_modifier.setEnabled(false);
        }
    }//GEN-LAST:event_bt_ajouterMouseClicked

    private void bt_quitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_quitterMouseClicked
        // TODO add your handling code here:
        try {
            int response = JOptionPane.showConfirmDialog(
                    null,
                    "Voulez-vous vraiment quitter l'application ?",
                    "Confirmation de fermeture",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (response == JOptionPane.YES_OPTION) {
                System.exit(0);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la fermeture de l'application : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_quitterMouseClicked

    private void bt_renitialiserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_renitialiserMouseClicked
        // TODO add your handling code here:
        try {
            txt_code.setText("");
            txt_nom.setText("");
            cb_grade.setSelectedItem("Ingénieur");
            rb_celibataire.setSelected(true);
            rb_divorcé.setSelected(false);
            rb_marié.setSelected(false);
            chb_promotion.setSelected(false);
            chb_changementdeposte.setSelected(false);
            chb_augmentationsalaire.setSelected(false);
            bt_modifier.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Formulaire réinitialisé avec succès !");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la réinitialisation du formulaire : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_renitialiserMouseClicked

    private void bt_supprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_supprimerMouseClicked
        // TODO add your handling code here:
        try {
            String code = JOptionPane.showInputDialog(null, "Veuillez saisir le code de l'employé à supprimer");

            if (code == null || code.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Code non saisi. Veuillez entrer un code valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean employeTrouve = false;

            for (Employe e : liste_Employe) {
                if (e.getCode().equalsIgnoreCase(code)) {
                    employeTrouve = true;
                    int response = JOptionPane.showConfirmDialog(
                            null,
                            "Voulez-vous vraiment supprimer cet employé ?",
                            "Confirmation",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                    );

                    if (response == JOptionPane.YES_OPTION) {
                        liste_Employe.remove(e);
                        JOptionPane.showMessageDialog(null, "Employé supprimé avec succès !");
                    }
                    break;
                }
            }

            if (!employeTrouve) {
                JOptionPane.showMessageDialog(null, "Employé introuvable avec le code : " + code, "Erreur", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la suppression de l'employé : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        } finally {
            afficherTab();
            bt_renitialiserMouseClicked(evt);
            bt_modifier.setEnabled(false);
        }
    }//GEN-LAST:event_bt_supprimerMouseClicked

    private void bt_rechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_rechercherMouseClicked
        // TODO add your handling code here:
        try {
            String code = JOptionPane.showInputDialog(null, "Veuillez saisir le code de l'employé à chercher");

            if (code == null || code.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Code non saisi. Veuillez entrer un code valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean employeTrouve = false;

            for (Employe e : liste_Employe) {
                if (e.getCode().equalsIgnoreCase(code)) {
                    employeTrouve = true;
                    txt_code.setText(e.getCode());
                    txt_nom.setText(e.getNom());
                    cb_grade.setSelectedItem(e.getGrade());

                    if (rb_celibataire.getText().equalsIgnoreCase(e.getSituation())) {
                        rb_celibataire.setSelected(true);
                    }
                    if (rb_divorcé.getText().equalsIgnoreCase(e.getSituation())) {
                        rb_divorcé.setSelected(true);
                    }
                    if (rb_marié.getText().equalsIgnoreCase(e.getSituation())) {
                        rb_marié.setSelected(true);
                    }

                    chb_promotion.setSelected(e.getSouhaits().contains(chb_promotion.getText()));
                    chb_changementdeposte.setSelected(e.getSouhaits().contains(chb_changementdeposte.getText()));
                    chb_augmentationsalaire.setSelected(e.getSouhaits().contains(chb_augmentationsalaire.getText()));
                    bt_modifier.setEnabled(true);
                    break;
                }
            }

            if (!employeTrouve) {
                JOptionPane.showMessageDialog(null, "Employé introuvable avec le code : " + code, "Erreur", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la recherche de l'employé : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_rechercherMouseClicked

    private void bt_modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modifierMouseClicked
        // TODO add your handling code here:
        try {
            String code = txt_code.getText().trim();

            if (code.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Veuillez entrer le code de l'employé à modifier.", "Erreur", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Employe employeAModifier = null;
            for (Employe e : liste_Employe) {
                if (e.getCode().equals(code)) {
                    employeAModifier = e;
                    break;
                }
            }

            if (employeAModifier == null) {
                JOptionPane.showMessageDialog(this, "Aucun employé trouvé avec le code : " + code, "Erreur", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String nom = txt_nom.getText().trim();
            if (nom.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Le champ 'Nom' est obligatoire.", "Erreur", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String grade = cb_grade.getSelectedItem().toString();
            String situation = rb_celibataire.isSelected() ? "Célibataire"
                    : rb_marié.isSelected() ? "Marié(e)"
                    : "Divorcé(e)";

            List<String> souhaits = new ArrayList<>();
            if (chb_promotion.isSelected()) {
                souhaits.add("Promotion");
            }
            if (chb_augmentationsalaire.isSelected()) {
                souhaits.add("Augmentation de salaire");
            }
            if (chb_changementdeposte.isSelected()) {
                souhaits.add("Changement de poste");
            }

            if (souhaits.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Veuillez sélectionner au moins un souhait.", "Erreur", JOptionPane.WARNING_MESSAGE);
                return;
            }

            employeAModifier.setNom(nom);
            employeAModifier.setGrade(grade);
            employeAModifier.setSituation(situation);
            employeAModifier.setSouhaits(souhaits);
            bt_modifier.setEnabled(false);
            bt_renitialiserMouseClicked(evt);

            afficherTab();

            JOptionPane.showMessageDialog(this, "Employé modifié avec succès !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_modifierMouseClicked

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
            java.util.logging.Logger.getLogger(employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tab_principale;
    private javax.swing.JButton bt_ajouter;
    private javax.swing.JButton bt_modifier;
    private javax.swing.JButton bt_quitter;
    private javax.swing.JButton bt_rechercher;
    private javax.swing.JButton bt_renitialiser;
    private javax.swing.JButton bt_supprimer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_grade;
    private javax.swing.JCheckBox chb_augmentationsalaire;
    private javax.swing.JCheckBox chb_changementdeposte;
    private javax.swing.JCheckBox chb_promotion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_celibataire;
    private javax.swing.JRadioButton rb_divorcé;
    private javax.swing.JRadioButton rb_marié;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_nom;
    // End of variables declaration//GEN-END:variables
}
