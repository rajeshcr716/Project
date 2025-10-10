package ModifierRules;


class Outer1 {
    private class Logger {   // 👈 private inner class
        void log(String msg) {
            System.out.println("LOG: " + msg);
        }
    }

    void process() {   // 👈 this method is in Outer
        Logger logger = new Logger();  // ✅ we can create inner object here
        logger.log("Process started");
        // some business logic
        logger.log("Process finished");

//        private means visible only inside the same outer class.
//        Since process() belongs to Outer, it is inside the same class scope as Logger.
//        So Outer can see and create objects of its own private inner class.
    }
}

public class Rule_private_2 {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.process();
        // ❌ Outer.Logger l = new Outer.Logger();  (Not allowed)

//        private inner class is fully hidden from the outside world.
//        But the outer class itself has access to it, so its methods (like process()) can create objects and call its methods.

    }
}

