class Point{
   int x;
   int y;
   void m1(){ 
     System.out.println(this);  //this.toString()
   }
   static void m2(){

   }
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point();    
    p1.m1();
    System.out.println(p1);
  }
}

//https://ide.geeksforgeeks.org/NvjDbWdiB5
