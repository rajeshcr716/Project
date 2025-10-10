package OverLoading_vs_Roading;
//---------Rule_1------------
class R1{
    public void r1(int i){

    }
}

class subR1 extends R1{
    public void r1(int i){

    }
}

//---------Rule_2------------
/* The parent method name is declared as final then overriding concept is not possible
 but non-final to final method overriding is allowed.*/
class R2{
    public final void r2(){}
}
class subR2 extends R2{
    /*public void r2(){

    }*/
}

//---------Rule_3------------
/* while overriding abstract to non abstract method overriding is possible.
 similarly vice versa abstract to abstract method overriding is impossible So we have to give implementation for the parent
 method.*/
//condition-1
class R3{
    public void r1(int i){

    }
}

abstract class subR3 extends R1{
    public abstract void r1(int i);
}
//condition-2

abstract class R32{
    public abstract void r1(int i);
}

class subR32 extends R1{
    public void r1(int i) {
    }
}

//---------Rule_4------------
/*  private method overriding in the child class is not possible because private method is
not visible to the child class.*/

//---------Rule_4------------
/*while performing overriding we can't reduce the scope of the access modifier otherwise we getting
a compile time error.*/

public class OverRiding_Rules {
    public static void main(String[] args) {

    }
}
