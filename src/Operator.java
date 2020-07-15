import java.util.HashMap;
import java.util.function.BinaryOperator;

public abstract class Operator implements Expression {

	protected Expression leftExp; 
	protected Expression rightExp;
	protected String operator;
	protected BinaryOperator<Float> operation;
	
	// constructor always receives left and right Expressions, their operator (+,-,etc...) and the operation function
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
	
	// if an Expression is of type Variable or a positive Number we do not want to wrap parentheses around it 
	private String expToString(Expression exp) {
		return exp.getClass().getSimpleName() == "Multiply" || exp.getClass().getSimpleName() == "Divide" ||
                (exp.getClass().getSimpleName() == "Number" && !((Number) exp).isPositive()) ? 
                        "(" + exp.toString() + ")" :  exp.toString() ;
	}
	
	// used for the print() function, enables "recursive" printing of the Expression
	@Override
	public String toString() { 
		return this.expToString(this.leftExp) + operator + this.expToString(this.rightExp);
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
	}
	
}
