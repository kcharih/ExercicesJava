/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class LectureClavierTest {

	/**
	 * @param args paramètres du programme
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir une chaîne de caractères :");
		String chaine = sc.nextLine();
		System.out.println("Vous avez saisi : " + chaine);
		sc.close();

	}

}
