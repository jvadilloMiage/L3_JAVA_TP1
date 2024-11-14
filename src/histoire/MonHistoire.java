package histoire;

import personnages.Humain;
import personnages.principaux.Commerçant;
import personnages.principaux.Ronin;
import personnages.principaux.Yakuza;

public class MonHistoire {

	public static void main(String[] args) {
		  Humain humain = new Humain("Prof", 10, "Porto");
		  humain.direBonjour();
		  humain.boire();
		  Commerçant commerçant = new Commerçant("Marchand", 35);
		  commerçant.direBonjour();
		  Yakuza yakusa = new Yakuza("Yaku␣le␣noir", 42,
		                             "biere", "WarSong");
		  yakusa.direBonjour();
		  yakusa.extorquer(commerçant);
		  Ronin ronin = new Ronin("Roro", 61, "sake");
		  ronin.donner(10, commerçant );
		  ronin.provoquer(yakusa);
		  ronin.direBonjour();


	}

}
