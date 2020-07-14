import java.util.HashMap;
import java.util.function.BinaryOperator;

public abstract class Operator implements Expression {

	protected Expression leftExp; 
	protected Expression rightExp;
	protected String operator;
	protected BinaryOperator<Float> operation;
	
	public Operator(Expression leftExp, Expression rightExp, String operator, BinaryOperator<Float> operation){
		this.leftExp = leftExp;
		this.rightExp = rightExp;
		this.operator = operator;
		this.operation = operation;
	}
	
	@Override
	public float calculate(HashMap<String,Integer> map) {
		return this.operation.apply(this.leftExp.calculate(map), this.rightExp.calculate(map));
	}
	
	private String expToString(Expression exp) {
		return exp.getClass().getSimpleName() == "Variable" || 
                exp.getClass().getSimpleName() == "Number" ? 
                        exp.toString() : "(" + exp.toString() + ")";
	}
	
	@Override
	public String toString() { 
		return this.expToString(this.leftExp) + operator + this.expToString(this.rightExp);
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
	}
	
}
