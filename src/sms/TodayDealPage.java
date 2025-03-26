/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static sms.WorkerDetailPage.conn;

/**
 *
 * @author jane
 */
public class TodayDealPage extends javax.swing.JFrame {

    static Connection conn = null;
    Statement stmt = null;
    int count=0;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ja1212ne";
    private static final String connstr = "jdbc:mysql://localhost:3306/mall?autoReconnect=true&useSSL=false";
    String ig[]=new String[]{"/sms/shopOffer.png","/sms/ShopOffer1.png","/sms/ShopeOffer4.jpg","/sms/shopOffer2.png"};
    //String ig1[]=new String[]{"/sms/ShopOffer1.jpg","/sms/FoodOffer2.jpg","/sms/FoodOffer4.jpg","/sms/food1.jpg"};
    int i=0,j=0,k=0;
    String Label[]=new String[100];
    String Text[]=new String[100];
    ImageIcon image;

    /**
     * Creates new form TodayDealPage
     */
    public TodayDealPage() {
        initComponents();
        Create_data();
    }
    
    public void Create_data(){
        try {
            conn = DriverManager.getConnection(connstr, USERNAME, PASSWORD);
            System.out.println("Connected to DataBase");
            stmt = (Statement) conn.createStatement();
            String sql="SELECT d.name,s.deal from ShopDetails d join TodayDeals s on d.id=s.id";    
            ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    //System.out.println(Label[i]);
                    Label[i]=rs.getString("name");
                    Text[i]=rs.getString("deal");
                    System.out.println(Label[i]+"------>"+Text[i]);
                    ++count;
                    i++;
    
            }
            System.out.println(count);

        } catch (SQLException ex) {
            System.out.println("ERROR------>"+ex.getMessage());
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 480, 50));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 50, 20));

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 450, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/whiteArrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 20));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 814, 44));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("DEALS FOR THE DAY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 260, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/dealToday_1.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 620, 230));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/right.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 40, 230));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/left.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 40, 230));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/MallFeed_1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           // TODO add your handling code here:

           if(j==0){
                j=count;    
           }
             --j;
            jLabel7.setText("offers");
            jLabel6.setText(Label[j]);
            jLabel8.setText(Text[j]);
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(ig[j%4]))); 
            
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
            // TODO add your handling code here:
           if(j==count){
                j=0;
           }
           
            jLabel7.setText("offers");
            jLabel6.setText(Label[j]);
            jLabel8.setText(Text[j]);
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(ig[j%4]))); 
            j++;
           // k++;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        super.dispose();
        new CustHomePage().setVisible(true);
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
            java.util.logging.Logger.getLogger(TodayDealPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodayDealPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodayDealPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodayDealPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TodayDealPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
