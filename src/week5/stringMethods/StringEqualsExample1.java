package week5.stringMethods;

/**
 * Created by Bharathan on 18/09/15.
 * Created on 18/09/15 11:32 PM
 */
public class StringEqualsExample1{
    public static void main(String args[]){
        String str1= new String("Hello");
        String str2= new String("Hi");
        String str3= new String("Hello");
        System.out.println("str1 equals to str2:"+str1.equals(str2));
        System.out.println("str1 equals to str3:"+str1.equals(str3));
        System.out.println("str1 equals to Welcome:"+str1.equals("Welcome"));
        System.out.println("str1 equals to Hello:"+str1.equals("Hello"));
        System.out.println("str1 equals to hello:"+str1.equals("hello"));
    }
}
