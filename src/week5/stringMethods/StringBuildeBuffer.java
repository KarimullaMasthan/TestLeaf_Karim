package week5.stringMethods;

/**
 * Created by Bharathan on 18/09/15.
 * Created on 18/09/15 11:25 PM
 */
public class StringBuildeBuffer {
    public static void main(String[] args){
        System.out.println("\n Start"+System.currentTimeMillis());
        long startTime = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<100000; i++){
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("\n End"+System.currentTimeMillis());

        System.out.println("\n Start"+System.currentTimeMillis());
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<100000; i++){
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("\n End"+System.currentTimeMillis());
    }
}

