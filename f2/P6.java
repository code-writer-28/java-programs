public class Sample{
    int x;
    Sample s;
    public static void main (String[] args) {
        Sample s1 =  new Sample();
        //create new object with field x and s
        s1.x = 1;
        //value of x in heap area s1, is 1 //s1.x = 1;
        s1.s = s1;
        //value of s in heap area s1, is s1, this will point again the heap area s1
        s1.s.x = 3;
        //now the s which is pointing s1 in that the value of x  = 3;
        s1.s.s.s.x = 4;
        //now the system will go into the loop at the last the value of x will come as 4.
        System.out.println(s1.x); // 4
        System.out.println(s1.s.x); // 4
        System.out.println(s1.s.s.x); //4
        System.out.println(s1.s.s.s.s.x); // 4
    }
}
