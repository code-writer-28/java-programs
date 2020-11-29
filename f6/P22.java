class Point{
   int x;
   int y;
   Point(){ 
     System.out.println(this);  
   }
   static void m2(){
     System.out.println(this);  
   }
}
class Sample{
  public static void main(String[] args){
    Point.m2();
  }
}

/*
 *prog.java:8: error: non-static variable this cannot be referenced from a static context
 *System.out.println(this);
 */
 
//https://ide.geeksforgeeks.org/ihu1xb7lwF
