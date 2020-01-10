/**
 * 
 */
package com.crm.api;

/**
 * @author CRM
 *
 */
public class Utils {

	// Declaration d'une constante PI
	public static final float MY_PI = 3.14f;

	public static int somme(int a, int b) {
		int s = a + b;
		return s;
	}

	public static void afficherMessage(String texte) {
		System.out.println(texte);
	}

	public static float surfaceCercle(int rayon) {
		// Calcul de la surface
		float surface = MY_PI * rayon * rayon;

		return surface;
	}

}
