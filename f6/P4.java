class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends B{}

class G extends C{}
class H extends C{}

class F extends E{}
class I extends G{}

class Demo{
    static void m1(B b){
        System.out.println("inside m1");
    }
}

public class Sample{
    public static void main (String[] args) {
        //Demo.m1(new A());
        Demo.m1(new B());
        //Demo.m1(new C());
        Demo.m1(new D());
        Demo.m1(new E());
        Demo.m1(new F());
        //Demo.m1(new G());
        //Demo.m1(new H());
        //Demo.m1(new I());
        
    }
}

//https://ide.geeksforgeeks.org/EwGVIjXO14
