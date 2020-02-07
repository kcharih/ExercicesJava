/**
 * 
 */
package com.crm.bo;

import java.util.Date;

/**
 *
 * @author CRM
 *
 */
public class Personne {

	// Attributs
	public String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;

	// Constructeurs
	public Personne() {
		nom = "";
		prenom = "";
		surnom = "";
		System.out.println("Construction d'un objet Personne(sans param)");
	}

	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	// getter/setter
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// Méthodes
	/**
	 * 
	 */
	public void afficherDetail() {
		System.out.println("Personne : " + prenom + " " + nom + " (" + surnom + ")");
	}

	public boolean isEquals(Personne pers) {
		if (this.prenom.equals(pers.prenom) && this.nom.equals(pers.nom)) {
			return true;
		}

		return false;
	}

	public int incrementeNombre(int nb) {
		return nb++;
	}

	public void modifierPersonne(Personne pers) {
		pers.nom = pers.nom.toUpperCase();
		pers.prenom = pers.prenom.toUpperCase();
	}

}
