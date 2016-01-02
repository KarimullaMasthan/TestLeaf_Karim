package testleaf.java.datatype;

public class UsingArithmeticDataType {

	public void additionWithoutReturn() {

		int a, b, c = 0;
		a = 5;
		b = 10;
		c = a + b;
		System.out.println("Addition output additionWithoutReturn is : " + c);
	}

	public int additionWithReturn() {

		int a, b, c = 0;
		a = 5;
		b = 10;
		c = a + b;
		System.out.println("Addition output oUsingArithmeticDataType  is : " + c);
		return c;
	}

	public void checkFlotDataType(float a, float b) {

		float c = a * b;

		System.out.println("Multiplication with float : " + c);

	}

	public static void main(String[] args) {

		// Syntax to create object
		UsingArithmeticDataType oUsingArithmeticDataType = new UsingArithmeticDataType();

		oUsingArithmeticDataType.additionWithReturn();

		oUsingArithmeticDataType.additionWithoutReturn();
		
		// Pass arguments to methos
		oUsingArithmeticDataType.checkFlotDataType(10,20);
		

	}

}
