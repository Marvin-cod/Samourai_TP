package personnages.principaux;

import personnages.Humain;

public class Commer�ants extends Humain {

	public Commer�ants(String nom, int argent) {
		super(nom, "th�", argent);
		
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
