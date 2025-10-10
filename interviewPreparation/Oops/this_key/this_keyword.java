package this_key;

class Demo{
    int x;

    public Demo() {   // this is the default constructor with no parameter
        this.x = 20;
    }

    public Demo(int a) { // this is the parameterized constructor.
        this.x = a;    // here we're assigning value to class attributes.
    }
}


public class this_keyword {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("call current class object: "+ d.x);

        Demo d1 = new Demo(10);
        System.out.println("call current class object: "+ d1.x);
    }
}
// "this" keyword is used to call the current class construct, method, object.
// Main use of "this" keyword is used eliminate the confusion between class attributes and parameters having the same name.