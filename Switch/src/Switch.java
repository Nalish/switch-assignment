import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		System.out.println("0:Sh20(30mins,3hrs)");
		System.out.println("1:Okoa Easy Sh50(50Mins,midnight)");
		System.out.println("2:Okoa 100");
		System.out.println("3:Okoa 50");
		System.out.println("4:Okoa 20(or Ksh50, Midnight)");
		System.out.println("5:Okoa 10");
		System.out.println("6:Okoa 5");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();

switch(n) {
case 0:
	System.out.println("Existing unpaid Okoa:0");
	System.out.println("New Okoa request:20");
	System.out.println("Total debt will be:20");
	System.out.println("1:Accept");
	System.out.println("2:Decline");
	System.out.println("0:Back");
	
	
	break;
case 1:
	System.out.println("Existing unpaid Okoa:0");
	System.out.println("New Okoa request:100");
	System.out.println("Total debt will be:100");
	System.out.println("1:Accept");
	System.out.println("2:Decline");
	System.out.println("0:Back");
	break;
case 3:
	System.out.println("Existing unpaid Okoa:0");
	System.out.println("New Okoa request:50");
	System.out.println("Total debt will be:50");
	System.out.println("1:Accept");
	System.out.println("2:Decline");
	System.out.println("0:Back");
	break;
case 4:
	System.out.println("Existing unpaid Okoa:");
	System.out.println("New Okoa request:20");
	System.out.println("Total debt will be:20");
	System.out.println("1:Accept");
	System.out.println("2:Decline");
	System.out.println("0:Back");
	break;
case 5:
	System.out.println("Existing unpaid Okoa:0");
	System.out.println("New Okoa request:10");
	System.out.println("Total debt will be:10");
	System.out.println("1:Accept");
	System.out.println("2:Decline");
	System.out.println("0:Back");
	break;
case 6:
	System.out.println("Existing unpaid Okoa:0");
	System.out.println("New Okoa request:5");
	System.out.println("Total debt will be:5");
	System.out.println("1:Accept");
	System.out.println("2:Decline");
	System.out.println("0:Back");
	break;
	default:
		System.out.println("Invalid option please try again");





}
n=input.nextInt();
do{
	System.out.println("0:Sh20(30mins,3hrs)");
	System.out.println("1:Okoa Easy Sh50(50Mins,midnight)");
	System.out.println("2:Okoa 100");
	System.out.println("3:Okoa 50");
	System.out.println("4:Okoa 20(or Ksh50, Midnight)");
	System.out.println("5:Okoa 10");
	System.out.println("6:Okoa 5");
}
while(n<0);
	}
	}


