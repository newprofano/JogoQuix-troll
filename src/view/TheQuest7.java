package view;


import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-PC
 */
public class TheQuest7 extends javax.swing.JFrame {
    
    private static Thread vagab = new Thread();
    private static int trava = 0;
    private static int clicks =0;
    private static int congratz =0;
    
    public String alou = System.getProperty("user.home");

    /**
     * Creates new form TheQuest
     */
    
    public TheQuest7() {
        initComponents();
        txPrayer.setText(TheGame.getNickName());
        txPontos.setText(""+TheGame.getPontos());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txPrayer = new javax.swing.JLabel();
        txPontos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPergunta2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTimer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Prayer:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Pontos:");

        lbPergunta2.setText("<html><h2>Jogo clicker hardcore</h2></br><font color=\"blue\"> Descrição:</font> Click como se não ouvesse amanhã, assim que clikar no start, será iniciado um contador e você terá 20 seg para clickar 100 vezes caso contrario, seu pc <font color =\"red\">reiniciara</font></html> ");
        lbPergunta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                troll(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                destrolando(evt);
            }
        });

        jLabel3.setText("<html><h3>TIMER:</h3></html>");

        lbTimer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbTimer.setForeground(new java.awt.Color(255, 0, 51));
        lbTimer.setText("20");

        jButton1.setText("<html><h3>Start</h3></html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbPergunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txPrayer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPontos))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTimer)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPrayer)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPontos)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(lbPergunta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTimer))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void troll(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_troll
        // TODO add your handling code here:
        
    }//GEN-LAST:event_troll

    private void destrolando(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destrolando
       
    }//GEN-LAST:event_destrolando

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (trava == 0) {
            vagab = new Thread(new Cronometro());
            vagab.start();
            trava = 1;
            
            File desliga = new File(alou +"\\Desktop\\Troll.bat");
            
            try {
                desliga.createNewFile();
            } catch (IOException ex) {
                System.out.println("Faill ao criar");
            }
            
            try {
                FileWriter escrevendoBat = new FileWriter(desliga);
                BufferedWriter escreve = new BufferedWriter(escrevendoBat);
                
                escreve.write("shutdown -r -t 22");
         
                escreve.close();
                escrevendoBat.close();
            } catch (IOException ex) {
                System.out.println("Deu Ruim ao escrever bat");
                
                
            }
            
            try {
                Desktop.getDesktop().open(desliga);
                
                
            } catch (IOException ex) {
                System.out.println("Deu ruim ao executar o virus");
            }
            
        }
        if (Integer.parseInt(lbTimer.getText()) >0){
            clicks++;
            String cont = Integer.toString(clicks);
            
            jButton1.setText(cont);
            
            congratz =clicks;
            
             if (congratz >=100) {
                 
                    File cancela = new File(alou+"\\Desktop\\Destoll.bat");
                try {
                    cancela.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Deu rum ao criar ant-virus");
                }
                try {
                    FileWriter escreveA = new FileWriter(cancela);
                    BufferedWriter buff = new BufferedWriter(escreveA);
                    
                    buff.write("shutdown -a");
                    
                    
                    
                    buff.close();
                    escreveA.close();
                } catch (IOException ex) {
                    System.out.println("Deu ruim ao escrever ant-virus");
                }
                   
                try {
                    Desktop.getDesktop().open(cancela);
                } catch (IOException ex) {
                    System.out.println("Deu ruim ao executar ant-virus");
                }
                    
                    
                    new TheQuest8().setVisible(true);
                    dispose();
                }
             
             
             
             
            
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
            java.util.logging.Logger.getLogger(TheQuest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheQuest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheQuest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheQuest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheQuest1().setVisible(true);
            }
        });
    }
    
    private class Cronometro implements Runnable{

        @Override
        public void run() {
            
            for (int i = 20; i >=0; i--) {
                
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TheQuest7.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            lbTimer.setText(""+i);
                if (congratz >=100) {
                    return;
                    
                }
               
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbPergunta2;
    private javax.swing.JLabel lbTimer;
    private javax.swing.JLabel txPontos;
    private javax.swing.JLabel txPrayer;
    // End of variables declaration//GEN-END:variables
}
