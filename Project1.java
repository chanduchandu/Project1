class Project1
{
	public static void main(String[] args) 
	{
      String [] s1={"1001","Ashish","R&D","Engineer"};
	  int k1=20000+8000+3000+20000;
	  String []s2={"1002","sushma","PM","consultant"};
	  int k2=30000+12000+9000+32000;
	  String []s3={"1003","Rahul","ACCT","Clerk"};
	  int k3=10000+8000+1000+12000;
	  String []s4={"1004","Chahat","Front Desk","Receptionist"};
	  int k4=12000+6000+2000+15000;
	  String[]s5={"1005","Ranjan","Engg","Manager"};
	  int k5=50000+20000+20000+40000;
	  String[]s6={"1006","suman","manufacturing","Engineer"};
	  int k6=23000+9000+4400+20000;
	  String[]s7={"1007","Tanmay","PM","Consultant"};
	  int k7=29000+12000+10000+32000;
      switch(args[0]){
		case "1001":
			System.out.print("Emp No."+"	"+"Emp Name"+"	"+"Department"+"	"+"Designation"+"	"+"Salary");
		    System.out.println();
			System.out.println(s1[0]+"	"+s1[1]+"		"+s1[2]+"		"+s1[3]+"	"+k1);
			break;
		case "1002":
			System.out.print("Emp No."+"	"+"Emp Name"+"	"+"Department"+"	"+"Designation"+"	"+"Salary");
		System.out.println();
		    System.out.println(s2[0]+"	"+s2[1]+"		"+s2[2]+"		"+s2[3]+"	"+k2);
			break;
		case "1003":
			System.out.print("Emp No."+"	"+"Emp Name"+"	"+"Department"+"	"+"Designation"+"	"+"Salary");
		System.out.println();
		    System.out.println(s3[0]+"	"+s3[1]+"		"+s3[2]+"		"+s3[3]+"		"+k3);
			break;
		case "1004":
			System.out.print("Emp No."+"	"+"Emp Name"+"	"+"Department"+"	"+"Designation"+"	"+"Salary");
		System.out.println();
		    System.out.println(s4[0]+"	"+s4[1]+"		"+s4[2]+"	"+s4[3]+"	"+k4);
			break;
		case "1005":
			System.out.print("Emp No."+"	"+"Emp Name"+"	"+"Department"+"	"+"Designation"+"	"+"Salary");
		System.out.println();
		    System.out.println(s5[0]+"	"+s5[1]+"		"+s5[2]+"		"+s5[3]+"		"+k5);
			break;
		case "1006":
			System.out.print("Emp No."+"	"+"Emp Name"+"	"+"Department"+"	"+"Designation"+"	"+"Salary");
		System.out.println();
		    System.out.println(s6[0]+"	"+s6[1]+"		"+s6[2]+"	"+s6[3]+"	"+k6);
			break;
		case "1007":
			System.out.print("Emp No."+"	"+"Emp Name"+"	"+"Department"+"	"+"Designation"+"	"+"Salary");
		System.out.println();
		    System.out.println(s7[0]+"	"+s7[1]+"		"+s7[2]+"		"+s7[3]+"	"+k7);
			break;
		default:
			System.out.println("There is no employee with employee ID :"+args[0]);

	}

}
}
