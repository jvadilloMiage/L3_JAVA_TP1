package personnages.secondaires;

import personnages.principaux.Commerçant;

public class Colporteur extends Commerçant {
	public Colporteur(String nom,int argent) {
		super(nom,argent);
	}
	
	@Override
	public int seFaireExtorquer() {
		int argentPerdu = getArgent()/2;
		perdreArgent(argentPerdu);
		parler("Le monde est vraiment à moitié trop injuste !!");
		return argentPerdu;
	}
}
