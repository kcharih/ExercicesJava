package com.crm.evaluationM7;

/**
 * Tests unitaires de la classe Cercle
 * 
 * @author CRM
 *
 */
public class CercleTest {

	public static void main(String[] args) {
		// Instanciation sans paramètre
		Cercle cercle1 = new Cercle();
		cercle1.setRayon(3);
		cercle1.afficherDetails();

		// Instanciation avec paramètre
		Cercle cercle2 = new Cercle(-5);
		System.out.println("Rayon : " + cercle2.getRayon());
		System.out.println("Périmètre : " + cercle2.perimetre());
		System.out.println("Périmètre : " + cercle2.surface());
	}

}
