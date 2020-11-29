class Numeric{
  int x;
  public Numeric(int value){
    x=value;
  }
  public String toString(){
    return x+"";
  }
  public boolean equals(Object r){
     return this.x==((Numeric)r).x;
  }
}
class P18{
  public static void main(String[] args){
    Numeric n1=new Numeric(10); 
    Numeric n2=new Numeric(10); 
    System.out.println(n1==n2);
    System.out.println(n1.equals(n2));    
  }
}

//https://ide.geeksforgeeks.org/4ooaufDvYo
