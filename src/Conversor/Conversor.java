/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import conversores.Distancia;
import conversores.Memoria;
import conversores.Peso;
import conversores.Temperatura;
import conversores.Tiempo;
import conversores.Area;
import java.awt.event.KeyEvent;

/**
 *
 * @author Matias
 */
public class Conversor extends javax.swing.JFrame {

    private final String[] unidades_distancia = { "KM", "M", "CM", "MI", "IN","FT","MINAUTICA" };
    private final String[] unidades_memoria = { "GB", "MB", "KB", "B", "b" };
    private final String[] unidades_area = { "GB", "MB", "KB", "B", "b" };
    private final String[] unidades_peso = { "TON", "KG", "G", "MG","SLUG","ONZA","LIBRA" };
    private final String[] unidades_temperatura = { "C", "K", "F" };
    private final String[] unidades_tiempo = { "DIA", "HR", "MIN", "SEG","AÑO" };
    
    private boolean focus_1 = true;
    // True: 1 a 2
    // False: 2 a 1
    
    /**
     * Creates new form Conversor
     */
    public Conversor() {
        initComponents();
    }
    
    private void Convertir()
    {
        text1_textfield.setText(text1_textfield.getText().replaceAll((","), "."));
        text2_textfield.setText(text2_textfield.getText().replaceAll((","), "."));

        text1_textfield.setText(text1_textfield.getText().replaceAll(("[^0-9.]"), ""));
        text2_textfield.setText(text2_textfield.getText().replaceAll(("[^0-9.]"), ""));
        
        if (text1_textfield.getText().equals("") && focus_1)
            return;

        if (text2_textfield.getText().equals("") && !focus_1)
            return;
        
        if (unidad_combo.getSelectedItem().equals("Longitud"))
        {
            Distancia num;
            if (focus_1)
            {
                num = new Distancia(Double.parseDouble(text1_textfield.getText()), (String) unidades1_combo.getSelectedItem());
                text2_textfield.setText(String.valueOf(num.Cambiar((String) unidades2_combo.getSelectedItem())));
            }
            else
            {
                num = new Distancia(Double.parseDouble(text2_textfield.getText()), (String) unidades2_combo.getSelectedItem());
                text1_textfield.setText(String.valueOf(num.Cambiar((String) unidades1_combo.getSelectedItem())));
            }
        }
        else if (unidad_combo.getSelectedItem().equals("Memoria"))
        {
            Memoria num;
            if (focus_1)
            {
                num = new Memoria(Long.parseLong(text1_textfield.getText()), (String) unidades1_combo.getSelectedItem());
                text2_textfield.setText(String.valueOf(num.Cambiar((String) unidades2_combo.getSelectedItem())));
            }
            else
            {
                num = new Memoria(Long.parseLong(text2_textfield.getText()), (String) unidades2_combo.getSelectedItem());
                text1_textfield.setText(String.valueOf(num.Cambiar((String) unidades1_combo.getSelectedItem())));
            }
        }
        else if (unidad_combo.getSelectedItem().equals("Masa"))
        {
            Peso num;
            if (focus_1)
            {
                num = new Peso(Double.parseDouble(text1_textfield.getText()), (String) unidades1_combo.getSelectedItem());
                text2_textfield.setText(String.valueOf(num.Cambiar((String) unidades2_combo.getSelectedItem())));
            }
            else
            {
                num = new Peso(Double.parseDouble(text2_textfield.getText()), (String) unidades2_combo.getSelectedItem());
                text1_textfield.setText(String.valueOf(num.Cambiar((String) unidades1_combo.getSelectedItem())));
            }
        }
        else if (unidad_combo.getSelectedItem().equals("Temperatura"))
        {
            Temperatura num;
            if (focus_1)
            {
                num = new Temperatura(Double.parseDouble(text1_textfield.getText()), (String) unidades1_combo.getSelectedItem());
                text2_textfield.setText(String.valueOf(num.Cambiar((String) unidades2_combo.getSelectedItem())));
            }
            else
            {
                num = new Temperatura(Double.parseDouble(text2_textfield.getText()), (String) unidades2_combo.getSelectedItem());
                text1_textfield.setText(String.valueOf(num.Cambiar((String) unidades1_combo.getSelectedItem())));
            }
        }
        else if (unidad_combo.getSelectedItem().equals("Tiempo"))
        {
            Tiempo num;
            if (focus_1)
            {
                num = new Tiempo(Double.parseDouble(text1_textfield.getText()), (String) unidades1_combo.getSelectedItem());
                text2_textfield.setText(String.valueOf(num.Cambiar((String) unidades2_combo.getSelectedItem())));
            }
            else
            {
                num = new Tiempo(Double.parseDouble(text2_textfield.getText()), (String) unidades2_combo.getSelectedItem());
                text1_textfield.setText(String.valueOf(num.Cambiar((String) unidades1_combo.getSelectedItem())));
            }
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

        jLabel1 = new javax.swing.JLabel();
        text1_textfield = new javax.swing.JTextField();
        text2_textfield = new javax.swing.JTextField();
        convertir_but = new javax.swing.JButton();
        unidad_combo = new javax.swing.JComboBox<String>();
        unidades1_combo = new javax.swing.JComboBox<String>();
        unidades2_combo = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de valores");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setText("Conversor de Unidades Fundamentales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, 41));

        text1_textfield.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        text1_textfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        text1_textfield.setText("Ingrese valor");
        text1_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text1_textfieldFocusGained(evt);
            }
        });
        text1_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text1_textfieldKeyReleased(evt);
            }
        });
        getContentPane().add(text1_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 186, 38));

        text2_textfield.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        text2_textfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        text2_textfield.setText("Ingrese valor");
        text2_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text2_textfieldFocusGained(evt);
            }
        });
        text2_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text2_textfieldKeyReleased(evt);
            }
        });
        getContentPane().add(text2_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 186, 37));

        convertir_but.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        convertir_but.setText("CONVERTIR");
        convertir_but.setMaximumSize(new java.awt.Dimension(100, 29));
        convertir_but.setMinimumSize(new java.awt.Dimension(100, 29));
        convertir_but.setPreferredSize(new java.awt.Dimension(100, 29));
        convertir_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convertir_butMouseClicked(evt);
            }
        });
        getContentPane().add(convertir_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 127, 78));

        unidad_combo.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        unidad_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Longitud", "Masa", "Tiempo" }));
        unidad_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                unidad_comboItemStateChanged(evt);
            }
        });
        unidad_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidad_comboActionPerformed(evt);
            }
        });
        getContentPane().add(unidad_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 223, 40));

        unidades1_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KM", "M", "CM", "MI", "IN", "FT" }));
        unidades1_combo.setMaximumSize(new java.awt.Dimension(60, 20));
        unidades1_combo.setPreferredSize(new java.awt.Dimension(60, 20));
        getContentPane().add(unidades1_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 72, -1));

        unidades2_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KM", "M", "CM", "MI", "IN", "FT" }));
        unidades2_combo.setMaximumSize(new java.awt.Dimension(60, 20));
        unidades2_combo.setPreferredSize(new java.awt.Dimension(60, 20));
        getContentPane().add(unidades2_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 72, -1));

        jLabel2.setText("CARLOS IVAN MENDEZ MATIAS®");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 402, -1, -1));

        jLabel3.setText("FISICA PARA INFORMÁTICA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 220, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Conversor/descarga (3).jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 240, 220));

        jLabel5.setText("Docente:Ángel Maya Hernández");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 250, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Conversor/LOGO2-una-linea-azul.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 710, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unidad_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidad_comboActionPerformed
        // TODO add your handling code here:
        unidades1_combo.removeAllItems();
        unidades2_combo.removeAllItems();
        
        if (unidad_combo.getSelectedItem().equals("Longitud"))
        {
            for (String unidades_distancia1 : unidades_distancia) {
                unidades1_combo.addItem(unidades_distancia1);
                unidades2_combo.addItem(unidades_distancia1);
            }
        }
        else if (unidad_combo.getSelectedItem().equals("Memoria"))
        {
            for (String unidades_memoria1 : unidades_memoria) {
                unidades1_combo.addItem(unidades_memoria1);
                unidades2_combo.addItem(unidades_memoria1);
            }
        }
        else if (unidad_combo.getSelectedItem().equals("Masa"))
        {
            for (String unidades_pesol : unidades_peso) {
                unidades1_combo.addItem(unidades_pesol);
                unidades2_combo.addItem(unidades_pesol);
            }
        }
        else if (unidad_combo.getSelectedItem().equals("Temperatura"))
        {
            for (String unidades_temperatural : unidades_temperatura) {
                unidades1_combo.addItem(unidades_temperatural);
                unidades2_combo.addItem(unidades_temperatural);
            }
        }
        else if (unidad_combo.getSelectedItem().equals("Tiempo"))
        {
            for (String unidades_tiempo1 : unidades_tiempo) {
                unidades1_combo.addItem(unidades_tiempo1);
                unidades2_combo.addItem(unidades_tiempo1);
            }
        }
    }//GEN-LAST:event_unidad_comboActionPerformed

    private void convertir_butMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertir_butMouseClicked
        // TODO add your handling code here:
        Convertir();
    }//GEN-LAST:event_convertir_butMouseClicked

    private void text1_textfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text1_textfieldFocusGained
        // TODO add your handling code here:
        focus_1 = true;
    }//GEN-LAST:event_text1_textfieldFocusGained

    private void text2_textfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text2_textfieldFocusGained
        // TODO add your handling code here:
        focus_1 = false;
    }//GEN-LAST:event_text2_textfieldFocusGained

    private void text1_textfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text1_textfieldKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            Convertir();
    }//GEN-LAST:event_text1_textfieldKeyReleased

    private void text2_textfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text2_textfieldKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            Convertir();
    }//GEN-LAST:event_text2_textfieldKeyReleased

    private void unidad_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_unidad_comboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_unidad_comboItemStateChanged

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(() -> {
            new Conversor().setVisible(true);
        });*/
        java.awt.EventQueue.invokeLater(new Runnable() {
    @Override
    public void run() {
        new Conversor().setVisible(true);
    }
});

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertir_but;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField text1_textfield;
    private javax.swing.JTextField text2_textfield;
    private javax.swing.JComboBox<String> unidad_combo;
    private javax.swing.JComboBox<String> unidades1_combo;
    private javax.swing.JComboBox<String> unidades2_combo;
    // End of variables declaration//GEN-END:variables

}
