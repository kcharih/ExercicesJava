/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class ConditionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		boolean estVrai = false;
//		System.out.println("Début programme");
//		if(estVrai == true) {
//			System.out.println("YES");
//			System.out.println("WE CAN");
//		} else {
//			System.out.println("NO");
//			System.out.println("WE CAN NOT");			
//		}
//		
		System.out.println("Fin programme");
		
		int nb = 3;
		String chaine = "OKK";

		// syntaxe else if
		if (nb > 10 && chaine.equals("OK")) {
			System.out.println("Condition remplie");
		} else if (nb > 10 || chaine.equals("OK")) {
			System.out.println("Une des 2 conditions est remplie");
		} else {
			System.out.println("Aucune Condition remplie");
		}
		
		// if imbriquée
		if (nb > 10 && chaine.equals("OK")) {
			System.out.println("Condition remplie");
		} else { 
			if (nb > 10 || chaine.equals("OK")) {
				System.out.println("Une des 2 conditions est remplie");
			}
		}

	}

}
