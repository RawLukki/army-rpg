
public class Brancardier extends SoldatTransporteur {

	public Brancardier(String n, int p) {
		super(n, p, 60);
		
	}

	public double vitesseMax() {
		if(getCharge()==0) {
			return 7.00;		
		}
		
		else if(getCharge()< getPoids()/3) {
			return 5.6;
		}
		
		else if(getCharge()<getPoids()/2){
			return 4.9;
		}
		
		else {
			return 4.00;
		}
	}
		
		public String toString() {
			return super.toString() + " c'est un brancardier ";
	}
	
}
