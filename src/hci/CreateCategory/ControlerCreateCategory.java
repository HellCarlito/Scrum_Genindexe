package hci.CreateCategory;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import core.SpecieCategory;
import core.IntegrationTest;
import hci.CreateCategory.ViewCreateCategory;
import javax.swing.*;
import core.*;

public class ControlerCreateCategory extends MouseAdapter{

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
     public void mousePressed(MouseEvent evt)
     {
    	 if (evt.getSource() == vue.getButtonSubmit())
		 {
    		 SpecieCategory newCategory = new SpecieCategory (vue.getTextNameCatSpecie().getText());    				 
    		 aBase.addCategory(newCategory);
    		 for (SpecieCategory c : aBase.getCategory())
    		 {
    			 System.out.println("Category"+c.getNameCategory());
    		 } 
    	 }
    }
}
