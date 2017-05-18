package hci.CreateCategory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hci.CreateCategory.ViewCreateCategory;
import javax.swing.*;
import core.*;

public class ControlerCreateCategory implements ActionListener{

	// attributes
    private ViewCreateCategory vue;
//    private SpecieCategory aCategory;
    private IntegrationTest aBase;
    private WordUtils word;
 
    
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
    		 SpecieCategory newCategory = new SpecieCategory (word.capitalize(vue.getTextNameCatSpecie().getText()));    				 
    		 SpecieCategory sc = null;
    		 boolean find=false;
    		 boolean findEmpty=false;
    		 
    		 for (SpecieCategory c : aBase.theCategories)
    		 {
    			 if (newCategory.getName().toUpperCase().equals(c.getName().toUpperCase()))
    			 {
    				 find = true;
    				 break;
    			 }
    			 else if (newCategory.getName().equals(""))
    			 {
    				 findEmpty=true;
    				 break;
    			 }
    			 else
    			 {
    				 sc=c;
    			 }
    		 }
    		 
    		 if(find)
    		 {
    			 JOptionPane.showMessageDialog(null, "The category "+newCategory.getName()+" is already in the database.","Warning",JOptionPane.WARNING_MESSAGE); 
    		 }
    		 else if (findEmpty)
    		 {
    			 JOptionPane.showMessageDialog(null, "Please fill the test field !!! ","Warning",JOptionPane.WARNING_MESSAGE); 
    		 }
    		 else
    		 {
    			 aBase.theCategories.add(newCategory);
    			 JOptionPane.showMessageDialog(null, "The category "+newCategory.getName()+" is created.","Information",JOptionPane.INFORMATION_MESSAGE);
    		 }

             for (SpecieCategory c :
                     aBase.theCategories) {
                 System.out.println(c.getName());
             }


         }
	}
}
