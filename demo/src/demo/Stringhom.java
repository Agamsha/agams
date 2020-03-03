package demo;

public class Stringhom {

	public static void main(String[] args) {
		String S1="Hello How Are You";
		System.out.println(S1);
		int size=0;
		int index=0;
		for(int i=0;i<=S1.length()-1;i++)
		{
			if(S1.charAt(i) == 'H') {
			size++;	
		 index=S1.indexOf('H',i);
		 System.out.println("Index of H "+index);
		 }
		}
		
		System.out.println("Number of time H char occur "+size);
		// TODO Auto-generated method stub

	}

}
 