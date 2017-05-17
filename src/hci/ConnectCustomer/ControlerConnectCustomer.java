package hci.ConnectCustomer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import core.Customer;
import core.CustomerBase;
import hci.CreateCustomer.ViewCreateCustomer;

public class ControlerConnectCustomer extends MouseAdapter
{
	// attributes
    private ViewConnectCustomer vue;
    private Customer aCustomer;
    private CustomerBase aBase;
    //private Main main;
    
    /**
     * The Constructor for the listener
     */
    public ControlerConnectCustomer(ViewConnectCustomer v,CustomerBase c)
    {
    	vue=v;
    	aBase=c;
    }
    
    /**
     * action to do when the mouse flies on buttons
     */
     public void mousePressed(MouseEvent evt)
     {
    	 if (evt.getSource() == vue.getButtonSubmit())
		 {
    		 System.out.println("login"+vue.getTextLogin().getText());
    		 System.out.println("password"+vue.getTextPassword().getText());
    		 if ((!vue.getTextLogin().getText().isEmpty()) && (!vue.getTextPassword().getText().isEmpty()))
    		 {
    			 if (aBase.signIn(vue.getTextLogin().getText(), vue.getTextPassword().getText())!=null)
    			 {
    				JOptionPane.showMessageDialog(null, "Yeeeee you are online !", "Information", JOptionPane.INFORMATION_MESSAGE);
    			 }
    			 else
    			 {
    				JOptionPane.showMessageDialog(null,  "The login or the password is uncorrect", "Error", JOptionPane.ERROR_MESSAGE);
    			 }
    		 }
    		 else
    		 {
    			 JOptionPane.showMessageDialog(null,  "You have to enter a login AND a password", "Warning", JOptionPane.WARNING_MESSAGE);
    		 }
		 }
     }
}
