import java.util.*;
class Q6{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Radius ");
		double r=sc.nextDouble();
		double a = (3.14*r*r);
		float c = (float)(2*3.14*r);
		System.out.println("Area "+a);
		System.out.println("Circumferance  "+c);
	}
}