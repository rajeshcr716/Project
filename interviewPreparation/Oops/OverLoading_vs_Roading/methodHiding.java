package OverLoading_vs_Roading;

// Method hiding
/* Overriding and Overridden both method are static then we called as method hiding.
 In method hiding method resolution will taken care by compiler.*/
class s1{
    public static void r1(int i){

    }
}

class subs1 extends s1{
    public static void r1(int i){

    }
}
public class methodHiding {

}
