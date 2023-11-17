package classes_and_object;

public class Student {

	String name;
	int rollNo;
	private static int numStudent;


public Student(String n, int rn) {
	name=n;
	rollNo=rn;
	numStudent++;
}
public static int getNumStudent(){
	
	return numStudent;
}

public void print(){
	System.out.println("Name"+": "+name+" RollNo"+": "+rollNo);
}

}