class Point{
  Point(){
    System.out.println("CB-POINT-0");
  }
  Point(int x,int y){
    System.out.println("CB-POINT-2");
  }
}
class Sample{
  public static void main(String[] args){
    System.out.println("main ");
    Point p1=new Point();
    Point p2=new Point();
    // the above two objects will call the default constructor
    Point p3=new Point(10,20);    
    //this will call the two parameterised constructor
  }
}

//https://ide.geeksforgeeks.org/dl6svfr7ep
