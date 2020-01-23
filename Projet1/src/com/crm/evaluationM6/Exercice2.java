/**
 * 
 */
package com.crm.evaluationM6;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Exercice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclaration des contantes, variables
		final float TAUX = 1.11F;
		float montantEuro = 0.0F;
		float montantDollar = 0.0F;
		Scanner sc = new Scanner(System.in);

		// Récupération du montant en euros
		System.out.println("Entrer un montant en euro");
		montantEuro = sc.nextFloat();

		// Vérification si montant valide
		if (montantEuro < 0) {
			System.out.println("Montant invalide, veuillez effectuer une nouvelle saisie");
		} else {
			// Calcul du montant en dollar
			montantDollar = montantEuro * TAUX;

			// Affichage du résultat de la conversion
			System.out.println("Le montant en dollar est de : " + montantDollar);
		}

		sc.close();
	}
}
