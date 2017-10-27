package be.tf.java.base;

import be.tf.java.Model.Circuit;
import be.tf.java.Model.Course;
import be.tf.java.Model.Escargot;

public class Main {

	/*
	 * Créez une course d'escargot:
	 * 
	 * - Vous aurez besoin de créer 3 escargots, leur vitesse sera déterminée de façon aléatoire à chaque tour de boucle (while)
	 * - Vous aurez également besoin d'une course d'une certaine longueur
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Circuit circuit = new Circuit("Super loop", 150);
		Course course = new Course("Derby des escargots", circuit);
		
//		Escargot flashMcSnail = new Escargot("Flash Mc Snail", 10);
//		Escargot turbo = new Escargot("Turbo" , 12);
//		Escargot snailInBlack = new Escargot("Snail in Black", 9);
		
		Escargot flashMcSnail = new Escargot("Flash Mc Snail");
		Escargot turbo = new Escargot("Turbo");
		Escargot snailInBlack = new Escargot("Snail in Black");
		
		course.ajouterParticipant(flashMcSnail);
		course.ajouterParticipant(turbo);
		course.ajouterParticipant(snailInBlack);
		
		Affichage.afficherIntroduction(course);
		
		while (course.faireLaCourse()) {
			Affichage.afficherCourse(course);
			Thread.sleep(1000);
		}
		Affichage.afficherCourse(course);
		
		Affichage.afficherGagnant(course.getGagnant());

	}

}
