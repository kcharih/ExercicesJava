/**
 * 
 */
package com.crm.evaluationM6;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Exercice5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclaration des contantes, variables
		final String SUFFIXE_MAIL = "@crm.com";
		final char POINT = '.';
		String prenom = "";
		String nom = "";
		String mail = "";
		Scanner sc = new Scanner(System.in);

		// Récupération des informations utilisateur
		System.out.println("Entrer votre prénom : ");
		prenom = sc.nextLine();
		System.out.println("Entrer votre nom : ");
		nom = sc.nextLine();

		// Vérification de la validité des informations
		if (prenom.isEmpty() || nom.isEmpty()) {
			System.out.println("Les informations saisies ne sont pas complètes");
		} else {
			// Construction de l’adresse mail avec le format spécifié
			mail = prenom.toLowerCase() + POINT + nom.toLowerCase() + SUFFIXE_MAIL;
			// Affichage du résultat
			System.out.println("Votre adresse mail sera : " + mail);
		}

		sc.close();
	}

}
