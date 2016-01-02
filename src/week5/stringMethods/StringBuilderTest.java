package week5.stringMethods;

/**
 * Created by Bharathan on 18/09/15.
 * Created on 18/09/15 11:29 PM
 */
public class StringBuilderTest {
    public static void main(String[] args){
        /*
        Creating StringBuilder
        */
        StringBuffer buffer=new StringBuffer("hello");
        /*
        Use append to concatenate
        */
        buffer.append("java");
        System.out.println(buffer);
    }
}
