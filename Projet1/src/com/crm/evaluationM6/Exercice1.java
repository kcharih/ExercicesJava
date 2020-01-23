/**
 * 
 */
package com.crm.evaluationM6;

/**
 * @author CRM
 *
 */
public class Exercice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char choix = 'Z';
//		if(choix == 'O') {
//			System.out.println("Vous aimez la programmation");
//		} else if(choix == 'N') {
//			System.out.println("Vous n'aimez pas la programmation");
//		} else {
//			System.out.println("Vous voulez voir la suite...");
//		}

		switch (choix) {
		case 'O':
			System.out.println("Vous aimez la programmation");
			break;
		case 'N':
			System.out.println("Vous n'aimez pas la programmation");
			break;
		default:
			System.out.println("Vous voulez voir la suite...");
			break;
		}
	}

}
