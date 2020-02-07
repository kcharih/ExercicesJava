package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personne;

public class PersonneAppScan {

	public static void main(String[] args) {
		// Init
		Scanner sc = new Scanner(System.in);
		String prenom = "";
		String nom = "";
		String surnom = "";
		
		// Demande infos
		System.out.println("Quel est votre prenom ?");
		prenom = sc.nextLine();
		
		System.out.println("Quel est votre nom ?");
		nom = sc.nextLine();
		
		System.out.println("Quel est votre surnom ?");
		surnom = sc.nextLine();

		// Résultat
		Personne user = new Personne(prenom, nom);
		user.surnom = surnom;
		System.out.println("Bienvenue dans notre programme");
		user.afficherDetail();
		
		sc.close();
	}

}
