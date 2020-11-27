public class Sample{
    int x;
    int y;
    public static void main (String[] args) {
        Sample s1 =  new Sample();
        Sample s2 =  s1;
        //s2 object will point the heap area of s1 object
        s1.x = 10;
        //value of x = 10 which is present in the s1 object heap area
        s2.x = 20;
        //value of x = 20 which is present in the s2 object heap area because s2 is pointing the heap area of s1.
        System.out.println(s1.x); // 20
        System.out.println(s2.x); // 20
    }
}
