package com.crm.evaluationM7;

public class ExamenTest {

	public static void main(String[] args) {
		Examen examen1 = new Examen();
		examen1.setPrenom("Tommy");
		examen1.setMatiere("Anglais");
		examen1.setNote(17);
		examen1.afficherDetail();

		// Création des objets examens
		Examen examenPierreInformatique = new Examen("Pierre", "Informatique", 12);
		Examen examenPierreAnglais = new Examen("Pierre", "Anglais", 14);
		Examen examenPierreFrancais = new Examen("Pierre", "Français", 12);

		Examen examenPaulInformatique = new Examen("Paul", "Informatique", 15);
		Examen examenPaulAnglais = new Examen("Paul", "Anglais", 10);
		Examen examenPaulFrancais = new Examen("Paul", "Français", 8);

		Examen examenRayanInformatique = new Examen("Rayan", "Informatique", 13);
		Examen examenRayanAnglais = new Examen("Rayan", "Anglais", 17);
		Examen examenRayanFrancais = new Examen("Rayan", "Français", 15);

		Examen examenBruceInformatique = new Examen("Bruce", "Informatique", 10);
		Examen examenBruceAnglais = new Examen("Bruce", "Anglais", 11);
		Examen examenBruceFrancais = new Examen("Bruce", "Français", 7);

		// Création du tableau d'examens
		Examen[] tabExam = { examenPierreInformatique, examenPierreAnglais, examenPierreFrancais,
				examenPaulInformatique, examenPaulAnglais, examenPaulFrancais, examenRayanInformatique,
				examenRayanAnglais, examenRayanFrancais, examenBruceInformatique, examenBruceAnglais,
				examenBruceFrancais };

		// Calcul de la moyenne de la classe en informatique
		int nbNoteInf = 0;
		int sommeNbInf = 0;
		for (Examen exam : tabExam) {
			if (exam.getMatiere().equals("Informatique")) {
				nbNoteInf++;
				sommeNbInf += exam.getNote();
			}
		}
		float moyenneInf = (float) sommeNbInf / nbNoteInf;
		System.out.println("La moyenne de la classe en informatique est : " + moyenneInf);

		// Recherche de la note la plus haute en français
		int noteSupFr = 0;
		String prenomNoteSupfr = "";
		for (Examen exam : tabExam) {
			if (exam.getMatiere().contentEquals("Français") && exam.getNote() > noteSupFr) {
				noteSupFr = exam.getNote();
				prenomNoteSupfr = exam.getPrenom();
			}
		}
		System.out.println("La note la plus haute en français est : " + noteSupFr + "(" + prenomNoteSupfr + ")");

		// Recherche de la note la plus basse en anglais
		int noteBasseEn = 20;
		String prenomNoteBasseEn = "";
		for (Examen exam : tabExam) {
			if (exam.getMatiere().contentEquals("Anglais") && exam.getNote() < noteBasseEn) {
				noteBasseEn = exam.getNote();
				prenomNoteBasseEn = exam.getPrenom();
			}
		}
		System.out.println("La note la plus haute en français est : " + noteBasseEn + "(" + prenomNoteBasseEn + ")");

	}

}
