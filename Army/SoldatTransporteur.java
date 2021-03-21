public class SoldatTransporteur extends Soldat {
	
	private int chargeMaxi;
	private int charge;
	

	public SoldatTransporteur(String n, int p, int maxCharge) {
		super(n, p);
		this.chargeMaxi = maxCharge;
			
	}
	
	public void charger(int laCharge) throws Exception {
		if(laCharge<0)throw new Exception();
		this.charge += laCharge;
		if(this.charge>this.chargeMaxi) throw new Exception();
	}
	
	public void decharge() {
		this.charge = 0;
	}
	
	public int getCharge() {
		return this.charge;
	}
	
	public String toString() {
		return super.toString() + " c'est un transporteur d'une charge de " + this.charge + " kg ";
	}
	
}
