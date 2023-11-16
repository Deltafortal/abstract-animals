package org.lessons.animals.pojo;

public class Delfino extends Animale{

	@Override
	public void verso() {
		System.out.println("Verso del delfino");
		
	}

	@Override
	public void mangia() {
		System.out.println("Pesce");
		
	}
	
	
	public void faiNuotare() {
		
		System.out.println("Il delfino nuota");
	}

}
