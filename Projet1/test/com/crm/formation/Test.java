/**
 * 
 */
package com.crm.formation;

import java.util.Arrays;

/**
 * @author CRM
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("Bonjour");
//		System.out.println("Comment ça va ?");

//		maVariableInt = 2;
//		System.out.println(maVariableInt);
//		int maVariableInt = 21145;
//		
//		{
//			byte maVariableByte = 25;
//			short maVariableShort = 2568;
//			long maVariableLong = 123456789123L;
////			maVariableInt = 257411;
//			System.out.println(maVariableInt);
//		}

//		float maVariableFloat = 2.5F;
//		double maVariableDouble = 12.3647889;
//		
//		char maVariableChar1 = 'c';
//		char maVariableChar2 = '\u0059';
//		System.out.println(maVariableChar2);
//		
//		
//		boolean maVariableBool = true;
//		
//		String maChaine1 = "Mon texte";
//		String maChaine2 = "est super";
//		String maChaine3 = maChaine1 + 32 + maChaine2;
//		System.out.println(maChaine3);
//		

//		int nb1 = 2;
//		int nb2 = ++nb1;
//		System.out.println(nb1);
//		System.out.println(nb2);

//		short nb1, nb2, nb3, nb4;
//		nb1 = 1;
//		nb2 = 2;
//		nb3 = 6;
//		nb4 = 7;
//		boolean bool1 = nb1>nb2;
//		boolean bool2 = (nb3==nb4);
//		boolean bool3 = bool1 || bool2;
//		System.out.println(bool3);
////		System.out.println(!bool1);
//		

//		MethodesMaths.somme(1,2);

//		String palindrome = "elle";
//		String inverse = "";
//		for (int i = palindrome.length() - 1; i >= 0; i--) {
//			inverse = inverse + palindrome.charAt(i);
//		}
//		
//		System.out.println(inverse);
//		
//		String[] tab = {"lolo","lala"};
//		inverse(tab);

		String chaineSeparateur1 = "chaine1=chaine2=chaine3";
		String[] tabChaineSplit1 = chaineSeparateur1.split("=");
		for (String str : tabChaineSplit1) {
			System.out.println(str);
		}
		
		String chaineSeparateur2 = "chaine1|chaine2|chaine3";
		String[] tabChaineSplit2 = chaineSeparateur2.split("\\|");
		for (String str : tabChaineSplit2) {
			System.out.println(str);
		}

		int[] tab1 = { 1, 2, 3 };
		int[] tab2 = { 1, 2, 4 };

		System.out.println(Arrays.equals(tab1, tab2));

	}

	public static void inverse(String[] tab) {
		System.out.println(tab[0]);
	}
}
