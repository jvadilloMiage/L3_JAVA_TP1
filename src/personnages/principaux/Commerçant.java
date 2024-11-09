package personnages.principaux;
import personnages.Humain;

public class Commerçant extends Humain {
	
	public Commerçant (String nom,int argent) {
		super(nom,argent,"Thé");
	}
	
	public int seFaireExtorquer() {
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		parler("Le monde est vraiment trop injuste !!");
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
	}
}
