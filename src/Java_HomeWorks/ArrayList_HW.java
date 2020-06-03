package Java_HomeWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_HW {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        names.add("happy");
        names.add("peace");
        names.add("joy");
        names.add("grow");
        names.add("laugh");
        names.add("happy");
        names.add("laugh");
        names.add("joy");
        System.out.println(names);
        duplicatesValue(names);

        arr1.add(4);
        arr1.add(6);
        arr1.add(76);
        arr1.add(87);
        arr1.add(90);
        System.out.println(arr1);

        arr2.add(98);
        arr2.add(6);
        arr2.add(87);
        arr2.add(45);
        arr2.add(1);
        arr2.add(4);
        System.out.println(arr2);
       commonElement(arr1,arr2);


    }

    public static void duplicatesValue(List<String> names) {
        for (int i = 0; i < names.size() - 1; i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if ((names.get(i) == names.get(j)) && (i != j)) {
                    System.out.println("Duplicate Element : " + names.get(j));

                }
            }
        }
    }

    public static void commonElement(List<Integer> arr1,List<Integer> arr2) {

        for(int i = 0; i < arr1.size(); i++){
            for(int j = 0; j < arr2.size(); j++){
                if(arr1.get(i) == arr2.get(j)){
                    System.out.println("Common element is: "+arr1.get(i));
                    break;
                }
            }
        }
    }
}
