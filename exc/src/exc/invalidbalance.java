package exc;

public class invalidbalance extends Throwable{


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public invalidbalance() {
	System.out.println("Sorry!You cannot withdraw. Minimum Balance to be maintained is Rs.10,000");
}
}
 
