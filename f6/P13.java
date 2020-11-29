class Numeric{
  int x=10;
  public String toString(){
    return x+"";  
  } 
  Numeric(int value){
    x=value;
  }
}
class Sample{
  public static void main(String[] args){
    Numeric n1=new Numeric(1);
    Numeric n2=new Numeric(2);
    Numeric n3=new Numeric(3);
    System.out.println(n1);   
    System.out.println(n2);   
    System.out.println(n3);   
  }
}

//https://ide.geeksforgeeks.org/moV1j7V7l7
