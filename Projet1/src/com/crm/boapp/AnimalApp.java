package com.crm.boapp;

import com.crm.bo.Animal;

public class AnimalApp {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Animal chat = new Animal("chat", 4);
		Animal araignee = new Animal("araignee", 8);
		
		Animal[] tabAnimal = new Animal[2];
		tabAnimal[0] = chat;
		tabAnimal[1] = araignee;
		
		
//		Animal poule = new Animal();
//		poule.setNom("poule");
//		System.out.println(poule.getNbPattes());
		
		
//		Animal poule = new Animal("poule", 2);
//		poule.setNbPattes(3);
//		System.out.println(poule.getNbPattes());
		
		Animal poule = new Animal();
		poule.setNom("poule");
		poule.setNbPattes(2);
		poule = null;
		System.out.println(poule.getNbPattes());
		
	}

}
