class Point{
   Point(){
     System.out.println("0"); 
   }  
   Point(int x){
     System.out.println("1"); 
   }  
   void Point(int x){
     System.out.println("m"); 
   }  
   Point(int a,int b){
     Point(a);
     System.out.println("2"); 
   }  
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point(10,20);
  }
}

//https://ide.geeksforgeeks.org/NKJQ16dMMs
