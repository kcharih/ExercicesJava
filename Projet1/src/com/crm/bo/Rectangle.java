package com.crm.bo;

public class Rectangle {
	private float longueur;
	private float largeur;

	public Rectangle() {
		super();
	}

	public Rectangle(float longueur, float largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	/**
	 * @return the longueur
	 */
	public float getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public float getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

}
