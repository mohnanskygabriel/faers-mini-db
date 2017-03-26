package com.globallogic.faers.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
        jsonURLTextField.setText(getProperty("URL"));
    }

    private String getProperty(String propertyName) {
        InputStream input = null;
        String property = null;
        try {
            input = new FileInputStream("mainForm.properties");
            Properties prop = new Properties();
            prop.load(input);
            property = prop.getProperty(propertyName);
            input.close();
        } catch (FileNotFoundException fnfEx) {
            fnfEx.printStackTrace();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
        return property;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstStepPanel = new javax.swing.JPanel();
        jsonURLLabel = new javax.swing.JLabel();
        jsonURLTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FAERS: JSON to DB");

        firstStepPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("1. Step: Download parts of FAERS database from JSON"));

        jsonURLLabel.setText("JSON URL:");

        jsonURLTextField.setToolTipText("");

        jButton1.setText("Save parts into...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firstStepPanelLayout = new javax.swing.GroupLayout(firstStepPanel);
        firstStepPanel.setLayout(firstStepPanelLayout);
        firstStepPanelLayout.setHorizontalGroup(
            firstStepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstStepPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstStepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addGroup(firstStepPanelLayout.createSequentialGroup()
                        .addComponent(jsonURLLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsonURLTextField)))
                .addContainerGap())
        );
        firstStepPanelLayout.setVerticalGroup(
            firstStepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstStepPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstStepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsonURLLabel)
                    .addComponent(jsonURLTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstStepPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstStepPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            URL jsonUrl = new URL(jsonURLTextField.getText());
            BufferedWriter out;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(jsonUrl.openStream()))) {
                FileWriter fw = new FileWriter("download.json");
                out = new BufferedWriter(fw);
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    out.write(inputLine + "\n");
                }
            }
            out.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new MainForm().setVisible(true);
  

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel firstStepPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jsonURLLabel;
    private javax.swing.JTextField jsonURLTextField;
    // End of variables declaration//GEN-END:variables
}