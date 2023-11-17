package classes_and_object;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student s1=new Student("Yash",205);
		Student s2=new Student("Parzi",206);
		
		s1.print();
		System.out.println(Student.getNumStudent());
		

	}

}
