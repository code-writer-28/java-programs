class Point{
   int x;
   int y; 
   Point(int x,int b){
     x=x;
     y=b;
   }
   void display(){ 
     System.out.println(x);  
     System.out.println(y);   
   } 
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point(10,20);
    p1.display();
  }
}


//https://ide.geeksforgeeks.org/URWNSr3KV1
