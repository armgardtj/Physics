import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.*;
import java.io.*;
/**
 * Kinematics.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Kinematics extends JPanel implements MouseListener, ActionListener 
{
    private Double a, a0, v, v0, x, x0, y, y0;
    private JButton standard, bomb, ff;
    
    private static final long serialVersionUID = 1L;
    private static JFrame frame;
    private JPanel buttonPanel, wrapperPanel;
    private static PhysMenu phys = new PhysMenu();
    public Kinematics()
    {
        standard = new JButton("Standard");
        standard.addActionListener(this);
        bomb = new JButton("Bomber");
        bomb.addActionListener(this);
        ff = new JButton("Free Fall");
        ff.addActionListener(this);
        this.add(standard);
        this.add(bomb);
        this.add(ff);
    }
    
    public void mousePressed(MouseEvent me){
        
    }
    
    public void mouseClicked(MouseEvent me){
        
    }
    
    public void mouseReleased(MouseEvent me) {

    }

    public void mouseEntered(MouseEvent me) {

    }

    public void mouseExited(MouseEvent me) {

    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(standard)){
            
        }
        if (ae.getSource().equals(bomb)){
            
        }
        if (ae.getSource().equals(ff)){
            
        }
    }
    private class Standard{}
    private class Bomber{}
    private class FreeFall{}
}
