import java.util.ArrayList;
import java.util.Arrays;

public class Task_1 {

    public static void main(String[] args) {

        Task_1 task = new Task_1();
        System.out.println("ArrayList: " + task.list_creation());
    }

    private ArrayList<String> list_creation(){

        ArrayList<String> list = new ArrayList<String>(
                Arrays.asList("чик",
                        "чирик",
                        "и в продакшен")
        )

        {
            {
                add(0, "Course");
                add(1,"Automation");
                add(2,"Quality");
                add(3,"Assurance");
            }
        };

        list.add(4,"Test");
        list.add(5,"Tested Test");
        list.add(6,"Test of Tested Test");

        return list;
    }
}
