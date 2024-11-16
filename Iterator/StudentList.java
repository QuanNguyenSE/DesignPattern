import java.util.ArrayList;
import java.util.List;

public class StudentList implements Aggregate {
    private List<String> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String get(int index) {
        return students.get(index);
    }

    public int size() {
        return students.size();
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
