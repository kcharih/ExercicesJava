/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bonjour");
		System.out.println("Comment ça va ?");

//		maVariableInt = 2;
//		System.out.println(maVariableInt);
		int maVariableInt = 21145;
		
		{
			byte maVariableByte = 25;
			short maVariableShort = 2568;
			long maVariableLong = 123456789123L;
//			maVariableInt = 257411;
			System.out.println(maVariableInt);
		}
		
		float maVariableFloat = 2.5F;
		double maVariableDouble = 12.3647889;
		
		char maVariableChar1 = 'c';
		char maVariableChar2 = '\u0059';
		System.out.println(maVariableChar2);
		
		
		boolean maVariableBool = true;
		
		String maChaine1 = "Mon texte";
		String maChaine2 = "est super";
		String maChaine3 = maChaine1 + 32 + maChaine2;
		System.out.println(maChaine3);
		
		

	}

}