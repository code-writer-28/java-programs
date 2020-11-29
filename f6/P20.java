class Numeric{
  int x;
}
class Sample{
  public static void main(String[] args){
    final Numeric n1=new Numeric(); 
    n1=new Numeric();
  }
}

//https://ide.geeksforgeeks.org/AzSiTElhdM
/*prog.java:7: error: cannot assign a value to final variable n1
    n1=new Numeric();*/
