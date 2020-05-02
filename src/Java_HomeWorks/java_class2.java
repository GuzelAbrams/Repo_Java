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

        //Calculate  the length of your name without using length() method of String class
        String var2 = "Guzel abrams";
        String [] afterSpit = var2.split( "");
        System.out.println(Arrays.toString(afterSpit));
        String [] arrName = afterSpit;
        String [] arrLength = arrName.length;
















    }
}
