package com.crm.evaluationM7;


/**
 * Tests unitaires de la classe CompteUtilisateur
 * 
 * @author CRM
 *
 */
public class CompteUtilisateurTest {

	public static void main(String[] args) {
		CompteUtilisateur user1 = new CompteUtilisateur();
		user1.afficherDetail();
		
		CompteUtilisateur user2 = new CompteUtilisateur("Khalil", "CHARIH");
		user2.setMotDePasse("123456");
		user2.afficherDetail();
	}

}
