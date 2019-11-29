import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_6 {

    private String start = "The longest:";

    @NotNull
    @Contract(" -> new")
    private ArrayList<String> array_list_creation(){

        return new ArrayList<>(
                Arrays.asList(
                        "Lamborghini",
                        "Ford",
                        "Dodge",
                        "Porsche",
                        "BMW",
                        "Citroen",
                        "Renault",
                        "Zaporozhets",
                        "Volvo",
                        "Skoda"
                )
        );
    }

    private String the_longest_string(){

        int number = 0;
        int length = 0;
        int i = 0;
        while (i < array_list_creation().size()){
            if (array_list_creation().get(i).length() > length){
                length = array_list_creation().get(i).length();
                number = i;
            }
            i++;
        }
        return array_list_creation().get(number);
    }

    @NotNull
    private ArrayList<String> duplicated_strings(){

        ArrayList<String> array = new ArrayList<>();
        int i = 0;
        while (i < array_list_creation().size()){
            if (array_list_creation().get(i).length() == the_longest_string().length()){
                array.add(array_list_creation().get(i));
            }
            i++;
        }
        return array;
    }

    private void print(){

        int iterator = 0;
        System.out.println(start);
        while (iterator < duplicated_strings().size()){
            System.out.println(duplicated_strings().get(iterator));
            iterator++;
        }
    }

    public static void main(String[] arg) {

        Task_6 task6 = new Task_6();
        task6.array_list_creation();
        task6.the_longest_string();
        task6.duplicated_strings();
        task6.print();
    }
}
