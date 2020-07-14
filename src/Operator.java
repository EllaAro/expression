import java.util.HashMap;

public abstract class Operator implements Expression {

	protected Expression leftExp; 
	protected Expression rightExp;
	
	public Operator(Expression leftExp, Expression rightExp){
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}
	
	@Override
	public abstract float calculate(HashMap<String,Integer> map);
	
	@Override
	public abstract void print(); 
	
}
