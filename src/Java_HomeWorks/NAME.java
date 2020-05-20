package Java_HomeWorks;

import java.util.Arrays;

public class NAME {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(addit (3,5));
        int[] num ={1,34,46,98,8};



        for(int i= 0; i<num.length; i++){
            System.out.println(num[i]);
        }
String sent = "once upon a time";
String[] sentSplit = sent.split( " ");
String newWord = sentSplit[0].substring(0,1);
newWord = newWord.toUpperCase() +sentSplit[0].substring(1,sentSplit[0].length());

for (String word : sentSplit){
    String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
    System.out.println("Line (Before modification): " + line);
    String[] lines = line.toLowerCase().split(" ");
    line = "";
    for (String w : lines) {
        line += w.toUpperCase().substring(0,1) + w.substring(1) + " ";
    }
    System.out.println("Line (After modification):" + line.trim());
}

System.out.println(newWord);

    }
    public static int addit ( int num1,int num2){
        return num1+num2;
    }
}
