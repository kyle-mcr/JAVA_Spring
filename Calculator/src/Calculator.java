
public class Calculator {
	private int OperandOne;
	private int OperandTwo;
	public static int total = 0;
public Calculator(int OperandOneParam, int OperandTwoParam) {
	OperandOne = OperandOneParam;
	OperandTwo = OperandTwoParam;
	

}
public void performOperation() {
	total = OperandOne + OperandTwo;
}
public int getResults() {
	return total;
}
}