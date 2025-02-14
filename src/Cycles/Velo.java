package Cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13.0 ;
	private double braquet ;
	private double diamRoue ;
	private Random genAlea ;
	
	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public void setDEFAUT_BRAQUET(double db) {
		DEFAUT_BRAQUET = db;
	}
	
	public Velo (double b, double dR) {
		this.braquet =b;
		this.diamRoue = dR;
		this.genAlea = new Random();
		
	}
	
	public Velo (double b) {
		this.braquet = b ;
	}
	
	public Velo () {
		this(DEFAUT_BRAQUET, DEFAUT_BRAQUET);
	}
	
	public Random getGenALea() {
		return this.genAlea ;
	}
	
	public void setGenAlea(Random G) {
		this.genAlea = G ;
	}
	 
	public double getBraquet() {
		return this.braquet;
	}
	
	public void setBraquet(double b) {
		this.braquet = b;
	}
	
	public double getDiamRoue() {
		return this.diamRoue;
	}
	
	public void setDiamRoue(double dR) {
		this.diamRoue = dR;
	}
	
	public String toSring() {
		return "Velo [Braquet=" +this.braquet+ ", Diametre Roue=" 
				+this.diamRoue+"]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale*this.diamRoue*this.braquet*genAlea.nextDouble();
	}

	
	public static void main(String[] args) {
    	Velo v1 = new Velo(14.5, 27.5);
        System.out.println(v1);
        System.out.println(v1.toSring());
        System.out.println("Puissance vélo : " + v1.getPuissance(10));

    }
}
    
        
