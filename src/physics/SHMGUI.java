/*
This class is the class that does all the graphical processing for the simple harmonic motion simulator
 */
package physics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.Timer;

/**
 *
 * @author nhoJ
 */
public class SHMGUI extends javax.swing.JPanel implements ActionListener{

    private final SHM s;
    private int x, y;
    private int type;
    private final Timer timer;
    private int theTime;
    DecimalFormat df;

    //This is the constructor
    //It gives a value to all the variables above, as well as completing some necessary initializations
    public SHMGUI() {
        s = new SHM();
        initComponents(); //Auto-generated function by IDE
        groupType.add(springRadioButton);
        groupType.add(pendulumRadioButton);
        springRadioButton.setSelected(true);
        degrad.add(degButton);
        degrad.add(radButton);
        radButton.setSelected(true);
        timer = new Timer(1, this);
        theTime = 0;
        timer.start();
        type = 1;
        df = new DecimalFormat("#.####");
        tSwitch(true);
    }

    /*
    This function is the actionPerformed function, called whenever an action is performed on the screen
    I only use it to check when the time updates, and act according as a result
    I increment my theTime variable by 1, and check to see if the time is equivalent to the SHM period
    If the time is equivalent, then the timer will reset
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            theTime++;
            //System.out.println(theTime);
            if (s.getT() != null && theTime / 1000.0 >= s.getT()) {
                timer.restart();
                theTime = 0;
            }
            repaint();
        }
    }

    /*
    This code is the highlight of the class, where all the graphics and computed and drawn
    First, it checks to see which SHM is being simulated (spring or pendulum), and acts accordingly
    It calls the getX function within SHM.java, and adds/subtracts to fit the screen size (1000,1000)
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawLine(0, 900, 1000, 900);
        //System.out.println(theTime/100.0);
        Double xp, yp;
        if (type == 1) {
            xp = s.calcX(theTime / 100.0, type);
            //System.out.println("xp1:"+xp);
            xp = 500 + xp / s.getAmp() * 250;
            //System.out.println("xp2:"+xp);
            x = xp.intValue();
            s.calcVal(theTime, type);
            y = 750;
            g.drawLine(0,y+50,x+50,y+50);
        }
        else if (type == 2){
            //g.drawOval(-300,-700,1600,1600);
            xp = s.calcX(theTime / 100.0, type);
            xp = xp/s.getL()*800+450;
            x = xp.intValue();
            yp = s.calcY(theTime/100.0, type);
            yp = yp/s.getL()*800+50;
            y = yp.intValue();
            s.calcVal(theTime, type);
            g.drawLine(500,0,x+50,y+50);

        }
        s.calcConstant(type);
        //System.out.println("x: "+x);
        //System.out.println("t:"+theTime);
        //y = k.calcY(theTime / 1000.0, this);
        //System.out.println(x+"\n"+y+"\n");
        g.setColor(Color.red);
        g.fillOval(x, y, 100, 100);

        if (theTime%10 == 0) {
            jLabel10.setText(String.valueOf(Double.parseDouble(df.format(s.getF()))));
            jLabel14.setText(String.valueOf(Double.parseDouble(df.format(s.getUe()))));
            jLabel16.setText(String.valueOf(Double.parseDouble(df.format(s.getKe()))));
            jLabel18.setText(String.valueOf(Double.parseDouble(df.format(s.getE()))));
            jLabel20.setText(String.valueOf(Double.parseDouble(df.format(s.getX()))));
            jLabel22.setText(String.valueOf(Double.parseDouble(df.format(s.getV()))));
            jLabel24.setText(String.valueOf(Double.parseDouble(df.format(s.getA()))));
        }
        //jLabel10.setText(String.valueOf(s.getF()));
    }
    /*
    This function is called when the button group of spring/pendulum is pressed
    It will display/hide certain labels and textfields depending on what mode is being simulated
     */
    public void tSwitch(boolean b)
    {
        jLabel1.setVisible(b);
        jLabel2.setVisible(b);
        jLabel3.setVisible(b);
        jLabel4.setVisible(b);
        jLabel5.setVisible(b);
        jtK.setVisible(b);
        jtM.setVisible(b);
        jtAMP.setVisible(b);
        jtW.setVisible(b);
        jtPS.setVisible(b);
        jLabel10.setVisible(b);
        jLabel18.setVisible(b);
        jLabel9.setVisible(b);
        jLabel13.setVisible(b);
        jLabel14.setVisible(b);
        jLabel15.setVisible(b);
        jLabel16.setVisible(b);
        jLabel17.setVisible(b);
        
        jLabel6.setVisible(!b);
        jLabel7.setVisible(!b);
        jLabel8.setVisible(!b);
        jtL.setVisible(!b);
        jtG.setVisible(!b);
        jtTHETA.setVisible(!b);
    }
    //All of the code until line 507 has been generated automatically through the IDE

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupType = new javax.swing.ButtonGroup();
        degrad = new javax.swing.ButtonGroup();
        springRadioButton = new javax.swing.JRadioButton();
        pendulumRadioButton = new javax.swing.JRadioButton();
        radButton = new javax.swing.JRadioButton();
        degButton = new javax.swing.JRadioButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtM = new javax.swing.JTextField();
        jtK = new javax.swing.JTextField();
        jtAMP = new javax.swing.JTextField();
        jtW = new javax.swing.JTextField();
        jtPS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtL = new javax.swing.JTextField();
        jtG = new javax.swing.JTextField();
        jtTHETA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        springRadioButton.setSelected(true);
        springRadioButton.setText("Spring");
        springRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                springRadioButtonActionPerformed(evt);
            }
        });

        pendulumRadioButton.setText("Pendulum");
        pendulumRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendulumRadioButtonActionPerformed(evt);
            }
        });

        radButton.setSelected(true);
        radButton.setText("Radian");
        radButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radButtonActionPerformed(evt);
            }
        });

        degButton.setText("Degree");
        degButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("m:");

        jLabel2.setText("k:");

        jLabel3.setText("amp:");

        jLabel4.setText("ω:");

        jLabel5.setText("ϕ:");

        jtM.setText(String.valueOf(s.getM()));
        jtM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMActionPerformed(evt);
            }
        });

        jtK.setText(String.valueOf(s.getK()));
        jtK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtKActionPerformed(evt);
            }
        });

        jtAMP.setText(String.valueOf(s.getAmp()));
        jtAMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAMPActionPerformed(evt);
            }
        });

        jtW.setText(String.valueOf(s.getW()));
        jtW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtWActionPerformed(evt);
            }
        });

        jtPS.setText(String.valueOf(s.getPS()));
        jtPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPSActionPerformed(evt);
            }
        });

        jLabel6.setText("l:");

        jLabel7.setText("g:");

        jLabel8.setText("θ:");

        jtL.setText(String.valueOf(s.getL()));
        jtL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLActionPerformed(evt);
            }
        });

        jtG.setText(String.valueOf(s.getG()));
        jtG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtGActionPerformed(evt);
            }
        });

        jtTHETA.setText(String.valueOf(s.getTheta()));
        jtTHETA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTHETAActionPerformed(evt);
            }
        });

        jLabel9.setText("F:");

        jLabel10.setText(String.valueOf(s.getF()));

        jLabel13.setText("Ue:");

        jLabel14.setText(String.valueOf(s.getUe()));

        jLabel15.setText("Ke:");

        jLabel16.setText(String.valueOf(s.getKe()));

        jLabel17.setText("E:");

        jLabel18.setText(String.valueOf(s.getE()));

        jLabel19.setText("x:");

        jLabel20.setText(String.valueOf(s.getX()));

        jLabel21.setText("v:");

        jLabel22.setText(String.valueOf(s.getV()));

        jLabel23.setText("a:");

        jLabel24.setText(String.valueOf(s.getA()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(springRadioButton)
                            .addComponent(pendulumRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radButton)
                            .addComponent(degButton))
                        .addGap(39, 39, 39))))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtM, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jtPS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jtW, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtAMP, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtK, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jtG, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jtTHETA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)))
                .addGap(253, 253, 253)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(springRadioButton)
                    .addComponent(radButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pendulumRadioButton)
                    .addComponent(degButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtAMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtW, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtTHETA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 467, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
    This section is the Action Performed section
    When an action is performed that relates to the components on the screen, such as a button being pressed, the function corresponding to that element will be called
    It is similar to the onEvent() function in JavaScript, and is called within the automatically generated code above
     */

    private void springRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_springRadioButtonActionPerformed
        type = 1;
        tSwitch(true);
    }//GEN-LAST:event_springRadioButtonActionPerformed

    private void pendulumRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendulumRadioButtonActionPerformed
        type = 2;
        tSwitch(false);
    }//GEN-LAST:event_pendulumRadioButtonActionPerformed

    private void radButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radButtonActionPerformed
        s.setIsRad(true);
        double theta = Double.parseDouble(jtTHETA.getText());
        System.out.println(theta);
        theta = Math.toRadians(theta);
        System.out.println(theta);
        jtTHETA.setText(String.valueOf(s.setTheta(String.valueOf(theta))));
        repaint();
    }//GEN-LAST:event_radButtonActionPerformed

    private void degButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degButtonActionPerformed
        s.setIsRad(false);
        double theta = Double.parseDouble(jtTHETA.getText());
        System.out.println(theta);
        theta = Math.toDegrees(theta);
        System.out.println(theta);
        jtTHETA.setText(String.valueOf(s.setTheta(String.valueOf(theta))));
        repaint();
    }//GEN-LAST:event_degButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        NewJFrame.clear(this, new Menu());
    }//GEN-LAST:event_backButtonActionPerformed

    private void jtMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMActionPerformed
        jtM.setText(String.valueOf(s.setM(jtM.getText())));
        repaint();
    }//GEN-LAST:event_jtMActionPerformed

    private void jtKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtKActionPerformed
        jtK.setText(String.valueOf(s.setK(jtK.getText())));
        repaint();
    }//GEN-LAST:event_jtKActionPerformed

    private void jtAMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAMPActionPerformed
        jtAMP.setText(String.valueOf(s.setAmp(jtAMP.getText())));
        repaint();
    }//GEN-LAST:event_jtAMPActionPerformed

    private void jtWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtWActionPerformed
        jtW.setText(String.valueOf(s.setW(jtW.getText())));
        repaint();
    }//GEN-LAST:event_jtWActionPerformed

    private void jtPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPSActionPerformed
        jtPS.setText(String.valueOf(s.setPS(jtPS.getText())));
        repaint();
    }//GEN-LAST:event_jtPSActionPerformed

    private void jtLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLActionPerformed
        jtL.setText(String.valueOf(s.setL(jtL.getText())));
        repaint();
    }//GEN-LAST:event_jtLActionPerformed

    private void jtGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtGActionPerformed
        jtG.setText(String.valueOf(s.setG(jtG.getText())));
        repaint();
    }//GEN-LAST:event_jtGActionPerformed

    private void jtTHETAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTHETAActionPerformed
        jtTHETA.setText(String.valueOf(s.setTheta(jtTHETA.getText())));
        repaint();
    }//GEN-LAST:event_jtTHETAActionPerformed

    /*
    All of the code beyond this point is variable declarations auto-generated by the IDE
    There exists one button: the back button - intended to bring the user back to the main screen

    There are four radio buttons and two button groups
    One group is for selecting what type of SHM will be conducted: with a spring or with a pendulum
    The other group is for selecting whether the angle at which the pendulum swings is in degrees or radians

    The JLabels were generated and named automatically
    They display snippets of texts, such as the variable in the simulation and the value of it (if uneditable)
    They have little code associated with them that I manually typed, so renaming them was unnecessary

    The JTextFields are fields that can the user can type a number into
    They are renamed to represent which variable they are associated with
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JRadioButton degButton;
    private javax.swing.ButtonGroup degrad;
    private javax.swing.ButtonGroup groupType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtAMP;
    private javax.swing.JTextField jtG;
    private javax.swing.JTextField jtK;
    private javax.swing.JTextField jtL;
    private javax.swing.JTextField jtM;
    private javax.swing.JTextField jtPS;
    private javax.swing.JTextField jtTHETA;
    private javax.swing.JTextField jtW;
    private javax.swing.JRadioButton pendulumRadioButton;
    private javax.swing.JRadioButton radButton;
    private javax.swing.JRadioButton springRadioButton;
    // End of variables declaration//GEN-END:variables
}
