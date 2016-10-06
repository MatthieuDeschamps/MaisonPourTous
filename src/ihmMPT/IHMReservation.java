/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihmMPT;

import metierClass.*;
import interBD.BDD;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import static java.text.DateFormat.SHORT;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mdeschamps
 */
public class IHMReservation extends javax.swing.JDialog {

    private Pattern patterNbrePersonne;
    private Matcher matcherNbrePersonne;

    /**
     * Creates new form IHMReservation
     */
    public static List<Adherent> adhe = new ArrayList<>();
    public static List<Representation> repres = new ArrayList<>();
    public static List<Reservation> resa = new ArrayList<>();

    public IHMReservation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        jT_NbrePersonnes.setText("1");
        jT_ChampsTotal.setText("0");

        BDD.lireBdd("ADHERENT");
        BDD.lireBdd("REPRESENTATION");

        for (int i = 0; i < adhe.size(); i++) {
            Adherent liste = (Adherent) adhe.get(i);
            ListAdherent.addItem(liste.getNomAdherent() + " " + liste.getPrenomAdherent());
        }
        for (int i = 0; i < repres.size(); i++) {
            Representation liste = (Representation) repres.get(i);
            ListRepresentation.addItem(liste.getDateRepresentation() + " " + liste.getNomSpectacle());
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
        LogO = new javax.swing.JLabel();
        jL_Adherent = new javax.swing.JLabel();
        jL_Representation = new javax.swing.JLabel();
        jL_Nbrepersonne = new javax.swing.JLabel();
        jL_personnes = new javax.swing.JLabel();
        jL_total = new javax.swing.JLabel();
        ListAdherent = new javax.swing.JComboBox();
        ListRepresentation = new javax.swing.JComboBox();
        jT_NbrePersonnes = new javax.swing.JTextField();
        jT_ChampsTotal = new javax.swing.JTextField();
        jB_Valider = new javax.swing.JButton();
        jB_Quitter = new javax.swing.JButton();
        jL_personnes1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Reservation Spectacle");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LogO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.png"))); // NOI18N
        LogO.setOpaque(true);

        jL_Adherent.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jL_Adherent.setText("Adhérent :");

        jL_Representation.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jL_Representation.setText("Représentation :");

        jL_Nbrepersonne.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jL_Nbrepersonne.setText("Nombre de personnes :");

        jL_personnes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jL_personnes.setText("personne(s)");

        jL_total.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jL_total.setText("Total à régler :");

        ListAdherent.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        ListAdherent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sélection" }));

        ListRepresentation.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        ListRepresentation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sélection" }));
        ListRepresentation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListRepresentationActionPerformed(evt);
            }
        });

        jT_NbrePersonnes.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jT_NbrePersonnes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_NbrePersonnesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_NbrePersonnesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jT_NbrePersonnesKeyTyped(evt);
            }
        });

        jT_ChampsTotal.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jT_ChampsTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jT_ChampsTotal.setEnabled(false);

        jB_Valider.setBackground(new java.awt.Color(255, 255, 255));
        jB_Valider.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jB_Valider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus-black-symbol.png"))); // NOI18N
        jB_Valider.setText("VALIDER");
        jB_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ValiderActionPerformed(evt);
            }
        });

        jB_Quitter.setBackground(new java.awt.Color(255, 255, 255));
        jB_Quitter.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jB_Quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cross-circular-button.png"))); // NOI18N
        jB_Quitter.setText("QUITTER");
        jB_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_QuitterActionPerformed(evt);
            }
        });

        jL_personnes1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jL_personnes1.setText("€");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 147, 226));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("RESERVATION");

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Spectacle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_Valider, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogO)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jL_Nbrepersonne)
                                .addComponent(jL_Representation)
                                .addComponent(jL_Adherent)
                                .addComponent(jL_total))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jT_ChampsTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jL_personnes1))
                                .addComponent(ListRepresentation, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jT_NbrePersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jL_personnes))
                                .addComponent(ListAdherent, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LogO, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListAdherent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Adherent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListRepresentation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Representation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Nbrepersonne)
                    .addComponent(jT_NbrePersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_personnes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jT_ChampsTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jL_personnes1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jL_total)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Valider)
                    .addComponent(jB_Quitter))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_QuitterActionPerformed
        Toolkit.getDefaultToolkit().beep();
        int selectedOption = JOptionPane.showConfirmDialog(null, "Voulez-vous Quitter ce programme?", "INFORMATION", JOptionPane.YES_NO_OPTION);

        if (selectedOption == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jB_QuitterActionPerformed

    private void jB_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ValiderActionPerformed
        try {
            jL_Adherent.setForeground(Color.BLACK);
            jL_Representation.setForeground(Color.BLACK);
            jL_personnes.setForeground(Color.BLACK);
            jL_Nbrepersonne.setForeground(Color.BLACK);

            String Verification = "Veuillez remplir correctement le(s) champ(s): " + "\n";

            if ("Sélection".equals(ListAdherent.getSelectedItem().toString())) {
                jL_Adherent.setForeground(Color.red);
                Verification += "--> Adhérent" + "\n";
            }
            if ("Sélection".equals(ListRepresentation.getSelectedItem().toString())) {
                jL_Representation.setForeground(Color.red);
                Verification += "--> Représentation" + "\n";
            }
            if("".equals(jT_NbrePersonnes.getText())){
                jL_personnes.setForeground(Color.RED);
                jL_Nbrepersonne.setForeground(Color.RED);
                Verification += "--> Nombre de personne" + "\n";
            }

            if ("Sélection".equals(ListAdherent.getSelectedItem().toString())
                    || "Sélection".equals(ListRepresentation.getSelectedItem().toString())
                    || "".equals(jT_NbrePersonnes.getText())){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, Verification, "Attention", JOptionPane.ERROR_MESSAGE);
            } else {
                
                int adhSelect = (ListAdherent.getSelectedIndex() - 1);
                int repSelect = (ListRepresentation.getSelectedIndex() - 1);
                int numAdhSelect = adhe.get(adhSelect).getNumAdhérent();
                int numRepSelect = repres.get(repSelect).getNumRepresentation();
                
                String recupNumRep = Integer.toString(numRepSelect);
                String recupNumAdh = Integer.toString(numAdhSelect);
                String recupNbrePers = jT_NbrePersonnes.getText();
                
                // récupération de la date du system au format dd/mm/yy
                Date RecupDateResa = new Date();
                DateFormat formatDate = DateFormat.getDateInstance(SHORT);
                
                // Version réduite
                //String recupNumAdh = Integer.toString(adhe.get((ListAdherent.getSelectedIndex() - 1))..getNumAdhérent();
                //String recupNumRep = Integer.toString(repres.get((ListRepresentation.getSelectedIndex()-1)).getNumRepresentation());
                
                
                String nouvelleResa = recupNumAdh + ", " + recupNumRep + ", " + recupNbrePers + ", '"+formatDate.format(RecupDateResa)+"'" ;
                
                System.out.println(nouvelleResa);
                
                if (((ListAdherent.getSelectedIndex() - 1) != 0) ||  ((ListRepresentation.getSelectedIndex() - 1) != 0)) {
                    BDD.ecrireBdd("RESERVATION", nouvelleResa);
                }
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jB_ValiderActionPerformed

    private void ListRepresentationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListRepresentationActionPerformed
        try {
            int repreSelect = (ListRepresentation.getSelectedIndex() - 1);
            double tarif = repres.get(repreSelect).getTarif();
            double result = tarif * Integer.parseInt(jT_NbrePersonnes.getText());
            jT_ChampsTotal.setText(Double.toString(result));

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException nb) {
            jT_ChampsTotal.setText("0");
        }

    }//GEN-LAST:event_ListRepresentationActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int selectedOption = JOptionPane.showConfirmDialog(null, "Voulez-vous Quitter ce programme?", "INFORMATION", JOptionPane.YES_NO_OPTION);

        if (selectedOption == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jT_NbrePersonnesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_NbrePersonnesKeyReleased
        try {
            CalculerPrixTotal();
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException nb) {
            jT_ChampsTotal.setText("0");
        }
    }//GEN-LAST:event_jT_NbrePersonnesKeyReleased

    private void jT_NbrePersonnesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_NbrePersonnesKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jT_NbrePersonnesKeyTyped

    private void jT_NbrePersonnesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_NbrePersonnesKeyPressed
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V) {
            evt.consume();
        }
    }//GEN-LAST:event_jT_NbrePersonnesKeyPressed

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

                javax.swing.UIManager.setLookAndFeel(
                        javax.swing.UIManager.getSystemLookAndFeelClassName());

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IHMReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IHMReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IHMReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IHMReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IHMReservation dialog = new IHMReservation(new javax.swing.JFrame(), true);
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

    private void CalculerPrixTotal() {

        int tarif = repres.get(ListRepresentation.getSelectedIndex() - 1).getTarif();
        int prixTotal = tarif * Integer.parseInt(jT_NbrePersonnes.getText());
        jT_ChampsTotal.setText(Integer.toString(prixTotal));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ListAdherent;
    private javax.swing.JComboBox ListRepresentation;
    private javax.swing.JLabel LogO;
    private javax.swing.JButton jB_Quitter;
    private javax.swing.JButton jB_Valider;
    private javax.swing.JLabel jL_Adherent;
    private javax.swing.JLabel jL_Nbrepersonne;
    private javax.swing.JLabel jL_Representation;
    private javax.swing.JLabel jL_personnes;
    private javax.swing.JLabel jL_personnes1;
    private javax.swing.JLabel jL_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jT_ChampsTotal;
    private javax.swing.JTextField jT_NbrePersonnes;
    // End of variables declaration//GEN-END:variables
}
