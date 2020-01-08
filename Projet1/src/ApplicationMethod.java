import com.crm.api.Utils;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class ApplicationMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nb1 = 2;
		int nb2 = 3;
		int s1 = Utils.somme(nb1, nb2);
		System.out.println(s1);
		
		int difference = MethodesMaths.soustraction(nb1, nb2);
		System.out.println(difference);
		
		String str = "Bonjour";
		Utils.afficherMessage(str);		
	}

}
