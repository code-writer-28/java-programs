class Point{
  static int x=1;
  static int y=2;
}
class Demo{
  static int x=3;
  static int y=4;
}
class Sample { 
  public static void main(String[] args) { 
    Point p=null;
    Demo d=new Demo();
    System.out.println(p.x);
    //will get the value of x which is present in Point class
    System.out.println(d.x);
    //will get the value of x which is present in the Demo class
  }
}
