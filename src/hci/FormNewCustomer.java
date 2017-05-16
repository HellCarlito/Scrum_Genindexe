package hci;

import javax.swing.*;
import java.awt.*;

public class FormNewCustomer extends JPanel {

	//D�finition des attributs pour le formulaire
	
	//Formulaire des informations propres au client
	private JLabel labelNewCustomer = new JLabel("Cr�er un nouveau client : ");
	private JLabel labelProfessionnal = new JLabel("Professionnel* : ");
	private JPanel choixPro = new JPanel(new GridLayout(1,2));
	private JRadioButton choixOui = new JRadioButton("Oui");
	private JRadioButton choixNon = new JRadioButton("Non");
	private JLabel labelName = new JLabel ("Nom* : ");
	private JTextField textName = new JTextField();
	private JLabel labelCorporateName = new JLabel ("Raison sociale : ");
	private JTextField textCorporateName = new JTextField();
	private JLabel labelTown = new JLabel("Ville* : ");
	private JTextField textTown = new JTextField();
	private JLabel labelPhoneNumber = new JLabel("T�l�phone* : ");
	private JTextField textPhoneNumber = new JTextField();
	private JLabel labelFaxNumber = new JLabel("Fax* : ");
	private JTextField textFaxNumber = new JTextField();
	private JLabel labelCellPhone = new JLabel("T�l�phone portable* : ");
	private JTextField textCellPhone = new JTextField ();
	
	//Formulaire des informations de paiement (uniquement pour les professionnels)
	private JLabel labelPayment = new JLabel ("Paiement : ");
	private JLabel labelInvoicingAddress = new JLabel("Adresse de facturation : ");
	private JTextField textInvoicingAddress = new JTextField();
	private JLabel labelInvoicingContact = new JLabel("Nom de facturation : ");
	private JTextField textInvoicingContact = new JTextField();
	
	//Formulaire des informations de cr�ation de compte web (uniquement pour les professionnels)
	private JLabel labelInternetServices = new JLabel ("Services web : ");
	private JLabel labelLogin = new JLabel ("Identifiant : ");
	private JTextField textLogin = new JTextField ();
	private JLabel labelPassword = new JLabel ("Mot de passe : ");
	private JTextField textPassword = new JTextField();
	private JLabel labelEmail = new JLabel ("Email : ");
	private JTextField textEmail = new JTextField();
	
	private JLabel labelChamps = new JLabel("* : champs obligatoires");
	
	private JButton buttonSubmit = new JButton ("Valider");
	
	
	
	/**
	 * Constructeur
	 */
	public FormNewCustomer() {
		
	        labelNewCustomer.setFont(new Font("Lucida Fax", Font.BOLD, 20));
	        labelNewCustomer.setForeground(new Color(89,148,60));
	        labelProfessionnal.setFont(new Font("Lucida Fax", Font.PLAIN, 14));
	        labelProfessionnal.setForeground(new Color(89,148,60));
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
	        
	        
			//D�finition de la police, du font et de la couleur du text ou des boutons
	        buttonSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 18));
	        buttonSubmit.setForeground(new Color(255,255,255));
	        buttonSubmit.setBackground(new Color(89,148,60));
	        
	        //Ajout des radio boutons au panel Choix
	        choixPro.add(choixOui);
	        choixPro.add(choixNon);
	        
	        //Cr�ation d'un gridbaglayout
	        this.setLayout(new GridBagLayout());
	        GridBagConstraints c = new GridBagConstraints();

	        //Position des labels
	        c.weighty = 1;
	        c.weightx = 1;
	        c.ipady = 30;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 1;
	        this.add(labelNewCustomer, c);
	        //c.anchor = GridBagConstraints.CENTER;
	        c.ipady = 30;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 2;
	        this.add(labelProfessionnal, c);
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
	        
	        //Position de la checkbox
	        c.ipady = 30;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 2;
	        this.add(choixPro, c);
	        
	        //Position des zones de texte
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
	        
	        //Position du bouton
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 4;
	        c.gridy = 22;
	        c.anchor = GridBagConstraints.SOUTHEAST;
	        this.add(buttonSubmit, c);
	}

	
	public static void main(String[] args){
		new MainWindow(){{setContent(new FormNewCustomer());}};
	}
	
}
