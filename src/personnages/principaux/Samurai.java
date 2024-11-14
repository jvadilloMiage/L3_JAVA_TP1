package personnages.principaux;

public class Samurai extends Ronin {
	private String seigneur;
	
	public Samurai(String nom,int argent,String boisson,String seigneur) {
		super(nom,argent,boisson);
		this.seigneur = seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Je represente le seigneur: "+this.seigneur);
	}
	
	public void boire(String b) {
		super.boire();
		parler("Et je bois aussi: "+b);
	}
}
