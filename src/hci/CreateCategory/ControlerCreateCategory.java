package hci.CreateCategory;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

import core.SpecieCategory;
import core.IntegrationTest;
import hci.CreateCategory.ViewCreateCategory;

import javax.swing.JPanel;
import core.*;

public class ControlerCreateCategory {

	// attributes
    private ViewCreateCategory vue;
    private SpecieCategory aCustomer;
    private IntegrationTest aBase;
    //private Main main;
    
    /**
     * The Constructor for the listener
     */
    public ControlerCreateCategory(ViewCreateCategory v,IntegrationTest c)
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
    		 SpecieCategory newCategory = new SpecieCategory (vue.getTextNameCatSpecie().getText());    				 
    		 aBase.addSpecie(newCategory);
    		 for (SpecieCategory c : aBase.getCategory())
    		 {
    			 System.out.println("Espece"+c.getTextNameCatSpecie());
    		 } 
    	 }
    }
}
