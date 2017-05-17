package hci.CreateMicroplate;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import core.IntegrationTest;
import hci.MainWindow;
import hci.CreateCategory.ControlerCreateCategory;
import hci.CreateCategory.ViewCreateCategory;

public class ViewCreateMicroplate  extends JPanel{
	
	//Form for category information
		private JLabel labelNewMicroplate = new JLabel("Create a new category of specie : ");
		private JButton buttonSubmit = new JButton("Submit");
		private ControlerCreateMicroplate evt;
		
		/**
		 * Constructor
		 */
		public ViewCreateMicroplate(IntegrationTest base){
			
			//Definition of fonts and colors 
			labelNewMicroplate.setFont(new Font("Lucida Fax", Font.BOLD, 20));
			labelNewMicroplate.setForeground(new Color(89,148,60));
	        
	      //Definition of font, foreground and background 
	        buttonSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 18));
	        buttonSubmit.setForeground(new Color(255,255,255));
	        buttonSubmit.setBackground(new Color(89,148,60));
	        
	        //Listeners for buttons action
	       evt = new ControlerCreateMicroplate(this,base);
	       buttonSubmit.addActionListener(evt);
	        
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
	        this.add(labelNewMicroplate, c);
	        c.ipady = 30;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 2;
	        this.add(labelNewMicroplate, c);
	        
	      //Position of button
	        c.ipady = 30;
	        c.ipadx = 50;
	        c.gridx = 4;
	        c.gridy = 5;
	        c.anchor = GridBagConstraints.SOUTHEAST;
	        this.add(buttonSubmit, c);
		}
		
		
		
		public JButton getButtonSubmit(){		

			return buttonSubmit;
		}
		
		public static void main(String[] args){
			IntegrationTest aBase = new IntegrationTest();
			MainWindow w = new MainWindow();
			w.setContent(new ViewCreateCategory(aBase));
		}

}
