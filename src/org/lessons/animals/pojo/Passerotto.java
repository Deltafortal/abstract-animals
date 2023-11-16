package org.lessons.animals.pojo;

import org.lessons.animals.pojo.inter.IVolante;

public class Passerotto extends Animale implements IVolante{

	@Override
	public void verso() {
		System.out.println("Cinguetta");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangia i semi");
		
	}
	
	@Override
	public void vola() {
		
		System.out.println("Il passerotto vola");
		
	}
	
	
	
	
	//TO String
	@Override
	public String toString() {
		
		return "Il passerotto ";
	}

}
