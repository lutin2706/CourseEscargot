package be.tf.java.Model;

import java.util.ArrayList;
import java.util.Random;

public class Course {
	private String nom;
	private Circuit circuit;
	private ArrayList<Escargot> listeParticipants;
	private Random random;
	private Escargot gagnant;

	public Course(String nom, Circuit circuit) {
		this.nom = nom;
		this.listeParticipants = new ArrayList<>();
		this.random = new Random();
		this.circuit = circuit;
	}

	public void ajouterParticipant(Escargot escargot) {
		listeParticipants.add(escargot);
	}

	public Escargot[] getListeParticipants() {
		Escargot[] listeEscargots = new Escargot[listeParticipants.size()];
		
		int i = 0;
		for (Escargot escargot : listeParticipants) {
			listeEscargots[i] = escargot;
			i++;
		}
		return listeEscargots;
	}

	public Circuit getCircuit() {
		return circuit;
	}

	public String getNom() {
		return nom;
	}

	public boolean faireLaCourse() throws InterruptedException {
		for (Escargot escargot : listeParticipants) {
//			escargot.avancer(random.nextInt(escargot.getVitesseMax()));
			escargot.avancer(random.nextInt(10));
			if (escargot.getDistanceParcourue() >= circuit.getLongueur()) {
				gagnant = escargot;
				return false;
			}
		}
		return true;
	}

	public String getGagnant() {
		return gagnant.getNom();
	}
}
