import java.util.*;
class Q18{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int f=0;
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
		{
			System.out.println("Not Prime ="+n);
			f=1;
			break;
		}
		
	}
	if(f==0)
	System.out.println("Yes it is prime"+n);
	
	
	}
	
}