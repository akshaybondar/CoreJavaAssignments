class Student{
	private static int count;
	private int rno;
	private String name;
	public void getData() {
		System.out.println(rno+" = "+name+"  " +count);
	}
	public void setData(int r,String n) {
		rno = r;
		name=n;
		
	}
	Student(){
		count++;
	}
}
public class Q31 {

	private static Student s;

	public static void main(String[] args) {
		s = new Student();
		s.setData(101, "Dipesh");
		s.getData();
		

	}

}
