import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_5 {

    private String array_size = "The size of the ArrayList is: ";

    @NotNull
    @Contract(" -> new")
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

    private void print_arraylist(){

        int i = 0;
        while (i < array_list_creation().size()){
            System.out.println(array_list_creation().get(i));
            i++;
        }
    }

    public static void main(String[] args) {

        Task_5 task5 = new Task_5();
        System.out.println(task5.array_size + task5.array_list_creation().size());
        task5.print_arraylist();
    }
}
