package Java_HomeWorks;

public class java_class5 {
    public static void main(String[] args) {


        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        String nameToSearch = "philip";
        for (int i=0; i<=names.length; i++) {
            boolean search =names[i].equalsIgnoreCase(nameToSearch);
            if (search == true) {
                System.out.println(nameToSearch + " " +(i+1));
                break;
            }
            else{
                System.out.println("happy is not present in the array");
            }
        } 

        int[] number = {1,2,3,4};
        int total = 0;
        int len= number.length;
        for (int value:number){
            total = total+value;
            System.out.println(total);
        }
        double avResult = total/len;
        System.out.println(avResult);
    }



    }

