package org.lessons.animals;

import org.lessons.animals.pojo.Aquila;
import org.lessons.animals.pojo.Cane;
import org.lessons.animals.pojo.Delfino;
import org.lessons.animals.pojo.Passerotto;
import org.lessons.animals.pojo.inter.INuotante;
import org.lessons.animals.pojo.inter.IVolante;

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
        System.out.println(faiVolare(passerotto));

        System.out.println("\nAquila:");
        aquila.verso();
        aquila.mangia();
        aquila.dormi();
        System.out.println(faiVolare(aquila));

        System.out.println("\nDelfino:");
        delfino.verso();
        delfino.mangia();
        delfino.dormi();
        System.out.println(faiNuotare(delfino));
        
        
        
        
	}
	
	public static String faiVolare(IVolante animale) {
		
		return animale + "sta volando";
		
	}
	
	
	public static String faiNuotare(INuotante animale) {
			
		return animale + "sta nuotando";
			
	}
	
}
