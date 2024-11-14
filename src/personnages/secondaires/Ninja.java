package personnages.secondaires;

import personnages.principaux.Yakuza;
import java.util.Random;

public class Ninja extends Yakuza {
	private String clanSecret;
	private static final String[] clansNinja = 
		{"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	
	public Ninja(String nom, int argent, String boisson, String clan) {
        super(nom, argent, boisson, clan);
        // Generar un índice aleatorio
        Random r = new Random();
        int randomIndex = r.nextInt(clansNinja.length);  // Obtiene un número aleatorio entre 0 y 4
        // Componer el clan secreto
        this.clanSecret = clan + " " + clansNinja[randomIndex];
    }
