public class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double age) {
        this.name = name;
        this.gpa = age;
    }

    @Override
    public int compareTo(Student other) {
        return -1 * Double.compare(gpa, other.gpa);
    }
}
