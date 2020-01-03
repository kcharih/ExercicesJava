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
		
		int maVariableInt2;
		maVariableInt2 = maVariableInt1;
//		System.out.println(maVariableInt2);
		
		int maVariableInt3;
		maVariableInt3 = maVariableInt2 = maVariableInt1 = 58;
		System.out.println(maVariableInt1);
		System.out.println(maVariableInt2);
		System.out.println(maVariableInt3);
		
	}

}
