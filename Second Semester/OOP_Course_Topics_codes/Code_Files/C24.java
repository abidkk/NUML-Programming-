// Generic in Java
// Generic class with a placeholder type

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class C24 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(); // Creating a Box for Integer
        intBox.setValue(100);
        System.out.println("Box contains: " + intBox.getValue());

        Box<String> strBox = new Box<>(); // Creating a Box for String
        strBox.setValue("Hello");
        System.out.println("Box contains: " + strBox.getValue());
    }
}
