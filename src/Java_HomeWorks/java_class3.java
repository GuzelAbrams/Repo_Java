package Java_HomeWorks;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Locale;

public class java_class3 {
    public static void main(String[] args) {



        //exercise number 2

        String mode = "D";
        String display = "";
        boolean snow = true;
        boolean sport = false;
        boolean eco = false;
        switch (mode) {
            case "P":
                System.out.println("you can park");
                break;
            case "D":
                System.out.println("drive car");
                if (snow) {
                    System.out.println("You are on Snow mode");
                } else if (sport) {
                    System.out.println("You are on Sport mode");
                } else if (eco) {
                    System.out.println("You are on Eco mode");
                }
                break;

            case "N":
                System.out.println("put car in car wash");
                break;
            case "R":
                System.out.println("revere the car");
                break;
        }

        //exercise number 3
        int var = 45;
        if (var % 3 == 0) {
            System.out.println("Divisible by 3");
        }
        if (var % 5 == 0) {
            System.out.println("Divisible by 5");
        }
        if ((var % 3 == 0) && (var % 5 == 0)) {
            System.out.println("Divisible by both");
        }
        if ((var % 3 != 0) && (var % 5 != 0)) {
            System.out.println(var);
        }


        //exercise number 1
        double studentScore =114.0;
        int maxScore = 180;
        String grade = "";
        double studentPercentage = studentScore / maxScore * 100 ;
        System.out.println(studentPercentage);
        if (studentPercentage >=91 && studentPercentage<=100) {
            System.out.println("grade is 'A'");
        } else if (studentPercentage<=90 && studentPercentage>=81) {
            System.out.println("grade is 'B'");
        } else if  (studentPercentage<=80 && studentPercentage>=71) {
            System.out.println("grade is 'C'");
        } else if (studentPercentage<=70 && studentPercentage>=61) {
            System.out.println("grade is 'D'");

        } else if (studentPercentage<=60 && studentPercentage>=51) {
            System.out.println("grade is'E'");
        } else if (studentPercentage <=50)
            System.out.println( "grade is 'F'");
    }
    
}



