/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class OperateurTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maVariableInt1;
		maVariableInt1 = 36;
		System.out.println(maVariableInt1);
		
		// Operateur d'assignement, d'affectation
		int maVariableInt2;
		maVariableInt2 = maVariableInt1;
//		System.out.println(maVariableInt2);
		
		int maVariableInt3;
		maVariableInt3 = maVariableInt2 = maVariableInt1 = 58;
		System.out.println(maVariableInt1);
		System.out.println(maVariableInt2);
		System.out.println(maVariableInt3);
		
		
		int somme1;
		somme1 = 5 + 6;
		System.out.println(somme1);
		
		int somme2;
		somme2 = somme1 + 7;
		System.out.println(somme2);

		int quotient1;
		quotient1 = 5 / 2;
		System.out.println(quotient1);
		
		float quotient2 = 5f / 2;
		System.out.println(quotient2);
		
		float quotient3 = 5 / 2;
		System.out.println(quotient3);
		
		int modulo;
		modulo = 5 % 2;
		System.out.println(modulo);

		
	}

}
