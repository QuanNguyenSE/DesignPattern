public class File extends FileSystem {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }
    @Override
    public void display(String indent) {
        System.out.println(indent + "- " + name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
