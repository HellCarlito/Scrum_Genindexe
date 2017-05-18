package hci.CreateSpecie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import hci.MainWindow;
import core.WordUtils;
import core.IntegrationTest;
import core.Specie;
import core.SpecieCategory;
import hci.CreateSpecie.ViewCreateSpecie;

public class ControllerCreateSpecie implements ActionListener{

	// attributes
    private ViewCreateSpecie vue;
    private IntegrationTest aBase;
    private MainWindow main;
    private WordUtils word;
 
    
    /**
     * The Constructor for the listener
     */
    public ControllerCreateSpecie(ViewCreateSpecie v,IntegrationTest c, MainWindow m)
    {
    	vue=v;
    	aBase=c;
    	main=m;
    }
    
    /**
     * action to do when the mouse flies on buttons
     * This method displays the name of the item in the inventory
     */
	@Override
	public void actionPerformed(ActionEvent evt)
	{ 	
		 if (evt.getSource() == vue.getButtonSubmit())
		 {
    		 Specie newSpecies = new Specie (word.capitalize(vue.getTextNameSpecie().getText()));    		 
    		 SpecieCategory sc = null;
    		 boolean find=false;
    		 boolean findEmpty=false;
    		 
    		 for(SpecieCategory c:aBase.theCategories)
    		 {
    			for (Specie s : c.getSpecies())
    				{
		    		 if (newSpecies.getName().equals(s.getName()))
		    		 {
		    			 find=true;
		    			 break;
		    		 }
		    		 else if (newSpecies.getName().equals(""))
		    		 {
		    			findEmpty = true;
		    			break;
		    		 }
		    		 else
		    		 {
		    			 sc=c;
		    		 }
	    		 }
    		if(find)
    			{
    				break;
    			}
    		}

    		 if(find)
    		 {
    			 JOptionPane.showMessageDialog(null, "The specie "+newSpecies.getName()+" is already in the database.","Warning",JOptionPane.WARNING_MESSAGE);
    		 }
    		 else if (findEmpty)
    		 {
    			 JOptionPane.showMessageDialog(null, "Please fill the test field !!! ","Warning",JOptionPane.WARNING_MESSAGE); 
    		 }
    		 else
    		 {
    			 sc.addSpecie(newSpecies);
    			 JOptionPane.showMessageDialog(null, "The specie "+newSpecies.getName()+" is created.","Information",JOptionPane.INFORMATION_MESSAGE);
    		 }
    	 }
	}
}