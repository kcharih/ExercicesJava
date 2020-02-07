package com.crm.formation;

public class ParameterMethod {

	public static void main(String[] args) {
		int nb = 3;
		ajouterUn(nb);
		System.out.println(nb);

	}

	private static void ajouterUn(int nombre) {
		nombre = nombre + 1;
	}

}
