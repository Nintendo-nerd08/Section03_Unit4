import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            Student mark = new Student("Mark", 3.87);
            Student linda = new Student("Linda", 4.12);
            Student clarence = new Student("Clarence", 3.93);

            List<Student> students = new ArrayList<>();
            students.add(mark);
            students.add(linda);
            students.add(clarence);

            Collections.sort(students);
            System.out.println(students);

        }
    }
