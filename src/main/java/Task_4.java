import java.util.Arrays;

public class Task_4 {

    private String array_of_integers = "Array of integers is: ";
    private String even = "Even count is: ";
    private String newline = "\n";

    private int[] array_creation(){

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10);
        }
        return array;
    }

    private int even_count(){

        int count = 0;
        int iterator = 0;
        while (iterator < array_creation().length){
            if (array_creation()[iterator] % 2 == 0) {
                count++;
            }
            iterator++;
        }
        return count;
    }

    public static void main(String[] args) {

        Task_4 task4 = new Task_4();
        System.out.println(
                        task4.array_of_integers +
                        Arrays.toString(task4.array_creation()) +
                        task4.newline +
                        task4.even +
                        task4.even_count()
        );
    }
}
