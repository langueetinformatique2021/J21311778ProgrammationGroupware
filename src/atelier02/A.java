package atelier02;

/** A contient la méthode treize retournant la valeur true si un entier n passé 
*
*/
public class A {

	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public static boolean treize(int n) {
		
// calcul du reste d'une division par 13
	  int n13 = n / 13;
      if (n == n13 * 13)
    	  return true;
      else
    	  return false;
	}
}

