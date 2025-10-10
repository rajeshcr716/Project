package package1;

class Outer {
    protected class Inner { // ✅ Allowed
        void display() {
            System.out.println("Protected Inner Class");
        }
    }
}

class SubOuter extends Outer {
    void test() {
        Inner i = new Inner(); // ✅ Accessible in subclass
        i.display();
    }
}

public class TestProtected {
    public static void main(String[] args) {
        SubOuter so = new SubOuter();

    }
}