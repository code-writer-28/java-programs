class Sample{
  public static void main(String[] args){
    Demo.m1(new A());   
  }
}
class A{}
class C extends A{}
class B extends A{}

class D extends B{}
class E extends B{}
class F extends E{}

class G extends C{}
class H extends C{}
class I extends G{}
class Demo
{
  static void m1(B b){
    System.out.println("inside m1");
  }
}

/*prog.java:3: error: incompatible types: A cannot be converted to B
  Demo.m1(new A()); 
  https://ide.geeksforgeeks.org/jJRy9EkQi7
 */





