import java.util.HashMap;

public class Variable implements Expression {

	private String var;
	
	public Variable(String var) {
		this.var = var;
	}
	
	public float calculate(HashMap<String,Integer> map) {
		return map.get(this.var);
	}
	

	@Override
	public void print() {
		System.out.println("The value of the variable is : " );		
	}


}