package nestedclass;

public class Outter2Example {
    public static void main(String[] args) {
        Outter2 outter2 = new Outter2();
        Outter2.Nested nested = outter2.new Nested();
        nested.print();
//        this.field는 Nested-field
//        Outter2.this.field는 Outter-field
//        this.method()는 Nested-method
//        Outter2.this.method()는 Outter-method
    }
}

