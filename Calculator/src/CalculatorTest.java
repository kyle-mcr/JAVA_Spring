
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator(15,25);
		c.performOperation();
		c.getResults();
		System.out.println(c.getResults());
	}

}
