/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author John
 */
public class NewJFrame extends JFrame {
    private static JFrame frame;
    public static void main (String[] args)
    {
        frame = new JFrame();
        frame.add(new Menu());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(1000,1000));
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
    }
    public static void clear(JPanel p1, JPanel p2){
        frame.remove(p1);
        frame.add(p2);
        frame.pack();
    }
}
