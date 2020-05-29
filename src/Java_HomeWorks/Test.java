package Java_HomeWorks;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /**
         * Question 1:
         * Create a method to return an array after remove a specific value from a given int array.
         * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
         * Returned array: {32, 14, 98, 56, 148, 78}
         *
         * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
         * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
         *
         */
        int[] hyy = {32, 43, 65, 43};
        int[] afterRemove;
        int remove = 76;
        afterRemove = removeValue(hyy, remove);
        System.out.println(Arrays.toString(afterRemove));
        speedPoints(150);
        int[] myNewArray={1,2,3,4,6,7,8};
        int numFound;
        numFound=missingInteger(myNewArray);
        System.out.println(numFound);



    }

    public static int[] removeValue(int[] myArray, int remove) {

            int counter = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] != remove) {
                    counter++;
                }
            }
            int[] afterRemove = new int[counter];
            int idx = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] != remove) {
                    afterRemove[idx] = myArray[i];
                    idx++;
                }
            }
            return afterRemove;
        }





        /**
         * Question 2:
         * Create a method to return missing smallest positive integer (greater than 0) from given array.
         * Example:
         * 	For array : {1, 3, 5, 4, 2, 7}
         * 	Method should return : 6
         *
         * 	For array : {-1, -3, 4, 2}
         * 	Method should return : 1
         *
         * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
         * 	Method should return : 4
         */
        public static int missingInteger(int[] myArray) {
            int testNum=1;
            boolean numFound;
            do {
                numFound = false;
                for (int i = 0; i < myArray.length; i++) {
                    if (testNum == myArray[i]) {
                        numFound = true;
                        break;
                    }
                }
                if (numFound == false) {
                    return testNum;
                }
                testNum++;
            }
            while (true);
        }


            /**
             * Question 3:
             * Scenario: Traffic ticketing system
             * Write a method, that will print (not return) the points charged against the license for over speeding.
             *    1. Speed Limit = 70
             *    2. Every 5 miles over the speed limit will add 1 point
             *    3. If user gets 12 points for a speed then license is suspended
             *
             *  Example:
             *      user speed = 78 ; 1 points
             *      user speed = 88 ; 3 points
             *      user speed = 178 ; 21 points (License suspended).
             *      user speed = 70 ; Thank you for driving within the speed limit.
             *
             *      88 -> 3
             *      70
             *      70-75 : 1
             *      75-80 : 1
             *      80-85 : 1
             *      85-88
             */
            public static void speedPoints ( int speed){
                int overSpeed = speed - 70;
                System.out.print("user speed = " + speed + "; ");
                if (overSpeed < 5) {
                    System.out.println("Thank you for driving within the speed limit");
                } else {
                    int points = overSpeed / 5;
                    System.out.println(points + " points");
                    if (points >= 12) {
                        System.out.println(points + " License suspended");
                    }

                }
            }
        }



