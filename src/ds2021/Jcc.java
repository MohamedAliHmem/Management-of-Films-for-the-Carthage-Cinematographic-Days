package ds2021;
import java.util.Scanner;
public class Jcc {
	Documentaire[] competition ;
	int annee ;
	final int NBFMAX = 30 ;
	int nbF = 0 ;
	
	int i=-1;
	
	Jcc(int taille , int annee){
		while(taille>30 || taille<0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("taille donnee est superieur a 30 ou inferieur a 0");
			taille = sc.nextInt();
		}
		this.nbF = taille ;
		this.annee = annee ;
		this.competition = new Documentaire[taille];
	}
	
	void ajoutFilm (Documentaire f) {
		if(i<this.NBFMAX) {
			i++;
			this.competition[i]= f ;
		}else
			System.out.println("La compétition est au complet");
		
	}
	
	void listeFilmsJCC() {
		for(int j=0;j<=i;j++) {
			System.out.println(this.competition[j].toString()+" "+this.competition[j].getNbPlace());
			
		}
	}
	
	float totalVenteBilletsJCC() {
		int total =0;
		for(int j=0;j<=i;j++) {
			total+= this.competition[j].totalVentreBillets();
		}
		return total ;
	}
	

	public static void main(String[] args) {
		Jcc jcc = new Jcc(2,2021);
		Documentaire d1 = new Documentaire("La guerre civile","Le dernier refuge","Ousman","Mali",86);
		d1.setNbPlace(30);		
		Documentaire d2 = new Documentaire("-","Insurrection","Jilani Saadi","Tunisie",45);
		d2.setNbPlace(45);
		jcc.ajoutFilm(d1);
		jcc.ajoutFilm(d2);
		jcc.listeFilmsJCC();
		System.out.println(jcc.totalVenteBilletsJCC());
	}

}
