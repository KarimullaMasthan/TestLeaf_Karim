package week5.stringMethods;

/**
 * Created by Bharathan on 18/09/15.
 * Created on 18/09/15 11:27 PM
 */
public class StringBufferTest {
    public static void main(String[] args){
        /*
        Creating StringBuffer
        */
        StringBuffer buffer=new StringBuffer("hello");
        /*
        Use append to concatenate
        */
        
        System.out.println("Hascode values of string buffer  : " + buffer.hashCode());
        buffer.append("java");
        System.out.println("Hascode values of string buffer  : " + buffer.hashCode());
        buffer.append(5);
        System.out.println("Hascode values of string buffer  : " + buffer.hashCode());
        System.out.println(buffer);
    }
}
