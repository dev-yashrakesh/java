package classes_and_object;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator,int denominator) throws Exception {
		this.numerator=numerator;
		if(denominator==0) {
			Exception e=new Exception("Denominator cant be 0");
			throw e;
		}
		this.denominator=denominator;
		simplify();
	}

	

	public void print() {
		if(denominator==1) {
			System.out.println(numerator);
		}
		
		else {
			System.out.println(numerator+"/"+denominator);
		}
	}
	
	public static Fraction add(Fraction f1,Fraction f2) {
		int num=f1.numerator*f2.denominator+f2.numerator*f1.denominator;
		int deno=f1.denominator*f2.denominator;
		Fraction f=new Fraction(num,deno);
		return f;
		
	}
	
	public static Fraction multiply(Fraction f1,Fraction f2) {
		int num=f1.numerator*f2.numerator;
		int deno=f1.denominator*f2.denominator;
		Fraction f3=new Fraction(num,deno);
		return f3;
	}
	
	public void simplify() {
		int gcd=1;
		int min=Math.min(numerator, denominator);
		for(int i=2;i<=min;i++) {
			if(numerator%i==0 && denominator%i==0) {
				gcd=i;
			}
			
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
	
}
