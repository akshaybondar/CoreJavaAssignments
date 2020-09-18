import java.util.*;
class Q22{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a[] =new int[10];


		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		Arrays.sort(a);
		for(int x=a.length-1;x>=0;x--)
		System.out.println(a[x]);
	}
	
}