//java Point
class Point
{
  public static void main(String[] args){
     System.out.println("Point-main");
     new Demo();
  }
  static{
     System.out.println("Inside Point-SB");
  }
}
class Demo
{
  static{
     System.out.println("Inside DEMO-SB");
     new Sample();
  }
  static public void main(String[] args){
     System.out.println("Demo-main");
  }
}
class Sample
{
  static{
     System.out.println("Inside Sample-SB");
  }
  static public void main(String[] args){
     System.out.println("Sample-main");
  }
}


//https://ide.geeksforgeeks.org/oiknOpNIsa
//Bug
