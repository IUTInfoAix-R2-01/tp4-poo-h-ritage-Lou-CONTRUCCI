package Cycles;


public class VeloElec extends Velo{
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0 ;
	private double facteurPuissanceMoteur;
	
	public VeloElec () {
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR ;
	}
	
	public VeloElec (double braquet, double diamRoue, double cM) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = cM ;
		
	}
	
	public VeloElec (double diamRoue, double cM) {
		super(diamRoue) ;
		this.facteurPuissanceMoteur = cM ;
	}
	
/*	public double getDEFAUT_COUPLE_MOTEUR() {
		return facteurPuissanceMoteur ; 
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		
	}*/
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur  ;
	}
	
	public void setFacteurPuissanceMoteur(double coupleMoteur) {
        this.facteurPuissanceMoteur = coupleMoteur;
    }
	
	public double getPuissance(double FrequenceCoupsDePedale) {
        return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
    }

    @Override
    public String toString() {
        return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
    }
    
    
    
  /*test de veloElec*/ 
    public static void main(String[] args) {
        VeloElec ve1 = new VeloElec(14.5, 27.5, 20.0);
        System.out.println(ve1);
        
        System.out.println("Puissance vélo électrique : " + ve1.getPuissance(90));
    }
	
}
