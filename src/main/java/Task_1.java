import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeSet.add;

public class Task_1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(
                Arrays.asList("1",
                              "2",
                              "3"));
                List.of("4",
                        "5",
                        "6");
        )
        {
            {
                add(0,"Course");
                add(1,"Automation");
                add(2,"Quality");
                add(3,"Assurance");
            }
        };

        list.add(4,"Test");
        list.add(5,"Tested Test");
        list.add(6,"Test of Tested Test");

        System.out.println("ArrayList: " + list);
    }
}
