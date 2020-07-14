public class Divide extends Operator {
	
	
	public Divide(Expression leftExp, Expression rightExp){
		super(leftExp, rightExp, " / ", ( a , b ) -> a / b );
	}
	
}
