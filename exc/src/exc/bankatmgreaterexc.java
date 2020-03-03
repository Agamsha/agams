package exc;

public class bankatmgreaterexc extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public bankatmgreaterexc()  {
		System.out.println("Sorry!You cannot withdraw more than available balance");
	}

}
 

