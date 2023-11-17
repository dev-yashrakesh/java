package classes_and_object;

public class ComplexNumbers {
	
	private int real;
	private int img;
	
	public ComplexNumbers(int real, int img) {
		this.real=real;
		this.img=img;
	}
	
	public void plus(ComplexNumbers c2) {
		this.real=this.real+c2.real;
		this.img=this.img+c2.img;
	}
	
	public void multiply(ComplexNumbers c2) {
		int r=(real*c2.real)+(-1)*(img*c2.img);
		this.img=(real*c2.img)+(img*c2.real);
		this.real=r;
	}
	
	public void print() {
		System.out.println(this.real+" + "+"i"+this.img);
	}
}
