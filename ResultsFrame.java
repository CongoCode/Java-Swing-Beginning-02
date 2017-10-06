/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project02;

/**
 *
 * @author benismunganga
 */
import java.awt.BorderLayout;
import static java.awt.BorderLayout.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ResultsFrame extends JFrame
{  
    private JTextArea infoText;
    public ResultsFrame()
    {
        infoText = new JTextArea();
        JPanel taPanel = new JPanel();
        taPanel.add(infoText);
        infoText.setPreferredSize(new Dimension(200,200));
        this.setLayout(new BorderLayout());
        this.getContentPane().add(taPanel, BorderLayout.CENTER);
        this.setSize(300,300);
        infoText.setEditable(false);
        this.setVisible(false);
    }
    
    
    
    //getter for JTextArea
    public JTextArea getInfoText() 
    {
        return infoText;
    }
}
