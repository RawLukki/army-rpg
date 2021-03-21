import java.util.ArrayList;

public class Troupe {

	private ArrayList<Soldat> armee;
	
	
	public Troupe() {	
		this.armee= new ArrayList<>();	
	}
	
	public void ajoutTroupe(Soldat s) {
		this.armee.add(s);
	}
	
	public void deleteTroupe(Soldat s) {
		this.armee.remove(s);	
	}
	
	
	public double vitesseMaxTroupe() {
		double vitesseTroupe = 100.00;	
		for(Soldat s:this.armee) {
			if(s.vitesseMax()<vitesseTroupe) {
				vitesseTroupe = s.vitesseMax();
			}
		}
		return vitesseTroupe;
	}
	
	public String toString() {
		return this.armee.toString();
	}
	
}
