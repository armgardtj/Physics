/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author jarmgar8
 */
public class MomentumGUI extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form MomentumGUI
     */
    private final Momentum m;
    private final Timer timer;
    private int x1, x2, theTime;
    private int type;
    private boolean active;

    public MomentumGUI() {
        m = new Momentum();
        initComponents();
        type = 1;
        groupType.add(ButtonElastic);
        groupType.add(ButtonInelastic);
        groupType.add(ButtonExplosion);
        ButtonElastic.setSelected(true);
        timer = new Timer(1, this);
        theTime = 0;
        timer.start();
        active = false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!m.calculate()) {
            x1 = 0;
            x2 = 900;
            active = false;
        } else {
            x1 = m.calcX1(theTime/1000.0, type);
            x2 = m.calcX2(theTime/1000.0, type);
            if (!active){
                timer.restart();
                theTime=0;
                active = true;
            }
        }
        System.out.println(x1 + " "+x2);
        g.setColor(Color.black);
        g.fillOval(495, 895, 10, 10);
        g.drawString("0", 497, 915);
        g.drawString("-5m", 250, 915);
        g.drawString("5m", 750, 915);
        g.drawLine(50,925,950,925);
        g.drawLine(50,900,50,925);
        g.drawLine(500,900,500,925);
        g.drawLine(950,900,950,925);
        
        g.drawLine(0, 900, 1000, 900);
        g.setColor(Color.red);
        g.fillOval(x1, 800, 100, 100);
        g.setColor(Color.blue);
        g.fillOval(x2, 800, 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            theTime++;
            if (theTime >= 10000) {
                timer.restart();
                theTime = 0;
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

        groupType = new javax.swing.ButtonGroup();
        ButtonElastic = new javax.swing.JRadioButton();
        ButtonInelastic = new javax.swing.JRadioButton();
        ButtonExplosion = new javax.swing.JRadioButton();
        jtM1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtV1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtM2 = new javax.swing.JTextField();
        jtV2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 1000));

        groupType.add(ButtonElastic);
        ButtonElastic.setText("Elastic");

        groupType.add(ButtonInelastic);
        ButtonInelastic.setText("Inelastic");

        groupType.add(ButtonExplosion);
        ButtonExplosion.setText("Explosion");

        jtM1.setText(String.valueOf(m.getM1()));
        jtM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtM1ActionPerformed(evt);
            }
        });

        jLabel1.setText("m1:");

        jtV1.setText(String.valueOf(m.getV1()));
        jtV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtV1ActionPerformed(evt);
            }
        });

        jLabel2.setText("v1:");

        jLabel3.setText("m2:");

        jLabel4.setText("v2:");

        jtM2.setText(String.valueOf(m.getM2()));
        jtM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtM2ActionPerformed(evt);
            }
        });

        jtV2.setText(String.valueOf(m.getV2()));
        jtV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtV2ActionPerformed(evt);
            }
        });

        jLabel7.setText("p1:");

        jLabel8.setText("p2:");

        jLabel9.setText(String.valueOf(m.getP2()));

        jLabel10.setText(String.valueOf(m.getP1()));

        jLabel11.setText("CoM x:");

        jLabel12.setText(String.valueOf(m.getCl()));

        jLabel13.setText("CoM v:");

        jLabel14.setText(String.valueOf(m.getCv()));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtV1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jtM1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtM2)
                        .addComponent(jtV2))
                    .addComponent(jLabel9))
                .addGap(205, 205, 205))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonExplosion)
                    .addComponent(ButtonInelastic, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonElastic, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ButtonElastic)
                .addGap(18, 18, 18)
                .addComponent(ButtonInelastic)
                .addGap(18, 18, 18)
                .addComponent(ButtonExplosion)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jtM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jtV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtM1ActionPerformed
        jtM1.setText(String.valueOf(m.setM1(jtM1.getText())));
        repaint();
    }//GEN-LAST:event_jtM1ActionPerformed

    private void jtV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtV1ActionPerformed
        jtV1.setText(String.valueOf(m.setV1(jtV1.getText())));
        repaint();
    }//GEN-LAST:event_jtV1ActionPerformed

    private void jtM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtM2ActionPerformed
        jtM2.setText(String.valueOf(m.setM2(jtM2.getText())));
        repaint();
    }//GEN-LAST:event_jtM2ActionPerformed

    private void jtV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtV2ActionPerformed
        jtV2.setText(String.valueOf(m.setV2(jtV2.getText())));
        repaint();
    }//GEN-LAST:event_jtV2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NewJFrame.clear(this, new Menu());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ButtonElastic;
    private javax.swing.JRadioButton ButtonExplosion;
    private javax.swing.JRadioButton ButtonInelastic;
    private javax.swing.ButtonGroup groupType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtM1;
    private javax.swing.JTextField jtM2;
    private javax.swing.JTextField jtV1;
    private javax.swing.JTextField jtV2;
    // End of variables declaration//GEN-END:variables

    private void buttonElasticActionPerformed(java.awt.event.ActionEvent evt) {
        type = 1;
    }

    private void buttonInelasticActionPerformed(java.awt.event.ActionEvent evt) {
        type = 2;
    }

    private void buttonExplosionActionPerformed(java.awt.event.ActionEvent evt) {
        type = 3;
    }

    public void setjtM1(Double d) {
        jtM1.setText(String.valueOf(d));
    }

    public void setjtM2(Double d) {
        jtM2.setText(String.valueOf(d));
    }

    public void setjtV1(Double d) {
        jtV1.setText(String.valueOf(d));
    }

    public void setjtV2(Double d) {
        jtV2.setText(String.valueOf(d));
    }

}
