package org.lessons.animals;

import org.lessons.animals.pojo.Aquila;
import org.lessons.animals.pojo.Cane;
import org.lessons.animals.pojo.Delfino;
import org.lessons.animals.pojo.Passerotto;

public class Main {

	public static void main(String[] args) {
		
		Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();
		
        
        
        //Main Logic
        System.out.println("Cane:");
        cane.verso();
        cane.mangia();
        cane.dormi();

        System.out.println("\nPasserotto:");
        passerotto.verso();
        passerotto.mangia();
        passerotto.dormi();
        passerotto.faiVolare();

        System.out.println("\nAquila:");
        aquila.verso();
        aquila.mangia();
        aquila.dormi();
        aquila.faiVolare();

        System.out.println("\nDelfino:");
        delfino.verso();
        delfino.mangia();
        delfino.dormi();
        delfino.faiNuotare();
        
        
        
        
	}
	
}
