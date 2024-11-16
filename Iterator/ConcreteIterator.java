public class ConcreteIterator implements Iterator {
    private StudentList studentList;
    private int index;

    public ConcreteIterator(StudentList studentList) {
        this.studentList = studentList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return studentList.get(index++);
        }
        return null;
    }
}