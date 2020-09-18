import java.util.*;
class Q21{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a[] =new int[10];
	int sum=0;
	double avg;	
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=(double)(sum/a.length);
		System.out.println("Avg = "+avg);
		System.out.println("Avg = "+sum);
	}
	
}