class Point{
   int x;
   int y; 
   void display(){ 
     int x=10;
     System.out.println(x); //sop(x);  
     System.out.println(y); //sop(this.y);
     System.out.println(this.x);
   } 
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point();
    p1.x=1;
    p1.y=2;
    p1.display();
  }
}


//https://ide.geeksforgeeks.org/0P8iTXcn3k
