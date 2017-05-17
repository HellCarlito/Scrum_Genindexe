package hci.CreateCategory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import core.SpecieCategory;
import core.IntegrationTest;
import hci.CreateCategory.ViewCreateCategory;
import javax.swing.*;
import core.*;

public class ControlerCreateCategory implements ActionListener{

	// attributes
    private ViewCreateCategory vue;
//    private SpecieCategory aCategory;
    private IntegrationTest aBase;
 
    
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
	@Override
	public void actionPerformed(ActionEvent evt) {
		 if (evt.getSource() == vue.getButtonSubmit())
		 {
    		 SpecieCategory newCategory = new SpecieCategory (vue.getTextNameCatSpecie().getText());    				 
    		 aBase.theCategories.add(newCategory);
    		 for (SpecieCategory c : aBase.theCategories)
    		 {
    			 System.out.println("Category: "+c.getName());
    		 } 
    	 }
		
	}
}
