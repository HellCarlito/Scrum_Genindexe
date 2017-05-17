package hci.ConnectCustomer;

import javax.swing.*;

import core.CustomerBase;
import core.SpecieCategory;
import hci.MainWindow;
import hci.CreateCustomer.ControlerCreateCustomer;
import hci.CreateCustomer.ViewCreateCustomer;

import java.awt.*;

public class ViewConnectCustomer extends JPanel{

	//Definition of attributes for form

	//Form for customer information
	private JLabel labelConnect = new JLabel("Sign in");
	private JLabel labelLogin = new JLabel("Login : ");
	private JLabel labelPassword = new JLabel("Password : ");
	private JTextField textLogin = new JTextField();
	private JTextField textPassword = new JTextField();
	
	//Button to submit the information
	private JButton buttonSubmit = new JButton("Submit");
	private ControlerConnectCustomer evt;
	
	/**
	 * Constructor
	 */
	public ViewConnectCustomer(CustomerBase base)
	{
		//Definition of fonts and colors 
		labelConnect.setFont(new Font("Lucida Fax", Font.BOLD, 24));
		labelConnect.setForeground(new Color(89,148,60));
        labelLogin.setFont(new Font("Lucida Fax", Font.PLAIN, 18));
        labelLogin.setForeground(new Color(89,148,60));
        labelPassword.setFont(new Font("Lucida Fax", Font.PLAIN, 18));
        labelPassword.setForeground(new Color(89,148,60));
        
      //Definition of font, foreground and background 
        buttonSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        buttonSubmit.setForeground(new Color(255,255,255));
        buttonSubmit.setBackground(new Color(89,148,60));
        
      //Listeners for buttons action
        evt = new ControlerConnectCustomer(this,base);
        buttonSubmit.addMouseListener(evt);
        
      //Creation of a gridbaglayout
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //Position of labels
        c.weighty = 1;
        c.weightx = 1;
        c.ipady = 60;
        c.ipadx = 90;
        c.gridx = 2;
        c.gridy = 1;
        this.add(labelConnect, c);
        c.ipady = 30;
        c.ipadx = 90;
        c.gridx = 1;
        c.gridy = 2;
        this.add(labelLogin, c);
        c.ipady = 20;
        c.ipadx = 90;
        c.gridx = 1;
        c.gridy = 3;
        this.add(labelPassword, c);
        
      //Position of text field
        c.ipady = 20;
        c.ipadx = 300;
        c.gridx = 2;
        c.gridy = 2;
        this.add(textLogin, c);
        
        c.ipady = 20;
        c.ipadx = 300;
        c.gridx = 2;
        c.gridy = 3;
        this.add(textPassword, c);
        
      //Position of button
        c.ipady = 30;
        c.ipadx = 50;
        c.gridx = 4;
        c.gridy = 5;
        c.anchor = GridBagConstraints.SOUTHEAST;
        this.add(buttonSubmit, c);
	}
	
	//Getters
		public JTextField getTextLogin(){		
			return textLogin;
		}
		
		public JTextField getTextPassword(){
			return textPassword;
		}
		
		public JButton getButtonSubmit(){		

			return buttonSubmit;
		}
		
		public static void main(String[] args){
			CustomerBase aBase = new CustomerBase();
			MainWindow w = new MainWindow();
			w.setContent(new ViewConnectCustomer(aBase));

		}
}
