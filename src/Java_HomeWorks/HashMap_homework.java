package Java_HomeWorks;

import java.util.*;

public class HashMap_homework {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("happy");
        names.add("peace");
        names.add("joy");
        names.add("grow");
        names.add("laugh");
        names.add("happy");
        names.add("laugh");
        names.add("joy");
        names.add("happy");
        System.out.println(names);


        Map<String, Integer> duplicates = new HashMap<String, Integer>();
        for (String abc : names) {
            if (duplicates.containsKey(abc)) {
                duplicates.put(abc, duplicates.get(abc) + 1);
            } else {
                duplicates.put(abc, 1);
            }
        }
        System.out.println(duplicates);






        Scanner hello=new Scanner(System.in);
        Map<Integer, String> fromUser=new HashMap<>();
        for(int i=0; i<fromUser.size();i++){
            System.out.println("enter a key");
            Integer key=hello.nextInt();
            System.out.println("enter a value");
            String value=hello.next();
        }
        System.out.println(fromUser);


        }

    }






