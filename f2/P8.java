class Point {
    int x=1;
    int y=2;
}
class Demo {
    int p=3;
    int q=4;
}
public class Sample { 
    int z=4;
    Point p=new Point(); 
    Demo d=new Demo();
    public static void main(String[] args) { 
        Sample s=new Sample();
        System.out.println(s.p.x);
        System.out.println(s.p.y);
        System.out.println(s.d.p);
        System.out.println(s.d.q);
        System.out.println(s.z);
  }
}
