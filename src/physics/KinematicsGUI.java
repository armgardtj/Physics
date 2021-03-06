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
public class KinematicsGUI extends javax.swing.JPanel implements ActionListener {

    private final Kinematics k;
    private int theTime, x, y;
    private final Timer timer;
    private boolean calc;

    public KinematicsGUI() {
        k = new Kinematics();
        initComponents();
        theTime = 0;
        timer = new Timer(1, this);
        timer.start();
        x = 0;
        y = 800;
        calc = false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0, 900, 1000, 900);
        g.setColor(Color.red);
        x = k.calcX(theTime / 1000.0, this);
        y = k.calcY(theTime / 1000.0, this);
        //System.out.println(x+"\n"+y+"\n");
        g.fillOval((x == -1) ? 0 : x, (y == -1) ? 800 : y, 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            theTime += 1;
            System.out.println(theTime);
            if (k.getT() != null && theTime / 1000 >= k.getT()) {
                timer.restart();
                theTime = 0;
            }
            repaint();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtX = new javax.swing.JTextField();
        jtX0 = new javax.swing.JTextField();
        jtVX = new javax.swing.JTextField();
        jtVX0 = new javax.swing.JTextField();
        jtAX = new javax.swing.JTextField();
        jtY = new javax.swing.JTextField();
        jtY0 = new javax.swing.JTextField();
        jtVY = new javax.swing.JTextField();
        jtVY0 = new javax.swing.JTextField();
        jtAY = new javax.swing.JTextField();
        jtT = new javax.swing.JTextField();

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("xf:");

        jLabel2.setText("x0:");

        jLabel3.setText("yf:");

        jLabel4.setText("y0:");

        jLabel5.setText("vxf:");

        jLabel6.setText("vx0:");

        jLabel7.setText("vyf:");

        jLabel8.setText("vy0:");

        jLabel9.setText("ax:");

        jLabel10.setText("ay:");

        jLabel11.setText("t:");

        jtX.setText(String.valueOf(k.getX()));
        jtX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtXActionPerformed(evt);
            }
        });

        jtX0.setText(String.valueOf(k.getX0()));
        jtX0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtX0ActionPerformed(evt);
            }
        });

        jtVX.setText(String.valueOf(k.getVx()));
        jtVX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVXActionPerformed(evt);
            }
        });

        jtVX0.setText(String.valueOf(k.getVx0()));
        jtVX0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVX0ActionPerformed(evt);
            }
        });

        jtAX.setText(String.valueOf(k.getAx()));
        jtAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAXActionPerformed(evt);
            }
        });

        jtY.setText(String.valueOf(k.getY()));
        jtY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtYActionPerformed(evt);
            }
        });

        jtY0.setText(String.valueOf(k.getY0()));
        jtY0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtY0ActionPerformed(evt);
            }
        });

        jtVY.setText(String.valueOf(k.getVy()));
        jtVY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVYActionPerformed(evt);
            }
        });

        jtVY0.setText(String.valueOf(k.getVy0()));
        jtVY0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVY0ActionPerformed(evt);
            }
        });

        jtAY.setText(String.valueOf(k.getAy()));
        jtAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAYActionPerformed(evt);
            }
        });

        jtT.setText(String.valueOf(k.getT()));
        jtT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtY0)
                            .addComponent(jtX0))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtVY)
                    .addComponent(jtVX)
                    .addComponent(jtT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtVY0)
                    .addComponent(jtVX0))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jtAX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jtAY, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtVX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtVX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jtAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtVY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jtVY0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jtAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jtY0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 866, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        NewJFrame.clear(this, new Menu());
    }                                        
    private void jtXActionPerformed(java.awt.event.ActionEvent evt) {                                    
        jtX.setText(String.valueOf(k.setX(jtX.getText())));
        k.verify(this);
        repaint();
    }                                   
    private void jtVXActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jtVX.setText(String.valueOf(k.setVX(jtVX.getText())));
        k.verify(this);
        repaint();
    }                                    
    private void jtYActionPerformed(java.awt.event.ActionEvent evt) {                                    
        jtY.setText(String.valueOf(k.setY(jtY.getText())));
        k.verify(this);
        repaint();
    }                                   
    private void jtX0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jtX0.setText(String.valueOf(k.setX0(jtX0.getText())));
        k.verify(this);
        repaint();
    }                                    
    private void jtY0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jtY0.setText(String.valueOf(k.setY0(jtY0.getText())));
        k.verify(this);
        repaint();
    }                                    
    private void jtVYActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jtVY.setText(String.valueOf(k.setVY(jtVY.getText())));
        k.verify(this);
        repaint();
    }                                    
    private void jtVX0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtVX0.setText(String.valueOf(k.setVX0(jtVX0.getText())));
        k.verify(this);
        repaint();
    }                                     
    private void jtAXActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jtAX.setText(String.valueOf(k.setAX(jtAX.getText())));
        k.verify(this);
        repaint();
    }                                    
    private void jtVY0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtVY0.setText(String.valueOf(k.setVY0(jtVY0.getText())));
        k.verify(this);
        repaint();
    }                                     
    private void jtAYActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jtAY.setText(String.valueOf(k.setAY(jtAY.getText())));
        k.verify(this);
        repaint();
    }                                    
    private void jtTActionPerformed(java.awt.event.ActionEvent evt) {                                    
        jtT.setText(String.valueOf(k.setT(jtT.getText())));
        k.verify(this);
        repaint();
    }                                   


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtAX;
    private javax.swing.JTextField jtAY;
    private javax.swing.JTextField jtT;
    private javax.swing.JTextField jtVX;
    private javax.swing.JTextField jtVX0;
    private javax.swing.JTextField jtVY;
    private javax.swing.JTextField jtVY0;
    private javax.swing.JTextField jtX;
    private javax.swing.JTextField jtX0;
    private javax.swing.JTextField jtY;
    private javax.swing.JTextField jtY0;
    // End of variables declaration                   

    public Kinematics getK() {
        return this.k;
    }
    
    public boolean getVarCalc() {
        return calc;
    }

    public void setjTextField1(Double d) {
        jtX.setText(String.valueOf(d));
    }

    public void setjTextField2(Double d) {
        jtY.setText(String.valueOf(d));
    }

    public void setjTextField3(Double d) {
        jtVX0.setText(String.valueOf(d));
    }

    public void setjTextField4(Double d) {
        jtY0.setText(String.valueOf(d));
    }

    public void setjTextField5(Double d) {
        jtVY.setText(String.valueOf(d));
    }

    public void setjTextField6(Double d) {
        jtVX.setText(String.valueOf(d));
    }

    public void setjTextField7(Double d) {
        jtX0.setText(String.valueOf(d));
    }

    public void setjTextField8(Double d) {
        jtVY0.setText(String.valueOf(d));
    }

    public void setjTextField9(Double d) {
        jtAX.setText(String.valueOf(d));
    }

    public void setjTextField10(Double d) {
        jtAY.setText(String.valueOf(d));
    }

    public void setjTextField11(Double d) {
        jtT.setText(String.valueOf(d));
    }
}
