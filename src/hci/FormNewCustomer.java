package hci;

import javax.swing.*;
import java.awt.*;

public class FormNewCustomer extends JPanel {

	
	private JLabel labelNewCustomer = new JLabel("Créer un nouveau client : ");
	private JLabel labelProfessionnal = new JLabel("Professionnel* : ");
	private JPanel choixPro = new JPanel(new GridLayout(1,2));
	private JLabel labelName = new JLabel ("Nom* : ");
	private JTextField textName = new JTextField();
	private JLabel labelCorporateName = new JLabel ("Raison sociale : ");
	private JTextField textCorporateName = new JTextField();
	private JLabel labelTown = new JLabel("Ville* : ");
	private JTextField textTown = new JTextField();
	private JLabel labelPhoneNumber = new JLabel("Téléphone* : ");
	private JTextField textPhoneNumber = new JTextField();
	private JLabel labelFaxNumber = new JLabel("Fax* : ");
	private JTextField textFaxNumber = new JTextField();
	private JLabel labelCellPhone = new JLabel("Téléphone portable* : ");
	private JTextField textCellPhone = new JTextField ();
	
	private JLabel labelPayment = new JLabel ("Paiement : ");
	private JLabel labelInvoicingAddress = new JLabel("Adresse de facturation : ");
	private JTextField textInvoicingAddress = new JTextField();
	private JLabel labelInvoicingContact = new JLabel("Nom de facturation : ");
	private JTextField textInvoicingContact = new JTextField();
	
	private JLabel labelInternetServices = new JLabel ("Services web : ");
	private JLabel labelLogin = new JLabel ("Identifiant : ");
	private JTextField textLogin = new JTextField ();
	private JLabel labelPassword = new JLabel ("Mot de passe : ");
	private JTextField textPassword = new JTextField();
	private JLabel labelEmail = new JLabel ("Email : ");
	private JTextField textEmail = new JTextField();
	
	private JLabel labelChamps = new JLabel("* : champs obligatoires");
	
	private JButton buttonSubmit = new JButton ("Valider");
	
	
	
	public FormNewCustomer() {
		
//	        buttonRetour.setFont(new Font("Lucida Fax", Font.BOLD, 28));
//	        buttonRetour.setForeground(new Color(89,148,60));
//	        buttonRetour.setBackground(new Color(255,255,255));
//	        labelTitre.setFont(new Font("Lucida Fax", Font.BOLD, 28));
//	        labelTitre.setForeground(new Color(89,148,60));
//	        labelIdentifiant.setFont(new Font("Lucida Fax", Font.BOLD, 28));
//	        labelIdentifiant.setForeground(new Color(89,148,60));
//	        labelMdp.setFont(new Font("Lucida Fax", Font.BOLD, 28));
//	        labelMdp.setForeground(new Color(89,148,60));
	        buttonSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 28));
	        buttonSubmit.setForeground(new Color(255,255,255));
	        buttonSubmit.setBackground(new Color(89,148,60));
	        
	        this.setLayout(new GridBagLayout());
	        GridBagConstraints c = new GridBagConstraints();

	        c.weighty = 1;
	        c.weightx = 1;
	        c.gridx = 1;
	        c.gridy = 1;
	        this.add(labelNewCustomer, c);
	        //c.anchor = GridBagConstraints.CENTER;
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 2;
	        this.add(labelProfessionnal, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 3;
	        this.add(labelName, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 4;
	        this.add(labelCorporateName, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 5;
	        this.add(labelTown, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 6;
	        this.add(labelPhoneNumber, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 7;
	        this.add(labelFaxNumber, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 8;
	        this.add(labelCellPhone, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 10;
	        this.add(labelPayment, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 11;
	        this.add(labelInvoicingAddress, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 12;
	        this.add(labelInvoicingContact, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 14;
	        this.add(labelInternetServices, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 15;
	        this.add(labelLogin, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 16;
	        this.add(labelPassword, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 17;
	        this.add(labelEmail, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 1;
	        c.gridy = 19;
	        this.add(labelChamps, c);
	        
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 2;
	        this.add(choixPro, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 3;
	        this.add(textName, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 4;
	        this.add(textCorporateName, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 5;
	        this.add(textTown, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 6;
	        this.add(textPhoneNumber, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 7;
	        this.add(textFaxNumber, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 8;
	        this.add(textCellPhone, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 11;
	        this.add(textInvoicingAddress, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 12;
	        this.add(textInvoicingContact, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 15;
	        this.add(textLogin, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 16;
	        this.add(textPassword, c);
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 2;
	        c.gridy = 17;
	        this.add(textEmail, c);
	        
	        c.ipady = 50;
	        c.ipadx = 90;
	        c.gridx = 4;
	        c.gridy = 22;
	        c.anchor = GridBagConstraints.SOUTHEAST;
	        this.add(buttonSubmit, c);
	}
	
}
