import java.util.HashMap;

public class Minus extends Operator {
	
	public Minus(Expression expOne, Expression expTwo){
		super(expOne,expTwo);
	}
	
	@Override
	public float calculate(HashMap<String,Integer> map) {
		return this.expOne.calculate(map) - this.expTwo.calculate(map);
	}
	
}
