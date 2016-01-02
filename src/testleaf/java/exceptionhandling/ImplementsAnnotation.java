package testleaf.java.exceptionhandling;

import java.lang.annotation.Annotation;

public class ImplementsAnnotation implements CustomizedException {

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		System.out.println("Name");
		return null;
	}

	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		System.out.println("age");
		return null;
	}

}
