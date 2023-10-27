package ds2021;
import java.util.Scanner;

public class Film {
	String titre ;
	String realisateur ;
	String paysOrigine ;
	int duree ;
	int nbPlace;
	
	int getNbPlace() {
		return this.nbPlace ;
	}
	
	void setNbPlace(int n) {
		this.nbPlace = n ;
	}
	
	public String toString () {
		return this.titre + " de "+this.realisateur+" ("+this.paysOrigine+") - "+this.duree+"min.";
	}
	
	Film(String titre, String r, String pays, int d){
		this.titre = titre ;
		this.paysOrigine = pays ;
		this.realisateur = r ;
		this.duree = d ;
	}
	float totalVentreBillets() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le nb des etudiant");
		int nbEtudiant = sc.nextInt();
		while(nbEtudiant>this.nbPlace || nbEtudiant<0) {
			System.out.println("donner le nouveau nb des etudiants");
			nbEtudiant = sc.nextInt();
		}
		return nbEtudiant*2+(this.nbPlace-nbEtudiant)*3 ;
	}
	
	
	
	
	
	
	
	
}
