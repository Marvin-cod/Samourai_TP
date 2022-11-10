package personnages;

public class Humain {
	
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain (String nom, String boisson, int argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}
	
		
	
	public String getNom() {
		return nom;
	}



	public String getBoisson() {
		return boisson;
	}

	
	public int getArgent() {
		return argent;
	}


	public void Parler(String texte) {
		System.out.println("<"+this.nom+">"+texte);
	}
	
	public void Bonjour() {
		Parler("Bonjour je m'appelle "+this.nom+" et j'aime boire du "+this.boisson);
	}
	
	public void Boire() {
		Parler("MMMMmmmm un bon verre de "+this.boisson+" ! Gloups");
	}
	
	public void GagnerArgent(int argent) {
		this.argent+=argent;
	}
	
	public void  PerdreArgent(int argent) {
		this.argent-=argent;
	}
	
}
