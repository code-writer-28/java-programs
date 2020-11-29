class A
{
  public String toString(){
    return "HELLO";
  }
}
class B{}
class Sample{
  public static void main(String[] args){
    A r1=new A();
    B r2=new B();
    System.out.println(r1);  //r1.toString();
    System.out.println(r2);   //r2.toString();
  }
}


//https://ide.geeksforgeeks.org/XpXNwurv2k
