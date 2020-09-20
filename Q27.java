import java.util.Scanner;

public class Q27 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		int a=arr[0];
		for(int i=0;i<5;i++)
		{
			if(a<arr[i])
			{
				a=arr[i];
			}
			
		}
		System.out.println("Gratest   "+a);
		for(int i=0;i<5;i++)
		{
			if(a>arr[i])
			{
				a=arr[i];
			}
		}
		System.out.println("Smallest    "+a);
	}

}
