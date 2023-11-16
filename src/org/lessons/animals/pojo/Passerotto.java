package org.lessons.animals.pojo;

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
	public void faiVolare() {
		
		System.out.println("Il passerotto vola");
		
	}

}
