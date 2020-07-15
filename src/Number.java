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
	public String toString() {
		return Integer.toString(this.num);
	}
	
	public boolean isPositive() {
		return this.num > 0;
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
    }

}
