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
	public Microplate(Integer id){
		this.ID = id;
		this.size = 8;
		this.list = new ArrayList<Sample>();
	}
	
	/**
	 * This method verifies that the microplate is empty
	 * @return
	 */
	public boolean emptyPlate(){
		if (this.list.isEmpty()){
			return true;
			}
		else return false;
	}
	/**
	 * Gets the size of the array
	 * @return
	 */
	protected Integer getSize() {
		return this.list.size();
	}
	/***
	 * Get the ID
	 * @return
	 */
	protected Integer getID() {
		return ID;
	}

	protected void setID(Integer iD) {
		ID = iD;
	}
	/**
	 * This method add a sample to the microplate
	 * @param s
	 */
	protected void addSample(Integer i, Sample s){
		this.list.add(i,s);
	}
	
}
