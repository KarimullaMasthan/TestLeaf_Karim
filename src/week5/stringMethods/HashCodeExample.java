package week5.stringMethods;

/**
 * Created by Bharathan on 19/09/15.
 * Created on 19/09/15 1:08 AM
 */
public class HashCodeExample {
    public static void main(String args[]){
        String str1 = new String("Welcome!! Bharath");
        System.out.println("Hash Code for String str str1: "+str1.hashCode());

        String str2 = "Welcome!!";
        System.out.println("Hash Code for String str str2: "+str2.hashCode());

        StringBuilder str3 = new StringBuilder("Welcome!!");
        System.out.println("Hash Code for String str str3: "+str3.hashCode());

        StringBuilder str4 = new StringBuilder("Welcome!!");
        System.out.println("Hash Code for String str str4: "+str4.hashCode());
        
        

        /*
        * hashCode() method
        * This method returns the hash code for the String. The computation is done like this:
        * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
        * */
    }
}
