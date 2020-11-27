class Point {
    int x=1;
    int y=2;
}
public class Sample {
    int z=3;
    Point p=new Point(); 
    public static void main(String[] args) { 
        Sample s=new Sample();
        System.out.println(s.p.x);
        System.out.println(s.p.y);	
        System.out.println(s.z);
    }
}
