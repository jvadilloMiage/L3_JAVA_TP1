package personnages.secondaires;

import java.util.Random;
import personnages.Humain;

public class GrandMere extends Humain {
	private Humain [] memoire = new Humain [30];
	private int nbConaissances;
	private Random r;
	
	public GrandMere(String nom) {
		super(nom,0,"tisane");
		this.nbConaissances = 0;
	}
	
	private String humainHasard() {
	    if (r == null) {
	        r = new Random();
	    }

	    int choix = r.nextInt(4); 

	    switch (choix) {
	        case 0:
	            return "Commerçant";
	        case 1:
	            return "Ronin";
	        case 2:
	            return "Samouraï";
	        case 3:
	            return "Yakuza";
	        default:
	            return "Inconnu"; 
	    }
	}
	
	public void ragoter() {
		for(Humain h : memoire) {
			if(h instanceof Traitre) {
				parler("Je suis sur que "+h.getNom()+"est un traitre!");
			}
			else {
				parler("Lui il était un: "+humainHasard());
			}
		}
	}
	
	public void faireConnaissanceAvec(Humain h) {
		if(this.nbConaissances <= 30) {
			memoire[this.nbConaissances] = h;
			this.nbConaissances++;
		}
		else {
			parler("Je ne peut plus retenir des personnes");
		}
	}
}
