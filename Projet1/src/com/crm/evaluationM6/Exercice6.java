/**
 * 
 */
package com.crm.evaluationM6;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Exercice6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclaration des variables
		int nombreDepart = 0;
		int nombreFin = 0;
		Scanner sc = new Scanner(System.in);

		// Récupération des informations utilisateur
		System.out.println("Entrer un premier nombre :");
		nombreDepart = sc.nextInt();
		System.out.println("Entrer un deuxième nombre :");
		nombreFin = sc.nextInt();

		// Affichage du résultat boucle for
		System.out.println("Résultat boucle FOR");
		for (int i = nombreDepart; i < nombreFin; i += 2) {
			System.out.println(i);
		}

		// Affichage du résultat boucle while
		System.out.println("Résultat boucle WHILE");
		int i = nombreDepart;
		while (i < nombreFin) {
			System.out.println(i);
			i += 2;
		}

		// Affichage du résultat boucle do while
		System.out.println("Résultat boucle DO WHILE");
		int j = nombreDepart;
		do {
			System.out.println(j);
			j += 2;
		} while (j < nombreFin);

		sc.close();
	}

}
