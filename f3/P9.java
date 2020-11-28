class Sample { 
  int x=1;
  int y=2;
  static Sample s=new Sample();
  public static void main(String[] args) { 
    Sample s1=new Sample();
    s=s1;
    //static variable can access the initialise the the static method variable
  }
}
