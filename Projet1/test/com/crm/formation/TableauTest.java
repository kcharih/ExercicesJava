/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class TableauTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclaration de tableau
		int[] tabInt1 = new int[5];
		int tabInt2[] = new int[5];

		// Initialiser un tableau
		int[] tabInt3 = { 1, 2, 3 };

		// Accéder à un élément du tableau
		int premierElement = tabInt3[0];
		System.out.println("Le 1er élément(indice 0) du tableau est : " + premierElement);

		int deuxiemeElement = tabInt3[1];
		System.out.println("Le 2e élément(indice 1) du tableau est : " + deuxiemeElement);

		int troisiemeElement = tabInt3[2];
		System.out.println("Le 3e élément(indice 2) du tableau est : " +troisiemeElement);

		// Indice dépasse la taille du tableau
		// int quatriemeElement = tabInt3[3];

		// Modifier la valeur d'un élément du tableau
		tabInt3[0] = 10;
		premierElement = tabInt3[0];
		System.out.println("1er élément modifié : " + premierElement);

		// Afficher la taille du tableau
		System.out.println("La taille du tableau est : " + tabInt3.length);
		
		// Parcours du tableau( 1ere version)
//		System.out.println(tabInt3[0]);
//		System.out.println(tabInt3[1]);
//		System.out.println(tabInt3[2]);
		
		System.out.println("Parcours du tableau(1ere version :");
		for (int i = 0; i < tabInt3.length; i++) {
			System.out.println(tabInt3[i]);
		}
		
		// Parcours du tableau( 2e version)
		System.out.println("Parcours du tableau(2e version :");
		for(int nb : tabInt3) {
			System.out.println(nb);
		}
		

	}

}
