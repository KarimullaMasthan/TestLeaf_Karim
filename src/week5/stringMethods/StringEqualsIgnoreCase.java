package week5.stringMethods;

/**
 * Created by Bharathan on 18/09/15.
 * Created on 18/09/15 11:35 PM
 */
public class StringEqualsIgnoreCase {
    public static void main(String args[]){
        String str1= new String("Apple");
        String str2= new String("MANGO");
        String str3= new String("APPLE");
        System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase(str2));
        System.out.println("str1 equals to str3:"+str1.equalsIgnoreCase(str3));
        System.out.println("str1 equals to Welcome:"+str1.equalsIgnoreCase("Welcome"));
        System.out.println("str1 equals to Apple:"+str1.equalsIgnoreCase("aPpLe"));
        System.out.println("str2 equals to mango:"+str2.equalsIgnoreCase("mango"));
    }
}
