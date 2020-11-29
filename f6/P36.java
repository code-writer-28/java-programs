class Point{
   Point(int x){
     System.out.println("1"); 
   }  
   Point(int a,int b){
     this(a,b);
     System.out.println("2"); 
   } 
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point(10,20);
  }
}


/*
 *https://ide.geeksforgeeks.org/GIhLsvY7SP
 *prog.java:5: error: recursive constructor invocation
 *Point(int a,int b){
 */ 
