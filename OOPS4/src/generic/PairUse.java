package generic;

public class PairUse {

	public static void main(String[] args) {
		Pair<String> p=new Pair<String>("ab","cd");
		p.setFirst("abc");
		p.getFirst();
		
		Pair<Integer> c=new Pair<Integer>(10,2);
		c.getClass();
		

	}

}
