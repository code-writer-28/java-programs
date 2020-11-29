class Point{
   Point(int x){
     System.out.println("1"); 
   }  
   Point(int a,int b){
     System.out.println("2"); 
     this(5);
   }  
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point(10,20);
  }
}


//prog.java:7: error: call to this must be first statement in constructor
//this(5);

/* https://ide.geeksforgeeks.org/tw8k311lp9 */
