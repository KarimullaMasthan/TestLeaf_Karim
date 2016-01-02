package week5.stringMethods;

/**
 * Created by Bharathan on 19/09/15.
 * Created on 19/09/15 12:46 AM
 */
public class StringConcatenate {

    public static void main(String args[]) {
        //One way of doing concatenation
        String str1 = "Welcome";
//        System.out.println("Hashcode is - " +str1.hashCode());
        str1 = str1.concat(" to ");
        System.out.println("Hashcode is - " +str1.hashCode());
//        str1 = str1.concat(" String handling ");
        System.out.println("Hashcode is - " +str1.hashCode());
//        System.out.println(str1);

        //Other way of doing concatenation in one line
        String str2 = "This";
//        System.out.println("Hashcode str2 is - " +str2.hashCode());
        str2 = str2.concat(" is").concat(" just a").concat(" String");
//        System.out.println("Hashcode str2 is - " +str2.hashCode());
        System.out.println(str2);
/*
        String s=null;
        s.concat("abc");
        s.concat("abc");*/

//        will throw NullPointerException.
    }


}
