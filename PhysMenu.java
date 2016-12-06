import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.*;
import java.io.*;
import static java.awt.GraphicsDevice.WindowTranslucency.*;

public class PhysMenu extends JPanel implements ActionListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static JFrame frame;
    private JButton kine, force, energy, momentum;
    private JPanel buttonPanel, wrapperPanel;
    private static PhysMenu phys = new PhysMenu();

    public static void main(String[] args) {
        phys = new PhysMenu();
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.add(phys);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

    }
    
    public void paintComponent(Graphics g) {
        setBackground(Color.yellow);
    }
    
    public PhysMenu() {
        
        
        // this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        kine = new JButton("Kinematics");
        // RPS.setAlignmentX(Component.CENTER_ALIGNMENT);
        // RPS.setAlignmentY(Component.CENTER_ALIGNMENT);
        kine.addActionListener(this);

        force = new JButton("Forces");
        // Chopsticks.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Chopsticks.setAlignmentY(Component.CENTER_ALIGNMENT);
        force.addActionListener(this);

        energy = new JButton("Energy");
        // TTT.setAlignmentX(Component.CENTER_ALIGNMENT);
        // TTT.setAlignmentY(Component.CENTER_ALIGNMENT);
        energy.addActionListener(this);
        
        momentum = new JButton("Momentum");
        momentum.addActionListener(this);

        buttonPanel = new JPanel(new GridLayout(4, 1));
        // buttonPanel.setLayout();
        buttonPanel.add(kine);
        // buttonPanel.add(Box.createVerticalStrut(10));
        buttonPanel.add(force);
        // buttonPanel.add(Box.createVerticalStrut(10));
        buttonPanel.add(energy);
        buttonPanel.add(momentum);

        wrapperPanel = new JPanel(new GridBagLayout());
        wrapperPanel.setPreferredSize(new Dimension(350, 400));
        wrapperPanel.add(buttonPanel);
        wrapperPanel.setBackground(Color.yellow);
        buttonPanel.setBackground(Color.yellow);
        this.add(wrapperPanel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(kine)) {
            frame.remove(phys);
            Kinematics k = new Kinematics();
            frame.add(k);
            frame.pack();
        }
        if (ae.getSource().equals(force)) {
            frame.remove(phys);
            Forces f = new Forces();
            frame.add(f);
            frame.pack();
        }
        if (ae.getSource().equals(energy)) {
            frame.remove(phys);
            Energy e = new Energy();
            frame.add(e);
            frame.pack();
        }
        if (ae.getSource().equals(momentum)){
            frame.remove(phys);
            Momentum m = new Momentum();
            frame.add(m);
            frame.pack();
        }
    }
}