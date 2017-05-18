package hci.CreateMicroplate;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import core.IntegrationTest;
import core.OrderStatus;
import core.Sample;
import core.SpecieCategory;
import hci.CreateCategory.ViewCreateCategory;

import java.awt.event.ActionEvent;

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
		 Mircoplate newMircoplate = new Mircoplate (vue.getTextNameCatSpecie().getText());    				 
		 aBase.theCategories.add(newCategory);
		 for (SpecieCategory c : aBase.theCategories)
		 {
			 System.out.println("Category: "+c.getName());
		 } 
	 }
	
}
}
