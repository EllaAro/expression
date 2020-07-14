import java.util.HashMap;

public class Multiply extends Operator {
	
	private String MULTIPLY = " * ";
	
	public Multiply(Expression leftExp, Expression rightExp){
		super(leftExp,rightExp);
	}
	
	@Override
	public float calculate(HashMap<String,Integer> map) {
		return this.leftExp.calculate(map) * this.rightExp.calculate(map);
	}
	
	@Override
	public String toString() {
		return "(" + this.leftExp.toString() + MULTIPLY + this.rightExp.toString() + ")";
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
		
	}
	
}
