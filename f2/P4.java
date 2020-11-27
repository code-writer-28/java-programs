public class Sample{
    int x;
    int y;
    public static void main (String[] args) {
        Sample s1 =  new Sample();
        Sample s2 =  new Sample();
        s1.x = 10;
        s2.x = 20;
        //this will print the default value of integer data type.
        System.out.println(s1.x);
        System.out.println(s2.x);
    }
}
