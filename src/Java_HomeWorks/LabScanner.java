package Java_HomeWorks;

import com.sun.tools.javac.code.Attribute;

import java.util.Scanner;

public class LabScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls write an int number...");
        int num1 =  input.nextInt();
        System.out.println("Pls write another int number...");
        int num2 =  input.nextInt();
        abc(num1,num2);


    }

    public static void abc(int num1,int num2) {
        for (int i= num1; i < num2; i++) {
    if (i% 2 == 0) {
     System.out.println("Range of even numbers is" + i);
    }

     }
    }
}

