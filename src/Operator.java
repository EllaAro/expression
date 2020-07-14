import java.util.HashMap;

public abstract class Operator implements Expression {

	protected Expression expOne; 
	protected Expression expTwo;
	
	public Operator(Expression expOne, Expression expTwo){
		this.expOne = expOne;
		this.expTwo = expTwo;
	}
	
	@Override
	public abstract float calculate(HashMap<String,Integer> map);
	
	@Override
	public void print() {
		System.out.println("This is the result : " );
    }
}
