package com.crm.evaluationM7;

public class CompteUtilisateur {
	private static final String DEFAULT_PRENOM = "TEST";
	private static final String DEFAULT_NOM = "TEST";
	private static final String DEFAULT_LOGIN = "TEST";
	private static final String DEFAULT_PASS = "pass";

	private String prenom;

	private String nom;

	private String login;

	private String motDePasse;

	/**
	 * Constructeur sans paramètre
	 */
	public CompteUtilisateur() {
		this.prenom = DEFAULT_PRENOM;
		this.nom = DEFAULT_NOM;
		this.login = DEFAULT_LOGIN;
		this.motDePasse = DEFAULT_PASS;
	}

	/**
	 * Constructeur avec paramètre
	 */
	public CompteUtilisateur(String prenom, String nom) {
		if (prenom != null && nom != null && !prenom.isEmpty() && !nom.isEmpty()) {
			this.prenom = prenom;
			this.nom = nom;
			this.login = (prenom.substring(0, 1) + nom).toLowerCase();
			this.motDePasse = DEFAULT_PASS;
		} else {
			this.prenom = DEFAULT_PRENOM;
			this.nom = DEFAULT_NOM;
			this.login = DEFAULT_LOGIN;
			this.motDePasse = DEFAULT_PASS;
		}
	}

	/**
	 * getter
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * setter
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * getter
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * setter
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * getter
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * setter
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * getter
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * setter
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * Afficher les informations du compte utilisateur
	 */
	public void afficherDetail() {
		System.out.println("Informations compte utilisateur :");
		System.out.println("Prénom : " + getPrenom());
		System.out.println("Nom : " + getNom());
		System.out.println("Login : " + getLogin());
		System.out.println("Mot de passe : " + getMotDePasse());
	}
}
