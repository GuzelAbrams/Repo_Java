package Java_HomeWorks;

import java.util.Arrays;

public class java_class2 {
    public static void main(String[] args) {
        String myFirstName = "Guzel";
        int myFirstNameLength = myFirstName.length();
        System.out.println("The length of my first name is "+ myFirstNameLength);

        // string myFirstName = "Guzel";
        boolean doesStartsWithK = myFirstName.startsWith("K");
        System.out.println("Does my name starts with 'K'? :" + doesStartsWithK);

        //print the first letter of your name
        String var = "Guzel";
        String fromIndex0to1 = var.substring(0,1);
        System.out.println("First letter of my name is: "+ fromIndex0to1);

        //does your name ends with "M"
        boolean doesEndsWithM = myFirstName.endsWith("M");
        System.out.println("Does my name ends with 'M'?: " + doesEndsWithM);


        String var1 = "I am a good programmer.";

        //replacing 'r' to 'f'
        String afterReplace = var1.replace('r', 'f');
        System.out.println(" After replacing 'r' with 'f' this happened: " + afterReplace);

        // Store your name as a string variable . Calculate the length of your name, without using lenght () method of String class
        String Var2 = "Guzel";
        String [] afterSplit = Var2.split("");
        System.out.println( Arrays.toString(afterSplit));
        int arrLength = afterSplit.length;
        System.out.println(arrLength);

















    }
}
