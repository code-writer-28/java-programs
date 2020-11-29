/*
class Xxx
{
  private xxx x;
  public Xxx(xxx x){
    this.x=x;
  }
  public String toString(){
    return x+"";
  }
  public xxx xxxValue(){
    return x;
  }
}
*/
class Myclass
{
  private int x;
  public Myclass(int x){
    this.x=x;
  }
  public String toString(){
    return x+"";
  }
  public int intValue(){
    return x;
  }
}
class Sample{
  public static void main(String[] args){
    Myclass m1=new Myclass(10);  //boxing
    System.out.println(m1);  
    System.out.println(m1.intValue()+5);
  }
}

//https://ide.geeksforgeeks.org/zxXPvWgWxK
