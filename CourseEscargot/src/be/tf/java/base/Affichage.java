package be.tf.java.base;

import java.util.Scanner;
import be.tf.java.Model.Course;
import be.tf.java.Model.Escargot;

public class Affichage {
	
	public static void afficherIntroduction(Course course) {
		
		System.out.println("********* Bienvenue à la course \"" + course.getNom() + "\" sur le circuit \"" + course.getCircuit().getNom() + "\", "
				+ "d'une longueur totale de " + course.getCircuit().getLongueur() + " centimètres *********\n");
		
		Escargot[] participants = course.getListeParticipants();
		System.out.println("Les participants sont:");
		for (Escargot escargot : participants) {
			System.out.println("\t" + escargot.getNom());// + " (vitesse max: " + escargot.getVitesseMax() + " cm/s)");
		}
		System.out.println("\t");
		
		System.out.println("Tapez enter pour démarrer la course <ENTER>");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		sc.close();
		System.out.println("A vos marques ! Prêts ? Partez ! PAN !");

	}
	
	public static void afficherGagnant(String gagnant) {
		System.out.println("La course est terminée. Le gagnant est " + gagnant);
		System.out.println("********* Au plaisir de vous revoir sur notre champ de course *********");
	}
	
	public static void afficherCourse(Course course) {
		// Dessin du champ de course
		String longueurCourse = "";
		for (int i = 0; i <= course.getCircuit().getLongueur() + 4; i++) {
			longueurCourse += "*";
		}		
		System.out.println("\n\n\n\n\n\n\n\n" + longueurCourse);
		
		// Dessin des escargots participants
		Escargot[] participants = course.getListeParticipants();
		for (Escargot escargot : participants) {
			String ligneEscargot = "|";
			for (int i = 0; (i < escargot.getDistanceParcourue() && i < course.getCircuit().getLongueur()); i++) {
				ligneEscargot += "-";
			}
			ligneEscargot += "@_%";
			for (int j = escargot.getDistanceParcourue(); j < course.getCircuit().getLongueur(); j++) {
				ligneEscargot += " ";
			}
			ligneEscargot += "| " + escargot.getNom();
			System.out.println(ligneEscargot);
		}
		System.out.println(longueurCourse);
		
	}
}
