package core;

import java.util.ArrayList;

public class CreateMircoplate {
	private ArrayList<Sample> microplate;
	private OrderStatus status;
	private Integer i=0, j=0, cpt=0;
	/**
	 * This
	 */
	public CreateMircoplate(Sample sample){
		
		
		
		status = OrderStatus.toAnalyze;
		microplate = new ArrayList<Sample>();
    	// Si la liste est vide
    	if (microplate.isEmpty()){
    		// tant que le taille est inf à 8
    		while (this.microplate.size()<8){
    			// si le status est inProgress
    			if (sample.getOrder().getStatus().equals(status)){
    				//ajout en tete de liste
		    		this.microplate.add(i,sample);
		    		i= i++;
		    		}
	    		else {
	    			// si pas inProgress ajouter en fin de liste
	    			j=microplate.size()+1; // la taille +1
	    			this.microplate.add(j,sample);
	    		}
    		}
    	}
    	else {
    	// Si liste non vide
		while (microplate.isEmpty()!=false)
			// si le status inProgress
			if (sample.getOrder().getStatus().equals(status))
				for (Sample s: microplate)
					while(s.getOrder().equals(status))
						cpt=cpt++; // le nombre de samples qui sont en progress
					this.microplate.add(cpt+1,sample);
    	}
	
		
	}
}
