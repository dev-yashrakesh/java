package classes_and_object;

public class FractionUse {

	public static void main(String[] args) {
		Fraction f1=new Fraction(10,20);
		Fraction f2=new Fraction(10,20);
		f1.print();
		Fraction f3=f2.add(f1, f2);
		f3.print();
		
		Fraction f4=f2.multiply(f1, f2);
		f4.print();

	}

}
