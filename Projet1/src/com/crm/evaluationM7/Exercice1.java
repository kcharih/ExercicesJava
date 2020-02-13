package com.crm.evaluationM7;

public class Exercice1 {

	public static void main(String[] args) {
		// Init
		String[] motAlphabet = { "I", "N", "F", "O", "R", "M", "A", "T", "I", "Q", "U", "E" };
		String[] motAscii = new String[motAlphabet.length];

		// Création du tablau de conversion
		String[][] tabAscii = {
				{ "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
						"U", "V", "W", "X", "Y", "Z" },
				{ "41", "42", "43", "44", "45", "46", "47", "48", "49", "4A", "4B", "4C", "4D", "4E", "4F", "50", "51",
						"52", "53", "54", "55", "56", "57", "58", "59", "5A" } };

		int postionLettre = 0;
		// Iteration sur chaque lettre du mot
		for (String lettre : motAlphabet) {
			// Recherche de la lettre dans le tableau de conversion
			for (int i = 0; i < tabAscii[0].length; i++) {
				if (lettre.equals(tabAscii[0][i])) {
					// On remplit le mot en hexa
					motAscii[postionLettre] = tabAscii[1][i];
				}
			}
			postionLettre++;
		}

		// Affichage du mot ASCII
		for (String lettre : motAscii) {
			System.out.print(lettre);
		}

	}

}
