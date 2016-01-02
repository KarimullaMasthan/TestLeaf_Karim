package testleaf.java.innerclass;

public class AccessingInnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClassDemo inner = new InnerClassDemo();
		// OuterClass.InnerClass Object = outerClassObj.new InnerClass();
		InnerClassDemo.MostInnerClass mostInner = inner.new MostInnerClass();
		
		//OuterClass.InnerClass object = new OuterClass.new InnerClass();
		InnerClassDemo.MostInnerClass mostInner2 = new InnerClassDemo().new MostInnerClass();
		mostInner.printMySalary();

	}

}
