import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVitesseMax {

	@Test
	void test() {
		try {		
		Cavalier A = new Cavalier("Alphonse",30);
		Brancardier C = new Brancardier("Timochut",50);
		Troupe t1 = new Troupe();
		A.charger(30);
		System.out.println(A.vitesseMax());
		A.decharge();
//		A.charger(170);
//		System.out.println(A.vitesseMax());
		System.out.println(A);
		t1.ajoutTroupe(A);
		t1.ajoutTroupe(C);
		System.out.println(t1);
		System.out.println(t1.vitesseMaxTroupe());
		
		}
		catch(Exception e) {
			System.out.println("Attention poids de la charge trop élevé ");
		}
	}

}
