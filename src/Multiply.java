
public class Multiply extends Operator {
		
	public Multiply(Expression leftExp, Expression rightExp){
		super(leftExp, rightExp, " * ", ( a , b ) -> a * b );
	}

}
