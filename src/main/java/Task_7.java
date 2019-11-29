import org.jetbrains.annotations.NotNull;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task_7 {

    private String start = "Map is:";

    @NotNull
    private HashMap map_creation(){

        HashMap<String, String> map = new HashMap<String, String>()
        {
            {
                put("watermelon", "berry");
                put("banana", "fruit");
                put("cherry", "berry");
                put("pineapple", "fruit");
                put("melon", "vegetable");
                put("cranberry", "berry");
                put("apple", "fruit");
                put("iris", "flower");
                put("potato", "vegetable");
                put("carrot", "vegetable");
            }
        };
        return map;
    }

    private void print_map(){

        Set set = map_creation().entrySet();
        System.out.println(start);
        for (Object object: set){
            Map.Entry m = (Map.Entry) object;
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }

    public static void main(String[] args) {

        Task_7 task7 = new Task_7();
        task7.map_creation();
        task7.print_map();
    }
}
