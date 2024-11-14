package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;
	
	public Yakuza(String nom,int argent,String boisson,String clan) {
		super(nom,argent,boisson);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public String getClan() {
		return this.clan;
	}
	
	public int  getReputation() {
		return this.reputation;
	}
	
	public void extorquer(Commerçant c) {
		int voleArgent = c.seFaireExtorquer();
		gagnerArgent(voleArgent);
		parler("Je viens de voler un Commerçant, WAJAJAJA!!");
	}
	
	public void gagnerDuel() {
		this.reputation += 1;
		parler("Victoire ! Sale Ronin !");
	}
	
	public int perdreDuel() {
		this.reputation -= 1;
		int argent = getArgent();
		perdreArgent(argent);
		parler("J'ai été vaincu...");
		return argent;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je viens du clan: "+this.clan);
	}
}
