package demo;

public class vow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String St="what is going on";
		System.out.println(St);
        char arr[]= {'a','e','i','o','u'};
        String s=new String(arr);
        System.out.println(s);
       // System.out.println(St.substring(3,9));
        //System.out.println(s.toUpperCase());
       // System.out.println(St.trim());
       // System.out.println(St.length());
        for(int i=0;i<St.length();i++)
        {
        	for(int j=0;j<s.length();j++) {
        	if(St.charAt(i)==s.charAt(j))
        	{System.out.println(St.charAt(i)+" value "+i);
        }
	}

}}}
