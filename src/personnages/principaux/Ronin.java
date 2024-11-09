package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom,int argent,String boisson) {
		super(nom,argent,boisson);
		this.honneur = 1;
	}
	
	public void donner(int n,Commerçant c) {
		int argent = getArgent();
		if(argent >= n ) {
			c.recevoir(n);
			parler("Tiens pauvre commerçant régale toi.");
		}
		else {
			parler("J'ai pas des tunnes frérot :(");
		}
	}	
	
	public void Provoquer(Yakuza y) {
		if(this.honneur * 2 > y.getReputation()) {
			gagnerArgent(y.perdreDuel());
			this.honneur +=1;
		}
		else {
			y.perdreDuel();
			this.honneur-=1;
			parler("P*tain je suis nul !");
		}
	}
}
