package week5.stringMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bharathan on 18/09/15.
 * Created on 18/09/15 11:45 PM
 */
public class StringEndsWithExample {
    public static void main(String args[]){
        String str1 = new String("This is a test String");
        String str2 = new String("Test ABC");
        //endsWith - its is case sensitive
        boolean var1 = str1.endsWith("String");
        boolean var2 = str1.endsWith("ABC");
        boolean var3 = str2.endsWith("String");
        boolean var4 = str2.endsWith("ABC");
        System.out.println(str1.hashCode());
        System.out.println("str1 ends with String: "+ var1);
        System.out.println("str1 ends with ABC: "+ var2);
        System.out.println("str2 ends with String: "+ var3);
        System.out.println("str2 ends with ABC: "+ var4);
        List list = new ArrayList();
        list.add("123");

        boolean removed = list.remove("123");
    }
}
