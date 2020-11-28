class Sample{
  public static void main(String[] args){
    byte x=10;
    //x=x+1;
    //x=(byte)x+1;
    //x=(byte)x+(byte)1;
    x=(byte)(x+1);
    //x++ => x=(byte)(x+1)
    System.out.println(x);
  }
}

//https://ide.geeksforgeeks.org/kloi0WMQ5V
