package OverLoading_vs_Roading;

class Parent{
    public void property(){
        System.out.println("Cash+Gold+Land");
    }

    public void marry(){
        System.out.println("Nagamma");
    }
}
    class Child extends Parent{
        public void marry(){
            System.out.println("katrina");
        }
    
}
public class OverRiding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.marry(); // Nagamma
        
        Child c = new Child();
        c.marry(); // Katrina
        
        Parent pc = new Child();
        pc.marry(); // Katrina
        
     //   Child cp = new Parent();    
     // child reference with parent object is not allowed.
        
/* when child class not satisfied with parent method implementation then the child is allowed to redefine it's
  own method based on the requirement such concept is called the overriding.
  In overriding method resolution is always taken care by JVM. */



    }
}
