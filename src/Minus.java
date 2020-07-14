public class Minus extends Operator {
		
	public Minus(Expression leftExp, Expression rightExp){
		super(leftExp, rightExp, " - ", ( a , b ) -> a - b );
	}
	
}
