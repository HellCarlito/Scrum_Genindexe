package hci.CreateSpecie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.IntegrationTest;
import core.Specie;
import core.SpecieCategory;
import hci.CreateSpecie.ViewCreateSpecie;

public class ControllerCreateSpecie implements ActionListener{

	// attributes
    private ViewCreateSpecie vue;
    private IntegrationTest aBase;
 
    
    /**
     * The Constructor for the listener
     */
    public ControllerCreateSpecie(ViewCreateSpecie v,IntegrationTest c)
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
    		 Specie newSpecies = new Specie (vue.getTextNameSpecie().getText());    				 
    		 aBase.theSpecies.add(newSpecies);
    	     System.out.println("Specie : "+ newSpecies + ", "+ vue.getBoxCategory().getName());
    	 }
		
	}
}
