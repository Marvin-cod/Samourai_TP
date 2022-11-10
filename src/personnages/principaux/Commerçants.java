package personnages.principaux;

import personnages.Humain;

public class Commerçants extends Humain {

	public Commerçants(String nom, int argent) {
		super(nom, "thé", argent);
		
	}
	
	public int SeFaireExtorquer() {
		int tempo=getArgent();
		PerdreArgent(tempo);
		return tempo;
	}
	
	public void RecevoirdelArgent(int argent) {
		GagnerArgent(argent);
		Parler("Merci pour le don d'argent");
	}
	
	

}
