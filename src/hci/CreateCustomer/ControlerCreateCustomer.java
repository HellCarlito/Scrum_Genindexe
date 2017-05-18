package hci.CreateCustomer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import core.*;
import hci.MainWindow;

public class ControlerCreateCustomer extends MouseAdapter
{
	// attributes
    private ViewCreateCustomer vue;
    private Customer aCustomer;
    private IntegrationTest aBase;
    private MainWindow main;
    
    /**
     * The Constructor for the listener
     */
    public ControlerCreateCustomer(ViewCreateCustomer v,IntegrationTest c, MainWindow m)
    {
    	vue=v;
    	aBase=c;
    	main=m;
        m.setContent(vue);
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
    				 vue.getTextFaxNumber().getText(), vue.getTextCellPhone().getText(), vue.getTextLogin().getText(), vue.getTextPassword().getText()))
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
    				 Customer newCustomer = new Customer (professional,vue.getTextName().getText(), vue.getTextTown().getText(),
        					 vue.getTextCorporateName().getText(), vue.getTextPhoneNumber().getText(),vue.getTextFaxNumber().getText(), vue.getTextCellPhone().getText(),
        					 vue.getTextInvoicingAddress().getText(),vue.getTextInvoicingContact().getText(),vue.getTextLogin().getText(),
        					 vue.getTextPassword().getText(), vue.getTextEmail().getText());
    				 if (aBase.theCustomers.add(newCustomer))
    				 {
    					 JOptionPane.showMessageDialog(null, "The new customer "+newCustomer.getName()+"("+newCustomer.getTown()+") is added.","Information",JOptionPane.INFORMATION_MESSAGE);
    				 }
    				 else
    				 {
    					 JOptionPane.showMessageDialog(null, "The customer "+newCustomer.getName()+"("+newCustomer.getTown()+") is already in the database.","Warning",JOptionPane.WARNING_MESSAGE);
    				 }
    			 } 
    		 }
    		 else
    		 {
    			 erreur=true;
    		 }
    		 if (erreur==true)
    		 {
    			 JOptionPane.showMessageDialog(null, "A mandatory field is missing.","Error",JOptionPane.ERROR_MESSAGE);
    		 }
		 }
     }
}
