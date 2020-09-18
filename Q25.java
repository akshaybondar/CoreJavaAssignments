import java.util.*;
class Q25{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a[] =new int[5];
	int y=0,f=0;
		for(int i=0;i<a.length;i++)
		{	
		a[i]=sc.nextInt();	
		}
		
		for(int x:a){
			if(x%2==0){
				f=x+f;
			}
			else{
				y=y+x;
			}
		}
		System.out.println("Sum of Even Element = "+f);
		System.out.println("Sum of Odd Element = "+y);	
	}
	
}