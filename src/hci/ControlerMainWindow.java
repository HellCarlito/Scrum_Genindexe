package hci;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import core.Customer;
import core.CustomerBase;
import hci.ConnectCustomer.ViewConnectCustomer;

public class ControlerMainWindow extends MouseAdapter
{
	// attributes
    private MainWindow main;
    
    /**
     * The Constructor for the listener
     */
    public ControlerMainWindow(MainWindow m)
    {
    	main=m;
    }
    
    /**
     * action to do when the mouse flies on buttons
     */
     public void mousePressed(MouseEvent evt)
     {
    	 if (evt.getSource() == main.getBack())
		 {
    		 //a faire
		 }
    	 else if (evt.getSource() == main.getSignIn())
		 {
    		 main.setContent(new ViewConnectCustomer(main.getBase(),main));
		 }
     }
}
