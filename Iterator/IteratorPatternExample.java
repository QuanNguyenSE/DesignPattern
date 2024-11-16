public class IteratorPatternExample {
    public static void main(String[] args) {
        // Tạo một danh sách học sinh
        StudentList studentList = new StudentList();
        studentList.addStudent("Alice");
        studentList.addStudent("Bob");
        studentList.addStudent("Charlie");
        studentList.addStudent("David");

        // Tạo một iterator để duyệt qua danh sách học sinh
        Iterator iterator = studentList.createIterator();

        // Duyệt qua danh sách học sinh
        while (iterator.hasNext()) {
            String student = (String) iterator.next();
            System.out.println(student);
        }
    }
}
