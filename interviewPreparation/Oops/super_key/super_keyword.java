package super_key;


    class parent {
        void vehicle() {
            System.out.println("M80");
        }
    }

    class child extends parent {
        void vehicle() {
            super.vehicle();
            System.out.println("R15");
        }

    }


class  Super_keyword{
    public static void main(String[] args) {
        child c = new child();
        c.vehicle();


    }
}
// Super key word is used call the parent method, object from child class "method'.
// In the above program we calling parent class method inside child method.