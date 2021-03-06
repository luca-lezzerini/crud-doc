/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruddoc.ui;

import cruddoc.AddEvent;
import cruddoc.AnnullaEvent;
import cruddoc.AutomaCrud;
import cruddoc.ConfermaEvent;
import cruddoc.Crudabile;
import cruddoc.ModificaEvent;
import cruddoc.RicercaEvent;
import cruddoc.RimuoviEvent;
import cruddoc.SelezionaEvent;

/**
 *
 * @author Luca Lezzerini
 */
public class CrudJFrame extends javax.swing.JFrame implements Crudabile {

    AutomaCrud automa;

    /**
     * Creates new form CrudJFrame
     */
    public CrudJFrame() {
        initComponents();
        automa = new AutomaCrud(this);
    }

    @Override
    public void entraRicerca() {
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jButtonAnnulla.setVisible(false);
        jButtonConferma.setVisible(false);
        jButtonModifica.setVisible(false);
        jButtonRimuovi.setVisible(false);
        jButtonSeleziona.setVisible(true);
        jButtonNuova.setVisible(true);
        jButtonCerca.setVisible(true);
        jTextFieldSearch.setVisible(true);
        jTable1.setVisible(true);
    }

    @Override
    public void entraVisualizza() {
        jTextField1.setVisible(true);
        jTextField1.setEnabled(false);
        jTextField2.setVisible(true);
        jTextField2.setEnabled(false);
        jButtonAnnulla.setVisible(false);
        jButtonConferma.setVisible(false);
        jButtonModifica.setVisible(true);
        jButtonRimuovi.setVisible(true);
        jButtonSeleziona.setVisible(true);
        jButtonNuova.setVisible(true);
        jButtonCerca.setVisible(true);
        jTextFieldSearch.setVisible(true);
        jTable1.setVisible(true);
    }

    @Override
    public void entraModifica() {
        jTextField1.setVisible(true);
        jTextField1.setEnabled(true);
        jTextField2.setVisible(true);
        jTextField2.setEnabled(true);
        jButtonAnnulla.setVisible(true);
        jButtonConferma.setVisible(true);
        jButtonModifica.setVisible(false);
        jButtonRimuovi.setVisible(false);
        jButtonSeleziona.setVisible(false);
        jButtonNuova.setVisible(false);
        jButtonCerca.setVisible(false);
        jTextFieldSearch.setVisible(false);
        jTable1.setVisible(false);
    }

    @Override
    public void entraRimuovi() {
        jTextField1.setVisible(true);
        jTextField1.setEnabled(false);
        jTextField2.setVisible(true);
        jTextField2.setEnabled(false);
        jButtonAnnulla.setVisible(true);
        jButtonConferma.setVisible(true);
        jButtonModifica.setVisible(false);
        jButtonRimuovi.setVisible(false);
        jButtonSeleziona.setVisible(false);
        jButtonNuova.setVisible(false);
        jButtonCerca.setVisible(false);
        jTextFieldSearch.setVisible(false);
        jTable1.setVisible(false);
    }

    @Override
    public void entraAggiungi() {
        jTextField1.setVisible(true);
        jTextField1.setEnabled(true);
        jTextField2.setVisible(true);
        jTextField2.setEnabled(true);
        jButtonAnnulla.setVisible(true);
        jButtonConferma.setVisible(true);
        jButtonModifica.setVisible(false);
        jButtonRimuovi.setVisible(false);
        jButtonSeleziona.setVisible(false);
        jButtonNuova.setVisible(false);
        jButtonCerca.setVisible(false);
        jTextFieldSearch.setVisible(false);
        jTable1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButtonModifica = new javax.swing.JButton();
        jButtonRimuovi = new javax.swing.JButton();
        jButtonConferma = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();
        jButtonNuova = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonCerca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonSeleziona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jButtonModifica.setText("Modifica");
        jButtonModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificaActionPerformed(evt);
            }
        });

        jButtonRimuovi.setText("Rimuovi");
        jButtonRimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRimuoviActionPerformed(evt);
            }
        });

        jButtonConferma.setText("Conferma");
        jButtonConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfermaActionPerformed(evt);
            }
        });

        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        jButtonNuova.setText("Nuova");
        jButtonNuova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuovaActionPerformed(evt);
            }
        });

        jTextFieldSearch.setText("jTextField3");

        jButtonCerca.setText("Cerca");
        jButtonCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCercaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonSeleziona.setText("Seleziona");
        jButtonSeleziona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelezionaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 178, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNuova)
                        .addGap(188, 188, 188))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonModifica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRimuovi)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConferma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAnnulla))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCerca)
                                .addGap(44, 44, 44)
                                .addComponent(jButtonSeleziona)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNuova))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModifica)
                    .addComponent(jButtonRimuovi)
                    .addComponent(jButtonConferma)
                    .addComponent(jButtonAnnulla))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCerca)
                    .addComponent(jButtonSeleziona))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuovaActionPerformed
        automa.next(new AddEvent());
    }//GEN-LAST:event_jButtonNuovaActionPerformed

    private void jButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaActionPerformed
        automa.next(new ModificaEvent());
    }//GEN-LAST:event_jButtonModificaActionPerformed

    private void jButtonRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRimuoviActionPerformed
        automa.next(new RimuoviEvent());
    }//GEN-LAST:event_jButtonRimuoviActionPerformed

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed
        automa.next(new ConfermaEvent());
    }//GEN-LAST:event_jButtonConfermaActionPerformed

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
        automa.next(new AnnullaEvent());
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCercaActionPerformed
        automa.next(new RicercaEvent());
    }//GEN-LAST:event_jButtonCercaActionPerformed

    private void jButtonSelezionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelezionaActionPerformed
        automa.next(new SelezionaEvent());
    }//GEN-LAST:event_jButtonSelezionaActionPerformed

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
            java.util.logging.Logger.getLogger(CrudJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonCerca;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonModifica;
    private javax.swing.JButton jButtonNuova;
    private javax.swing.JButton jButtonRimuovi;
    private javax.swing.JButton jButtonSeleziona;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
