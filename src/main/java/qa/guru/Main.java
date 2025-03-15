package qa.guru;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Human dima = new Human(
                "Dima",
                34,
                true
        );

        // Лист список

        List<String> lectures = new ArrayList<>();
        lectures.add("git");
        lectures.add("java");
        lectures.add("files");
        lectures.add("junit");

        Set<String> lectureSet = Set.of(
                "git", "java", "files", "junit"
        );

        Map<String, Human> humans = new HashMap<>();

        humans.put("1123123213", dima);
        humans.put("145345", dima);
        humans.put("547647567", dima);
        humans.put("23415465", dima);
        humans.put("463623525", dima);

        for (Map.Entry<String, Human> entry : humans.entrySet()){
            entry.getKey();
            entry.getValue();
        }

        for (String key : humans.keySet()) {

        }

        for (Human value : humans.values()) {

        }

        int hours = 12;
        String hello = "Hello";

        dima.printSomeValue(
                hours,
                hello,
                lectures
        );

        // Массив данных

        String[] lecturesArray = new String[] {"git", "java", "files", "junit" };
        lecturesArray[0] = "git";
        lecturesArray[1] = "java";
        lecturesArray[2] = "files";
        lecturesArray[3] = "junit";

        int[] intArray0 = new int[] {1, 2, 3};
        int[] intArray1 = new int[] {1, 2, 3};

        int[][]biArray0 = new int [][] {
                intArray0,
                intArray1
        };

        int[][]biArray1 = new int [][] {
                intArray0,
                intArray1
        };

        int[][][] threeArray = new int [][][] {
                biArray0,
                biArray1
        };

        // Циклы ( наборы данных )

//        for( int i = 0 ; i < lecturesArray.length ; i++) {
//            System.out.println(lecturesArray[i]);
//        }
//
//        for ( int i = lecturesArray.length - 1; i >= 0 ; i--) {
//            System.out.println(lecturesArray[i]);
//        }

        for (String lectureName : lectureSet) {
            if (!lectureName.startsWith(("j"))) {
                continue;
            }
            System.out.println(lectureName);
            break;
        }

        int i = 0;

//        while (i < lecturesArray.length) {
//            System.out.println(lecturesArray[1]);
//            i++;
//        }


    }
}
