public class SizeCalculator implements Visitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Folder folder) {
        for (FileSystem child : folder.getChildren()) {
            child.accept(this);
        }
    }

    public int getTotalSize() {
        return totalSize;
    }
}
