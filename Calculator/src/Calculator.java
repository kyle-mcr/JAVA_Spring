
public class Calculator {
	private int OperandOne;
	private int OperandTwo;
	public static int total = 0;
public Calculator(int OperandOneParam, int OperandTwoParam) {
	OperandOne = OperandOneParam;
	OperandTwo = OperandTwoParam;
	
}
public void setOperandOne(int OperandOne) {
	this.OperandOne = OperandOne;
}
public void setOperandTwo(int OperandTwo) {
	this.OperandTwo = OperandTwo;
}
public void performOperation() {
	total = OperandOne + OperandTwo;
}
public int getResults() {
	return total;
}
}