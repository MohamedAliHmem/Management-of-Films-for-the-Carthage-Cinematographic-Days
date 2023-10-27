package ds2021;

public class Documentaire extends Film{
	String sujet ;
	float tarif = 2;
	Documentaire (String sujet, String titre, String r, String pays, int d){
		super(titre,r,pays,d);
		this.sujet = sujet;
	}
	
	public String toString () {
		return super.toString() + " " +this.sujet ;
	}
	
	float totalVentreBillets() {
		return super.totalVentreBillets();
	}
	
	
	

	public static void main(String[] args) {
		/*Documentaire d = new Documentaire("iset nabeul","dsi22","dali","tunisia",100);
		System.out.println(d.toString());
*/
	}

}
