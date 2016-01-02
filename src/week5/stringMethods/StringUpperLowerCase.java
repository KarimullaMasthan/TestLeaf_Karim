package week5.stringMethods;

import java.util.Locale;

/**
 * Created by Bharathan on 19/09/15.
 * Created on 19/09/15 1:06 AM
 */
public class StringUpperLowerCase {
    public static void main(String args[]){
        String str1 = new String("ABC IS NOT EQUAL TO XYZ");
        //Standard method of conversion
        System.out.println(str1.toLowerCase());

        String str2 = new String("this is a test string");
        //Standard method of conversion
        System.out.println(str2.toUpperCase());
    }
}
