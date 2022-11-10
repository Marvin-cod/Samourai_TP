package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	
	private int honneur;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur=1;
	}
	
	public void DonnerArgent(int argent) {
		
		
	}

}
