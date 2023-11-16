package org.lessons.animals.pojo;

abstract class Animale {

	
	//Sleep function
    public void dormi() {
        System.out.println("Zzz");
    }

    //Sound function 
    public abstract void verso();

    
    //Eat function
    public abstract void mangia();
	
}
