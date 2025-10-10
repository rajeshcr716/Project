package ModifierRules;

//---example1-----
class Outer2 {
    static class MathUtils {
        static int square(int x) {
            return x * x;
        }
    }
}
//-----example2---- Real time usage in the java.
class Map {
    // Static inner class
    static class Entry {
        int key;
        String value;

        // here this is a constructor we creating a object of "Entry" class.
        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

         void display() {
            System.out.println(key + " = " + value);
        }
    }
}

public class Rule_static_3 {
    public static void main(String[] args) {
        int result = Outer2.MathUtils.square(5); // no Outer object needed
        System.out.println("Square = " + result);
        // static inner class → Group related code without outer instance dependency (like a namespace).

        // No need to create OuterMap object
        Map.Entry e1 = new Map.Entry(1, "Apple");
        Map.Entry e2 = new Map.Entry(2, "Banana");
        e1.display();  // 1 = Apple
        e2.display();  // 2 = Banana
    }
}

// Learning notes
//static class Entry {
//   -----
//
//   static  void display() {                               ----> When we change method to static.
//        System.out.println(key + " = " + value);
 //        ----
//    }

// Map.entry.disply()
// we getting error like below
// Non-static field 'key' cannot be referenced from a static context // for System.out.println(key + " = " + value);

// Reason
/*
key and value are instance fields → each object of Entry has its own key and value.

        show() is static → belongs to the class, not to any object.

        Static methods cannot access instance fields directly, because they don’t know which object’s key/value you mean.*/
