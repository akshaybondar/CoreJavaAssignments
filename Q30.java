import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int x;
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				a[i][j]=sc.nextInt();
		
		x=a[0][0]+a[1][1]+a[2][2]+a[0][2]+a[2][0];
		
		System.out.println(x);
				
	}

}

