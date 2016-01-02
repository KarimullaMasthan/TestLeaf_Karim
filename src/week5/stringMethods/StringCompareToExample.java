package week5.stringMethods;

/**
 * Created by Bharathan on 18/09/15.
 * Created on 18/09/15 11:38 PM
 */
public class StringCompareToExample {
    public static void main(String args[]) {
        String str1 = "A";
        String str2 = "B";
        String str3 = "Aa";
        String str4 = "Ab";

        int var1 = str1.compareTo( str2 );
        System.out.println("str1 & str2 comparison: "+var1);

        int var2 = str2.compareTo( str1 );
        System.out.println("str2 & str1 comparison: "+var2);

        int var3 = str3.compareTo( str4 );
        System.out.println("str2 & string argument comparison: "+var3);
    }
}
