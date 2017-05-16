package hci.CreateCustomer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import core.*;

public class ControlerCreateCustomer extends MouseAdapter
{
	// attributes
    private ViewCreateCustomer vue;
    private Customer aCustomer;
    private CustomerBase aBase;
    //private Main main;
    
    /**
     * The Constructor for the listener
     */
    public ControlerCreateCustomer(ViewCreateCustomer v,CustomerBase c)
    {
    	vue=v;
    	aBase=c;
    }
    
    /**
     * action to do when the mouse flies on buttons
     * This method displays the name of the item in the inventory
     */
     public void mousePressed(MouseEvent evt)
     {
    	 if (evt.getSource() == vue.getButtonSubmit())
		 {
    		 boolean erreur = false;
    		 if (aCustomer.getMandatory(vue.getTextName().getText(), vue.getTextTown().getText(), vue.getTextPhoneNumber().getText(),
    				 vue.getTextFaxNumber().getText(), vue.getTextCellPhone().getText()))
    		 {
    			 boolean professional=false;
    			 if (vue.getChoixOui().isSelected())
    			 {
    				 professional=true;
    			 }
    			 else if (vue.getChoixNon().isSelected())
    			 {
    				 professional=false;
    			 }
    			 else
    			 {
    				 erreur=true;
    			 }
    			 if (erreur==false)
    			 {
    				 Customer newCustomer = new Customer (professional,vue.getTextName().getText(), vue.getTextCorporateName().getText(),
        					 vue.getTextTown().getText(), vue.getTextPhoneNumber().getText(),vue.getTextFaxNumber().getText(), vue.getTextCellPhone().getText(),
        					 vue.getTextInvoicingAddress().getText(),vue.getTextInvoicingContact().getText(),vue.getTextLogin().getText(),
        					 vue.getTextPassword().getText(), vue.getTextEmail().getText());    				 
    				 aBase.addCustomer(newCustomer);
    				 for (Customer c : aBase.getCustomers())
    				 {
    					 System.out.println("professional"+c.getProfessional());
    					 System.out.println("name"+c.getName());
    					 System.out.println("town"+c.getTown());
    					 System.out.println("cn"+c.getCorporateName());
    					 System.out.println("pn"+c.getPhoneNumber());
    					 System.out.println("fax"+c.getFax());
    					 System.out.println("cell"+c.getCellNumber());
    					 System.out.println("adres"+c.getAddress());
    					 System.out.println("in"+c.getInvoicingName());
    					 System.out.println("login"+c.getLogin());
    					 System.out.println("mdp"+c.getPassword());
    					 System.out.println("email"+c.getEmail());
    					 
    				 }
    			 } 
    		 }
    		 else
    		 {
    			 erreur=true;
    		 }
    		 if (erreur==true)
    		 {
    			 JOptionPane.showMessageDialog(null, "A mandatory field is missing.","Warning",JOptionPane.WARNING_MESSAGE);
    		 }
		 }
     }
}
