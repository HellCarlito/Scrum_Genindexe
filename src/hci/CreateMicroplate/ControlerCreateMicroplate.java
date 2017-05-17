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
    
    
	private ArrayList<Sample> samples;
	private Sample sample;
	private OrderStatus status;
	
	public ControlerCreateMicroplate(ViewCreateMicroplate v,IntegrationTest c)
    {
    	vue=v;
    	aBase=c;
    	
    	
		status = OrderStatus.inProgress;
		samples = new ArrayList<Sample>();
    	// Si la liste est vide
    	if samples.isEmpty()
		while (samples.isEmpty()!=false)
			if samples.
		if (sample.getOrder().getStatus().equals(status))
			samples.add(sample);
			samples.toArray(a)
			
		
    	
    	
    	
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
