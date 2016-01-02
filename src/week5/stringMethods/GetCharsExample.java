package week5.stringMethods;

/**
 * Created by Bharathan on 18/09/15.
 * Created on 18/09/15 10:27 PM
 */
public class GetCharsExample{
    public static void main(String args[]){
        String str = new String("This is a String Handling Tutorial");
        int i=0;
        char[] array1 = new char[6];
        str.getChars(0, 4, array1, 2);
        System.out.println("Array Content:" );
        for(char temp: array1){
            /*System.out.print("The value at "+i++ + " is ");
            System.out.print(temp+"\n");*/
            System.out.print(temp);
        }
        System.out.printf("\nEnd");

      /*  char[] array2 = new char[]{'a','a','a','a','a','a','a','a'};
        str.getChars(10, 16, array2, 2);
        System.out.println("\nSecond Array Content:" );
        for(char temp: array2){
            System.out.print(temp);
        }*/
    }
}

