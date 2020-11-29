class Point{
   Point(int x){
     this(10,20);
     System.out.println("1"); 
   }  
   Point(int a,int b){
     this(a);
     System.out.println("2"); 
   } 
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point(10,20);
  }
}

/*
 *https://ide.geeksforgeeks.org/OfOZWLKK0G
 *prog.java:6: error: recursive constructor invocation
 *Point(int a,int b){
 */
