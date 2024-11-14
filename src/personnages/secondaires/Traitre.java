/*ç*/
package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commerçant;
import personnages.principaux.Samurai;

public class Traitre extends Samurai{
	private int traitrise;
	
	public Traitre(String nom,int argent,String boisson,String seigneur) {
		super(nom,argent,boisson,seigneur);
		this.traitrise = 0;
	}
	
	public void extorquer(Commerçant c) {
		if(this.traitrise<3) {
			int voleArgent = c.seFaireExtorquer();
			gagnerArgent(voleArgent);
			parler("Je viens de voler un Commerçant, WAJAJAJA!!");
			this.traitrise++;
		}
		else {
			parler("P*tain il va falloir que j'attends...");
		}
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de T est de "+this.traitrise);
	}
	
	public void FaireLeGentil(Humain h,int n) {
		int argent = getArgent();
		if(argent >= n ) {
			h.gagnerArgent(n);
			parler("Tiens Humain régale toi.");
			this.traitrise = Math.max(0, traitrise - n / 10);
		}
		else {
			parler("Tu regarde qui einh!");
		}
	}


}
