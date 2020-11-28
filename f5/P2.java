//java Sample
class Point{
  static{
    System.out.println("SB-POINT");
  }
  {
    System.out.println("NSB-POINT");
  }
  Point(){
    System.out.println("CB-POINT");
  }
}
class Sample{
  public static void main(String[] args){
    Point p1=new Point();
    Point p2=new Point();
  }
}

// https://ide.geeksforgeeks.org/nnsTRVOr2i
