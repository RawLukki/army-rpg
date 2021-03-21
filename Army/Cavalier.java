
public class Cavalier extends SoldatTransporteur {

	public Cavalier(String n, int p) {
		super(n, p, 150);
		
		
	}

	public double vitesseMax() {
		if(getCharge()==0) {
			return 15.00;		
		}
		
		else if(getCharge()< 50) {
			return 13.00;
		}
		
		else if(getCharge()< 100){
			return 10.00;
		}
		
		else {
			return 8.00;
		}
	}
	
	public String toString() {
		return super.toString() + " c'est un cavalier ";
	}
	
}
