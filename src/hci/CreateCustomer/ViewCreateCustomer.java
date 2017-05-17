package hci.CreateCustomer;

import javax.swing.*;
import hci.MainWindow;
import core.CustomerBase;
import java.awt.*;

public class ViewCreateCustomer extends JPanel
{
		//Definition of attributes for form
		
		//Form for customer information
		private JLabel labelNewCustomer = new JLabel("Create a new customer : ");
		private JLabel labelProfessional = new JLabel("Professional* : ");
		private JPanel choixPro = new JPanel(new GridLayout(1,2));
		private ButtonGroup bg = new ButtonGroup();
		private JRadioButton choixOui = new JRadioButton("Yes");
		private JRadioButton choixNon = new JRadioButton("No");
		private JLabel labelName = new JLabel ("Name * : ");
		private JTextField textName = new JTextField();
		private JLabel labelCorporateName = new JLabel ("Corporate name : ");
		private JTextField textCorporateName = new JTextField();
		private JLabel labelTown = new JLabel("Town * : ");
		private JTextField textTown = new JTextField();
		private JLabel labelPhoneNumber = new JLabel("Phone number * : ");
		private JTextField textPhoneNumber = new JTextField();
		private JLabel labelFaxNumber = new JLabel("Fax number * : ");
		private JTextField textFaxNumber = new JTextField();
		private JLabel labelCellPhone = new JLabel("Cell phone * : ");
		private JTextField textCellPhone = new JTextField ();
		
		//Payment form (for professional only)
		private JLabel labelPayment = new JLabel ("Payment : ");
		private JLabel labelInvoicingAddress = new JLabel("Invoicing address : ");
		private JTextField textInvoicingAddress = new JTextField();
		private JLabel labelInvoicingContact = new JLabel("Invoicing contact : ");
		private JTextField textInvoicingContact = new JTextField();
		
		//Internet services form (for professional only)
		private JLabel labelInternetServices = new JLabel ("Internet services : ");
		private JLabel labelLogin = new JLabel ("Login * : ");
		private JTextField textLogin = new JTextField ();
		private JLabel labelPassword = new JLabel ("Password * : ");
		private JTextField textPassword = new JTextField();
		private JLabel labelEmail = new JLabel ("Mail : ");
		private JTextField textEmail = new JTextField();
		
		//Information about mandatory fields
		private JLabel labelChamps = new JLabel("* : mandatory fields");
		
		//Button to submit the information
		private JButton buttonSubmit = new JButton ("Submit");
		private ControlerCreateCustomer evt;
			
		/**
		 * Constructor
		 */
		public ViewCreateCustomer(CustomerBase base)
		{	
				//Definition of fonts and colors 
		        labelNewCustomer.setFont(new Font("Lucida Fax", Font.BOLD, 20));
		        labelNewCustomer.setForeground(new Color(89,148,60));
		        labelProfessional.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelProfessional.setForeground(new Color(89,148,60));
		        labelName.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelName.setForeground(new Color(89,148,60));
		        labelCorporateName.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelCorporateName.setForeground(new Color(89,148,60));
		        labelTown.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelTown.setForeground(new Color(89,148,60));
		        labelPhoneNumber.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelPhoneNumber.setForeground(new Color(89,148,60));
		        labelFaxNumber.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelFaxNumber.setForeground(new Color(89,148,60));
		        labelCellPhone.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelCellPhone.setForeground(new Color(89,148,60));
	        
		        labelPayment.setFont(new Font("Lucida Fax", Font.BOLD, 20));
		        labelPayment.setForeground(new Color(89,148,60));
		        labelInvoicingAddress.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelInvoicingAddress.setForeground(new Color(89,148,60));
		        labelInvoicingContact.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelInvoicingContact.setForeground(new Color(89,148,60));
		        
		        labelInternetServices.setFont(new Font("Lucida Fax", Font.BOLD, 20));
		        labelInternetServices.setForeground(new Color(89,148,60));
		        labelLogin.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelLogin.setForeground(new Color(89,148,60));
		        labelPassword.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelPassword.setForeground(new Color(89,148,60));
		        labelEmail.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
		        labelEmail.setForeground(new Color(89,148,60));
		        
		        labelChamps.setFont(new Font("Lucida Fax", Font.PLAIN, 10));
		        labelChamps.setForeground(new Color(255,0,0));
		        
		        
				//Definition of font, foreground and background 
		        buttonSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		        buttonSubmit.setForeground(new Color(255,255,255));
		        buttonSubmit.setBackground(new Color(89,148,60));
		        
		        //Listeners for buttons action
		        evt = new ControlerCreateCustomer(this,base);
		        buttonSubmit.addMouseListener(evt);
		        
		        //Add radiobutton to panel choixPro
		        bg.add(choixOui);
		        bg.add(choixNon);
		        choixPro.add(choixOui);
		        choixPro.add(choixNon);
		        
		        //Creation of a gridbaglayout
		        this.setLayout(new GridBagLayout());
		        GridBagConstraints c = new GridBagConstraints();

		        //Position of labels
		        c.weighty = 1;
		        c.weightx = 1;
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 1;
		        this.add(labelNewCustomer, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 2;
		        this.add(labelProfessional, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 3;
		        this.add(labelName, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 4;
		        this.add(labelCorporateName, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 5;
		        this.add(labelTown, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 6;
		        this.add(labelPhoneNumber, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 7;
		        this.add(labelFaxNumber, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 8;
		        this.add(labelCellPhone, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 10;
		        this.add(labelPayment, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 11;
		        this.add(labelInvoicingAddress, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 12;
		        this.add(labelInvoicingContact, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 14;
		        this.add(labelInternetServices, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 15;
		        this.add(labelLogin, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 16;
		        this.add(labelPassword, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 17;
		        this.add(labelEmail, c);
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 1;
		        c.gridy = 19;
		        this.add(labelChamps, c);
		        
		        //Position of checkbox
		        c.ipady = 30;
		        c.ipadx = 90;
		        c.gridx = 2;
		        c.gridy = 2;
		        this.add(choixPro, c);
		        
		        //Position of text field
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 3;
		        this.add(textName, c);
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 4;
		        this.add(textCorporateName, c);
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 5;
		        this.add(textTown, c);
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 6;
		        this.add(textPhoneNumber, c);
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 7;
		        this.add(textFaxNumber, c);
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 8;
		        this.add(textCellPhone, c);
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 11;
		        this.add(textInvoicingAddress, c);
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 12;
		        this.add(textInvoicingContact, c);
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 15;
		        this.add(textLogin, c);
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 16;
		        this.add(textPassword, c);
		        c.ipady = 10;
		        c.ipadx = 300;
		        c.gridx = 2;
		        c.gridy = 17;
		        this.add(textEmail, c);
		        
		        //Position of button
		        c.ipady = 50;
		        c.ipadx = 90;
		        c.gridx = 4;
		        c.gridy = 22;
		        c.anchor = GridBagConstraints.SOUTHEAST;
		        this.add(buttonSubmit, c);
		}

		//Getters
		public JTextField getTextName(){		

			return textName;
		}
		
		public JTextField getTextCorporateName(){		

			return textCorporateName;
		}
		
		public JTextField getTextTown(){		

			return textTown;
		}
		
		public JTextField getTextPhoneNumber(){		

			return textPhoneNumber;
		}
		
		public JTextField getTextFaxNumber(){		

			return textFaxNumber;
		}
		
		public JTextField getTextCellPhone(){		

			return textCellPhone;
		}
		
		public JTextField getTextInvoicingAddress(){		

			return textInvoicingAddress;
		}
		
		public JTextField getTextInvoicingContact(){		

			return textInvoicingContact;
		}
		
		public JTextField getTextLogin(){		

			return textLogin;
		}
		
		public JTextField getTextPassword(){		

			return textPassword;
		}
		
		public JTextField getTextEmail(){		

			return textEmail;
		}
		
		public JButton getButtonSubmit(){		

			return buttonSubmit;
		}
		
		public JRadioButton getChoixOui(){
			return choixOui;
		}
		
		public JRadioButton getChoixNon(){
			return choixNon;
		}
		
		
		public static void main(String[] args){
			CustomerBase aBase = new CustomerBase();
			MainWindow w = new MainWindow();
			w.setContent(new ViewCreateCustomer(aBase));
		}
	}

