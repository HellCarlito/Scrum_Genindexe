package hci.CreateCategory;

import javax.swing.*;
import hci.MainWindow;
import hci.CreateCategory.ControlerCreateCategory;
import hci.CreateCategory.ViewCreateCategory;
import core.SpecieCategory;
import java.awt.*;

public class ViewCreateCategory extends JPanel{

	
	//Definition of attributes for form
	
	//Form for customer information
	private JLabel labelNewSpecie = new JLabel("Create a new specie : ");
	private JLabel labelNameSpecie = new JLabel("Name of the specie : ");
	private JTextField textNameSpecie = new JTextField();
	private JButton buttonSubmit = new JButton("Submit");
	
	/**
	 * Constructor
	 */
	public ViewCreateCategory(SpecieCategory base){
		
		//Definition of fonts and colors 
        labelNewSpecie.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        labelNewSpecie.setForeground(new Color(89,148,60));
        labelNameSpecie.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        labelNameSpecie.setForeground(new Color(89,148,60));
        
      //Definition of font, foreground and background 
        buttonSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 18));
        buttonSubmit.setForeground(new Color(255,255,255));
        buttonSubmit.setBackground(new Color(89,148,60));
        
        //Listeners for buttons action
     //   evt = new ControlerCreateCategory(this,base);
     //  buttonSubmit.addMouseListener(evt);
        
        //Creation of a gridbaglayout
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //Position of labels
        c.weighty = 1;
        c.weightx = 1;
        c.ipady = 30;
        c.ipadx = 90;
        c.gridx = 2;
        c.gridy = 1;
        this.add(labelNewSpecie, c);
        c.ipady = 30;
        c.ipadx = 90;
        c.gridx = 1;
        c.gridy = 2;
        this.add(labelNameSpecie, c);
        
      //Position of text field
        c.ipady = 10;
        c.ipadx = 300;
        c.gridx = 2;
        c.gridy = 2;
        this.add(textNameSpecie, c);
        
      //Position of button
        c.ipady = 30;
        c.ipadx = 50;
        c.gridx = 4;
        c.gridy = 5;
        c.anchor = GridBagConstraints.SOUTHEAST;
        this.add(buttonSubmit, c);
	}
	
	//Getters
	public JTextField getTextNameCatSpecie(){		
		return textNameSpecie;
	}
	
	public JButton getButtonSubmit(){		

		return buttonSubmit;
	}
	
	public static void main(String[] args){
		MainWindow w = new MainWindow();
		//w.setContent(new ViewCreateCategory(aBase));
	}

}
