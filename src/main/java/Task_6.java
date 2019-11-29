import java.util.ArrayList;
import java.util.List;

public class Task_6 {



    public static List<String> largestStringArray = new ArrayList<>();
    public static List<String> arr = new ArrayList<>();

    public static void main(String... arg) {
        arr.add("Ivan");
        arr.add("Petro");
        arr.add("Taras");
        arr.add("Stepan");
        arr.add("Vladislav");
        arr.add("Vitalii");
        arr.add("Vally");
        arr.add("Petrovich");
        arr.add("Ivanovich");
        arr.add("Valentina");

        String longestString = findLongestString(arr);
        largestStringArray = findDuplicateStrings(arr, longestString);
        printList(largestStringArray);

    }

    private static String findLongestString(List<String> list) {

        int index = 0;
        int longest = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > longest) {
                longest = arr.get(i).length();
                index = i;
            }
        }
        return list.get(index);
    }

    private static List<String> findDuplicateStrings (List<String> list, String value){
        List<String> result = new ArrayList<>();
        for (int i =0; i < arr.size(); i++){
            if (arr.get(i).length() == value.length()){
                result.add(arr.get(i));
            }
        }
        return result;
    }
    private static void printList(List<String> list){
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
