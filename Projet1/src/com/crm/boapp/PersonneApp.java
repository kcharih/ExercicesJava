package com.crm.boapp;

import com.crm.bo.Personne;

public class PersonneApp {

	public static void main(String[] args) {
//		Personne pers = new Personne();
//		pers.surnom = "Joe";
//		pers.setNom("charih");
//
//		System.out.println("bienvenue " + pers.getNom() + " (" + pers.surnom + ")");
		
//		Personne pers2 = new Personne();
//		pers2.afficherDetail();
//		System.out.println(pers2);
		
		// Déclencher une exception suite au déréférencement de l'objet
//		pers2 = null;		
//		System.out.println(pers2.getNom());
		
//		Personne pers3 = new Personne("bob", "dylan");
//		pers3.afficherDetail();
		
		int a = 5;
		int b = 5;
		if(a == b) {
			System.out.println("Les 2 entiers sont identiques");
		}
		
		
		Personne pers4 = new Personne("khalil", "charih");
		Personne pers5 = new Personne("khalil", "charih");
		if(pers4 == pers5) {
			System.out.println("Les 2 objets sont identiques");
		}
		
		if(pers4.isEquals(pers5) == true) {
			System.out.println("Les 2 objets sont identiques(méthode isEquals)");
		}
		
		int nb = 5;
		pers5.incrementeNombre(nb);
		System.out.println(nb);
		
		pers4.modifierPersonne(pers5);
		pers5.afficherDetail();
		
	}

}
