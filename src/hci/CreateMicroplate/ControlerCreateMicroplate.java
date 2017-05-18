package hci.CreateMicroplate;

import core.IntegrationTest;
import core.Microplate;
import core.SpecieCategory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlerCreateMicroplate implements ActionListener{

	// attributes
    private ViewCreateMicroplate vue;
//    private SpecieCategory aCategory;
    private IntegrationTest aBase;
    
	
	public ControlerCreateMicroplate(ViewCreateMicroplate v,IntegrationTest c)
    {
    	vue=v;
    	aBase=c;
    
    	
    }

	@Override
	public void actionPerformed(ActionEvent evt) {
	if (evt.getSource() == vue.getButtonSubmit())
	 {
		 Microplate newMircoplate = new Microplate(vue.ViewCreateMicroplate().getText());
		 aBase.theCategories.add(newMircoplate);
		 for (SpecieCategory c : aBase.theCategories)
		 {
			 System.out.println("Microplate: "+c.getName());
		 } 
	 }
	
}
}
