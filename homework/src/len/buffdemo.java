package len;

public class buffdemo {
	public void scc()
	{
		StringBuffer sb=new StringBuffer("Hello ");
		sb.append("How r you");
		System.out.println(sb);
		sb.delete(1,5);
		System.out.println(sb);
		StringBuilder bld=new StringBuilder("Welcome ");
		bld.append("to btes");
		System.out.println(bld);}

	public static void main(String[] args) {buffdemo oo=new buffdemo();
	oo.scc();
		// TODO Auto-generated method stub

	}

}
