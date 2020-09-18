import java.util.*;
class Q7{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++)
		{
			int mark=sc.nextInt();
			sum=sum+mark;	
		}
		double p=(sum/5.0);
		System.out.println("Percentage "+p+"%");
		
	}
}