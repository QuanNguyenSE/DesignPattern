public class Client {
    public static void main(String[] args) {
        XMLAdaptee adaptee = new XMLAdaptee();
        IJsonTarget target = new JsonAdapter(adaptee);
        System.out.println(target.GetRequest());
    }
}

