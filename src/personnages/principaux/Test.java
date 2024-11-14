package personnages.principaux;

import personnages.Humain;

public class Test {

	public static void main(String[] args) {
		Humain h = new Humain("Julian",100,"Thé");
		Ronin r = new Ronin("JulianR",100,"Biere");
		Commerçant c = new Commerçant("JulianC",100);
		Yakuza y = new Yakuza("JulianY",100,"Rhum","Talishte");
		Ronin rs = new Samurai("JulianRS",100,"Rhum","Julius");
		h.direBonjour();
		c.direBonjour();
		r.direBonjour();
		y.direBonjour();
		rs.direBonjour();
		((Samurai)rs).boire("Pastis");
	}

}
