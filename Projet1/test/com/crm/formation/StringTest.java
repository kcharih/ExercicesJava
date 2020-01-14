package com.crm.formation;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class StringTest {

	/**
	 * @param args paramètres du programme
	 */
	public static void main(String[] args) {
		// affichage d'une chaine
		String texte = "Bonjour";
		System.out.println(texte);
		
		// Test de la concanténation
		texte = texte + " Khalil";
		System.out.println(texte);

		// Longueur d'une chaine
		String str1 = "Java c'est génial !!!   ";
		System.out.println(str1.length());
		
		// Mettre en majuscule
		String str2 = str1.toUpperCase();
		System.out.println(str2);
		
		// Suppression des blancs en début et fin de chaine
		String str3 = str1.trim();
		System.out.println(str3);
		
		// Remplacer des caracteres
		String str4 = str1.replace('a', 'e');
		System.out.println(str4);
		
		// Extraction d'une sous chaine
		String str5 = str1.substring(0, 4);
		System.out.println(str5);
		
		// Comparaison de chaines
		String chaine1 = "test";
		String chaine2 = "TEST";
		System.out.println(chaine1.equals(chaine2));
		System.out.println(chaine1.equalsIgnoreCase(chaine2));
		
		
		
	}

}
