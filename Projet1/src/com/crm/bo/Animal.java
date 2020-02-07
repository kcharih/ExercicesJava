package com.crm.bo;

public class Animal {
	private String nom;
	private int nbPattes;

	public Animal() {
		super();
	}

	public Animal(String nom, int nbPattes) {
		this.nom = nom;
		this.nbPattes = nbPattes;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbPattes
	 */
	public int getNbPattes() {
		return nbPattes;
	}

	/**
	 * @param nbPattes the nbPattes to set
	 */
	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}

	public void afficherAnimal() {
		System.out.println("Mon animal est un(e) : " + this.nom);
		System.out.println("Il possède " + this.nbPattes + " pattes");
	}

}
