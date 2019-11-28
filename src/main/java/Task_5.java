import java.util.ArrayList;
import java.util.Arrays;

public class Task_5 {

    private ArrayList<String> array_list_creation(){
        return new ArrayList<>(
                Arrays.asList(
                        "раз",
                        "два",
                        "три",
                        "четыре",
                        "пять"
                )
        );
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("String 1 ");
        arr.add("String 2 ");
        arr.add("String 3 ");
        arr.add("String 4 ");
        arr.add("String 5 ");
        int size = arr.size();
        System.out.println("size of array list: " + size);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
