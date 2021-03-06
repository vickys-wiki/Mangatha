/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Mangatha.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pathi
 */
public class PlayDesk extends javax.swing.JFrame {

    /**
     * Creates new form PlayDesk
     */
    String nos[] ={"A " ,"2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","J ","Q ","K " } ;
    ArrayList<String> deck = new ArrayList<String>();
    ArrayList<String> player1 = new ArrayList<String>();
    ArrayList<String> player2 = new ArrayList<String>();
    ArrayList<String> gameplay = new ArrayList<String>();
   Random gen = new Random();String current;
   String hearts ="\u2661";
   String diamonds = "\u2662";
   String spades = "\u2660";
   String clubs = "\u2663";
   boolean lock=false;
   boolean p1_lock=false,p2_lock=false;
   
   public void init()
    {int i;
      deck.clear();player1.clear();player2.clear();gameplay.clear();
      fill(new String("Hearts"));
      fill(new String("Diamonds"));
      fill(new String("Clubs"));
      fill(new String("Spades"));
      System.out.println("the contents of arraylists "+deck);
      Collections.shuffle(deck);
      System.out.println("the contents of deck after shuffling "+deck);
    }
   
    public void fill(String s)
    { int i;
        for(i=0;i<13;i++)
        {
          deck.add(String.valueOf(nos[i]).concat(s));
        }
    }
   
    public PlayDesk() {
        initComponents();
        init();
         
    }
    
    public void dispose_cards()
    {int i,j;
     player1.clear();
     player2.clear();
     Collections.shuffle(deck);j=1;
     for(i=0;i<52;i++,j++)
     {if(j%2!=0)
        { player1.add(deck.get(i));}
          else
            {   player2.add(deck.get(i));}
     }
     
     System.out.println("The cards with player1" +player1);
     System.out.println("The cards with player2" +player2);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 102, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Player 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Player 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("cards here...");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Start New Game");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Mangatha");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("cards here...");

        jButton4.setText("shuffle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("shuffle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("About");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(196, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose_cards();
        JOptionPane.showMessageDialog(rootPane,"Cards disposed successfully. start playing");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int t;boolean res;
        jLabel4.setText("");
        if(player1.isEmpty())
         {
           JOptionPane.showMessageDialog(rootPane,"click 'start new game' button");
           
         }
      if(p1_lock == false)
      { 
         
          p2_lock=true;
      
          if(player1.isEmpty()==false)
      {
          jLabel1.setVisible(true);
          jLabel3.setVisible(true);
          
        if(lock==false)
        {
          lock=true;
          current=player1.get((player1.size())-1);
          player1.remove((player1.size())-1);
          
          if(current.contains(String.valueOf('H')) ||current.contains(String.valueOf('D')))
          {   jLabel1.setVisible(false);
              jLabel3.setText(current);
          }
          else
          {   jLabel3.setVisible(false);
              jLabel1.setText(current);
          }
          gameplay.add(current);
          t=gameplay.indexOf(current);
          if(t!=0)
          {
            res=check_luck(t);
            if(res==true)
            { 
              JOptionPane.showMessageDialog(rootPane,"Player 1 has got it ! :) ");
              System.out.println("Player1 has got it !"+player1);
              
              acquire_cards(t,1);
              System.out.println("Player1 cards after acquiring" + player1);
              System.out.println("cards have been added to player1");
              Collections.shuffle(player1);
            }
          }
          
          lock=false;
        }
      }
      else if(player2.isEmpty()!=true)
      { 
          JOptionPane.showMessageDialog(rootPane, "PLAYER 2  wins the game !!!!" + " CONGRATS");
    
     }
          p2_lock=false;
          jLabel5.setText("ur turn");
          
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel5.setText("");
        int t;boolean res;
        if(player2.isEmpty())
         {
           JOptionPane.showMessageDialog(rootPane,"click 'start new game' button");
           
         }
       if(p2_lock==false)
       {
         p1_lock=true; 
      if(player2.isEmpty()==false)
      {
          jLabel1.setVisible(true);
          jLabel3.setVisible(true);
          
        if(lock==false)
        {
          lock=true;
          current=player2.get((player2.size())-1);
          player2.remove((player2.size())-1);
          if(current.contains(String.valueOf('H')) ||current.contains(String.valueOf('D')))
          {   jLabel1.setVisible(false);
              jLabel3.setText(current);
          }
          else
          {   jLabel3.setVisible(false);
              jLabel1.setText(current);
          }
          jLabel1.setText(current);
          gameplay.add(current);
          t=gameplay.indexOf(current);
          if(t!=0)
          {
            res=check_luck(t);
            if(res==true)
            { 
              JOptionPane.showMessageDialog(rootPane,"Player 2 has got it ! :) ");
              System.out.println("Player2 has got it !"+player2);
                
              acquire_cards(t,2);
              System.out.println("Player2 cards after acquiring" + player2);
              Collections.shuffle(player2);
            }
          } 
          lock=false;
        }
      }
      else if(player1.isEmpty()!=true)
      {
        JOptionPane.showMessageDialog(rootPane, "PLAYER 1  wins the game !!!!" + " CONGRATS");
      }
       p1_lock=false;
       jLabel4.setText("ur turn");
       }
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      Collections.shuffle(player1);
      JOptionPane.showMessageDialog(rootPane, "cards shuffled successfully. continue playing !");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       Collections.shuffle(player2);
       JOptionPane.showMessageDialog(rootPane, "cards shuffled successfully. continue playing !");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         aboutwindow obj1 = new aboutwindow();obj1.setVisible(true);
         obj1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         
        
    }//GEN-LAST:event_jButton6ActionPerformed
    
    void acquire_cards(int t,int p_id)
    {
       if(p_id==1)
       {
         for(int i=0;i<=t;i++)
            {
             player1.add(gameplay.get(i));
             }
           gameplay.clear();    
        }
       else
       {
            for(int i=0;i<=t;i++)
            {
             player2.add(gameplay.get(i));
             }
           gameplay.clear();    
       
       }
    }
    
    
    
    boolean check_luck( int t)
    { 
        if(String.valueOf(gameplay.get(t).charAt(0)).equalsIgnoreCase(String.valueOf(gameplay.get(t-1).charAt(0))))
        { return true;}
        else
        {  return false;}
     
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(PlayDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayDesk().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
