class MyString{
  String x;
  public String toString(){
    return x;  
  } 
  MyString(String value){
    x=value;
  }
}
class Sample{
  public static void main(String[] args){
    MyString n1=new MyString("ABC");
    String s1=new String("ABC");
    System.out.println(n1);   
    System.out.println(s1);   
  }
}


//https://ide.geeksforgeeks.org/lkMe65KdoK
