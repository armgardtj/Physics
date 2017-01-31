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
 * @author John
 */
public class MomentumGUI extends javax.swing.JPanel implements ActionListener {

    private final Momentum m;
    private final Timer timer;
    private int x1, x2, theTime;

    private enum mType {
        ELASTIC,
        INELASTIC,
        EXPLOSION
    }
    private mType type = mType.ELASTIC;

    public MomentumGUI() {
        m = new Momentum();
        initComponents();
        groupType.add(buttonElastic);
        groupType.add(buttonInelastic);
        groupType.add(buttonExplosion);
        buttonElastic.setSelected(true);
        timer = new Timer(1, this);
        timer.start();
        theTime = 0;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (type) {
            case ELASTIC:
//                x1 = m.calcX1(theTime, type);
//                x2 = m.calcX2(theTime, type);
                g.setColor(Color.black);
                g.drawLine(0, 900, 1000, 900);
                g.setColor(Color.red);
                g.fillOval(x1, 800, 100, 100);
                g.setColor(Color.blue);
                g.fillOval(x2, 800, 100, 100);
                break;
            case INELASTIC:
                g.setColor(Color.black);
                g.drawLine(0, 900, 1000, 900);
                g.setColor(Color.red);
                g.fillOval(x1, 800, 100, 100);
                g.setColor(Color.blue);
                g.fillOval(x2, 800, 100, 100);
                break;
            case EXPLOSION:
                g.setColor(Color.black);
                g.drawLine(0, 900, 1000, 900);
                g.setColor(Color.red);
                g.fillOval(x1, 800, 100, 100);
                g.setColor(Color.blue);
                g.fillOval(x2, 800, 100, 100);
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            theTime++;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        groupType = new javax.swing.ButtonGroup();
        buttonElastic = new javax.swing.JRadioButton();
        buttonInelastic = new javax.swing.JRadioButton();
        buttonExplosion = new javax.swing.JRadioButton();
        jtM1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtV1 = new javax.swing.JTextField();
        jtM2 = new javax.swing.JTextField();
        jtV2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        buttonElastic.setText("Elastic");
        buttonElastic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElasticActionPerformed(evt);
            }
        });

        buttonInelastic.setText("Inelastic");
        buttonInelastic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInelasticActionPerformed(evt);
            }
        });

        buttonExplosion.setText("Explosion");
        buttonExplosion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExplosionActionPerformed(evt);
            }
        });

        jtM1.setText(String.valueOf(m.getM1()));
        jtM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtM1ActionPerformed(evt);
            }
        });

        jLabel1.setText("m1:");

        jLabel2.setText("v1:");

        jLabel3.setText("m2:");

        jLabel4.setText("v2:");

        jtV1.setText(String.valueOf(m.getV1()));
        jtV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtV1ActionPerformed(evt);
            }
        });

        jtM2.setText(String.valueOf(m.getM2()));
        jtM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtM2ActionPerformed(evt);
            }
        });

        jtV2.setText(String.valueOf(m.getM2()));
        jtV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtV2ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonExplosion)
                    .addComponent(buttonInelastic)
                    .addComponent(buttonElastic))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(250, 250, 250))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(buttonElastic))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(buttonInelastic)
                .addGap(18, 18, 18)
                .addComponent(buttonExplosion)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jtM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 748, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void buttonElasticActionPerformed(java.awt.event.ActionEvent evt) {                                              
        type = mType.ELASTIC;
       // m.setCase(type);
    }                                             

    private void buttonInelasticActionPerformed(java.awt.event.ActionEvent evt) {                                                
        type = mType.INELASTIC;
        //m.setCase(type);
    }                                               

    private void buttonExplosionActionPerformed(java.awt.event.ActionEvent evt) {                                                
        type = mType.EXPLOSION;
       // m.setCase(type);
    }                                               

    private void jtM1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jtM1.setText(String.valueOf(m.setM1(jtM1.getText())));
        repaint();
    }                                    

    private void jtV1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jtV1.setText(String.valueOf(m.setV1(jtV1.getText())));
        repaint();
    }                                    

    private void jtM2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jtM2.setText(String.valueOf(m.setM2(jtM2.getText())));
        repaint();
    }                                    

    private void jtV2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jtV2.setText(String.valueOf(m.setV2(jtV2.getText())));
        repaint();
    }                                    

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        NewJFrame.clear(this, new Menu());
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        timer.restart();
        theTime = 0;
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

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton buttonElastic;
    private javax.swing.JRadioButton buttonExplosion;
    private javax.swing.JRadioButton buttonInelastic;
    private javax.swing.ButtonGroup groupType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtM1;
    private javax.swing.JTextField jtM2;
    private javax.swing.JTextField jtV1;
    private javax.swing.JTextField jtV2;
    // End of variables declaration                   
}
