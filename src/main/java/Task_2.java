import org.jetbrains.annotations.Contract;

public class Task_2 {

    private String start = "Tester's grades are: ";
    private String newline = "\n";

    public enum Tester {

        TRAINEE ("Trainee"),
        JUNIOR ("Junior"),
        MIDDLE ("Middle"),
        SENIOR ("Senior");

        private String grade;

        @Contract(pure = true)
        Tester(String grade) {
            this.grade = grade;
        }

        public String grade() {
            return grade;
        }
    }

    public static void main(String[] args) {

        Task_2 task2 = new Task_2();
        System.out.print(
                task2.start +
                task2.newline +
                Tester.TRAINEE.grade() +
                task2.newline +
                Tester.JUNIOR.grade() +
                task2.newline +
                Tester.MIDDLE.grade() +
                task2.newline +
                Tester.SENIOR.grade()
        );
    }
}
