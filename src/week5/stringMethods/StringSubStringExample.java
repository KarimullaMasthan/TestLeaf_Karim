package week5.stringMethods;

/**
 * Created by Bharathan on 19/09/15.
 * Created on 19/09/15 12:40 AM
 */
public class StringSubStringExample {
    public static void main(String args[]) {
        String str= new String("quick brown fox jumps over the lazy dog");
        System.out.println("Substring starting from index 15:");
        System.out.println(str.substring(15));
        System.out.println("Substring starting from index 15 and ending at 20:");
        System.out.println(str.substring(15, 20));
    }
}
