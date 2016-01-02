package week5.stringMethods;

/**
 * Created by Bharathan on 19/09/15.
 * Created on 19/09/15 1:05 AM
 */
public class TrimExample {
    public static void main(String args[]){
        String str = new String("    How are you??   ");
        System.out.println("String before trim: "+str);
        System.out.println("String after trim: "+str.trim());
    }
}
