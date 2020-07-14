import java.util.HashMap;

public interface Expression {
	
	public float calculate(HashMap<String,Integer> map);
	
	public void print();
}
