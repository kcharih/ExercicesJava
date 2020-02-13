package com.crm.evaluationM7;

public class Cercle {

	private int rayon;

	/**
	 * Constructeur sans paramètre
	 */
	public Cercle() {
		rayon = 0;
	}

	/**
	 * Constructeur avec paramètre
	 * 
	 * @param rayon rayon du cercle
	 */
	public Cercle(int rayon) {
		if (rayon < 0) {
			this.rayon = -rayon;
		} else {
			this.rayon = rayon;
		}
	}

	/**
	 * Getter
	 */
	public int getRayon() {
		return rayon;
	}

	/**
	 * Setter
	 */
	public void setRayon(int rayon) {
		if (rayon < 0) {
			this.rayon = -rayon;
		} else {
			this.rayon = rayon;
		}
	}

	/**
	 * Calcul du périmetre du cercle
	 */
	public double perimetre() {
		return 2 * this.rayon * Math.PI;
	}

	/**
	 * Calcul de la surface du cercle
	 */
	public double surface() {
		return this.rayon * this.rayon * Math.PI;
	}

	/**
	 * Afficher les infos du cercle
	 */
	public void afficherDetails() {
		System.out.println("Le rayon du cercle vaut : " + this.rayon);
		System.out.println("Le périmètre du cercle vaut : " + perimetre());
		System.out.println("La surface du cercle vaut : " + surface());
	}

}
