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
    		 if (null!=vue.getTextLogin().getText() && null!=vue.getTextPassword().getText())
    		 {
    			 JOptionPane.showMessageDialog(null, "Yeeeee you are online !", "Information", JOptionPane.INFORMATION_MESSAGE);
    		 } else {
    			 JOptionPane.showMessageDialog(null,  "You have to enter a login and a password", "Information", JOptionPane.WARNING_MESSAGE);
    		 }
		 }
     }
}
