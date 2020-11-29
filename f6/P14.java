class Numeric{
  String x;
  public String toString(){
    return x;  
  } 
  Numeric(String value){
    x=value;
  }
}
class Sample{
  public static void main(String[] args){
    Numeric n1=new Numeric("ABC");
    String s1=new String("ABC");
    System.out.println(n1);   
    System.out.println(s1);   
  }
}


//https://ide.geeksforgeeks.org/FgXqfb1Rci 
