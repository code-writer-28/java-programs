class Point{
   Point(){ 
     System.out.println(this);  
   }
   void m1(){
     System.out.println(this);  
   }
   {
     System.out.println(this);  
   }
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point();
    p1.m1();
  }
}


//https://ide.geeksforgeeks.org/4bxOe6vE0j
