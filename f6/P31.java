class Point{
   Point(){
     System.out.println("0"); 
   }  
   Point(int x){
     this();
     System.out.println("1"); 
   }  
   Point(int a,int b){
     this(5);
     System.out.println("2"); 
   }  
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point(10,20);
  }
}

//https://ide.geeksforgeeks.org/4ra4j7STPF
