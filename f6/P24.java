class Point{
   int x;
   int y; 
   void display(){  //this=100,200
     System.out.println(this);
     System.out.println(x);  //sop(this.x);
     System.out.println(y);  //sop(this.y)
   } 
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point();
    Point p2=new Point();  
    p1.x=1;
    p1.y=2;
    p2.x=3;
    p2.y=4;
    p1.display();
    p2.display();
    System.out.println(p1);
    System.out.println(p2);
  }
}

//https://ide.geeksforgeeks.org/bJDVt5Qq0S
