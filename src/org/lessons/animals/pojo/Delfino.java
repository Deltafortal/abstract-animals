package org.lessons.animals.pojo;

import org.lessons.animals.pojo.inter.INuotante;

public class Delfino extends Animale implements INuotante{

	@Override
	public void verso() {
		System.out.println("Verso del delfino");
		
	}

	@Override
	public void mangia() {
		System.out.println("Pesce");
		
	}
	
	
	public void nuota() {
		
		System.out.println("Il delfino nuota");
	}
	
	
	
	
	
	//TO String
		@Override
		public String toString() {
			
			return "Il delfino ";
		}

}
