import java.util.HashMap;
import java.util.Map;

public class Task_3 {

    private String start = "Vehicles are:";
    private String newline = "\n";
    private String bmw = "BMW";
    private String lada = "Лада седан баклажан";

    private Map<Integer,String> map_creation (){

        Map<Integer,String> vehicles = new HashMap<>();
        vehicles.put(5, bmw);
        vehicles.put(6, lada);
        return vehicles;
    }

    public static void main(String[] args) {

        Task_3 task3 = new Task_3();
        System.out.println(task3.start + task3.newline + task3.map_creation().values());
    }
}
