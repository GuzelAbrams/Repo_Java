package Java_HomeWorks;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class java_class1 {
    public static void main(String[] args) {
        /*
    increment and decrement
     */
        int d = 5;
        System.out.println(d++);
        System.out.println(d++);
        System.out.println(++d);
        System.out.println(d);
        System.out.println(--d);
        System.out.println(d);
        System.out.println(d++);

        /*
        number of hours in a day
         */
        int numOfHours = 24;
        System.out.println("Number of hours in a day is " + numOfHours);

        int maxNumOfDay = 366;
        System.out.println(" Number of max no. of day in a years " + maxNumOfDay);

        int numOfEmpl = 50;
        System.out.println("Total number of employees in an organization "+ numOfEmpl);
        double numOfPopulation = 328.2;
        System.out.println("Population in a country is "+ numOfPopulation);
        double intRate = 24.3;
        System.out.println("Interest rate is " + intRate);
        double balInBank = 16000.08;
        System.out.println("Balance in a bank account is" + balInBank);
        boolean riseFromWest = false;
        System.out.println("Does the sun rise from the west? " + false);
        char intlOfFirst = 'G';
        System.out.println("Initial of my first name is " + intlOfFirst );
        char intOfLast = 'A';
        System.out.println("initial of my last name is " + intOfLast);
        String myName = "Guzel Abrams";
        System.out.println("My name is " + myName);

        /*
        Implement code to convert temperature value using below formulae
        */
        /**
         * F = 9/5 * C + 32
         */
        double cTemp = 15;
        double fTemp = 9.0/5 * cTemp + 32;
        System.out.println("Temperature in Fahrenheit will be "+ fTemp);
        /**
         * F = 9/5 * (K-273) + 32
         */
        double kTemp = 400;
        double fTemp1 = 9/5.0 * (kTemp - 273) + 32;
        System.out.println("Fahrenheit scale to kelvin will be "+ fTemp1);
        /**
         * K = C + 273
         */
        double cTemp1 = 15;
        double kTemp1 = cTemp1 + 273;
        System.out.println("Kelvin scale to celsius will be "+ kTemp1);

        /**
         * C = K - 273.
         */
        double kTemp2 = 700;
        double cTemp2 = kTemp2 - 273;
        System.out.println("Celsius scale to kelvin will be " + cTemp2);
        /**
         * K = 5/9 * (F -32) + 273.
         */
        double fTemp2 = 1000;
        double kTemp3 = 5/9.0 * (fTemp2 -32) + 273;
        System.out.println("Kelvin scale to fahrenheits will be "+ kTemp3);











    }


}
