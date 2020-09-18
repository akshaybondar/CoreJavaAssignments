import java.util.*;
class Q23{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a[] =new int[5];
	int y=0,r=0,rev=0;

		for(int i=0;i<a.length;i++)
		{	
			y=sc.nextInt();
			while(y!=0)
			{
				r=y%10;
				rev=(rev*10)+r;
				y=y/10;
				
			
			}
			
			a[i]=rev;
			rev=0;
			
		}
		
		for(int x:a)
		System.out.println(x);
	}
	
}