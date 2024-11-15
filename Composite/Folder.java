import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystem {
    private String name;
    private List<FileSystem> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add(FileSystem component) {
        children.add(component);
    }

    @Override
    public void remove(FileSystem component) {
        children.remove(component);
    }

    @Override
    public List<FileSystem> getChildren() {
        return children;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ " + name);
        for (FileSystem child : children) {
            child.display(indent + "   ");
        }
    }
}
