package testleaf.java.constructor;

public class Constructor {
	
	public Constructor(){
		this("");
		System.out.println("hi");
//		Constructor("a");
	}
	
	public Constructor(String a){
		System.out.println("hi hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor cons = new Constructor();

	}
	
	
	public void name() {
		System.out.println("method");
		this.age();
		
	}
	
	
	public void age(){
		System.out.println("age");
	}

}
