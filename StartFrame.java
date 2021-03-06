/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackpot;

import static jackpot.JackpotForm.stmt;
import java.awt.Toolkit;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Yogi
 */
public class StartFrame extends javax.swing.JFrame {

    /**
     * Creates new form StartFrame
     */
    public StartFrame() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(JackpotForm.IconName)));
        
        initComponents();
        setVisible(true);
        DBButton.setEnabled(false);
        JackpotForm.dbloader();
        
        String sql = "SELECT TNAME FROM Player GROUP BY (TNAME)";
        try{
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String database = rs.getString("TNAME");
                dblist.add(database);
                DBbox.addItem(database);
            }
          
        }catch(SQLException e){
            System.err.println(e);
        }
        
        if(DBbox.getItemCount()==0) LoadButton.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WarningLabel = new javax.swing.JLabel();
        LoadButton = new javax.swing.JButton();
        NewButton = new javax.swing.JButton();
        DBbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        DBButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RED JOKER JACKPOT");

        WarningLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        WarningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WarningLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jackpot/RJjackpot.png"))); // NOI18N
        WarningLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LoadButton.setText("Wczytaj");
        LoadButton.setToolTipText("Wczytuje wybranego Jackpota");
        LoadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });
        LoadButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoadButtonKeyPressed(evt);
            }
        });

        NewButton.setText("Nowy");
        NewButton.setToolTipText("Tworzy nowego Jackpota");
        NewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewButtonActionPerformed(evt);
            }
        });
        NewButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NewButtonKeyPressed(evt);
            }
        });

        DBbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Autor: Michał \"Yogi\" Szczepanik");

        DBButton.setText("Wczytaj Bazę Danych");
        DBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(WarningLabel)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(DBbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(WarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DBbox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewButtonActionPerformed

        Date date = new Date();
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        
        String time = "" + calendar.get(Calendar.DAY_OF_MONTH) + " " + month[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.YEAR)
                + "( " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND) + " )";
        if(NewButton.getText()!="")  new JackpotForm(time);
        dispose();
    }//GEN-LAST:event_NewButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        // TODO add your handling code here:
        if(DBbox.getSelectedIndex() != -1) {
            new JackpotForm(DBbox.getSelectedItem().toString());
            dispose();
        }else{
            new WarningFrame("Nie wybrano Jackpota do wczytania");
        }
        
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void LoadButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoadButtonKeyPressed
        if(evt.getKeyCode() == VK_ENTER){
            LoadButton.doClick();
        }
    }//GEN-LAST:event_LoadButtonKeyPressed

    private void NewButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewButtonKeyPressed
        if(evt.getKeyCode() == VK_ENTER){
            NewButton.doClick();
        }
    }//GEN-LAST:event_NewButtonKeyPressed

    private void DBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBButtonActionPerformed
        // TODO add your handling code here:
        new DBChoseForm();
    }//GEN-LAST:event_DBButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame();
            }
        });
    }

    public static List<String> dblist = new ArrayList<String>();
    public final static String [] month = {"","STYCZEŃ","LUTY","MARZEC","KWIECIEŃ","MAJ","CZERWIEC","LIPIEC","SIERPIEŃ","WRZESIEŃ","PAŹDZIERNIK","LISTOPAD","GRUDZIEŃ"};
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DBButton;
    private javax.swing.JComboBox<String> DBbox;
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton NewButton;
    private javax.swing.JLabel WarningLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
