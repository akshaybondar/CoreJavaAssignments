import java.util.Scanner;

public class Q28 {

	private static Scanner sc;
	private static String arrs[];

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		arrs = new String[5];
		for(int i=0;i<5;i++)
			arrs[i]=sc.next();
		for(String a:arrs)
			System.out.println(a);
		

	}

}
