/**
 * 
 */
package com.crm.api;

/**
 * @author CRM
 *
 */
public class SplitChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Chaine de caractères à splitter
		String strToSplit = "toto,titi,tata";
		
		// Le résultat du split est stocké dans un tableau 
		String[] tabSplit = strToSplit.split(",");

		// Parcours du tableau avec le séparateur ,
		for (String str : tabSplit) {
			System.out.println(str);
		}
	}
}
