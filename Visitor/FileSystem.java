import java.util.List;

public abstract class FileSystem implements IFileSystem {
    public abstract String getName();
    public abstract void setName(String name);
    public void add(FileSystem component) {
        throw new UnsupportedOperationException("Current operation is not supported for this object.");
    }
    public void remove(FileSystem component) {
        throw new UnsupportedOperationException("Current operation is not supported for this object.");
    }
    public List<FileSystem> getChildren() {
        throw new UnsupportedOperationException("Current operation is not supported for this object.");
    }
    public abstract void display(String indent);
}
