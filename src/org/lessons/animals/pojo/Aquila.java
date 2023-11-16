package org.lessons.animals.pojo;

public class Aquila extends Animale implements IVolante{

	@Override
	public void verso() {
		System.out.println("Strilla");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangia gli animali");
		
	}
	
	
	
	@Override
	public void faiVolare() {
		
		System.out.println("l'aquila vola");
		
	}

}
