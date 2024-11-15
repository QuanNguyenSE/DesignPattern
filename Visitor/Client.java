public class Client {
    public static void main(String[] args) {
        File file1 = new File("File1.txt", 100);
        File file2 = new File("File2.txt", 200);
        Folder folder1 = new Folder("Folder1");
        folder1.add(file1);
        folder1.add(file2);

        File file3 = new File("File3.txt", 300);
        Folder rootFolder = new Folder("Root");
        rootFolder.add(folder1);
        rootFolder.add(file3);

        SizeCalculator sizeCalculator = new SizeCalculator();
        rootFolder.accept(sizeCalculator);
        System.out.println("Total size: " + sizeCalculator.getTotalSize());

    }
}
