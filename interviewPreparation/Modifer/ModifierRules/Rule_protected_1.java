package ModifierRules;

//--------example1--------------
class Parent {
    protected class Inner {   // 👈 protected inner class
        void display() {
            System.out.println("Protected Inner Class");
        }
    }
}

class Child extends Parent {
    void accessInner() {
        Inner i = new Inner();  // ✅ allowed in subclass
        i.display();
    }
}
// ------example2----------
class Outer {
    protected class Config {
        String db = "mysql";
        }
    }

class SubOuter extends Outer {
    void showConfig() {
        Config cfg = new Config();   // allowed inside subclass
        System.out.println("Using DB: " + cfg.db);
        //void test();

    }
}

public class Rule_protected_1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.accessInner();

        SubOuter s = new SubOuter();
        s.showConfig();
        // here Main difference is we creating the object of child class and calling the object.
        // summary is direct creating the object of parent class we can't access the inner class.

    }



}
