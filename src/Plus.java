public class Plus extends Operator {
	
	public Plus(Expression leftExp, Expression rightExp){
		super(leftExp, rightExp, " + ", ( a , b ) -> a + b );
	}
	
}
