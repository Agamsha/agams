package len;

public class vocount {
	String St="Pooja Garg";
	int vowels=0;
	public void Vowe() {
		
		for(int i=0;i<=St.length()-1;i++) {
			char St1=St.charAt(i);
			if( St1 == 'a'|| St1=='o')
				{++vowels;
				}
			else
			{System.out.println(" ");
				}}
			System.out.println("No of vowels"+vowels);
			
	}
	public static void main(String[] args) {vocount oo=new vocount();
	oo.Vowe();
		// TODO Auto-generated method stub

	}

}
