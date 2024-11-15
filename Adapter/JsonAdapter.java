public class JsonAdapter implements IJsonTarget {
    public XMLAdaptee _adaptee;

    public JsonAdapter(XMLAdaptee adaptee) {
        _adaptee = adaptee;
    }

    public String GetRequest() {
        // Chuyển đổi XML của Adaptee sang định dạng mà Target (JSON) mong muốn
        return "Adapted data: " + _adaptee.GetSpecificRequest() + "in JSON format";
    }
}
