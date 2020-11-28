class Sample { 
  int x=1;
  int y=2;
  Sample s=new Sample();
  public static void main(String[] args) { 
    Sample s1=new Sample();
    s=s1;
    //error: non-static variable s cannot be referenced from a static context
    System.out.println(s1.s.x);
  }
}
