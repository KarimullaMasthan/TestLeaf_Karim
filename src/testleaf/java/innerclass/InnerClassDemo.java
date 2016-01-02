package testleaf.java.innerclass;

class InnerClassDemo {

	private int mySalray = 10;

	class MostInnerClass {

		public void printMySalary() {

			System.out.println(mySalray);

		}

	}

	class MostInnerClass2 {

		public void printMySalary() {

			System.out.println(mySalray);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InnerClassDemo.MostInnerClass mostInnerObj = new
		// InnerClassDemo.MostInnerClass();

		InnerClassDemo inner = new InnerClassDemo();
		InnerClassDemo.MostInnerClass mostInner = inner.new MostInnerClass();

		InnerClassDemo.MostInnerClass2 mostInner2 = inner.new MostInnerClass2();
		mostInner.printMySalary();

	}

}
