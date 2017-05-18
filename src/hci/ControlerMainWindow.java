package hci;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import core.Customer;
import core.CustomerBase;
import core.IntegrationTest;
import hci.ConnectCustomer.ViewConnectCustomer;
import hci.MainTest.ControllerMainTest;

public class ControlerMainWindow extends MouseAdapter
{
	// attributes
    private MainWindow main;
    private IntegrationTest integrationTest;

    /**
     * The Constructor for the listener
     */
    public ControlerMainWindow(MainWindow m, IntegrationTest integrationTest)
    {
        this.integrationTest = integrationTest;
    	main=m;
    }
    
    /**
     * action to do when the mouse flies on buttons
     */
     public void mousePressed(MouseEvent evt)
     {
    	 if (evt.getSource() == main.getBack())
		 {
    		 new ControllerMainTest(main, integrationTest);
		 }
    	 else if (evt.getSource() == main.getSignIn())
		 {
    		 new ViewConnectCustomer(integrationTest,main);
		 }
     }
}
