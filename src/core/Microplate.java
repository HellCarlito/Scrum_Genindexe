package core;

import java.util.ArrayList;
import core.Sample;

/**
 * This class represents the Mircoplates that will be used for the analysis
 * A microplate has maximum 8 places for samples
 * @author astem
 *
 */
public class Microplate {
	private Integer size, ID, pos;
	private ArrayList<Sample> list;
	/**
	 * This constructor adds a sample to the microplate list
	 * @param s the sample 
	 */
	public Microplate(Sample s, Integer id){
		// TODO add a database for microplates
		if (this.list.size()<8){
			this.list.add(s);
			this.ID=id;
		} else {
			System.out.println("The Microplate is full, please use another one");
		}

	}
	
	
	
	
	
}
