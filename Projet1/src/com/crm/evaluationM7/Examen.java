package com.crm.evaluationM7;

public class Examen {
	private String prenom;
	private String matiere;
	private int note;

	/**
	 * Constructeur sans paramètre
	 */
	public Examen() {
		this.prenom = "";
		this.matiere = "";
		this.note = 0;
	}

	/**
	 * Constructeur avec paramètre
	 */
	public Examen(String prenom, String matiere, int note) {
		super();
		this.prenom = prenom;
		this.matiere = matiere;
		this.note = note;
	}

	/**
	 * getter
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * getter
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * getter
	 */
	public String getMatiere() {
		return matiere;
	}

	/**
	 * getter
	 */
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	/**
	 * getter
	 */
	public int getNote() {
		return note;
	}

	/**
	 * setter
	 */
	public void setNote(int note) {
		this.note = note;
	}

	/**
	 * Afficher les informations de l'examen
	 */
	public void afficherDetail() {
		System.out.println("Prenom du stagiaire : " + this.prenom);
		System.out.println("Matière évaluée : " + this.matiere);
		System.out.println("Note obtenue : " + this.note);
	}

}
