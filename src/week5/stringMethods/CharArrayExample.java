package week5.stringMethods;

/**
 * Created by Bharathan on 19/09/15.
 * Created on 19/09/15 1:12 AM
 */
public class CharArrayExample {
    public static void main(String args[]){
        String str = new String("Welcome to BeginnersBook.com");
        char[] array= str.toCharArray();
        System.out.print("Content of Array:");
        for(char c: array){
        	 
            System.out.print(c);
           
        }
    }
}
