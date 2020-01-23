/**
 * 
 */
package com.crm.evaluationM6;

/**
 * @author CRM
 *
 */
public class Exercice7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Création et initialization du tableau
		int[] tabInt = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		// Afficher les éléments du tableau(V1)
		for (int i = 0; i < tabInt.length; i++) {
			System.out.println(tabInt[i]);
		}

		// Afficher les éléments du tableau(V2)
		for (int element : tabInt) {
			System.out.println(element);
		}

		// Modification du dernier élément
		tabInt[tabInt.length - 1] = 0;		
	}

}
