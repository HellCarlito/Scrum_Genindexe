package hci.CreateCategory;

import javax.swing.*;
import hci.MainWindow;
import hci.CreateCategory.ControlerCreateCategory;
import core.IntegrationTest;
import java.awt.*;


public class ViewCreateCategory extends JPanel{
	//Definition of attributes for form
	
	//Form for category information
	private JLabel labelNewCategory = new JLabel("Create a new category of specie : ");
	private JLabel labelNameCategory = new JLabel("Name of the category : ");
	private JTextField textNameCategory = new JTextField();
	private JButton buttonSubmit = new JButton("Submit");
	private ControlerCreateCategory evt;
	
	/**
	 * Constructor
	 */
	public ViewCreateCategory(IntegrationTest base, MainWindow w){
		
		//Definition of fonts and colors 
        labelNewCategory.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        labelNewCategory.setForeground(new Color(89,148,60));
        labelNameCategory.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        labelNameCategory.setForeground(new Color(89,148,60));
        
      //Definition of font, foreground and background 
        buttonSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 18));
        buttonSubmit.setForeground(new Color(255,255,255));
        buttonSubmit.setBackground(new Color(89,148,60));
        
        //Listeners for buttons action
       evt = new ControlerCreateCategory(this,base);
       buttonSubmit.addActionListener(evt);
        
        //Creation of a gridbaglayout
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //Position of labels
        c.weighty = 1;
        c.weightx = 1;
        c.ipady = 30;
        c.ipadx = 90;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        this.add(labelNewCategory, c);
        c.gridwidth = 1;
        c.ipady = 30;
        c.ipadx = 90;
        c.gridx = 1;
        c.gridy = 2;
        this.add(labelNameCategory, c);

        //Position of text field
        c.ipady = 10;
        c.ipadx = 300;
        c.gridx = 2;
        c.gridy = 2;
        this.add(textNameCategory, c);

        //Position of button
        c.gridwidth = 3;
        c.ipady = 30;
        c.ipadx = 50;
        c.gridx = 2;
        c.gridy = 5;
        c.anchor = GridBagConstraints.SOUTHEAST;
        this.add(buttonSubmit, c);

        w.setContent(this);
	}
	
	//Getters
	public JTextField getTextNameCatSpecie(){		
		return textNameCategory;
	}
	
	public JButton getButtonSubmit(){		

		return buttonSubmit;
	}
	
	public static void main(String[] args){
		IntegrationTest aBase = new IntegrationTest();
		MainWindow w = new MainWindow(aBase);
		w.setContent(new ViewCreateCategory(aBase, w));
	}

}
