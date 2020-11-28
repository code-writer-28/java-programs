class Point{
  void Point(){
    System.out.println("CB-POINT");
  }
}
class Sample{
  public static void main(String[] args){
    System.out.println("main ");
    Point p1=new Point();
    Point p2=new Point();
    p1.Point();
    p1.Point();
    p1.Point();
  }
}

// https://ide.geeksforgeeks.org/4FkUnYBEoG
