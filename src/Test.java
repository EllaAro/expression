import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		
		Expression a = new Number(3);
		
		Expression c = new Variable("y"); 
		HashMap<String, Integer> test = new HashMap<>();
		test.put("y", 5);
		Expression b = new Plus(a,c);
		
		System.out.println(b.calculate(test));

	}

}
