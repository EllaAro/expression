import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		
		Expression a = new Number(3);
		
		Expression c = new Variable("y"); 
		HashMap<String, Integer> test = new HashMap<>();
		test.put("y", 5);
		Expression b = new Multiply(a,c);
		Expression z = new Number(2);
		Expression t = new Plus(b,z);
		
		t.print();

	}

}
