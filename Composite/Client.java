public class Client {
    public static void main(String[] args) {
        // Tạo các file
        FileSystem file1 = new File("File1.txt");
        FileSystem file2 = new File("File2.txt");
        FileSystem file3 = new File("File3.docx");

        // Tạo các thư mục
        FileSystem folder1 = new Folder("Folder1");
        FileSystem folder2 = new Folder("Folder2");
        FileSystem folder3 = new Folder("Folder3");

        // Xây dựng cấu trúc cây
        folder1.add(file1);
        folder1.add(file2);

        folder2.add(file3);

        folder3.add(folder1);
        folder3.add(folder2);

        // Hiển thị cấu trúc cây
        System.out.println("File System Structure:");
        folder3.display("");
    }
}
