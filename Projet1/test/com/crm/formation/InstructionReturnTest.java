/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class InstructionReturnTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nombre = 10;
		afficherListeNombre(nombre);
	}
	
	public static void afficherListeNombre(int nb) {
		System.out.println("Début méthode afficherListeNombre");
		
		for(int i = 0;i<nb;i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Fin méthode afficherListeNombre");
	}

}
