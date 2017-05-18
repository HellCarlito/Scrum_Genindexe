package core;

import java.util.ArrayList;

public class CreateMircoplate {
	private ArrayList<Sample> microplate;
	private Microplate plate;
	private OrderStatus status;
	private Integer i=0, j=0, cpt=0;
	/**
	 * This method creates a microplate and add the sample to it
	 */
	public CreateMircoplate(Integer id, Sample sample){
		
		
		
		status = OrderStatus.toAnalyze;
		//microplate = new ArrayList<Sample>();
		plate = new Microplate(id);
    	// Si la liste est vide
		if (plate.emptyPlate()) {
    		// tant que le taille est inf à 8
    		while (plate.getSize()<8){
    			// si le status est inProgress
    			if (sample.getOrder().getStatus().equals(status)){
    				//ajout en tete de liste
		    		plate.addSample(i,sample);
		    		i= i++;
		    		}
	    		else {
	    			// si pas inProgress ajouter en fin de liste
	    			j=plate.getSize()+1; // la taille +1
	    			this.plate.addSample(j,sample);
	    		}
    		}
    	}
    	else {
    	// Si liste non vide
		while (plate.emptyPlate()!=false)
			// si le status inProgress
			while (plate.getSize()<8){
				if (sample.getOrder().getStatus().equals(status))
					for (Sample s: microplate)
						while(s.getOrder().equals(status))
							cpt=cpt++; // le nombre de samples qui sont en progress
						plate.addSample(cpt+1,sample);
			}
	
    	}
	}
}
