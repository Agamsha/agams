package inhr;

 class inhrt {
	int empid;
	String empName;
	int Total_leaves;
	double Total_salary;
	public inhrt(int id,String Name,int leaves)
	{empid=id;
	empName=Name;
	Total_leaves=leaves;
	}
	public void leave_data() {
		System.out.println("Id of"+empid);
		System.out.println("name of"+empName);
		System.out.println("leaves of"+Total_leaves);
	}

	void calculate()
	{
		
		
	}
	class permanentemp extends inhrt{
		void details(int id,String Name,int leaves)
		{
		}
		
	}
	public static void main(String[] args) {inhrt oo=new inhrt(13,AGAM,17);
		// TODO Auto-generated method stub

	}

}
