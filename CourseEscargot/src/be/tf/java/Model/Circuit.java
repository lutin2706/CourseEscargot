package be.tf.java.Model;

public class Circuit {
	private String nom;
	private int longueur;
	
	public Circuit(String nom, int longueur) {
		this.nom = nom;
		this.longueur = longueur;
	}
	
	public int getLongueur() {
		return longueur;
	}
	
	public String getNom() {
		return nom;
	}

}
