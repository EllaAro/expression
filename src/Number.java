import java.util.HashMap;

public class Number implements Expression{

	private int num;
	
	public Number(int num) {
		this.num = num;
	}
	
	@Override
	public float calculate(HashMap<String,Integer> map) {
		return (float)num;
	}

	@Override
	public void print() {
		System.out.println("The value of the number is : ");
    }

}
