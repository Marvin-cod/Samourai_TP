package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain{

	private int reputation;
	private String clan;
	
	public Yakusa(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan=clan;
		this.reputation=0;
	}
	
	void extorquer(Commerçants commerçant) {
		
	}

}
