
public class Soldat {
	private String nom;
	private int poids;
	
	public Soldat(String n,int p) {
		this.nom = n;
		this.poids = p;
	}
	
	public double vitesseMax() {
	if(this.poids<85) {
		return 7.00;
	}
	else if(this.poids<95) {
		return 6.6;
	}
	
	else {
		return 6;
	}
		
	}
	
	public  String getNom() {
		return this.nom;
	}
	
	public  double getPoids(){
		return this.poids;
	}
	
	public String toString() {
		return "Le nom du soldat est " + this.nom + " son poids est de " + this.poids + " kg ";
	}
	
	
}
