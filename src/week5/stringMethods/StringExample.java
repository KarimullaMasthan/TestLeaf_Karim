package week5.stringMethods;

/**
 * Created by Bharathan on 18/09/15.
 * Created on 18/09/15 10:10 PM
 */
public class StringExample {
    public static void main(String args[]) {
        String welcome = "Welcome to string handling tutorial";

        /*char charAt(int index): It returns the character at the specified index.
        Specified index value should be between 0 to length() -1 both inclusive.
        It throws IndexOutOfBoundsException if index<0||>= length of String.*/
        char ch1 = welcome.charAt(0);
        char ch2 = welcome.charAt(11);
        /* Character at 0 index is: W
        Character at 5th index is: s */
        System.out.println("\n******* charAt Start *******");
        System.out.println("Character at 0 index is: "+ch1);
        System.out.println("Character at 11th index is: "+ch2);
        System.out.println("******* charAt Start *******");
        /*int codePointAt(int index):It is similar to the charAt method
        however it returns the Unicode code point value of specified
        index rather than the character itself*/
        System.out.println("\n******* codePointAt Start *******");
        System.out.println("Character at 0 index is: " + welcome.codePointAt(0));
        System.out.println("Character at 11th index is: "+ welcome.codePointAt(11));
        System.out.println("******* codePointAt Start *******");
    }
}
