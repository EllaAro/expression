import java.util.HashMap;

public class Devide extends Operator {
	
	private String DIVIDE = " / ";
	
	public Devide(Expression leftExp, Expression rightExp){
		super(leftExp,rightExp);
	}
	
	/*
	 *  We are under the assumption that we get a valid rightExp.calculate(map) - not zero. 
	 *  If it is zero then we can handle it with exceptions.
	 */
	@Override
	public float calculate(HashMap<String,Integer> map) {
		return this.leftExp.calculate(map) / this.rightExp.calculate(map);
	}
	
	@Override
	public String toString() {
		return "(" + this.leftExp.toString() + DIVIDE + this.rightExp.toString() + ")";
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
		
	}
	
}
