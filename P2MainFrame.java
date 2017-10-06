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
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class P2MainFrame extends JFrame 
{
    private JLabel fName, lName, clName;
    private JTextField fNameText, lNameText, clNameText;
    private JButton showBtn;
    private JButton updateBtn;
    private JButton exitBtn;
    
    public P2MainFrame()
    {
   //creating components and adding them to the first JPanel
        fName = new JLabel("First Name:");
        fNameText = new JTextField(15);
        JPanel fNamePanel = new JPanel();
        fNamePanel.add(fName);
        fNamePanel.add(fNameText);
       
   //creating components and adding them to the second JPanel
        lName = new JLabel("Last Name:");
        lNameText = new JTextField(15);
        JPanel lNamePanel = new JPanel();
        lNamePanel.add(lName);
        lNamePanel.add(lNameText);
        
   //creating components and adding them to the third JPanel
        clName = new JLabel("Class:       ");
        clNameText = new JTextField(15);
        JPanel clNamePanel = new JPanel();
        clNamePanel.add(clName);
        clNamePanel.add(clNameText);
        
   //creating components and adding them to the fourth JPanel
        showBtn = new JButton("Show Results");
        updateBtn = new JButton("Update");
        exitBtn = new JButton("Exit");
        JPanel btnPanel = new JPanel();
        btnPanel.add(showBtn);
        btnPanel.add(updateBtn);
        btnPanel.add(exitBtn);
        
   //creating the main JPanel that will contain the 4 previous JPanels
        JPanel mainPanel = new JPanel();
        mainPanel.add(fNamePanel);
        mainPanel.add(lNamePanel);
        mainPanel.add(clNamePanel);
        mainPanel.add(btnPanel);
        mainPanel.setLayout(new GridLayout(4,1)); 
        
   //JFrame that contains the main JPanel
        JFrame P2Frame = new JFrame("");
        P2Frame.getContentPane().add(mainPanel);
        P2Frame.setSize(400,200);
        P2Frame.setVisible(true);
        P2Frame.setResizable(false);
         
   //Instantiating the ResultsFrame
        ResultsFrame infoFrame = new ResultsFrame();
        infoFrame.setLocation(200,200);
        
   //adding an ActionListener to the show results button --- displays the second JFrame
        showBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(showBtn.getText().equals("Show Results"))
                  {                    
                          infoFrame.setVisible(true);
                         showBtn.setText("Hide Results"); 
                  }
                  else if(showBtn.getText().equals("Hide Results"))
                       {
                             infoFrame.setVisible(false);
                             showBtn.setText("Show Results");
                       }
            }
        });
        
   //adding an ActionListener to the update button --- updates the results on the second JFrame
        updateBtn.addActionListener(new ActionListener() 
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                      if(e.getSource() == updateBtn)
                        {
                          infoFrame.getInfoText().setText(getfName().getText() + " "
                          + getfNameText().getText() + "\n" + "\n" + getlName().getText() + " "
                          + getlNameText().getText() + "\n" + "\n" + getClName().getText() + "  "
                          + getClNameText().getText());
                        }
                    }
                });
   
   //adding an ActionListener to the exit button --- terminates the program when pressed
        exitBtn.addActionListener(new ActionListener()
        {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                     System.exit(0);
                }           
        });
             
   //Adding a WindowListener to the second JFrame
        infoFrame.addWindowListener(new WindowAdapter()
        {
           @Override
           public void windowClosing(WindowEvent e)
           {
                 showBtn.setText("Show Results");
                 infoFrame.setDefaultCloseOperation(HIDE_ON_CLOSE);
           }
        });
    }  
    
   //getters for JLabels
    public JLabel getfName() 
    {
         return fName;
    }

    public JLabel getlName() 
    {
         return lName;
    }

    public JLabel getClName() 
    {
         return clName;
    } 
    
    //getters for JTextFields

    public JTextField getfNameText() 
    {
         return fNameText;
    }

    public JTextField getlNameText() 
    {
         return lNameText;
    }

    public JTextField getClNameText() 
    {
         return clNameText;
    }
}
