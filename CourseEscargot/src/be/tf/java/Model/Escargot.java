package be.tf.java.Model;

public class Escargot {
	private String nom;
//	private int vitesse;
//	private int vitesseMax;
	private int distanceParcourue;
	
	public Escargot(String nom) {//, int vitesseMax) {
		this.nom = nom;
//		this.vitesse = 0;
//		this.vitesseMax = vitesseMax;
	}
	
	public void avancer(int vitesse) {
		distanceParcourue += vitesse;
	}
	
	public String getNom() {
		return nom;
	}
	
//	public int getVitesseMax() {
//		return vitesseMax;
//	}
	
	public int getDistanceParcourue() {
		return distanceParcourue;
	}
}
