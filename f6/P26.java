class Point{
   int x;
   int y; 
   Point(int a,int b){
     x=a;  //this.x=a
     y=b;  //this.y=b
   }
   void display(){ 
     System.out.println(x);  //this.x 
     System.out.println(y);  //this.y
   } 
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point(10,20);
    p1.display();
  }
}


//https://ide.geeksforgeeks.org/xPASSeKUKc
