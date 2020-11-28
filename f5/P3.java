class Point{
  //It is a method
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
    //point method will call with all the calling the point through point object
  }
}

// https://ide.geeksforgeeks.org/4FkUnYBEoG
