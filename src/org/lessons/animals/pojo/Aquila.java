package org.lessons.animals.pojo;

import org.lessons.animals.pojo.inter.IVolante;

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
	public void vola() {
		
		System.out.println("l'aquila vola");
		
	}
	
	
	
	
	//TO String
		@Override
		public String toString() {
			
			return "L'aquila ";
		}

}
