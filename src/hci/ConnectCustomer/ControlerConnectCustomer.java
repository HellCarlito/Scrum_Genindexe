package hci.ConnectCustomer;
import core.IntegrationTest;
import hci.MainWindow;
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
    private IntegrationTest aBase;
    private MainWindow main;
    
    /**
     * The Constructor for the listener
     */
    public ControlerConnectCustomer(ViewConnectCustomer v, IntegrationTest c, MainWindow m)
    {
    	vue=v;
    	aBase=c;
    	main=m;
    }
    
    /**
     * action to do when the mouse flies on buttons
     */
     public void mousePressed(MouseEvent evt)
     {
    	 if (evt.getSource() == vue.getButtonSubmit())
		 {
    		 System.out.println("bouton");
    		 if (null!=vue.getTextLogin().getText() && null!=vue.getTextPassword().getText())
    		 {
    			 System.out.println("pas null");
    			 if (aBase.signIn(vue.getTextLogin().getText(), vue.getTextPassword().getText())!=null)
    			 {
    				 main.setLogCustomer(aBase.signIn(vue.getTextLogin().getText(), vue.getTextPassword().getText()));
    				 JOptionPane.showMessageDialog(null, "Yeeeee you are online !", "Information", JOptionPane.INFORMATION_MESSAGE);
    			 }
    			 System.out.println(aBase.signIn(vue.getTextLogin().getText(), vue.getTextPassword().getText()));
    		 } 
    		 else
    		 {
    			 JOptionPane.showMessageDialog(null,  "You have to enter a login and a password", "Information", JOptionPane.WARNING_MESSAGE);
    		 }
		 }
     }
}
